package com.cartnalia;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Cartnalia.MODID, name = Cartnalia.NAME, version = Cartnalia.VERSION)
public class Cartnalia {
    public static final String MODID = "cartnalia";
    public static final String NAME = "Cartnalia";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Cartnalia Mod Carregado!");
    }
}
