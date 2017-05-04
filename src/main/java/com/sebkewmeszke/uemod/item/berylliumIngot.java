package com.sebkewmeszke.uemod.item;

import com.sebkewmeszke.uemod.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ankor on 03.05.2017.
 */
public class berylliumIngot {

    public static Item berylliumOre;
    public static Item berylliumIg;
    public static Item berylliumSword;
    public static Item berylliumPickaxe;
    public static Item berylliumAxe;
    public static Item berylliumSpade;
    public static Item berylliumHoe;
    public static Item.ToolMaterial beryllium = EnumHelper.addToolMaterial("BERYLLIUM", 4 , 3000, 10.0f, 6.5f, 5 );

    public static void preinit(){
        berylliumIg = new ItemBerylliumItem("beryllium_ingot");
        berylliumSword = new berylliumSword(beryllium,"beryllium_sword");
        berylliumPickaxe = new berylliumPickaxe(beryllium, "beryllium_pickaxe");
        berylliumAxe = new berylliumAxe(beryllium,3.0f, -2.0f, "beryllium_axe");
        berylliumSpade = new berylliumSpade(beryllium, "beryllium_spade");
        berylliumHoe = new berylliumHoe(beryllium, "beryllium_hoe");
        berylliumOre = new berylliumOre("beryllium_ore");

        registerItems();
    }

    public static void registerItems()
    {
        GameRegistry.register(berylliumIg, new ResourceLocation(Main.MODID,"beryllium_ingot"));
        GameRegistry.register(berylliumSword, new ResourceLocation(Main.MODID,"beryllium_sword"));
        GameRegistry.register(berylliumAxe, new ResourceLocation(Main.MODID,"beryllium_axe"));
        GameRegistry.register(berylliumHoe, new ResourceLocation(Main.MODID,"beryllium_hoe"));
        GameRegistry.register(berylliumSpade, new ResourceLocation(Main.MODID,"beryllium_spade"));
        GameRegistry.register(berylliumPickaxe, new ResourceLocation(Main.MODID,"beryllium_pickaxe"));
        GameRegistry.register(berylliumOre, new ResourceLocation(Main.MODID,"beryllium_ore"));
    }

    public static void registerRenders(){
        registerRender(berylliumIg);
        registerRender(berylliumSword);
        registerRender(berylliumPickaxe);
        registerRender(berylliumAxe);
        registerRender(berylliumSpade);
        registerRender(berylliumHoe);
        registerRender(berylliumOre);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory" ));

    }
}
