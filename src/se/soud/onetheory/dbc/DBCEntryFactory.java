package se.soud.onetheory.dbc;

public interface DBCEntryFactory<T> {

  public T create(int index, DBCRecord dbc) throws DBCException;

}
