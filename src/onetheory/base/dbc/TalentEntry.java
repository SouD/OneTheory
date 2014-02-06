package onetheory.base.dbc;

public class TalentEntry {
	
	private int ID;
	private int talentTab;
	private int row;
	private int col;
	private int[] rankIDs;
	private int dependsOn;
	private int dependsOnRank;
	private int dependsOnSpell;
	
	public TalentEntry(int index, DBCRecord dbc) throws DBCException {
		int numReqFields = 21;
		if (dbc.getNumCols() != numReqFields) {
			throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
		}
		
		ID = dbc.getInt(index, 0);
		talentTab = dbc.getInt(index, 1);
		row = dbc.getInt(index, 2);
		col = dbc.getInt(index, 3);
		
		rankIDs = new int[DBC.MAX_TALENT_RANK];
		rankIDs[0] = dbc.getInt(index, 4);
		rankIDs[1] = dbc.getInt(index, 5);
		rankIDs[2] = dbc.getInt(index, 6);
		
		dependsOn = dbc.getInt(index, 13);
		dependsOnRank = dbc.getInt(index, 16);
		//needAddInSpellBook = dbc.getInt(index, 19);
		dependsOnSpell = dbc.getInt(index, 20);
	}
	
	public int getID() {
		return ID;
	}

	public int getTalentTab() {
		return talentTab;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public int[] getRankIDs() {
		return rankIDs;
	}
	
	public int getRankID(int index) {
		return rankIDs[index];
	}

	public int getDependsOn() {
		return dependsOn;
	}

	public int getDependsOnRank() {
		return dependsOnRank;
	}

	public int getDependsOnSpell() {
		return dependsOnSpell;
	}

	@Override
	public String toString() {
		return String.format("TalentEntry: ", ID);
	}
	
	public static class Factory implements DBCEntryFactory<TalentEntry> {

		@Override
		public TalentEntry create(int index, DBCRecord dbc) throws DBCException {
			return new TalentEntry(index, dbc);
		}
		
	}
	
}
