/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.gui.themes.meteor.widgets;

import com.koffyclient.gui.WidgetScreen;
import com.koffyclient.gui.themes.meteor.MeteorWidget;
import com.koffyclient.gui.widgets.WAccount;
import com.koffyclient.systems.accounts.Account;
import com.koffyclient.utils.render.color.Color;

public class WMeteorAccount extends WAccount implements MeteorWidget {
    public WMeteorAccount(WidgetScreen screen, Account<?> account) {
        super(screen, account);
    }

    @Override
    protected Color loggedInColor() {
        return theme().loggedInColor.get();
    }

    @Override
    protected Color accountTypeColor() {
        return theme().textSecondaryColor.get();
    }
}
