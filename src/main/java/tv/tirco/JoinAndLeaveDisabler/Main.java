package tv.tirco.JoinAndLeaveDisabler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable() {
        // Don't log enabling, Spigot does that for you automatically!
    	 Bukkit.getPluginManager().registerEvents(new JoinLeaveListener(), this);

        // Commands enabled with following method must have entries in plugin.yml
    }
    
    @Override
    public void onDisable() {
        // Don't log disabling, Spigot does that for you automatically!
    }
}
