package krazyminer001.bettersniffer;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterSniffer implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("bettersniffer");
	public static final String MODID = "bettersniffer";

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}