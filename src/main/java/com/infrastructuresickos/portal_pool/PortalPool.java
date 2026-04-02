package com.infrastructuresickos.portal_pool;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("portal_pool")
public class PortalPool {
    public static final Logger LOGGER = LogManager.getLogger();

    public PortalPool() {
        LOGGER.info("PortalPool mod initialized");
    }
}
