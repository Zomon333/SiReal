package com.zomon333.SiReal;
import com.zomon333.SiReal.Reference;

import net.minecraft.init.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;



@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class Main
{
    public static final String MODID = "sir";
    public static final String NAME = "SiReal";
    public static final String VERSION = "0.0.2";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.log(Level.INFO, "___________________");
        logger.log(Level.INFO, "SiReal FMLPReInitializationEvent");
        logger.log(Level.INFO, "___________________");
    }




    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.log(Level.INFO, "___________________");
        logger.log(Level.INFO, "SiReal FMLInitializationEvent");
        logger.log(Level.INFO, "___________________");

        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
