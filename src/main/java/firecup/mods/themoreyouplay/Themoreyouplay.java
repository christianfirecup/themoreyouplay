package firecup.mods.themoreyouplay;

import firecup.mods.themoreyouplay.items.TMYPItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Themoreyouplay implements ModInitializer {
    public static final String MOD_ID = "themoreyouplay";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        TMYPItems.registermoditems();

    }
}
