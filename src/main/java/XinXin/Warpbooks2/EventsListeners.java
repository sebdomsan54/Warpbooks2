package main.java.XinXin.Warpbooks2;

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
    public void onPlayerJoin(PlayerJoinEvent event) {

        Bukkit.broadcastMessage("your message");

    }

    @EventHandler
    public void onPlayerClicks(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();
        player.sendMessage(event.getEventName());
        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
                player.sendMessage("You have right clicked");
            player.sendMessage(event.getHand().name().toString());
        }

    }

}
