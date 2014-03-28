package com.steamPowered.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;


@Mod(modid = "SteamPowered", name = "SteamPowered", version = "ALPHA 1.0")
public class SteamPowered {
@SidedProxy(clientSide = "com.steamPowered.common.ClientProxy", serverSide="com.steamPowered.common.CommonProxy")
public static CommonProxy proxy;
	
	
	
	public SteamPowered(){
	
		
		
		
		
	}

}
