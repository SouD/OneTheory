package onetheory.base.dbc;

public class SpellEntry {
	
	private int ID;
	private int category;
	private int castUI;
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
	private int modalNextSpell;
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
	private int spellVisual2;
	private int spellIconID;
	private int activeIconID;
	private int spellPriority;
	private String spellName;
	private int spellNameFlag;
	private String rank;
	private int rankFlags;
	private String description;
	private int descriptionFlags;
	private String tooltip;
	private int tooltipFlags;
	private int manaCostPercentage;
	private int startRecoveryCategory;
	private int startRecoveryTime;
	private int maxTargetLevel;
	private int spellFamilyName;
	private int spellFamilyFlags;
	private int maxAffectedTargets;
	private int dmgClass;
	private int preventionType;
	private int stanceBarOrder;
	private int[] dmgMultipliers;
	private int minFactionID;
	private int minReputation;
	private int requiredAuraVision;
	private int[] totemCategories;
	private int areaID;
	private int schoolMask;
	
	public SpellEntry() {
		ID = 0;
		category = 0;
		castUI = 0;
		dispel = 0;
		mechanic = 0;
		attributes = 0;
		attributesEx = 0;
		attributesEx2 = 0;
		attributesEx3 = 0;
		attributesEx4 = 0;
		attributesEx5 = 0;
		attributesEx6 = 0;
		stances = 0;
		stancesNot = 0;
		targets = 0;
		targetCreatureType = 0;
		requireSpellFocus = 0;
		facingCasterFlags = 0;
		casterAuraState = 0;
		targetAuraState = 0;
		castingTimeIndex = 0;
		recoveryTime = 0;
		categoryRecoveryTime = 0;
		interruptFlags = 0;
		auraInterruptFlags = 0;
		channelInterruptFlags = 0;
		procFlags = 0;
		procChance = 0;
		procCharges = 0;
		maxLevel = 0;
		baseLevel = 0;
		spellLevel = 0;
		durationIndex = 0;
		powerType = 0;
		manaCost = 0;
		manaCostPerLevel = 0;
		manaPerSecond = 0;
		manaPerSecondLevel = 0;
		rangeIndex = 0;
		speed = 0.0f;
		modalNextSpell = 0;
		stackAmount = 0;
		totems = new int[DBC.MAX_TOTEM_INDEX];
		reagents = new int[DBC.MAX_REAGENT_INDEX];
		reagentCounts = new int[DBC.MAX_REAGENT_INDEX];
		equippedItemClass = 0;
		equippedItemSubClassMask = 0;
		equippedItemInventoryTypeMask = 0;
		effects = new int[DBC.MAX_EFFECT_INDEX];
		effectDieSides = new int[DBC.MAX_EFFECT_INDEX];
		effectBaseDie = new int[DBC.MAX_EFFECT_INDEX];
		effectDicePerLevel = new float[DBC.MAX_EFFECT_INDEX];
		effectRealPointsPerLevel = new float[DBC.MAX_EFFECT_INDEX];
		effectBasePoints = new int[DBC.MAX_EFFECT_INDEX];
		effectMechanics = new int[DBC.MAX_EFFECT_INDEX];
		effectImplicitTargetsA = new int[DBC.MAX_EFFECT_INDEX];
		effectImplicitTargetsB = new int[DBC.MAX_EFFECT_INDEX];
		effectRadiusIndices = new int[DBC.MAX_EFFECT_INDEX];
		effectApplyAuraName = new int[DBC.MAX_EFFECT_INDEX];
		effectAmplitudes = new int[DBC.MAX_EFFECT_INDEX];
		effectMultipleValues = new float[DBC.MAX_EFFECT_INDEX];
		effectChainTargets = new int[DBC.MAX_EFFECT_INDEX];
		effectItemTypes = new int[DBC.MAX_EFFECT_INDEX];
		effectMiscValues = new int[DBC.MAX_EFFECT_INDEX];
		effectMiscValuesB = new int[DBC.MAX_EFFECT_INDEX];
		effectTriggerSpells = new int [DBC.MAX_EFFECT_INDEX];
		effectPointsPerComboPoint = new float[DBC.MAX_EFFECT_INDEX];
		spellVisual = 0;
		spellVisual2 = 0;
		spellIconID = 0;
		activeIconID = 0;
		spellPriority = 0;
		spellName = "Unknown";
		spellNameFlag = 0;
		rank = "";
		rankFlags = 0;
		description = "";
		descriptionFlags = 0;
		tooltip = "";
		tooltipFlags = 0;
		manaCostPercentage = 0;
		startRecoveryCategory = 0;
		startRecoveryTime = 0;
		maxTargetLevel = 0;
		spellFamilyName = 0;
		spellFamilyFlags = 0;
		maxAffectedTargets = 0;
		dmgClass = 0;
		preventionType = 0;
		stanceBarOrder = 0;
		dmgMultipliers = new int[DBC.MAX_EFFECT_INDEX];
		minFactionID = 0;
		minReputation = 0;
		requiredAuraVision = 0;
		totemCategories = new int[DBC.MAX_TOTEM_INDEX];
		areaID = 0;
		schoolMask = 0;
	}
	
