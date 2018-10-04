package com.test.config;

import org.openqa.selenium.remote.DesiredCapabilities;

public enum Browsers {

    FIREFOX("firefox", DesiredCapabilities.firefox()),
    CHROME("chrome", DesiredCapabilities.chrome());

    private String name;
    private DesiredCapabilities capabilities;

    Browsers(String name, DesiredCapabilities capabilities) {
        this.name = name;
        this.capabilities = capabilities;
    }

    public String getName() {
        return name;
    }

    public static DesiredCapabilities getCapabilities(String name) {
        for (Browsers browsers : Browsers.values()) {
            if (browsers.name.equals(name)) {
                return browsers.capabilities;
            }
        }

        throw new RuntimeException(String.format("Unknown browser '%s' ", name));
    }

}
