package onetheory.base.dbc;

public class SpellCastTimesEntry {
	
	private int ID;
	private int castTime;

	public SpellCastTimesEntry(int index, DBCRecord dbc) throws DBCException {
		int numReqFields = 4;
		if (dbc.getNumCols() != numReqFields) {
			throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
		}
		
		ID = dbc.getInt(index, 0);
		castTime = dbc.getInt(index, 1);
		//castTimePerLevel = dbc.getFloat(index, 2);
		//minCastTime = dbc.getInt(index, 3);
	}
	
	public int getID() {
		return ID;
	}

	public int getCastTime() {
		return castTime;
	}
	
	@Override
	public String toString() {
		return String.format("SpellCastTimesEntry: ", ID);
	}
	
	public static class Factory implements DBCEntryFactory<SpellCastTimesEntry> {

		@Override
		public SpellCastTimesEntry create(int index, DBCRecord dbc) throws DBCException {
			return new SpellCastTimesEntry(index, dbc);
		}
		
	}
	
}
