package ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



public class HomePage {

    private final SelenideElement
            openLink = $(Selectors.byText("Enter the Store"));


    @Step("Открываем главную страницу")
    public HomePage openHomePage() {

        open(" ");

        return this;

    }

    @Step("Перейти по ссылке в магазин")
    public HomePage openLink() {

        openLink.hover().click();

        return this;

    }

    @Step("Подтверждение результатов")
    public HomePage checkResults() {

        $("#CTA").shouldHave(text("Elevate you load-testing with"));

        return this;
    }










}
