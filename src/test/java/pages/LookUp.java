package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;


public class LookUp extends UIInteractionSteps {
    public List<String> titles() {
        By RESULT_TITLES = By.xpath("/html/body/div[2]/div[1]/div/h3");

        return findAll(RESULT_TITLES)
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }

}