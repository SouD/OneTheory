package onetheory.base.dbc;

public interface DBCEntryFactory<T> {
	
	public T create();
	public T create(int index, DBCRecord dbc);
	
}
