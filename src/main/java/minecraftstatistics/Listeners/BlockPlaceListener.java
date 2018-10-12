package minecraftstatistics.Listeners;

import minecraftstatistics.Main;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceListener implements Listener {

    private final Main plugin;
    public BlockPlaceListener(final Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();

        //Get block name as string
        String placed_block_name = block.getType().toString();


    }
}
