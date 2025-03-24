package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class);

    @BeforeAll
    static void configurationBrowser() {
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = config.getRemoteURL();
    }

    @AfterEach
    void addAttachments() {
        Selenide.closeWebDriver();
    }
}
