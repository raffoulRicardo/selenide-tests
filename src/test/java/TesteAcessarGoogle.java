import org.apache.commons.codec.StringEncoder;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TesteAcessarGoogle {

    @Test
    public void acessarGoogle() {
        open("http://google.com");
        $(By.name("q")).setValue("Selenide");
        $(By.name("btnK")).click();
        $(By.cssSelector("#rso > div:nth-child(1) > div:nth-child(1) > div > div.yuRUbf > a")).click();
        String Titulo = $(By.tagName("title")).getText();


    }

}