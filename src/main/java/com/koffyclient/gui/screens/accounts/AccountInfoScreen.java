/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.gui.screens.accounts;

import com.koffyclient.gui.GuiTheme;
import com.koffyclient.gui.WindowScreen;
import com.koffyclient.gui.widgets.containers.WHorizontalList;
import com.koffyclient.gui.widgets.pressable.WButton;
import com.koffyclient.systems.accounts.Account;
import com.koffyclient.systems.accounts.AccountType;
import com.koffyclient.systems.accounts.TokenAccount;
import com.koffyclient.utils.render.color.Color;

import static com.koffyclient.MeteorClient.mc;

public class AccountInfoScreen extends WindowScreen {
    private final Account<?> account;

    public AccountInfoScreen(GuiTheme theme, Account<?> account) {
        super(theme, account.getUsername() + " details");
        this.account = account;
    }

    @Override
    public void initWidgets() {
        TokenAccount e = (TokenAccount) account;
        WHorizontalList l = add(theme.horizontalList()).expandX().widget();

        String tokenLabel = account.getType() + " token:";
        if (account.getType() == AccountType.Session) tokenLabel = "";

        WButton copy = theme.button("Copy");
        copy.action = () -> mc.keyboard.setClipboard(e.getToken());

        l.add(theme.label(tokenLabel));
        l.add(theme.label(account.getType() == AccountType.Session ? "Click to copy Token" : e.getToken()).color(Color.GRAY)).pad(5);
        l.add(copy);
    }
}
