package com.Hileb.lnrepair_2317.proxy;

import net.minecraft.item.Item;

public class ProxyBase {
	public boolean isServer()
	{
		return false;
	}

	public void registerItemRenderer(Item item, int meta, String id) {
		//Ignored
		//SlashBlade.InitEventBus.register(new ItemSlashBlade_ItemFoxChange());
	}
}
