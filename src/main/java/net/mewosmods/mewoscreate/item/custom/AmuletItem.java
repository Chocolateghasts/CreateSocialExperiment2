package net.mewosmods.mewoscreate.item.custom;

import net.mewosmods.mewoscreate.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;

public class AmuletItem extends Item {
    public AmuletItem(Properties pProperties) {
        super(pProperties);
    }
    public static void applyEffect(Player player) {
        //System.out.println("Health: " + player.getHealth());
        player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20, 2, false, false));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, false, false));
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, false, false));

            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, false, false));


    }
}
