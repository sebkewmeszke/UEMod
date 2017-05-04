package com.sebkewmeszke.uemod.item;

import com.sebkewmeszke.uemod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Ankor on 04.05.2017.
 */
public class berylliumAxe extends ItemAxe {
    public berylliumAxe(ToolMaterial material, float damage, float speed, String name) {
        super(material, damage, speed);
        setCreativeTab(Main.uETab);
        setUnlocalizedName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
        //TODO
        //Create Radiant Tree and Give 500 Durability
    }
}
