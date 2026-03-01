/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package com.koffyclient.systems.waypoints.events;

import com.koffyclient.systems.waypoints.Waypoint;

public record WaypointAddedEvent(Waypoint waypoint) {
}
