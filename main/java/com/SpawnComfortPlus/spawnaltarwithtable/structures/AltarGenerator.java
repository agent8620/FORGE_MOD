package com.SpawnComfortPlus.spawnaltarwithtable.structures;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.fml.common.IWorldGenerator;


public class AltarGenerator implements IWorldGenerator{
    
    
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()){
            case 0:
                this.runAltarGenerator(world, random);
                break;
            default:
                break;
        }
    }
    int y = 120;
    boolean work = true;
    private static final ResourceLocation Altar = new ResourceLocation("spawnaltarwithtable","spawnaltarwithtable");
    public void runAltarGenerator(World world, Random random){
        if(work){
            int x = 0;
            int z = 0;
            if(world.getBlockState(new BlockPos(x,0,z)).getBlock() == Blocks.AIR){
                AltarBuild( x,  z,  world);
                return;
            }
            if(world.getBlockState(new BlockPos(x,y,z)).getBlock() != Blocks.AIR 
               && world.getBlockState(new BlockPos(x,y,z)).getBlock() != Blocks.CRAFTING_TABLE  
               && world.getBlockState(new BlockPos(x,y,z)).getBlock() != Blocks.LEAVES 
               && (world.getBlockState(new BlockPos(x,y+1,z)).getBlock() == Blocks.AIR
               || world.getBlockState(new BlockPos(x,y+1,z)).getBlock() == Blocks.LEAVES)
               ){
                    AltarBuild( x,  z,  world);
            }
            else
            y--;
        }
    }

    public void AltarBuild(int x, int z, World world){
                work = false;
                final PlacementSettings settings = new PlacementSettings().setRotation(Rotation.NONE);
                final Template template = world.getSaveHandler().getStructureTemplateManager().getTemplate(world.getMinecraftServer(), Altar);
                template.addBlocksToWorld(world, new BlockPos(x*16 - template.getSize().getX()/2,y-5,z*16 - template.getSize().getZ()/2), settings); 
                world.getWorldInfo().setSpawn(new BlockPos(x+0,y+3,z+0));
                
}



}


