package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {

    @BeforeAll
    static void setUp() {
        Configuration.startMaximized=true;

    }

    @BeforeEach
    void initialize() {
        open("https://demoqa.com/automation-practice-form");
    }

    @AfterEach
    void close() {
        closeWebDriver();
    }

    @Test
    void fillForm() {

        String firstName = "Aleksey";
        String lastName = "Panov";
        String email = "blackblastbox@gmail.com";
        String phoneNumber = "89277271769";
        String subject = "some subj";
        String curAddress = "Samara 44-21";

        $("#firstName").sendKeys(firstName);
        $("#lastName").sendKeys(lastName);
        $("#userEmail").sendKeys(email);
        $("#genterWrapper").$("[for=gender-radio-1]").click();
        $("#userNumber").sendKeys(phoneNumber);
        $("#dateOfBirthInput").click();
        $(byXpath("//div[@class='react-datepicker-popper']//div[@class='react-datepicker__week']//div[@class='react-datepicker__day react-datepicker__day--031 react-datepicker__day--outside-month']")).click();
        $("#subjectsWrapper").sendKeys(subject);
        $(byXpath("#hobbiesWrapper/*[2]")).click();
        $("#uploadPicture").sendKeys("C:\\Users\\blast\\Pictures\\20210522_091402.jpg");
        $("#currentAddress").sendKeys(curAddress);
        $(byText("Select State")).click();

        $("#submit").click();
    }


}
