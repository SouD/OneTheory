package onetheory.base.dbc;

public class SpellEntry {
	
	private int ID;
	private int category;
	private int dispel;
	private int mechanic;
	private int attributes;
	private int attributesEx;
	private int attributesEx2;
	private int attributesEx3;
	private int attributesEx4;
	private int attributesEx5;
	private int attributesEx6;
	private int stances;
	private int stancesNot;
	private int targets;
	private int targetCreatureType;
	private int requireSpellFocus;
	private int facingCasterFlags;
	private int casterAuraState;
	private int targetAuraState;
	private int castingTimeIndex;
	private int recoveryTime;
	private int categoryRecoveryTime;
	private int interruptFlags;
	private int auraInterruptFlags;
	private int channelInterruptFlags;
	private int procFlags;
	private int procChance;
	private int procCharges;
	private int maxLevel;
	private int baseLevel;
	private int spellLevel;
	private int durationIndex;
	private int powerType;
	private int manaCost;
	private int manaCostPerLevel;
	private int manaPerSecond;
	private int manaPerSecondLevel;
	private int rangeIndex;
	private float speed;
	private int stackAmount;
	private int[] totems;
	private int[] reagents;
	private int[] reagentCounts;
	private int equippedItemClass;
	private int equippedItemSubClassMask;
	private int equippedItemInventoryTypeMask;
	private int[] effects;
	private int[] effectDieSides;
	private int[] effectBaseDie;
	private float[] effectDicePerLevel;
	private float[] effectRealPointsPerLevel;
	private int[] effectBasePoints;
	private int[] effectMechanics;
	private int[] effectImplicitTargetsA;
	private int[] effectImplicitTargetsB;
	private int[] effectRadiusIndices;
	private int[] effectApplyAuraName;
	private int[] effectAmplitudes;
	private float[] effectMultipleValues;
	private int[] effectChainTargets;
	private int[] effectItemTypes;
	private int[] effectMiscValues;
	private int[] effectMiscValuesB;
	private int[] effectTriggerSpells;
	private float[] effectPointsPerComboPoint;
	private int spellVisual;
	private int spellIconID;
	private int activeIconID;
	private String spellName;
	private String rank;
	private String description;
	private String tooltip;
	private int manaCostPercentage;
	private int startRecoveryCategory;
	private int startRecoveryTime;
	private int maxTargetLevel;
	private int spellFamilyName;
	private long spellFamilyFlags;
	private int maxAffectedTargets;
	private int dmgClass;
	private int preventionType;
	private int[] dmgMultipliers;
	private int[] totemCategories;
	private int areaID;
	private int schoolMask;
	
