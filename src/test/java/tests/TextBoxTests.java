package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
//        Configuration.startMaximized = true;
    }

    @Test
    void dataAppearsInOutputBlockTest() {
        //arrange(given)
        open("https://demoqa.com/text-box");
        //act(when)
        $("#userName").setValue("Ivan");
        $("#userEmail").setValue("Ivan@outlook.com");
        $("#currentAddress").setValue("Current address");
        $("#permanentAddress").setValue("Permanent address");
        $("#submit").scrollTo();
        $("#submit").click();
        //assert(then)
        $("#output").shouldHave(text("Ivan"), text("Ivan@outlook.com"));
    }


}
