package se.soud.onetheory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class OneTheory {

  private Properties config;

  public OneTheory() {
    config = new Properties();
    ClassLoader cl = Thread.currentThread().getContextClassLoader();
    InputStream stream = cl.getResourceAsStream(String.format("resources%sonetheory.properties", File.separator));

    try {
      config.load(stream);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    // DBCStorage<SpellEntry> spellStore = new DBCStorage<>(new SpellEntry.Factory(), config.getProperty("DBC_PATH"));
    // spellStore.load("Spell.dbc");
    // SpellEntry foo = spellStore.lookupEntry(53085);
  }

}
