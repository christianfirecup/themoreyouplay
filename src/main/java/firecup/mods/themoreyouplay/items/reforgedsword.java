package firecup.mods.themoreyouplay.items;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;

public class reforgedsword extends SwordItem {
    public reforgedsword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed,  boolean hasincreaseddamage, Settings settings) {

        super(toolMaterial, attackDamage, attackSpeed, settings);
        hasincreaseddamage = false;
       if(hasincreaseddamage == true){
           attackDamage = attackDamage + 3;
       }else if(hasincreaseddamage ==false) {
           attackDamage = attackDamage;
       }
       }







}

