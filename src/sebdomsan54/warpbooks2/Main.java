package sebdomsan54.warpbooks2;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    //Sets up the var plugin to reference this class
    static Main plugin;
    //Plugin manager shorthand
    private PluginManager Pm;
    public Main() {
        plugin = this;
        Pm = Bukkit.getPluginManager();
    }
    //On enable method
    @Override
    public void onEnable() {
        //Call method to load all classes
        plugin.loadClasses();
        getLogger().info("Warpbook V2 has loaded");
    }
    @Override
    public void onDisable() {
        getLogger().info("Warpbook V2 has unloaded");
    }

    //Method to Load all subclasses
    private void loadClasses() {
        Pm.registerEvents(new EventsListeners(), this);
    }



}
