package net.mewosmods.mewoscreate;
import net.mewosmods.mewoscreate.commands.ErruptionCommand;
import net.mewosmods.mewoscreate.item.ModItems;
import net.mewosmods.mewoscreate.item.custom.AmuletItem;
import net.mewosmods.mewoscreate.item.custom.HotItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "mewoscreate", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventHandler {
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        // Check if player has the item and apply effects if necessary
        if (player.getInventory().contains(new ItemStack(ModItems.VOLCANIC_AMULET.get()))) {
            AmuletItem.applyEffect(player);
        }
        if (player.getInventory().contains(new ItemStack(ModItems.VOLCANIC_CRYSTAL.get()))) {
            HotItem.applyFireDamage(player);
        }
    }
    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        ErruptionCommand.register(event.getDispatcher());
        System.out.println("onregistercommandsis triggered");
    }
}