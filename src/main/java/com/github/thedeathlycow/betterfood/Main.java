package com.github.thedeathlycow.betterfood;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public final class Main {

    public static final String MODID = "better-food";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Main() {
        LOGGER.debug("HELLO from BETTER FOOD");
    }
}

