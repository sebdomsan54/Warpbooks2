package XinXin.Warpbooks2;

import net.minecraft.server.v1_16_R3.ContainerPlayer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
    @Override
    public void onEnable() {
        getLogger().info("Yeet on");
        getServer().getPluginManager().registerEvents((Listener) this, this);
    }
    @Override
    public void onDisable() {
        getLogger().info("Yeet off");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Bukkit.broadcastMessage("your message");

    }

}
