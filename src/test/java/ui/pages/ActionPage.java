package ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ui.tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ActionPage {

            private final SelenideElement
                    logoClick = $("#Logo"),
                    basketClick = $("[name=img_cart]"),
                    signInClick = $(Selectors.byText("Sign In")),
                    helpClick = $(Selectors.byText("?")),
                    //backClick = $(""),
                    searchClick = $("[type=submit]");



        @Step("Открываем страницу Actions")
        public ActionPage openActionPage() {

            open("/actions/Catalog.action");

            return this;

        }

    @Step("Нажимаем на логотип")
    public ActionPage logoClick() {

        logoClick.hover().click();

        return this;

    }

    @Step("Нажимаем на корзинку")
    public ActionPage basketClick() {

        basketClick.hover().click();

        return this;

    }

    @Step("Нажимаем на Sign In")
    public ActionPage signInClick() {

        signInClick.hover().click();

        return this;

    }

    @Step("Нажимаем на знак вопроса")
    public ActionPage helpClick() {

        helpClick.hover().click();

        return this;

    }

    @Step("Нажимаем кнопку Назад")
    public ActionPage backClick() {

        back();

        return this;

    }

    @Step("Нажимаем на кнопку Search")
    public ActionPage searchClick() {

        searchClick.hover().click();

        return this;

    }



    }
