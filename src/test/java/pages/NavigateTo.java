package pages;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    BookInfoPage BookInfoPage;

    @Step()
    public void bookInfoHomePage() {
        BookInfoPage.open();
    }
}
