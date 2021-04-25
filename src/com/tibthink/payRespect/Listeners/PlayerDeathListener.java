package com.tibthink.payRespect.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.tibthink.payRespect.Main;
//import com.tibthink.payRespect.Utils.Utils;

public class PlayerDeathListener implements Listener {
    private static Main plugin;

    public PlayerDeathListener(Main plugin) {
		      Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
		      if (e.getEntity().getPlayer() instanceof Player) {
            //Player killer = e.getEntity().getKiller();
            Player p = e.getEntity();
			         Bukkit.broadcastMessage(plugin.getConfig().getString("deathMsg").replace("%player%", p.getDisplayName()));

			         /*  This part is broken.  Produces Null pointer exception if player does not die by another player.  TODO: Test for killed by player or natural.
            killer.sendMessage(Utils.chat(plugin.getConfig().getString("killerMsg").replace("%player%", p.getDisplayName())));
            p.sendMessage(Utils.chat(plugin.getConfig().getString("killedMsg").replace("%player%", killer.getDisplayName())));*/
            return;
        }
    }
}
