package net.carlospirulito.absolutecinemamod.item;

import net.carlospirulito.absolutecinemamod.AbsoluteCinemaMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AbsoluteCinemaMod.MOD_ID);

    public static final DeferredItem<Item> VIRUSOLITO = ITEMS.registerItem("virusolito",
            Item::new,
            new Item.Properties()
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
