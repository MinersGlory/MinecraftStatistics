package minecraftstatistics.Listeners;

import minecraftstatistics.Classes.MySQL;
import minecraftstatistics.Main;
import minecraftstatistics.Tasks.CreatePlayerOnlineTask;
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
