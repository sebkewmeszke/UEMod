package com.sebkewmeszke.uemod;


/**
 * Created by Ankor on 03.05.2017.
 */
import com.sebkewmeszke.uemod.proxy.CommonProxy;
import com.sebkewmeszke.uemod.tab.CreativeTabUE;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME,version = Main.VERSION)
public class Main {
    public static final String MODID = "assets/uemod";
    public static final String MODNAME = "Ultra Expansion Mod";
    public static final String VERSION = "0.1";

    @Instance
    public static Main instance;

    public static CreativeTabUE uETab;

    @SidedProxy(clientSide = "com.sebkewmeszke.uemod.proxy.ClientProxy", serverSide = "com.sebkewmeszke.uemod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit(e);
        uETab = new CreativeTabUE(CreativeTabs.getNextID(),"uEMTab");
    }

    @EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }

}
