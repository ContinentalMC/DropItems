package org.cmc.dropitems;

import org.bukkit.configuration.file.FileConfiguration;
import org.cmc.CMC;

import java.util.List;

public class ConfigManager {

    private static FileConfiguration config;

    public static void setupConfig(CMC cmc) {
        ConfigManager.config = cmc.getConfig();
        cmc.saveDefaultConfig();
    }

    public static List<String> getItemList() {
        return config.getStringList("Items");
    }

}
