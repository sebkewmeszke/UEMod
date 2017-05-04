package com.sebkewmeszke.uemod.item;

import com.sebkewmeszke.uemod.Main;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Ankor on 04.05.2017.
 */
public class berylliumSword extends ItemSword {
    public Entity entity;

    public berylliumSword(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(Main.uETab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(playerIn.inventory.getCurrentItem().getItemDamage() <= playerIn.inventory.getCurrentItem().getMaxDamage()-1000)
        {
            playerIn.inventory.getCurrentItem().setItemDamage(playerIn.inventory.getCurrentItem().getItemDamage()+1000);
        entity = new EntityIronGolem(worldIn);
        entity.setPosition(playerIn.getPosition().getX(),playerIn.getPosition().getY(), playerIn.getPosition().getZ());
        worldIn.spawnEntity(entity);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
