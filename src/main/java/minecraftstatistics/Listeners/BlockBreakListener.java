package minecraftstatistics.Listeners;

import minecraftstatistics.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.ArrayList;
import java.util.List;

public class BlockBreakListener implements Listener {

    private final Main plugin;
    public BlockBreakListener(final Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBreak(final BlockBreakEvent event){
        final Player player = event.getPlayer();
        Block block = event.getBlock();
        final String worldName = block.getWorld().getName();

        // Get block name as string
        String broken_block_name = block.getType().toString();

        /* Insert block break data into MySQL DB below */

        // Lets see what this function is returning in terms of block name data
        player.sendMessage(ChatColor.RED + block.getBlockData().getMaterial().name());
    }


}
