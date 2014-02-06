package se.soud.onetheory.dbc;

public class SpellRangeEntry {

  private int ID;
  private float minRange;
  private float maxRange;

  public SpellRangeEntry(int index, DBCRecord dbc) throws DBCException {
    int numReqFields = 38;
    if (dbc.getNumCols() != numReqFields) {
      throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
    }

    ID = dbc.getInt(index, 0);
    minRange = dbc.getFloat(index, 1);
    maxRange = dbc.getFloat(index, 2);
    //flags = dbc.getInt(index, 3);
    //name = dbc.getString(index, 4); //4-19
    //nameFlags = dbc.getInt(index, 20);
    //shortName = dbc.getString(index, 21); //21-36
    //shortNameFlags = dbc.getInt(index, 37);
  }

  public int getID() {
    return ID;
  }
  public float getMinRange() {
    return minRange;
  }
  public float getMaxRange() {
    return maxRange;
  }

  @Override
  public String toString() {
    return String.format("SpellRangeEntry: ", ID);
  }

  public static class Factory implements DBCEntryFactory<SpellRangeEntry> {

    @Override
    public SpellRangeEntry create(int index, DBCRecord dbc) throws DBCException {
      return new SpellRangeEntry(index, dbc);
    }

  }

}
