package com.zomon333.SiReal;

import com.zomon333.SiReal.Main;

import java.io.File;
import java.util.function.Function;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.apache.logging.log4j.Level;

public class ConfigHandler<key> {
    public static Configuration config;
    private static String file = "config/modID.cfg";

    /// Configuration initiation
    //Loads config from modID.cfg
    //
    //
    public static void init() {
        config = new Configuration(new File(file));
        try {
            config.load();
        } catch (Exception e) {
            Main.logger.log(Level.ERROR, "Cannot load configuration file!");
        } finally {
            config.save();
        }
    }

    public static void removeConfig(String category) {
        config = new Configuration(new File(file));
        try {
            config.load();
            if (config.hasCategory(category))
                config.removeCategory(new ConfigCategory(category));
        } catch (Exception e) {
            Main.logger.log(Level.ERROR, "Cannot load configuration file!");
        } finally {
            config.save();
        }
    }

    /*public static < T > T getValue(String category, String key)
    {
        /*
            String
            int
            double
            float
            long
            short
            byte
            boolean
         ///
        Property.Type toReturn = config.get(category, key, 0).getType();
        config = new Configuration(new File(file));
        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {

                 if(toReturn.getClass().equals(String.class))
                 {
                     return (T)(config.get(category, key, 0).getString());
                 }
                 if(toReturn.getClass().equals(int.class))
                 {

                 }
            }
        } catch (Exception e) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }
    }*/



}
