package net.mewosmods.mewoscreate.item.custom;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.FireBlock;

public class HotItem extends Item {
    public HotItem(Properties pProperties) {
        super(pProperties);
    }
    public static void applyFireDamage(Player player) {
        if(player.isInWater() == false) {
            player.setSecondsOnFire(1);
        }

    }
}
