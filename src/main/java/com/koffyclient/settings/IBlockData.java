/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.settings;

import com.koffyclient.gui.GuiTheme;
import com.koffyclient.gui.WidgetScreen;
import com.koffyclient.utils.misc.IChangeable;
import com.koffyclient.utils.misc.ICopyable;
import com.koffyclient.utils.misc.ISerializable;
import net.minecraft.block.Block;

public interface IBlockData<T extends ICopyable<T> & ISerializable<T> & IChangeable & IBlockData<T>> {
    WidgetScreen createScreen(GuiTheme theme, Block block, BlockDataSetting<T> setting);
}
