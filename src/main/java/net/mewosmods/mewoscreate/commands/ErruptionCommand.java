package net.mewosmods.mewoscreate.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;


public class ErruptionCommand {
        public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
            dispatcher.register(Commands.literal("disaster")
                    .then(Commands.literal("errupt")
                            .executes((commandContext) -> {

                                CommandSourceStack source = (CommandSourceStack) commandContext.getSource();
                                Player player = commandContext.getSource().getPlayer();
                                Level world = player.level();

                                double x = player.getX() + 10;
                                double y = player.getY();
                                double z = player.getZ();
                                //world.addParticle();
                                //world.explode(null, -518, 180, 160, 20, Level.ExplosionInteraction.TNT);
                                particlecloud(world, x, y, z);

                                return 1;
            })));
        }
        public static void particlecloud(Level world, double x, double y, double z) {
            double originY = y + 15;
            double ofsetX = 0;
            double ofsetZ = 0;
            double ofsetX2 = 0;
            double ofsetZ2 = 0;
            if (world instanceof ServerLevel serverWorld) {
                for (int i = 0; i < 100; i++) {
                    serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, 1, 1, 1, 1, 1, 1, 1, 1);
                }
            }

        }
}
//coordinates = -518.11 107.00 160.45 and highest point is y = 187
