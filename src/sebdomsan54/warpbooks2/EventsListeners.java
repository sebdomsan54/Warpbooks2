package sebdomsan54.warpbooks2;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class EventsListeners implements Listener{



    @EventHandler
    public void onPlayerClicks(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();
        if(action.toString().equals("RIGHT_CLICK_AIR") || action.toString().equals("RIGHT_CLICK_BLOCK")){
            player.sendMessage(Objects.requireNonNull(event.getItem()).toString());
        }
        event.setCancelled(true);
        event.setCancelled(false);
    }


}
