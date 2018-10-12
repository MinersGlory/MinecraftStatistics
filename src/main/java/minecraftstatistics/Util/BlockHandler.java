package minecraftstatistics.Util;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockHandler {




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
