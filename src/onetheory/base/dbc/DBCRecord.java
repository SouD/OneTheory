package onetheory.base.dbc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class DBCRecord {
	
	private byte[] signature;
	private int numRows;
	private int numCols;
	private int rowSize;
	private int fieldLen;
	private int strBlockSize;
	private byte[] data;
	private byte[] strBlock;
	private String fmt;
	
	public DBCRecord(ByteBuffer bb, String fmt) {
		this.fmt = fmt;
		
		bb.order(ByteOrder.LITTLE_ENDIAN);
		
		//Get header
		signature = new byte[4];
		bb.get(signature);
		numRows = bb.getInt();
		numCols = bb.getInt();
		rowSize = bb.getInt();
		strBlockSize = bb.getInt();
		
		data = new byte[numRows * rowSize];
		bb.get(data);
		
		strBlock = new byte[strBlockSize];
		bb.get(strBlock);
		
		//Field length always (?) 4 bytes each
		fieldLen = rowSize / numRows;
	}
	
	public byte[] getRow(int index) {
		int from = index * rowSize;
		int to = from + rowSize;
		return Arrays.copyOfRange(data, from, to);
	}
	
	public int getInt(int row, int col) {
		int offset = row * rowSize + col * fieldLen;
		return     (data[offset] & 0xFF)
				| ((data[offset + 1] & 0xFF) << 8)
				| ((data[offset + 2] & 0xFF) << 16)
				| ((data[offset + 3] & 0xFF) << 24);
	}
	
	public float getFloat(int col, int row) {
		return Float.intBitsToFloat(getInt(row, col));
	}
	
	public String getString(int row, int col) {
		int from = getInt(row, col);
		int to = from;
		while(strBlock[to++] != 0) { /* Find null termination */ }
		return new String(Arrays.copyOfRange(strBlock, from, to)).trim();
	}

	public String getSignature() {
		return new String(signature);
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumCols() {
		return numCols;
	}

	public int getRowSize() {
		return rowSize;
	}
	
	public int getSize() {
		return rowSize * numRows;
	}

	public int getStrBlockSize() {
		return strBlockSize;
	}

	public String getFmt() {
		return fmt;
	}
	
	@Override
	public String toString() {
		return String.format("Rows: %d, Cols: %d\nRow size: %d\nSize: %d\nString block size: %d", numRows, numCols, rowSize, getSize(), strBlockSize);
	}
	
}