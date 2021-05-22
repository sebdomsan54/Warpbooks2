package sebdomsan54.warpbooks2;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.io.IOException;



public class Config {
    private final Main main;

    public Config(Main main) {
        this.main = main;
        Main plugin = main;
    }
    public String loadConfig() {
        main.getConfig().addDefault("youAreAwesome", "WRITTEN_BOOK");
        main.getConfig().options().copyDefaults(true);
        return(main.getConfig().getString("youAreAwesome").toString());
    }
}
