package se.soud.onetheory.dbc;

public class SpellRadiusEntry {

  private int ID;
  private float radius;

  public SpellRadiusEntry(int index, DBCRecord dbc) throws DBCException {
    int numReqFields = 4;
    if (dbc.getNumCols() != numReqFields) {
      throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
    }

    ID = dbc.getInt(index, 0);
    radius = dbc.getFloat(index, 1);
    //radiusPerLevel = dbc.getFloat(index, 2);
    //radiusMax = dbc.getFloat(index, 3);
  }

  public int getID() {
    return ID;
  }

  public float getRadius() {
    return radius;
  }

  @Override
  public String toString() {
    return String.format("SpellRadiusEntry: ", ID);
  }

  public static class Factory implements DBCEntryFactory<SpellRadiusEntry> {

    @Override
    public SpellRadiusEntry create(int index, DBCRecord dbc) throws DBCException {
      return new SpellRadiusEntry(index, dbc);
    }

  }

}
