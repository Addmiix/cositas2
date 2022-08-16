package com.addmix.modid.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COSITAS_HOT = new CreativeModeTab("cositashot") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.NECRONOMICON.get());
        }
    };
}