package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTests extends TestBase{


    @Test
    public void testGithub() {
        open("/");
        $("#hero-section-brand-heading")
                .shouldHave(text("Build and ship software on a single, collaborative platform"));
    }

}
