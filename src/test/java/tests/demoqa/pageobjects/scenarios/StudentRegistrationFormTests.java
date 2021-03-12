package tests.demoqa.pageobjects.scenarios;

import org.junit.jupiter.api.Test;
import tests.demoqa.TestBase;

public class StudentRegistrationFormTests extends TestBase {
    StudentRegistrationPage studentRegistrationPage;

    @Test
    void successfulFillFormTest() {
        studentRegistrationPage = new StudentRegistrationPage();

        studentRegistrationPage.openPage();
        studentRegistrationPage.fillForm();
        studentRegistrationPage.checkData();
    }
}
