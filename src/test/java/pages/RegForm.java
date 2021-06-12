package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegForm {

    private SelenideElement firstName = $("#firstName");
    private SelenideElement lastname = $("#lastName");
    private SelenideElement email = $("#userEmail");
    private SelenideElement gender1 = $("#genterWrapper").$("[for=gender-radio-1]");
    private SelenideElement number = $("#userNumber");
    private SelenideElement dateOfBrth = $("#dateOfBirthInput");
    private SelenideElement date = $x("//div[@class='react-datepicker-popper']//div[@class='react-datepicker__week']//div[@class='react-datepicker__day react-datepicker__day--031 react-datepicker__day--outside-month']");

    private SelenideElement subject = $("#subjectsContainer input");
    private SelenideElement secondHobby = $x("//div[@id='hobbiesWrapper']/*[2]/*[2]//label");
    private SelenideElement picture = $("#uploadPicture");
    private SelenideElement currentAddress = $("#currentAddress");
    private SelenideElement state = $("#react-select-3-input");
    private SelenideElement city = $("#react-select-4-input");
}
