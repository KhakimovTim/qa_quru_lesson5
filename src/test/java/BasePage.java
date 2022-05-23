import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasePage {
    StudentData studentData= new StudentData();
    Calendar calendar = new Calendar();
    AssertToForm check = new AssertToForm();
    @Test
    @AfterEach
    void fillingFields() {
        studentData
                .openPage()
                .editFields()
                .selectGenger()
                .editNumber();
        calendar.selectBirthDay("29", "July", "2008");
        studentData
                .subjects()
                .hobbies()
                .inputPicture()
                .editCurrentAddress()
                .stateCity();

    }
    @BeforeEach
    void assertText() {
        check.AssertFields();
    }
    //   $("#submit").click();
    //  $(".modal-title").shouldHave(text("Thanks for submitting the form"));
    //   $("#example-modal-sizes-title-lg").shouldBe(visible);
    //   $(".table-responsive").shouldHave(text("Khakimov Timur"), text("kyubi9@gmail.com"),
    //   text("Male"), text("8999134935"), text("29 July,2008"), text("English"),
    //   text("Music"), text("1.png"), text("no current address"), text("Haryana Panipat"));

}
