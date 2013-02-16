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
	
	public void load(String file, String fmt) throws Exception {
		FileInputStream fis = null;
		try {
			URL u = this.getClass().getResource(dbcPath + file);
			File f = new File(u.toURI());
			ByteBuffer bb = ByteBuffer.allocate((int)f.length());
			fis = new FileInputStream(f);
			fis.getChannel().read(bb);
			bb.rewind();
			dbc = new DBCRecord(bb, fmt);
			System.out.println("Loaded DBC file: " + file); //Remove later
			System.out.println(dbc.toString());
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}
	
	public T lookupEntry(int id) {
		return factory.create(id, dbc);
	}
	
	public String getDBCPath() {
		return dbcPath;
	}
	
}
