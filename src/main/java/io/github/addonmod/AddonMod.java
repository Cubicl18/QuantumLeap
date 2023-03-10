package io.github.addonmod;

import io.github.addonmod.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

@Mod(
    modid = Reference.MOD_ID, 
    name = Reference.MOD_NAME, 
    useMetadata = true, 
    version = Reference.MOD_VERSION, 
    dependencies = Reference.MOD_DEPENDENCIES, 
    acceptedMinecraftVersions = "[1.12, 1.13)"
)
public class AddonMod
{

    @SidedProxy(clientSide = "io.github.addonmod.proxy.ClientProxy", serverSide = "io.github.addonmod.proxy.CommonProxy")
    public static IProxy proxy;

    @Instance(Reference.MOD_ID)
    public static AddonMod _instance;

    public AddonMod()
    {
    }

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    @EventHandler
    public void onServerStarting(FMLServerStartingEvent event)
    {
    }

    @EventHandler
    public void onServerStarted(FMLServerStartedEvent event)
    {
    }

    @EventHandler
    public void onServerStopping(FMLServerStoppingEvent event)
    {
    }
}
