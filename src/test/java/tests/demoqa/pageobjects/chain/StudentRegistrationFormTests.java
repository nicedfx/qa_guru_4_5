package tests.demoqa.pageobjects.chain;

import org.junit.jupiter.api.Test;
import tests.demoqa.TestBase;

public class StudentRegistrationFormTests extends TestBase {
    StudentRegistrationPage studentRegistrationPage;

    @Test
    void successfulFillFormTest() {
        studentRegistrationPage = new StudentRegistrationPage();

        studentRegistrationPage.openPage()
                .fillForm()
                .checkData();
    }
}
