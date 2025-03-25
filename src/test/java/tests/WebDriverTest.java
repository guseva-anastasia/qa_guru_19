package tests;

import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WebDriverTest {

    @Test
    public void testSelenoidEnv() {

        System.setProperty("env", "selenoid");
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(config.getBrowser()).isEqualTo("CHROME");
        assertThat(config.getRemote()).isEqualTo(true);
        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.getVersion()).isEqualTo("127");
        assertThat(config.getBrowserSize()).isEqualTo("1920x1080");
        assertThat(config.getRemoteURL()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub");
    }

    @Test
    public void testLocalEnv() {

        System.setProperty("env", "local");
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(config.getBrowser()).isEqualTo("CHROME");
        assertThat(config.getRemote()).isEqualTo(false);
        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.getVersion()).isEqualTo("127");
        assertThat(config.getBrowserSize()).isEqualTo("1920x1080");
    }

}
