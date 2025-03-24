package config;

import org.aeonbits.owner.ConfigFactory;
import com.codeborne.selenide.Configuration;

public class WebDriverProvider {

    private final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    public void setConfig(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 7000;

        Configuration.browser = String.valueOf(config.getBrowser());
        Configuration.browserVersion = config.getVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.remote = config.getRemoteURL();
        Configuration.baseUrl = config.getBaseUrl();


    }



}
