package sebdomsan54.warpbooks2;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
public class Config {



    public static FileConfiguration loadConfig(){
        FileConfiguration configFile = new FileConfiguration() {
            @Override
            public String saveToString() {
                return null;
            }

            @Override
            public void loadFromString(String s) throws InvalidConfigurationException {

            }

            @Override
            protected String buildHeader() {
                return null;
            }

        };

        configFile.addDefault("youAreAwesome", "WRITTEN_BOOK");
        configFile.options().copyDefaults(true);
        return(configFile);
    }

}
