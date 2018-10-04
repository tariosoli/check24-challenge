package com.test.config;
import io.mikael.urlbuilder.UrlBuilder;
import ru.yandex.qatools.properties.annotations.Property;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.yandex.qatools.properties.PropertyLoader;

public class Config {

    private static final String DEFAULT_HOST = "www.check24.de";
    private static final String DEFAULT_GRID = "http://localhost:4444/wd/hub";
    private static final String DEFAUL_BROWSER = Browsers.CHROME.getName();

    private static Config CONFIG;

    public static synchronized Config instance() {
        if (CONFIG == null) {
            CONFIG = new Config();
        }

        return CONFIG;
    }

    private Config() {
        PropertyLoader.populate(this);
    }

    @Property("host")
    private String host = DEFAULT_HOST;

    @Property("browser")
    private String browser = DEFAUL_BROWSER;

    @Property("grid")
    private String grid = DEFAULT_GRID;

    public UrlBuilder getHost() {
        return UrlBuilder.empty()
                .withHost(host)
                .withScheme("https");
    }

    public DesiredCapabilities getCapabilities() {
        return Browsers.getCapabilities(this.browser);
    }

    public synchronized String getGrid() {
        return grid;
    }

}
