/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.gui.screens.settings;

import com.koffyclient.gui.GuiTheme;
import com.koffyclient.gui.screens.settings.base.DynamicRegistryListSettingScreen;
import com.koffyclient.gui.widgets.WWidget;
import com.koffyclient.settings.Setting;
import com.koffyclient.utils.misc.Names;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import java.util.Set;

public class EnchantmentListSettingScreen extends DynamicRegistryListSettingScreen<Enchantment> {
    public EnchantmentListSettingScreen(GuiTheme theme, Setting<Set<RegistryKey<Enchantment>>> setting) {
        super(theme, "Select Enchantments", setting, setting.get(), RegistryKeys.ENCHANTMENT);
    }

    @Override
    protected WWidget getValueWidget(RegistryKey<Enchantment> value) {
        return theme.label(Names.get(value));
    }

    @Override
    protected String[] getValueNames(RegistryKey<Enchantment> value) {
        return new String[]{
            Names.get(value),
            value.getValue().toString()
        };
    }
}
