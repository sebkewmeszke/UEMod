package com.sebkewmeszke.uemod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Ankor on 03.05.2017.
 */
public class CreativeTabUE extends CreativeTabs {
    public CreativeTabUE(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.EMERALD);
    }

}
