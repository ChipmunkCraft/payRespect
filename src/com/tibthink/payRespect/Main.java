package com.tibthink.payRespect;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.tibthink.payRespect.Listeners.PlayerDeathListener;
import com.tibthink.payRespect.Utils.Utils;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new PlayerDeathListener(this);
		// startup
		// reloads
		// plugins do a reload

	}

	@Override
	public void onDisable() {
		// shutdown
		// reload
		// plugins reboot

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("testpr")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(Utils.chat(getConfig().getString("testMsg").replace("%player%", player.getDisplayName())));

				return true;
			} else {
				sender.sendMessage(Utils.chat(getConfig().getString("notPermitted")));

			}
		}

		return false;
	}

}
