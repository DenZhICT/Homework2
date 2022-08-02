package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;


public class Starter {
    Read r = new Read();
    Filler f = new Filler();
    Checker c = new Checker();

    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "400x1028";
        Configuration.browserPosition = "0x0";

    }
    @Test
    void check() throws IOException {
        open("/automation-practice-form");
        Inf data = r.reader();
        f.fill(data);
        c.check(data);
    }
}


