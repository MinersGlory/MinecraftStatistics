package main.java.minecraftstatistics.Listeners;

import main.java.minecraftstatistics.Classes.MySQL;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class SetPlayerOfflineListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        (new MySQL()).validateDatabase();

        Player player = event.getPlayer();

        String query = "UPDATE " + MySQL.table + " SET is_online=0 WHERE uuid='" + player.getUniqueId() + "' AND server = '" + MySQL.servername + "'";
        (new MySQL()).updateAsync(query);
    }

}
