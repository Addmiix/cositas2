package com.addmix.modid.items;

import com.addmix.modid.Tutorialmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MODID);

public static final RegistryObject<Item> AMETHYSTT =ITEMS.register("amethyst", ()
                    -> new Item(new Item.Properties().tab));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