	public SpellEntry(int index, DBCRecord dbc) throws DBCException {
		int numReqFields = 216;
		if (dbc.getNumCols() != numReqFields) { //Spell.dbc need 216 fields for a SpellEntry
			throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
		}
		
		ID = dbc.getInt(index, 0);
		category = dbc.getInt(index, 1);
		//castUI = dbc.getInt(index, 2);
		dispel = dbc.getInt(index, 3);
		mechanic = dbc.getInt(index, 4);
		attributes = dbc.getInt(index, 5);
		attributesEx = dbc.getInt(index, 6);
		attributesEx2 = dbc.getInt(index, 7);
		attributesEx3 = dbc.getInt(index, 8);
		attributesEx4 = dbc.getInt(index, 9);
		attributesEx5 = dbc.getInt(index, 10);
		attributesEx6 = dbc.getInt(index, 11);
		stances = dbc.getInt(index, 12);
		stancesNot = dbc.getInt(index, 13);
		targets = dbc.getInt(index, 14);
		targetCreatureType = dbc.getInt(index, 15);
		requireSpellFocus = dbc.getInt(index, 16);
		facingCasterFlags = dbc.getInt(index, 17);
		casterAuraState = dbc.getInt(index, 18);
		targetAuraState = dbc.getInt(index, 19);
		//casterAuraStateNot = dbc.getInt(index, 20);
		//targetAuraStateNot = dbc.getInt(index, 21);
		castingTimeIndex = dbc.getInt(index, 22);
		recoveryTime = dbc.getInt(index, 23);
		categoryRecoveryTime = dbc.getInt(index, 24);
		interruptFlags = dbc.getInt(index, 25);
		auraInterruptFlags = dbc.getInt(index, 26);
		channelInterruptFlags = dbc.getInt(index, 27);
		procFlags = dbc.getInt(index, 28);
		procChance = dbc.getInt(index, 29);
		procCharges = dbc.getInt(index, 30);
		maxLevel = dbc.getInt(index, 31);
		baseLevel = dbc.getInt(index, 32);
		spellLevel = dbc.getInt(index, 33);
		durationIndex = dbc.getInt(index, 34);
		powerType = dbc.getInt(index, 35);
		manaCost = dbc.getInt(index, 36);
		manaCostPerLevel = dbc.getInt(index, 37);
		manaPerSecond = dbc.getInt(index, 38);
		manaPerSecondLevel = dbc.getInt(index, 39);
		rangeIndex = dbc.getInt(index, 40);
		speed = dbc.getFloat(index, 41);
		//modalNextSpell = dbc.getInt(index, 42);
		stackAmount = dbc.getInt(index, 43);
		
		totems = new int[DBC.MAX_TOTEM_INDEX];
		totems[0] = dbc.getInt(index, 44);
		totems[1] = dbc.getInt(index, 45);
		
		reagents = new int[DBC.MAX_REAGENT_INDEX];
		reagents[0] = dbc.getInt(index, 46);
		reagents[1] = dbc.getInt(index, 47);
		reagents[2] = dbc.getInt(index, 48);
		reagents[3] = dbc.getInt(index, 49);
		reagents[4] = dbc.getInt(index, 50);
		reagents[5] = dbc.getInt(index, 51);
		reagents[6] = dbc.getInt(index, 52);
		reagents[7] = dbc.getInt(index, 53);
		
		reagentCounts = new int[DBC.MAX_REAGENT_INDEX];
		reagentCounts[0] = dbc.getInt(index, 54);
		reagentCounts[1] = dbc.getInt(index, 55);
		reagentCounts[2] = dbc.getInt(index, 56);
		reagentCounts[3] = dbc.getInt(index, 57);
		reagentCounts[4] = dbc.getInt(index, 58);
		reagentCounts[5] = dbc.getInt(index, 59);
		reagentCounts[6] = dbc.getInt(index, 60);
		reagentCounts[7] = dbc.getInt(index, 61);
		
		equippedItemClass = dbc.getInt(index, 62);
		equippedItemSubClassMask = dbc.getInt(index, 63);
		equippedItemInventoryTypeMask = dbc.getInt(index, 64);
		
		effects = new int[DBC.MAX_EFFECT_INDEX];
		effects[0] = dbc.getInt(index, 65);
		effects[1] = dbc.getInt(index, 66);
		effects[2] = dbc.getInt(index, 67);
		
		effectDieSides = new int[DBC.MAX_EFFECT_INDEX];
		effectDieSides[0] = dbc.getInt(index, 68);
		effectDieSides[1] = dbc.getInt(index, 69);
		effectDieSides[2] = dbc.getInt(index, 70);
		
		effectBaseDie = new int[DBC.MAX_EFFECT_INDEX];
		effectBaseDie[0] = dbc.getInt(index, 71);
		effectBaseDie[1] = dbc.getInt(index, 72);
		effectBaseDie[2] = dbc.getInt(index, 73);
		
		effectDicePerLevel = new float[DBC.MAX_EFFECT_INDEX];
		effectDicePerLevel[0] = dbc.getFloat(index, 74);
		effectDicePerLevel[1] = dbc.getFloat(index, 75);
		effectDicePerLevel[2] = dbc.getFloat(index, 76);
		
		effectRealPointsPerLevel = new float[DBC.MAX_EFFECT_INDEX];
		effectRealPointsPerLevel[0] = dbc.getFloat(index, 77);
		effectRealPointsPerLevel[1] = dbc.getFloat(index, 78);
		effectRealPointsPerLevel[2] = dbc.getFloat(index, 79);
		
		effectBasePoints = new int[DBC.MAX_EFFECT_INDEX];
		effectBasePoints[0] = dbc.getInt(index, 80);
		effectBasePoints[1] = dbc.getInt(index, 81);
		effectBasePoints[2] = dbc.getInt(index, 82);
		
		effectMechanics = new int[DBC.MAX_EFFECT_INDEX];
		effectMechanics[0] = dbc.getInt(index, 83);
		effectMechanics[1] = dbc.getInt(index, 84);
		effectMechanics[2] = dbc.getInt(index, 85);
		
		effectImplicitTargetsA = new int[DBC.MAX_EFFECT_INDEX];
		effectImplicitTargetsA[0] = dbc.getInt(index, 86);
		effectImplicitTargetsA[1] = dbc.getInt(index, 87);
		effectImplicitTargetsA[2] = dbc.getInt(index, 88);
		
		effectImplicitTargetsB = new int[DBC.MAX_EFFECT_INDEX];
		effectImplicitTargetsB[0] = dbc.getInt(index, 89);
		effectImplicitTargetsB[1] = dbc.getInt(index, 90);
		effectImplicitTargetsB[2] = dbc.getInt(index, 91);
		
		effectRadiusIndices = new int[DBC.MAX_EFFECT_INDEX];
		effectRadiusIndices[0] = dbc.getInt(index, 92);
		effectRadiusIndices[1] = dbc.getInt(index, 93);
		effectRadiusIndices[2] = dbc.getInt(index, 94);
		
		effectApplyAuraName = new int[DBC.MAX_EFFECT_INDEX];
		effectApplyAuraName[0] = dbc.getInt(index, 95);
		effectApplyAuraName[1] = dbc.getInt(index, 96);
		effectApplyAuraName[2] = dbc.getInt(index, 97);
		
		effectAmplitudes = new int[DBC.MAX_EFFECT_INDEX];
		effectAmplitudes[0] = dbc.getInt(index, 98);
		effectAmplitudes[1] = dbc.getInt(index, 99);
		effectAmplitudes[2] = dbc.getInt(index, 100);
		
		effectMultipleValues = new float[DBC.MAX_EFFECT_INDEX];
		effectMultipleValues[0] = dbc.getFloat(index, 101);
		effectMultipleValues[1] = dbc.getFloat(index, 102);
		effectMultipleValues[2] = dbc.getFloat(index, 103);
		
		effectChainTargets = new int[DBC.MAX_EFFECT_INDEX];
		effectChainTargets[0] = dbc.getInt(index, 104);
		effectChainTargets[1] = dbc.getInt(index, 105);
		effectChainTargets[2] = dbc.getInt(index, 106);
		
		effectItemTypes = new int[DBC.MAX_EFFECT_INDEX];
		effectItemTypes[0] = dbc.getInt(index, 107);
		effectItemTypes[1] = dbc.getInt(index, 108);
		effectItemTypes[2] = dbc.getInt(index, 109);
		
		effectMiscValues = new int[DBC.MAX_EFFECT_INDEX];
		effectMiscValues[0] = dbc.getInt(index, 110);
		effectMiscValues[1] = dbc.getInt(index, 111);
		effectMiscValues[2] = dbc.getInt(index, 112);
		
		effectMiscValuesB = new int[DBC.MAX_EFFECT_INDEX];
		effectMiscValuesB[0] = dbc.getInt(index, 113);
		effectMiscValuesB[1] = dbc.getInt(index, 114);
		effectMiscValuesB[2] = dbc.getInt(index, 115);
		
		effectTriggerSpells = new int [DBC.MAX_EFFECT_INDEX];
		effectTriggerSpells[0] = dbc.getInt(index, 116);
		effectTriggerSpells[1] = dbc.getInt(index, 117);
		effectTriggerSpells[2] = dbc.getInt(index, 118);
		
		effectPointsPerComboPoint = new float[DBC.MAX_EFFECT_INDEX];
		effectPointsPerComboPoint[0] = dbc.getFloat(index, 119);
		effectPointsPerComboPoint[1] = dbc.getFloat(index, 120);
		effectPointsPerComboPoint[2] = dbc.getFloat(index, 121);
		
		spellVisual = dbc.getInt(index, 122);
		//spellVisual2 = dbc.getInt(index, 123);
		spellIconID = dbc.getInt(index, 124);
		activeIconID = dbc.getInt(index, 125);
		//spellPriority = dbc.getInt(index, 126);
		spellName = dbc.getString(index, 127); //127-142
		//spellNameFlag = dbc.getInt(index, 143);
		rank = dbc.getString(index, 144); //144-159
		//rankFlags = dbc.getInt(index, 160);
		description = dbc.getString(index, 161); //161-176
		//descriptionFlags = dbc.getInt(index, 177);
		tooltip = dbc.getString(index, 178); //178-193
		//tooltipFlags = dbc.getInt(index, 194);
		manaCostPercentage = dbc.getInt(index, 195);
		startRecoveryCategory = dbc.getInt(index, 196);
		startRecoveryTime = dbc.getInt(index, 197);
		maxTargetLevel = dbc.getInt(index, 198);
		spellFamilyName = dbc.getInt(index, 199);
		spellFamilyFlags = dbc.getLong(index, 200); //200-201
		maxAffectedTargets = dbc.getInt(index, 202);
		dmgClass = dbc.getInt(index, 203);
		preventionType = dbc.getInt(index, 204);
		//stanceBarOrder = dbc.getInt(index, 205);
		
		dmgMultipliers = new int[DBC.MAX_EFFECT_INDEX];
		dmgMultipliers[0] = dbc.getInt(index, 206);
		dmgMultipliers[1] = dbc.getInt(index, 207);
		dmgMultipliers[2] = dbc.getInt(index, 208);
		
		//minFactionID = dbc.getInt(index, 209);
		//minReputation = dbc.getInt(index, 210);
		//requiredAuraVision = dbc.getInt(index, 211);
		
		totemCategories = new int[DBC.MAX_TOTEM_INDEX];
		totemCategories[0] = dbc.getInt(index, 212);
		totemCategories[1] = dbc.getInt(index, 213);
		
		areaID = dbc.getInt(index, 214);
		schoolMask = dbc.getInt(index, 215);
	}
	
