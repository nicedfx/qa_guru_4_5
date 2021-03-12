package tests.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Selenide;

public class TestBase {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
}
