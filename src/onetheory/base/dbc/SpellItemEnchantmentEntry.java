package onetheory.base.dbc;

public class SpellItemEnchantmentEntry {
	
	private int ID;
	private int[] types;
	private int[] amounts;
	private int[] spellIDs;
	private String description;
	private int auraID;
	private int slot;
	private int gemID;
	private int enchantmentCondition;
	
	public SpellItemEnchantmentEntry(int index, DBCRecord dbc) throws DBCException {
		int numReqFields = 34;
		if (dbc.getNumCols() != numReqFields) {
			throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
		}
		
		ID = dbc.getInt(index, 0);
		
		types = new int[DBC.MAX_EFFECT_INDEX];
		types[0] = dbc.getInt(index, 1);
		types[1] = dbc.getInt(index, 2);
		types[2] = dbc.getInt(index, 3);
		
		amounts = new int[DBC.MAX_EFFECT_INDEX];
		amounts[0] = dbc.getInt(index, 4);
		amounts[1] = dbc.getInt(index, 5);
		amounts[2] = dbc.getInt(index, 6);
		
		/*amounts2 = new int[DBC.MAX_EFFECT_INDEX];
		 *amounts2[0] = dbc.getInt(index, 7);
		 *amounts2[1] = dbc.getInt(index, 8);
		 *amounts2[2] = dbc.getInt(index, 9);
		 */
		
		spellIDs = new int[DBC.MAX_EFFECT_INDEX];
		spellIDs[0] = dbc.getInt(index, 10);
		spellIDs[1] = dbc.getInt(index, 11);
		spellIDs[2] = dbc.getInt(index, 12);
		
		description = dbc.getString(index, 13); //13-28
		//descriptionFlags = dbc.getInt(index, 29);
		auraID = dbc.getInt(index, 30);
		slot = dbc.getInt(index, 31);
		gemID = dbc.getInt(index, 32);
		enchantmentCondition = dbc.getInt(index, 33);
	}

	public int getID() {
		return ID;
	}

	public int[] getTypes() {
		return types;
	}
	
	public int getType(int index) {
		return types[index];
	}

	public int[] getAmounts() {
		return amounts;
	}
	
	public int getAmount(int index) {
		return amounts[index];
	}

	public int[] getSpellIDs() {
		return spellIDs;
	}
	
	public int getSpellID(int index) {
		return spellIDs[index];
	}

	public String getDescription() {
		return description;
	}

	public int getAuraID() {
		return auraID;
	}

	public int getSlot() {
		return slot;
	}

	public int getGemID() {
		return gemID;
	}

	public int getEnchantmentCondition() {
		return enchantmentCondition;
	}
	
	@Override
	public String toString() {
		return String.format("SpellItemEnchantmentEntry: ", ID);
	}
	
	public static class Factory implements DBCEntryFactory<SpellItemEnchantmentEntry> {

		@Override
		public SpellItemEnchantmentEntry create(int index, DBCRecord dbc) throws DBCException {
			return new SpellItemEnchantmentEntry(index, dbc);
		}
		
	}
	
}
