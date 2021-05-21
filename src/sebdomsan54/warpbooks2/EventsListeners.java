package sebdomsan54.warpbooks2;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;
import java.util.Objects;

public class EventsListeners implements Listener{



    @EventHandler
    public void onPlayerClicks(PlayerInteractEvent event){
        Player player = event.getPlayer();

        ItemStack item = event.getItem();
        Action action = event.getAction();
        if(action.toString().equals("RIGHT_CLICK_AIR") || action.toString().equals("RIGHT_CLICK_BLOCK")){
            player.sendMessage(String.valueOf(Objects.requireNonNull(item.getType())));
        }
        player.sendMessage(Config.loadConfig().getString("youAreAwesome"));
        event.setCancelled(true);
        event.setCancelled(false);
    }


}
