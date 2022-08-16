package com.addmix.modid.items;

import com.addmix.modid.Tutorialmod;
import com.addmix.modid.items.custom.EightBallItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MODID);

public static final RegistryObject<Item> ZIRCON =ITEMS.register("zircon", ()
                    -> new Item(new Item.Properties().tab(ModCreativeModeTab.COSITAS_HOT)));

public static final RegistryObject<Item> RAW_ZIRCON =ITEMS.register("raw_zircon", ()
                    -> new Item(new Item.Properties().tab(ModCreativeModeTab.COSITAS_HOT)));

    public static final RegistryObject<Item> CORAZON =ITEMS.register("corazon", ()
            -> new Item(new Item.Properties().tab(ModCreativeModeTab.COSITAS_HOT)));

    public static final RegistryObject<Item> INTESTINO =ITEMS.register("intestino", ()
            -> new Item(new Item.Properties().tab(ModCreativeModeTab.COSITAS_HOT)));
    public static final RegistryObject<Item> NECRONOMICON =ITEMS.register("necronomicon", ()
            -> new Item(new Item.Properties().tab(ModCreativeModeTab.COSITAS_HOT)));

    public static final RegistryObject<Item> EIGHT_BALL =ITEMS.register("eight_ball", ()
            -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.COSITAS_HOT)));


    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
