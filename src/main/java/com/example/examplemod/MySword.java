package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
public class MySword extends net.minecraft.item.ItemSword {
    public MySword(ToolMaterial material) {
        super(material);
        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
