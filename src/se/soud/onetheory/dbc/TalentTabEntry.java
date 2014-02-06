package se.soud.onetheory.dbc;

public class TalentTabEntry {

  private int ID;
  private String name;
  private int classMask;
  private int tabPage;

  public TalentTabEntry(int index, DBCRecord dbc) throws DBCException {
    int numReqFields = 23;
    if (dbc.getNumCols() != numReqFields) {
      throw new DBCException(String.format("Not enough DBC fields, got %d, expected %d", dbc.getNumCols(), numReqFields));
    }

    ID = dbc.getInt(index, 0);
    name = dbc.getString(index, 1); //1-16
    //nameFlags = dbc.getInt(index, 17);
    //spellIcon = dbc.getInt(index, 18);
    //raceMask = dbc.getInt(index, 19);
    classMask = dbc.getInt(index, 20);
    tabPage = dbc.getInt(index, 21);
    //bgFile = dbc.getString(index, 22);
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public int getClassMask() {
    return classMask;
  }

  public int getTabPage() {
    return tabPage;
  }

  @Override
  public String toString() {
    return String.format("TalentTabEntry: ", ID);
  }

  public static class Factory implements DBCEntryFactory<TalentTabEntry> {

    @Override
    public TalentTabEntry create(int index, DBCRecord dbc) throws DBCException {
      return new TalentTabEntry(index, dbc);
    }

  }

}
