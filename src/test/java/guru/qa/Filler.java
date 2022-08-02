package guru.qa;


import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.Keys;


import java.io.File;

import static com.codeborne.selenide.Selenide.$;



public class Filler {
    public void fill(Inf data) {
        $("#firstName").setValue(data.fname);
        $("#lastName").setValue(data.lname);
        $("#userEmail").setValue(data.email);
        $("#genterWrapper").find(new ByText(data.gender)).click();
        $("#userNumber").setValue(data.phone);
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "a");
        $("#dateOfBirthInput").sendKeys(data.birth + Keys.ENTER);
        for (int i = 0; i<data.subj.length;i++){
            $("#subjectsInput").setValue(data.subj[i]).pressEnter();
        }
        for (int i=0;i<data.hobbies.length;i++){
            $("#hobbiesWrapper").find(new ByText(data.hobbies[i])).click();
        }
        $("#uploadPicture").uploadFile(new File("src/test/resources/"+data.pict));
        $("#currentAddress").setValue(data.address);
        $("#react-select-3-input").setValue(data.state).pressEnter();
        $("#react-select-4-input").setValue(data.city).pressEnter();
        $("#submit").scrollTo().click();
    }
}
