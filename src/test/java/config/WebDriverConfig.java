package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("version")
    @DefaultValue("127")
    String getVersion();

    @Key("remoteUrl")
    String getRemoteURL();

    @Key("remote")
    @DefaultValue("false")
    Boolean getRemote();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();



}
