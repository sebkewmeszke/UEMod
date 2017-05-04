package com.sebkewmeszke.uemod.item;

import com.sebkewmeszke.uemod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.awt.*;

/**
 * Created by Ankor on 04.05.2017.
 */
public class berylliumPickaxe extends ItemPickaxe {

    public berylliumPickaxe(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(Main.uETab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(!(playerIn.inventory.getCurrentItem().getItemDamage() >= playerIn.inventory.getCurrentItem().getMaxDamage() - 500)) {
            playerIn.addPotionEffect(new PotionEffect(Potion.getPotionById(3), 1200));
            playerIn.inventory.getCurrentItem().setItemDamage(playerIn.inventory.getCurrentItem().getItemDamage()+500);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

