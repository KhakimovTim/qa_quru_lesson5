import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;
public class Calendar {
    public void selectBirthDay(String day, String month, String year){
        $("#dateOfBirthInput").click();
        $("[class*='month-select']").selectOptionByValue(month);
        $("[class*='year-select']").selectOptionByValue(year);
        String dayLocator = format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)", day);
        $(dayLocator).click();
    }

}
