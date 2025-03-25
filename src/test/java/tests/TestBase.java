package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.WebDriverConfig;
import config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    private static final WebDriverConfig config =
            ConfigFactory.create(
                    WebDriverConfig.class,
                    System.getProperties()
            );

    @BeforeAll
    static void configurationBrowser() {
        WebDriverProvider webDriverProvider = new WebDriverProvider(config);
        webDriverProvider.setConfig();
    }

    @AfterEach
    void addAttachments() {
        Selenide.closeWebDriver();
    }
}
