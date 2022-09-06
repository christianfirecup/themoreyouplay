package firecup.mods.themoreyouplay.tags;

import firecup.mods.themoreyouplay.Themoreyouplay;
import firecup.mods.themoreyouplay.items.TMYPItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TMYPReforgeTags {
    public static final TagKey<Item> OVERSHARP = TagKey.of(Registry.ITEM_KEY, new Identifier(Themoreyouplay.MOD_ID));
    public static void registertags(){
        Themoreyouplay.LOGGER.debug("Reg Tags for " + Themoreyouplay.MOD_ID);
    
    }

}
