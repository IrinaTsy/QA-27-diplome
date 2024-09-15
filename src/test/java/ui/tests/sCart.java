package ui.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.pages.ActionPage;
import ui.pages.ShoppingCart;

@Tag("web")
@Owner("Цыганкова Ирина")
@Feature("ShoppingCart")
@DisplayName("UI: наполнение корзины")

public class sCart extends TestBase {

    ShoppingCart sCart = new ShoppingCart();

    @Test
    @DisplayName("Добавляем товары в корзину")
    void addOneProductTest() {

}
}
