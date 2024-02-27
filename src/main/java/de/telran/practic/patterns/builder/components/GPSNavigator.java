package de.telran.practic.patterns.builder.components;

import lombok.Getter;

public class GPSNavigator {
    @Getter
    private String route;

    public GPSNavigator() {
        route = "Home";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }
}