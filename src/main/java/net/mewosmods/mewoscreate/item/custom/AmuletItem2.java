package net.mewosmods.mewoscreate.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class AmuletItem2 extends Item {
    public AmuletItem2(Properties pProperties) {
        super(pProperties);
    }
    public static void applyEffect(Player player) {
        player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20, 2, false, false));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, false, false));
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, false, false));

        if(player.getEffect(MobEffects.POISON) == null) {
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 30, 1, false, false));
        }


            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, false, false));


    }
}
