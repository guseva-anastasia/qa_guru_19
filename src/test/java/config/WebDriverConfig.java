package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:environment.properties"
})
public interface WebDriverConfig extends Config {

    @DefaultValue("local")
    String env();

    @Key("${env}.baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("${env}.browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("${env}.version")
    @DefaultValue("125")
    String getVersion();

    @Key("${env}.remoteUrl")
    String getRemoteURL();

    @Key("${env}.remote")
    @DefaultValue("false")
    Boolean getRemote();

    @Key("${env}.browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();



}
