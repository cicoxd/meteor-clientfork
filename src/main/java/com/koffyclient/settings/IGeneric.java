/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.settings;

import com.koffyclient.gui.GuiTheme;
import com.koffyclient.gui.WidgetScreen;
import com.koffyclient.utils.misc.ICopyable;
import com.koffyclient.utils.misc.ISerializable;

public interface IGeneric<T extends IGeneric<T>> extends ICopyable<T>, ISerializable<T> {
    WidgetScreen createScreen(GuiTheme theme, GenericSetting<T> setting);
}
