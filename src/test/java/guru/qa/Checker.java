package guru.qa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.$;

public class Checker {
    public void check(Inf data) {
        $(".modal-body").shouldHave(text(data.fname+" "+data.lname),text(data.email),text(data.gender),text(data.phone));
        LocalDate time = LocalDate.parse(data.birth, DateTimeFormatter.ofPattern("MM.dd.yyyy"));
        String newTime = time.format(DateTimeFormatter.ofPattern("dd MMMM,yyyy",new Locale("en")));
        $(".modal-body").shouldHave(text(newTime));
        String s = data.subj[0];
        for (int i=1;i<data.subj.length;i++){
            s += ", "+data.subj[i];
        }
        $(".modal-body").shouldHave(text((s)));
        String h = data.hobbies[0];
        for (int i=1;i<data.hobbies.length;i++){
            h += ", "+data.hobbies[i];
        }
        $(".modal-body").shouldHave(text(h));
        $(".modal-body").shouldHave(text(data.pict),text(data.address),text(data.state+" "+data.city));
    }
}
