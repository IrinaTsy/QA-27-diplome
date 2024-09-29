package ui.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.pages.HomePage;


@Tag("web")
@Owner("Цыганкова Ирина")
@Feature("HomePage")
@DisplayName("UI: навигация по разделам сайта")

public class HPage extends TestBase {

    HomePage hPage = new HomePage();

    @Test
    @DisplayName("Открываем домашнюю страницу")
    void successfulOpenHomePageTest() {

                hPage.openHomePage()
                        .openLink()

                        .checkResults();
    }
}
