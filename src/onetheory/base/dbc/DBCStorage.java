package onetheory.base.dbc;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.ByteBuffer;

public class DBCStorage<T> {
	
	private String dbcPath;
	private DBCRecord dbc;
	private DBCEntryFactory<T> factory;
	
	public DBCStorage(DBCEntryFactory<T> fact, String dbcPath) {
		this.factory = fact;
		this.dbcPath = dbcPath;
		
		dbc = null;
	}
	
	public void load(String file) throws Exception {
		FileInputStream fis = null;
		try {
			URL u = this.getClass().getResource(dbcPath + file);
			File f = new File(u.toURI());
			ByteBuffer bb = ByteBuffer.allocate((int)f.length());
			fis = new FileInputStream(f);
			fis.getChannel().read(bb);
			bb.rewind();
			dbc = new DBCRecord(bb);
			System.out.println(file + "\n" + dbc.toString());
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}
	
	public T lookupEntry(int id) throws DBCException {
		int index = dbc.findIndexByID(id);
		if (index >= 0) {
			return factory.create(index, dbc);
		} else {
			return null;
		}
	}
	
	public String getDBCPath() {
		return dbcPath;
	}
	
}
