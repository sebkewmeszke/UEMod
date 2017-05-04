package com.sebkewmeszke.uemod.item;

import com.sebkewmeszke.uemod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Ankor on 04.05.2017.
 */
public class berylliumSpade extends ItemSpade {

    public berylliumSpade(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(Main.uETab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        //TODO
        //Don't know yet
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
