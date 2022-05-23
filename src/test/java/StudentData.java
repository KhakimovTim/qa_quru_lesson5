import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentData {
SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            labelGenger = $(".custom-control-label"),
            numberField = $("#userNumber"),
            subjectField = $("#subjectsContainer"),
            subjectCheck = $("subjectsInput"),
            hobbiesElement = $("#hobbiesWrapper"),
            pictureButton = $("#uploadPicture"),
            adress = $("#currentAddress"),
            stateField = $("#state"),
            cityField = $("#city"),
            stateCityElement = $("#stateCity-wrapper");

    public StudentData openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(InputData.textPage));
        return this;
    }

    public StudentData editFields() {
        firstNameInput.setValue(InputData.firstName);
        lastNameInput.setValue(InputData.lastName);
        emailInput.setValue(InputData.email);
        return this;
    }

    public StudentData selectGenger() {
        labelGenger.
                shouldHave(text(InputData.gengerText))
                .click();
        return this;
    }
    public StudentData editNumber() {
        numberField.setValue(InputData.number);
        return this;
    }
    public StudentData subjects() {
        subjectCheck.click();
        subjectCheck.setValue(InputData.subject);
        subjectCheck.pressEnter();
        return this;
    }
    public StudentData hobbies() {
        hobbiesElement.
                $(byText(InputData.hobbiesText)).
                click();
        return this;
    }
    public StudentData inputPicture() {
        pictureButton.uploadFromClasspath("1.png");
        return this;
    }
    public StudentData editCurrentAddress() {
        adress.setValue(InputData.currentAddress);
        return this;
    }
    public StudentData stateCity() {
        stateField
                .scrollTo()
                .click();
        stateCityElement
                .$(byText(InputData.stateText))
                .click();
        cityField.click();
        stateCityElement
                .$(byText(InputData.cityText))
                .click();
        return this;
    }
}
       // $("#dateOfBirthInput").scrollTo();
       // $("#dateOfBirthInput").click();

     //   $("#submit").click();
      //  $(".modal-title").shouldHave(text("Thanks for submitting the form"));
     //   $("#example-modal-sizes-title-lg").shouldBe(visible);
     //   $(".table-responsive").shouldHave(text("Khakimov Timur"), text("kyubi9@gmail.com"),
     //   text("Male"), text("8999134935"), text("29 July,2008"), text("English"),
     //   text("Music"), text("1.png"), text("no current address"), text("Haryana Panipat"));
