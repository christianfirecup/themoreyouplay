package firecup.mods.themoreyouplay.blocks;

import firecup.mods.themoreyouplay.Themoreyouplay;
import firecup.mods.themoreyouplay.items.MagicStick;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TMYPBlocks {
    public static final Block TESTWORK = registerblock("testwork",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);





    private static Block registerblock(String name, Block block, ItemGroup tab){
        registerblockitem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Themoreyouplay.MOD_ID, name), block);
    }

    private static Item registerblockitem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Themoreyouplay.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registermodblocks(){
        Themoreyouplay.LOGGER.debug("Reg blocks for " + Themoreyouplay.MOD_ID);
    }


}
