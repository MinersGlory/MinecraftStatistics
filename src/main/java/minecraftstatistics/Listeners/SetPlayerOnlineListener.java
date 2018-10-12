package main.java.minecraftstatistics.Listeners;

import main.java.minecraftstatistics.Classes.MySQL;
import main.java.minecraftstatistics.Main;
import main.java.minecraftstatistics.Tasks.CreatePlayerOnlineTask;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SetPlayerOnlineListener implements Listener {

    protected Main plugin;

    public SetPlayerOnlineListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        (new MySQL()).validateDatabase();

        Player player = event.getPlayer();
        new CreatePlayerOnlineTask(player).runTaskAsynchronously(this.plugin);
    }

}
