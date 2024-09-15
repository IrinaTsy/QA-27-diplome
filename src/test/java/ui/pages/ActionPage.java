package ui.pages;

import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByTagAndText;
import io.qameta.allure.Step;
import ui.tests.TestBase;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ActionPage {

    private final SelenideElement
                    logoClick = $("#Logo"),
                    basketEmptyClick = $("[name=img_cart]"),
                    signInClick = $("#MenuContent > a:nth-child(3)"),
                    helpClick = $("#MenuContent > a:nth-child(5)"),
                    searchClick = $("[type=submit]"),

                    leftFishClick = $("#SidebarContent > a:nth-child(1)"),
                    backLinkClick = $("#BackLink > a"),
                    leftDogsClick = $("#SidebarContent > a:nth-child(4)"),
                    leftCatsClick = $("#SidebarContent > a:nth-child(7)"),
                    leftReptilesClick = $("#SidebarContent > a:nth-child(10)"),
                    leftBirdsClick = $("#SidebarContent > a:nth-child(13)"),

                    centralFishClick = $("#QuickLinks > a:nth-child(1)"),
                    centralDogsClick = $("#QuickLinks > a:nth-child(3)"),
                    centralReptilesClick = $("#QuickLinks > a:nth-child(5)"),
                    centralCatsClick = $("#QuickLinks > a:nth-child(7)"),
                    centralBirdsClick =$("#QuickLinks > a:nth-child(9)"),

                    bigBirdPictureClick = $("[alt=Birds]"),
                    fishPictureClick = $("[alt=Fish]"),
                    dogPictureClick = $("[alt=Dogs]"),
                    reptilesPictureClick = $("[alt=Reptiles]"),
                    catPictureClick = $("[alt=Cats]"),
                    birdPictureClick = $("[name=estoremap]>area:nth-child(6)"),

                    linkOctoPerfClick = $("#CTA > a"),

                    linkFooterOctoPerfClick = $(Selectors.byText("https://octoperf.com")),
                    linkFooterMybatisClick = $(Selectors.byText("www.mybatis.org"));




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

    @Step("Подтверджение результата нажатия на логотип")
    public ActionPage backClickResult() {

        webdriver().shouldHave(url("https://petstore.octoperf.com/actions/Catalog.action"));

        return this;

    }

    @Step("Нажимаем на корзинку")
    public ActionPage basketEmptyClick() {

        basketEmptyClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на корзинку")
    public ActionPage basketEmptyClickResult() {

        $("#Cart").shouldHave(text("Your cart is empty."));

        return this;

    }


    @Step("Нажимаем на Sign In")
    public ActionPage signInClick() {

        signInClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на SignIn")
    public ActionPage signInClickResult() {

        $("#Catalog").shouldHave(text("Please enter your username and password."));

        return this;

    }

    @Step("Нажимаем на знак вопроса")
    public ActionPage helpClick() {

        helpClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на знак вопроса")
    public ActionPage helpClickResult() {

        $("h1").shouldHave(text("JPetStore Demo"));

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

    @Step("Подтверджение результата нажатия на кнопку Search")
    public ActionPage searchClickResult() {

        $("li").shouldHave(text("Please enter a keyword to search for, then press the search button."));

        return this;

    }

    @Step("Нажимаем на Fish")
    public ActionPage leftFishClick() {

        leftFishClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Fish")
    public ActionPage leftFishClickResult() {

        $("h2").shouldHave(text("Fish"));

        return this;

    }

   @Step("Возвращаемся на домашнюю страницу")
   public ActionPage backLinkClick() {

        backLinkClick.hover().click();

        return this;

   }

    @Step("Подтверджение результата возврата на домашнюю страницу")
    public ActionPage backLinkResult() {

        webdriver().shouldHave(url("https://petstore.octoperf.com/actions/Catalog.action"));

        return this;

    }

   @Step("Нажимаем на Dogs")
   public ActionPage leftDogsClick() {

     leftDogsClick.hover().click();

     return this;

   }

    @Step("Подтверджение результата нажатия на Dogs")
    public ActionPage leftDogsClickResult() {

        $("h2").shouldHave(text("Dogs"));

        return this;

    }

    @Step("Нажимаем на Cats")
    public ActionPage leftCatsClick() {

        leftCatsClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Cats")
    public ActionPage leftCatsClickResult() {

        $("h2").shouldHave(text("Cats"));

        return this;

    }

    @Step("Нажимаем на Reptiles")
    public ActionPage leftReptilesClick() {

        leftReptilesClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Reptiles")
    public ActionPage leftReptiltsClickResult() {

        $("h2").shouldHave(text("Reptiles"));

        return this;

    }

    @Step("Нажимаем на Reptiles")
    public ActionPage leftBirdsClick() {

        leftBirdsClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Birds")
    public ActionPage leftBirdsClickResult() {

        $("h2").shouldHave(text("Birds"));

        return this;

    }

    @Step("Нажимаем на Fish в центральной группе ссылок")
    public ActionPage centralFishClick() {

        centralFishClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Fish в центральной группе ссылок")
    public ActionPage centralFishClickResult() {

        $("h2").shouldHave(text("Fish"));

        return this;

    }

    @Step("Нажимаем на Dogs в центральной группе ссылок")
    public ActionPage centralDogsClick() {

        centralDogsClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Dogs в центральной группе ссылок")
    public ActionPage centralDogsClickResult() {

        $("h2").shouldHave(text("Dogs"));

        return this;

    }

    @Step("Нажимаем на Reptiles в центральной группе ссылок")
    public ActionPage centralReptilesClick() {

        centralReptilesClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Reptiles в центральной группе ссылок")
    public ActionPage centralReptilesClickResult() {

        $("h2").shouldHave(text("Reptiles"));

        return this;

    }

    @Step("Нажимаем на Cats в центральной группе ссылок")
    public ActionPage centralCatsClick() {

        centralCatsClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Cats в центральной группе ссылок")
    public ActionPage centralCatsClickResult() {

        $("h2").shouldHave(text("Cats"));

        return this;

    }

    @Step("Нажимаем на Birds в центральной группе ссылок")
    public ActionPage centralBirdsClick() {

        centralBirdsClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на Birds в центральной группе ссылок")
    public ActionPage centralBirdsClickResult() {

        $("h2").shouldHave(text("Birds"));

        return this;

    }

    @Step("Нажимаем на большую картинку с попугаем")
    public ActionPage bigBirdPictureClick() {

        bigBirdPictureClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на большую картинку с попугаем")
    public ActionPage bigBirdPictureClickResult() {

        $("h2").shouldHave(text("Birds"));

        return this;

    }

    @Step("Нажимаем на картинку с рыбкой")
    public ActionPage fishPictureClick() {

        fishPictureClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на картинку с рыбкой")
    public ActionPage fishPictureClickResult() {

        $("h2").shouldHave(text("Fish"));

        return this;

    }

    @Step("Нажимаем на картинку с собакой")
    public ActionPage dogPictureClick() {

        dogPictureClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на картинку с собакой")
    public ActionPage dogPictureClickResult() {

        $("h2").shouldHave(text("Dogs"));

        return this;

    }

    @Step("Нажимаем на картинку с ящерицей")
    public ActionPage reptilesPictureClick() {

        reptilesPictureClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на картинку с ящерицей")
    public ActionPage reptilesPictureClickResult() {

        $("h2").shouldHave(text("Reptiles"));

        return this;

    }

    @Step("Нажимаем на картинку с кошкой")
    public ActionPage catPictureClick() {

        catPictureClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на картинку с кошкой")
    public ActionPage catPictureClickResult() {

        $("h2").shouldHave(text("Cats"));

        return this;

    }

    @Step("Нажимаем на маленькую картинку с попугаем")
    public ActionPage birdPictureClick() {

        birdPictureClick.hover().click();

        return this;

    }

    @Step("Подтверджение результата нажатия на маленькую каринку с попугаем")
    public ActionPage birdPictureClickResult() {

        $("h2").shouldHave(text("Birds"));

        return this;

    }

    @Step("Переходим по ссылке на сайт OctoPerf")
    public ActionPage linkOctoPerfClick() {

        linkOctoPerfClick.hover().click();

        return this;

    }

    @Step("Подтверджение перехода по ссылке на сайт OctoPerf")
    public ActionPage linkOctoPerfClickResult() {

        webdriver().shouldHave(url("https://octoperf.com/"));

        return this;

    }

    @Step("Переходим по ссылке на сайт OctoPerf")
    public ActionPage linkFooterOctoPerfClick() {

        linkFooterOctoPerfClick.hover().click();

        return this;

    }

    @Step("Подтверджение перехода по ссылке на сайт OctoPerf")
    public ActionPage linkFooterOctoPerfClickResult() {

        webdriver().shouldHave(url("https://petstore.octoperf.com/actions/Catalog.action"));

        return this;

    }

    @Step("Переходим по ссылке в блог MyBatis")
    public ActionPage linkFooterMyBatisClick() {

        linkFooterMybatisClick.hover().click();

        return this;

    }

    @Step("Подтверджение перехода по ссылке в блог MyBatis")
    public ActionPage linkFooterMyBatisClickResult() {

        webdriver().shouldHave(url("https://petstore.octoperf.com/actions/Catalog.action"));

        return this;

    }

}
