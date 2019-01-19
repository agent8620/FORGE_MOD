
package com.example.BedrockStones;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyOre extends Block {

    public RubyOre() {
	super(Material.ROCK);
	this.setHardness(2F);
        this.setUnlocalizedName("Ruby ore");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setResistance(2);
    }
    
}
