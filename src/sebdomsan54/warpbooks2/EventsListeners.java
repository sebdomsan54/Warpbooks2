package sebdomsan54.warpbooks2;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventsListeners implements Listener{



    @EventHandler
    public void onPlayerClicks(PlayerInteractEvent event) throws InterruptedException {
        Player player = event.getPlayer();
        Action action = event.getAction();
        if(action.toString() == "RIGHT_CLICK_AIR" || action.toString() == "RIGHT_CLICK_BLOCK"){
            player.sendMessage(event.getItem().toString());
        }
        event.setCancelled(true);
        event.setCancelled(false);
    }


}
