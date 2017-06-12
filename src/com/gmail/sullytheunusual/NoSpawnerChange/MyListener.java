package com.gmail.sullytheunusual.NoSpawnerChange;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import net.md_5.bungee.api.ChatColor;

public class MyListener implements Listener {

	@EventHandler
	public void onSpawnerInteract(PlayerInteractEvent event) {

		if (event.getClickedBlock() != null && event.getClickedBlock().getType() == Material.MOB_SPAWNER
				&& event.getItem() != null && event.getItem().getType() == Material.MONSTER_EGG
				&& !event.getPlayer().hasPermission("nospawnerchange.bypass")) {

			event.getPlayer().sendMessage(ChatColor.RED + "You're not allowed to change spawners!");
			event.setCancelled(true);
		} else {
			return;
		}
	}

}