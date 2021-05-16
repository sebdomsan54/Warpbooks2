package XinXin.Warpbooks2;

import main.java.XinXin.Warpbooks2.EventsListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
    //Sets up the var plugin to refrance this class
    static Main plugin;
    public Main() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        plugin.registerEvents();
        getLogger().info("Warpbook V2 has loaded");
    }
    @Override
    public void onDisable() {
        getLogger().info("Warpbook V2 has unloaded");
    }

    private void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new EventsListeners(), this);
    }
}
