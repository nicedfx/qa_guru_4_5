package gitHub;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideInGitHub() {
        //open ginthub page
        Selenide.open("https://github.com");
        //enter "selenide" in the search field
        Selenide.$("[data-scoped-placeholder='Search']").setValue("Selenide").pressEnter();
        //click on the first project from the list
        Selenide.$$("ul.repo-list").first().$("a").click();
        //check project name: "selenide/selenide"
        Selenide.$("h1").shouldHave(Condition.text("selenide / selenide"));

    }
}
