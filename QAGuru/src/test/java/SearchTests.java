import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchTests {
    @Test
    public void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }

    @Test
    public void sds() {
        LocalDate localDate = LocalDate.parse("05.03.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Assertions.assertEquals(5,localDate.getDayOfMonth());
    }//
}