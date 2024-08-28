package ui.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.pages.ActionPage;

@Tag("web")
@Owner("Цыганкова Ирина")
@Feature("HomePage")
@DisplayName("UI: навигация по разделам сайта")
public class aPage extends TestBase {

    ActionPage aPage = new ActionPage();

        @Test
        @DisplayName("Навигация по верхней части сайта")
        void headerFeaturesTest() {

            aPage.openActionPage()
                    .logoClick()
                    .basketClick()
                    .signInClick()
                    .helpClick()
                    .backClick()
                    .searchClick();





        }
}
