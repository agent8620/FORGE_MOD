package com.example.BedrockStones;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = BedrockStones.MODID, version = BedrockStones.VERSION, name = BedrockStones.NAME)
public class BedrockStones
{
    public static final String MODID = "BedrockStones";
    public static final String NAME = "Bedrock Stones";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
 public static Block blockRubyOre;
 
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {
        blockRubyOre = new RubyOre();
        
    }
}