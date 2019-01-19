package com.SpawnComfortPlus.spawnaltarwithtable;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = spawnaltarwithtable.MODID, name = spawnaltarwithtable.NAME, version = spawnaltarwithtable.VERSION)
public class spawnaltarwithtable
{
    public static final String MODID = "spawnaltarwithtable";
    public static final String NAME = "Spawn Altar with worktable and other comforts";
    public static final String VERSION = "The First";

    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerGenerators();
    }
}