	public int calculateSimpleValue() {
		//TODO: Implement
		return 0;
	}

	public int getID() {
		return ID;
	}

	public int getCategory() {
		return category;
	}

	public int getDispel() {
		return dispel;
	}

	public int getMechanic() {
		return mechanic;
	}

	public int getAttributes() {
		return attributes;
	}

	public int getAttributesEx() {
		return attributesEx;
	}

	public int getAttributesEx2() {
		return attributesEx2;
	}

	public int getAttributesEx3() {
		return attributesEx3;
	}

	public int getAttributesEx4() {
		return attributesEx4;
	}

	public int getAttributesEx5() {
		return attributesEx5;
	}

	public int getAttributesEx6() {
		return attributesEx6;
	}

	public int getStances() {
		return stances;
	}

	public int getStancesNot() {
		return stancesNot;
	}

	public int getTargets() {
		return targets;
	}

	public int getTargetCreatureType() {
		return targetCreatureType;
	}

	public int getRequireSpellFocus() {
		return requireSpellFocus;
	}

	public int getFacingCasterFlags() {
		return facingCasterFlags;
	}

	public int getCasterAuraState() {
		return casterAuraState;
	}

	public int getTargetAuraState() {
		return targetAuraState;
	}

	public int getCastingTimeIndex() {
		return castingTimeIndex;
	}