	public SpellEntry(int index, DBCRecord dbc) {
		System.out.println("Not yet implemented!");
	}

	public int getID() {
		return ID;
	}

	public int getCategory() {
		return category;
	}

	public int getCastUI() {
		return castUI;
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

	public int getModalNextSpell() {
		return modalNextSpell;
	}

	public int getStackAmount() {
		return stackAmount;
	}

	public int[] getTotems() {
		return totems;
	}
	
	public int getTotem(int index) throws ArrayIndexOutOfBoundsException {
		return totems[index];
	}

	public int[] getReagents() {
		return reagents;
	}
	
	public int getReagent(int index) throws ArrayIndexOutOfBoundsException {
		return reagents[index];
	}

	public int[] getReagentCounts() {
		return reagentCounts;
	}
	
	public int getReagentCount(int index) throws ArrayIndexOutOfBoundsException {
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
	
	public int getEffect(int index) throws ArrayIndexOutOfBoundsException {
		return effects[index];
	}

	public int[] getEffectDieSides() {
		return effectDieSides;
	}
	
	public int getEffectDiceSide(int index)  throws ArrayIndexOutOfBoundsException {
		return effectDieSides[index];
	}

	public int[] getEffectBaseDie() {
		return effectBaseDie;
	}
	
	public int getEffectBaseDice(int index) throws ArrayIndexOutOfBoundsException {
		return effectBaseDie[index];
	}

	public float[] getEffectDicePerLevel() {
		return effectDicePerLevel;
	}
	
	public float getEffectDicePerLevel(int index) throws ArrayIndexOutOfBoundsException {
		return effectDicePerLevel[index];
	}

	public float[] getEffectRealPointsPerLevel() {
		return effectRealPointsPerLevel;
	}
	
	public float getEffectRealPointsPerLevel(int index) throws ArrayIndexOutOfBoundsException {
		return effectRealPointsPerLevel[index];
	}

	public int[] getEffectBasePoints() {
		return effectBasePoints;
	}
	
	public int getEffectBasePoints(int index) throws ArrayIndexOutOfBoundsException {
		return effectBasePoints[index];
	}

	public int[] getEffectMechanics() {
		return effectMechanics;
	}
	
	public int getEffectMechanic(int index) throws ArrayIndexOutOfBoundsException {
		return effectMechanics[index];
	}

	public int[] getEffectImplicitTargetsA() {
		return effectImplicitTargetsA;
	}
	
	public int getEffectImplicitTargetA(int index) throws ArrayIndexOutOfBoundsException {
		return effectImplicitTargetsA[index];
	}

	public int[] getEffectImplicitTargetsB() {
		return effectImplicitTargetsB;
	}
	
	public int getEffectImplicitTargetB(int index) throws ArrayIndexOutOfBoundsException {
		return effectImplicitTargetsB[index];
	}

	public int[] getEffectRadiusIndices() {
		return effectRadiusIndices;
	}
	
	public int getEffectRadiusIndex(int index) throws ArrayIndexOutOfBoundsException {
		return effectRadiusIndices[index];
	}

	public int[] getEffectApplyAuraName() {
		return effectApplyAuraName;
	}
	
	public int getEffectApplyAuraName(int index) throws ArrayIndexOutOfBoundsException {
		return effectApplyAuraName[index];
	}

	public int[] getEffectAmplitudes() {
		return effectAmplitudes;
	}
	
	public int getEffectAmplitude(int index) throws ArrayIndexOutOfBoundsException {
		return effectAmplitudes[index];
	}

	public float[] getEffectMultipleValues() {
		return effectMultipleValues;
	}
	
	public float getEffectMultipleValue(int index) throws ArrayIndexOutOfBoundsException {
		return effectMultipleValues[index];
	}

	public int[] getEffectChainTargets() {
		return effectChainTargets;
	}
	
	public int getEffectChainTarget(int index) throws ArrayIndexOutOfBoundsException {
		return effectChainTargets[index];
	}

	public int[] getEffectItemTypes() {
		return effectItemTypes;
	}
	
	public int getEffectItemType(int index) throws ArrayIndexOutOfBoundsException {
		return effectItemTypes[index];
	}

	public int[] getEffectMiscValues() {
		return effectMiscValues;
	}
	
	public int getEffectMiscValue(int index) throws ArrayIndexOutOfBoundsException {
		return effectMiscValues[index];
	}

	public int[] getEffectMiscValuesB() {
		return effectMiscValuesB;
	}
	
	public int getEffectMiscValueB(int index) throws ArrayIndexOutOfBoundsException {
		return effectMiscValuesB[index];
	}

	public int[] getEffectTriggerSpells() {
		return effectTriggerSpells;
	}
	
	public int getEffectTriggerSpells(int index) throws ArrayIndexOutOfBoundsException {
		return effectTriggerSpells[index];
	}

	public float[] getEffectPointsPerComboPoint() {
		return effectPointsPerComboPoint;
	}
	
	public float getEffectPointsPerComboPoints(int index) throws ArrayIndexOutOfBoundsException {
		return effectPointsPerComboPoint[index];
	}

	public int getSpellVisual() {
		return spellVisual;
	}

	public int getSpellVisual2() {
		return spellVisual2;
	}

	public int getSpellIconID() {
		return spellIconID;
	}

	public int getActiveIconID() {
		return activeIconID;
	}

	public int getSpellPriority() {
		return spellPriority;
	}

	public String getSpellName() {
		return spellName;
	}

	public int getSpellNameFlag() {
		return spellNameFlag;
	}

	public String getRank() {
		return rank;
	}

	public int getRankFlags() {
		return rankFlags;
	}

	public String getDescription() {
		return description;
	}

	public int getDescriptionFlags() {
		return descriptionFlags;
	}

	public String getTooltip() {
		return tooltip;
	}

	public int getTooltipFlags() {
		return tooltipFlags;
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

	public int getSpellFamilyFlags() {
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

	public int getStanceBarOrder() {
		return stanceBarOrder;
	}

	public int[] getDmgMultipliers() {
		return dmgMultipliers;
	}
	
	public int getDmgMultiplier(int index) throws ArrayIndexOutOfBoundsException {
		return dmgMultipliers[index];
	}

	public int getMinFactionID() {
		return minFactionID;
	}

	public int getMinReputation() {
		return minReputation;
	}

	public int getRequiredAuraVision() {
		return requiredAuraVision;
	}

	public int[] getTotemCategories() {
		return totemCategories;
	}
	
	public int getTotemCategory(int index) throws ArrayIndexOutOfBoundsException {
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
		return String.format("Entry: %d", ID);
	}
	
	public static class Factory implements DBCEntryFactory<SpellEntry> {

		@Override
		public SpellEntry create() {
			return new SpellEntry();
		}

		@Override
		public SpellEntry create(int index, DBCRecord dbc) {
			return new SpellEntry(index, dbc);
		}
		
	}
	
}
