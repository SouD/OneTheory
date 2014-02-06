package onetheory.base.dbc;

public class SpellDurationEntry {
	
	private int ID;
	private int[] durations;
	
	public SpellDurationEntry(int index, DBCRecord dbc) throws DBCException {
		int numReqFields = 4;
		if (dbc.getNumCols() != numReqFields) {
			throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
		}
		
		ID = dbc.getInt(index, 0);
		
		durations = new int[DBC.MAX_EFFECT_INDEX];
		durations[0] = dbc.getInt(index, 1);
		durations[1] = dbc.getInt(index, 2);
		durations[2] = dbc.getInt(index, 3);
	}

	public int getID() {
		return ID;
	}

	public int[] getDurations() {
		return durations;
	}
	
	public int getDuration(int index) {
		return durations[index];
	}
	
	@Override
	public String toString() {
		return String.format("SpellDurationEntry: ", ID);
	}
	
	public static class Factory implements DBCEntryFactory<SpellDurationEntry> {

		@Override
		public SpellDurationEntry create(int index, DBCRecord dbc) throws DBCException {
			return new SpellDurationEntry(index, dbc);
		}
		
	}
	
}