	public int getRecoveryTime() {
		return recoveryTime;
	}

	public int getCategoryRecoveryTime() {
		return categoryRecoveryTime;
	}

	public int getInterruptFlags() {
		return interruptFlags;
	}

	public int getAuraInterruptFlags() {
		return auraInterruptFlags;
	}

	public int getChannelInterruptFlags() {
		return channelInterruptFlags;
	}

	public int getProcFlags() {
		return procFlags;
	}

	public int getProcChance() {
		return procChance;
	}

	public int getProcCharges() {
		return procCharges;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public int getBaseLevel() {
		return baseLevel;
	}

	public int getSpellLevel() {
		return spellLevel;
	}

	public int getDurationIndex() {
		return durationIndex;
	}

	public int getPowerType() {
		return powerType;
	}

	public int getManaCost() {
		return manaCost;
	}

	public int getManaCostPerLevel() {
		return manaCostPerLevel;
	}

	public int getManaPerSecond() {
		return manaPerSecond;
	}

	public int getManaPerSecondLevel() {
		return manaPerSecondLevel;
	}

	public int getRangeIndex() {
		return rangeIndex;
	}

	public float getSpeed() {
		return speed;
	}

	public int getStackAmount() {
		return stackAmount;
	}

	public int[] getTotems() {
		return totems;
	}
	
	public int getTotem(int index) {
		return totems[index];
	}

	public int[] getReagents() {
		return reagents;
	}
	
	public int getReagent(int index) {
		return reagents[index];
	}

	public int[] getReagentCounts() {
		return reagentCounts;
	}
	
	public int getReagentCount(int index) {
		return reagentCounts[index];
	}

	public int getEquippedItemClass() {
		return equippedItemClass;
	}

	public int getEquippedItemSubClassMask() {
		return equippedItemSubClassMask;
	}

	public int getEquippedItemInventoryTypeMask() {
		return equippedItemInventoryTypeMask;
	}

	public int[] getEffects() {
		return effects;
	}
	
	public int getEffect(int index) {
		return effects[index];
	}

	public int[] getEffectDieSides() {
		return effectDieSides;
	}
	
	public int getEffectDiceSide(int index)  {
		return effectDieSides[index];
	}

	public int[] getEffectBaseDie() {
		return effectBaseDie;
	}
	
	public int getEffectBaseDice(int index) {
		return effectBaseDie[index];
	}

	public float[] getEffectDicePerLevel() {
		return effectDicePerLevel;
	}
	
	public float getEffectDicePerLevel(int index) {
		return effectDicePerLevel[index];
	}

	public float[] getEffectRealPointsPerLevel() {
		return effectRealPointsPerLevel;
	}
	
	public float getEffectRealPointsPerLevel(int index) {
		return effectRealPointsPerLevel[index];
	}

	public int[] getEffectBasePoints() {
		return effectBasePoints;
	}
	
	public int getEffectBasePoints(int index) {
		return effectBasePoints[index];
	}

	public int[] getEffectMechanics() {
		return effectMechanics;
	}
	
	public int getEffectMechanic(int index) {
		return effectMechanics[index];
	}

	public int[] getEffectImplicitTargetsA() {
		return effectImplicitTargetsA;
	}
	
	public int getEffectImplicitTargetA(int index) {
		return effectImplicitTargetsA[index];
	}

	public int[] getEffectImplicitTargetsB() {
		return effectImplicitTargetsB;
	}
	
	public int getEffectImplicitTargetB(int index) {
		return effectImplicitTargetsB[index];
	}

	public int[] getEffectRadiusIndices() {
		return effectRadiusIndices;
	}
	
	public int getEffectRadiusIndex(int index) {
		return effectRadiusIndices[index];
	}

	public int[] getEffectApplyAuraName() {
		return effectApplyAuraName;
	}
	
	public int getEffectApplyAuraName(int index) {
		return effectApplyAuraName[index];
	}

	public int[] getEffectAmplitudes() {
		return effectAmplitudes;
	}
	
	public int getEffectAmplitude(int index) {
		return effectAmplitudes[index];
	}

	public float[] getEffectMultipleValues() {
		return effectMultipleValues;
	}
	
	public float getEffectMultipleValue(int index) {
		return effectMultipleValues[index];
	}

	public int[] getEffectChainTargets() {
		return effectChainTargets;
	}
	
	public int getEffectChainTarget(int index) {
		return effectChainTargets[index];
	}

	public int[] getEffectItemTypes() {
		return effectItemTypes;
	}
	
	public int getEffectItemType(int index) {
		return effectItemTypes[index];
	}

	public int[] getEffectMiscValues() {
		return effectMiscValues;
	}
	
	public int getEffectMiscValue(int index) {
		return effectMiscValues[index];
	}

	public int[] getEffectMiscValuesB() {
		return effectMiscValuesB;
	}
	
	public int getEffectMiscValueB(int index) {
		return effectMiscValuesB[index];
	}

	public int[] getEffectTriggerSpells() {
		return effectTriggerSpells;
	}
	
	public int getEffectTriggerSpells(int index) {
		return effectTriggerSpells[index];
	}

	public float[] getEffectPointsPerComboPoint() {
		return effectPointsPerComboPoint;
	}
	
	public float getEffectPointsPerComboPoints(int index) {
		return effectPointsPerComboPoint[index];
	}

	public int getSpellVisual() {
		return spellVisual;
	}

	public int getSpellIconID() {
		return spellIconID;
	}

	public int getActiveIconID() {
		return activeIconID;
	}

	public String getSpellName() {
		return spellName;
	}

	public String getRank() {
		return rank;
	}

	public String getDescription() {
		return description;
	}

	public String getTooltip() {
		return tooltip;
	}

	public int getManaCostPercentage() {
		return manaCostPercentage;
	}

	public int getStartRecoveryCategory() {
		return startRecoveryCategory;
	}

	public int getStartRecoveryTime() {
		return startRecoveryTime;
	}

	public int getMaxTargetLevel() {
		return maxTargetLevel;
	}

	public int getSpellFamilyName() {
		return spellFamilyName;
	}

	public long getSpellFamilyFlags() {
		return spellFamilyFlags;
	}

	public int getMaxAffectedTargets() {
		return maxAffectedTargets;
	}

	public int getDmgClass() {
		return dmgClass;
	}

	public int getPreventionType() {
		return preventionType;
	}

	public int[] getDmgMultipliers() {
		return dmgMultipliers;
	}
	
	public int getDmgMultiplier(int index) {
		return dmgMultipliers[index];
	}

	public int[] getTotemCategories() {
		return totemCategories;
	}
	
	public int getTotemCategory(int index) {
		return totemCategories[index];
	}

	public int getAreaID() {
		return areaID;
	}

	public int getSchoolMask() {
		return schoolMask;
	}
	
	@Override
	public String toString() {
		return String.format("SpellEntry: ", ID);
	}
	
	public static class Factory implements DBCEntryFactory<SpellEntry> {

		@Override
		public SpellEntry create(int index, DBCRecord dbc) throws DBCException {
			return new SpellEntry(index, dbc);
		}
		
	}
	
}
