package com.gamingimperatrix.richearth;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.gamingimperatrix.richearth.lib.ModInfo;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION, guiFactory = ModInfo.FACTORY)
public class RichEarth {

	@Instance
	public static RichEarth instance = new RichEarth();
	
	@EventHandler
	public void preInitialization(FMLPreInitializationEvent e){
		
	}
	
	@EventHandler
	public void initialization (FMLInitializationEvent e){
		
	}
	
	@EventHandler
	public void postInitialization(FMLPostInitializationEvent e){
		
	}
}
