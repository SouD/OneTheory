package onetheory;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

import onetheory.base.dbc.DBCStorage;
import onetheory.base.dbc.SpellEntry;

public class OneTheory {
	
	private Properties config;
	
	public OneTheory() {
		config = new Properties();
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		InputStream stream = cl.getResourceAsStream(String.format("resources%sonetheory.properties", File.separator));
		try {
			config.load(stream);
			DBCStorage<SpellEntry> spellStore = new DBCStorage<>(new SpellEntry.Factory(), config.getProperty("DBC_PATH"));
			spellStore.load("Spell.dbc");
			SpellEntry foo = spellStore.lookupEntry(53085);
			if (foo != null) {
				System.out.println("DBC up to date");
				foo = spellStore.lookupEntry(27209);
				System.out.println(foo.getSpellName());
			} else {
				System.out.println("DBC not up to date");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new OneTheory();
	}
	
}
