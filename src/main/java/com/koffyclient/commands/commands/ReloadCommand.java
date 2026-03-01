/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.commands.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.koffyclient.commands.Command;
import com.koffyclient.renderer.Fonts;
import com.koffyclient.systems.Systems;
import com.koffyclient.systems.friends.Friend;
import com.koffyclient.systems.friends.Friends;
import com.koffyclient.utils.network.Capes;
import com.koffyclient.utils.network.MeteorExecutor;
import net.minecraft.command.CommandSource;

public class ReloadCommand extends Command {
    public ReloadCommand() {
        super("reload", "Reloads many systems.");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            warning("Reloading systems, this may take a while.");

            Systems.load();
            Capes.init();
            Fonts.refresh();
            MeteorExecutor.execute(() -> Friends.get().forEach(Friend::updateInfo));

            return SINGLE_SUCCESS;
        });
    }
}
