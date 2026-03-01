/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.systems.modules;

import com.koffyclient.addons.AddonManager;
import com.koffyclient.addons.MeteorAddon;
import net.minecraft.item.Items;

public class Categories {
    public static final Category SPAWNER = new Category("Spawner", Items.SPAWNER.getDefaultStack());

    public static boolean REGISTERING;

    public static void init() {
        REGISTERING = true;

        // KoffyClient
        Modules.registerCategory(SPAWNER);

        // Addons
        AddonManager.ADDONS.forEach(MeteorAddon::onRegisterCategories);

        REGISTERING = false;
    }
}
