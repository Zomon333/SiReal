package com.zomon333.SiReal;

import com.zomon333.SiReal.Main;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.*;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.RegistryBuilder;
import org.apache.logging.log4j.Level;


public class RegistryHandler extends Main {

    @SubscribeEvent public void registerBlocks(RegistryEvent.Register<Block> event){
        logger.log(Level.INFO, "___________________");
        logger.log(Level.INFO, "SiReal RegistryEvent.Register<Block>");
        logger.log(Level.INFO, "___________________");
        int i = 0;
        while(i<BlockHolderHelper.blockCount)
        {
            event.getRegistry().register(BlockHolderHelper.blockList[i]);
            i+=1;
        }
    }

    @SubscribeEvent public void registerItems(RegistryEvent.Register<Item> event){
        logger.log(Level.INFO, "___________________");
        logger.log(Level.INFO, "SiReal RegistryEvent.Register<Item>");
        logger.log(Level.INFO, "___________________");
        int i = 0;
        while(i<ItemHolderHelper.itemCount)
        {
            event.getRegistry().register(ItemHolderHelper.itemList[i]);
            i+=1;
        }
    }

    @SubscribeEvent public void catchRegistry(RegistryEvent.NewRegistry event)
    {
        logger.log(Level.INFO, "___________________");
        logger.log(Level.INFO, "SiReal RegistryEvent.NewRegistry");
        logger.log(Level.INFO, "___________________");
        //RegistryBuilder::create;
        //https://mcforge.readthedocs.io/en/1.12.x/concepts/registries/#creating-registries
    }

}


class BlockHolderHelper
{
    public static final int blockCount = 0;

    public static final Block[] blockList = {

    };
}

@ObjectHolder("sir")
class BlockHolder extends IForgeRegistryEntry.Impl
{}

class ItemHolderHelper
{
    public static final int itemCount = 9;
    public static final Item[] itemList = {
            ItemHolder.silicates, //0
            ItemHolder.raw_silicon, //1
            ItemHolder.silicon_crystal, //2
            ItemHolder.unpolished_wafer, //3
            ItemHolder.polished_wafer, //4
            ItemHolder.epitaxially_enhanced_wafer, //5
            ItemHolder.wafer_mask, //6
            ItemHolder.gold_wire, //7
            ItemHolder.p_type_dopant, //8
            ItemHolder.n_type_dopant //9
    };
}
@ObjectHolder("sir")
class ItemHolder extends IForgeRegistryEntry.Impl
{
    //0
    //Silicates
    //Gained from filtering sand
    @ObjectHolder("sir:silicates")
    public static final Item silicates = null;

    //1
    //Raw Silicon
    //Gained from smelting Silicates
    @ObjectHolder("sir:si")
    public static final Item raw_silicon = null;

    //2
    //Silicon Crystal
    //Gained from smelting Raw Silicon
    @ObjectHolder("sir:si_crystal")
    public static final Item silicon_crystal = null;

    //3
    //Unpolished Wafer
    //Gained from slicing Silicon Crystals
    @ObjectHolder("sir:si_wafer")
    public static final Item unpolished_wafer = null;

    //4
    //Polished Wafer
    //Gained from polishing Unpolished Wafers
    @ObjectHolder("sir:si_wafer_polished")
    public static final Item polished_wafer = null;

    //5
    //Epitaxially Enhanced Wafer
    //Gained from enhancing Polished Wafers
    @ObjectHolder("sir:si_wafer_enhanced")
    public static final Item epitaxially_enhanced_wafer = null;

    //6
    //Wafer Mask
    //Craftable from Iron Ingots, Paper, and Slime Balls
    @ObjectHolder("sir:wafer_mask")
    public static final Item wafer_mask = null;

    //7
    //Gold Wire
    //Gained from passing gold ingots through an Extruder
    @ObjectHolder("sir:gold_wire")
    public static final Item gold_wire = null;

    //8
    //P-Type Dopant
    //
    @ObjectHolder("sir:p_dopant")
    public static final Item p_type_dopant = null;

    //9
    //N-Type Dopant
    //
    @ObjectHolder("sir:n_dopant")
    public static final Item n_type_dopant = null;

}
