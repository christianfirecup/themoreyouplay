package firecup.mods.themoreyouplay.items;

import firecup.mods.themoreyouplay.Themoreyouplay;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TMYPItems {

    public static final Item STONESTICK = registeritem("stone_stick" ,
            new MagicStick(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item FORGEDDIAMONDSWORD = registeritem("swordman" , new reforgedsword(ToolMaterials.DIAMOND,3, -2.4F, false ,new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item ENGCORE = registeritem("noengcore" ,
            new MagicStick(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registeritem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(Themoreyouplay.MOD_ID, name), item);
    }

    public static void registermoditems(){
        Themoreyouplay.LOGGER.debug("Reg items for " + Themoreyouplay.MOD_ID);
    }

}
