package com.SpawnComfortPlus.spawnaltarwithtable;

import com.SpawnComfortPlus.spawnaltarwithtable.structures.AltarGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class CommonProxy {
    public void registerGenerators(){
        GameRegistry.registerWorldGenerator(new AltarGenerator(), 1);
    }
}
