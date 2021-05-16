package XinXin.Warpbooks2;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    @Override
    public void onEnable() {
        getLogger().info("Warpbook V2 has loaded");
    }
    @Override
    public void onDisable() {
        getLogger().info("Warpbook V2 has unloaded");
    }

}
