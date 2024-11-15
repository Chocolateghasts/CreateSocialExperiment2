package net.mewosmods.mewoscreate.item;

import net.mewosmods.mewoscreate.MewosCustomServer;
import net.mewosmods.mewoscreate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MewosCustomServer.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Mewos_Create_Tab = CREATIVE_MODE_TABS.register("mewos_create_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VOLCANIC_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.mewos_create_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VOLCANIC_CRYSTAL.get());
                        pOutput.accept(ModItems.VOLCANIC_AMULET.get());

                        pOutput.accept(ModBlocks.VOLCANIC_CRYSTAL_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
