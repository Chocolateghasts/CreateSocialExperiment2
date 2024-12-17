package net.mewosmods.mewoscreate.item;

import net.mewosmods.mewoscreate.MewosCustomServer;
import net.mewosmods.mewoscreate.item.custom.AmuletItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MewosCustomServer.MOD_ID);
    public static final RegistryObject<Item> VOLCANIC_CRYSTAL = ITEMS.register("volcanic_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOLCANIC_AMULET = ITEMS.register("volcanic_amulet",
            () -> new AmuletItem(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    public static final RegistryObject<Item> VOLCANIC_SWORD = ITEMS.register("volcanic_sword",
            () -> new Item(new Item.Properties()));
}
