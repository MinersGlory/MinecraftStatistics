package minecraftstatistics.Listeners;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.ArrayList;
import java.util.List;

public class BlockTrackingListener implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();

        // Get block name as string
        String broken_block_name = block.getType().toString();


    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();

        //Get block name as string
        String placed_block_name = block.getType().toString();


    }



    /* Below is everything involved with grouping up block types, not sure if I am doing this correctly as I am learning still. */

    // Cast ores into own array
    protected List<Material> getOres(){
        List<Material> materials = new ArrayList<Material>();
        for (Material material : Material.values()) {
            if(material.toString().contains("ORE")) {
                materials.add(material);
            }

        }
        return materials;
    }

}
