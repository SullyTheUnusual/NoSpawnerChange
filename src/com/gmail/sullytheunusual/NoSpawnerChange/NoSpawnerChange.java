package com.gmail.sullytheunusual.NoSpawnerChange;

import org.bukkit.plugin.java.JavaPlugin;

public class NoSpawnerChange extends JavaPlugin {
	
	@Override
	public void onEnable() {
	
		getServer().getPluginManager().registerEvents(new MyListener(), this);
	}
	
	@Override
	public void onDisable () {
		
	}
	
}
