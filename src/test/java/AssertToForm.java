import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AssertToForm {
    StudentData studentData = new StudentData();
    SelenideElement
        button = $("#submit"),
        nameForm = $(".modal-title"),
        tableToForm =  $(".table-responsive"),
        Form = $("#example-modal-sizes-title-lg");
    void AssertFields(){
        button.click();
        nameForm.shouldHave(text("Thanks for submitting the form"));
        Form.shouldBe(visible);
        tableToForm.shouldHave(
                        text(InputData.firstName + ' ' + InputData.lastName),
                        text(InputData.email),
                        text(InputData.gengerText),
                        text(InputData.number),
                        text("29 July,2008"),
                        text("English"),
                        text(InputData.hobbiesText),
                        text(InputData.currentAddress),
                        text("1.png"),
                        text(InputData.stateText + ' ' +  InputData.cityText));


    }
}
