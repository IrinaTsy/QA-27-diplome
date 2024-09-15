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
        @DisplayName("Навигация по верхней части страницы")
        void headerFeaturesTest() {

            aPage.openActionPage()
                    .logoClick()
                    .backClickResult()

                    .basketEmptyClick()
                    .basketEmptyClickResult()
                    .backClick()
                    .backClickResult()

                    .signInClick()
                    .signInClickResult()
                    .backClick()
                    .backClickResult()

                    .helpClick()
                    .helpClickResult()
                    .backClick()
                    .backClickResult()

                    .searchClick()
                    .searchClickResult()
                    .backClick()
                    .backClickResult();


        }

    @Test
    @DisplayName("Навигация по боди страницы (левая группа ссылок) c возвратом через BackLink")
    void bodyFeaturesSideBackLinkTest() {

            aPage.openActionPage()
                    .leftFishClick()
                    .leftFishClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .leftDogsClick()
                    .leftDogsClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .leftCatsClick()
                    .leftCatsClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .leftReptilesClick()
                    .leftReptiltsClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .leftBirdsClick()
                    .leftBirdsClickResult()
                    .backLinkClick()
                    .backLinkResult();

    }

    @Test
    @DisplayName("Навигация по боди страницы (левая группа ссылок) c возвратом через кнопку Back")
    void bodyFeaturesSideBackTest() {

            aPage.openActionPage()
                    .leftFishClick()
                    .leftFishClickResult()
                    .backClick()
                    .backClickResult()

                    .leftDogsClick()
                    .leftDogsClickResult()
                    .backClick()
                    .backClickResult()

                    .leftCatsClick()
                    .leftCatsClickResult()
                    .backClick()
                    .backClickResult()

                    .leftReptilesClick()
                    .leftReptiltsClickResult()
                    .backClick()
                    .backClickResult()

                    .leftBirdsClick()
                    .leftBirdsClickResult()
                    .backClick()
                    .backClickResult();

    }

    @Test
    @DisplayName("Навигация по боди страницы (верхняя группа ссылок) c возвратом через BackLink")
    void bodyFeaturesCentralBackLinkTest() {

            aPage.openActionPage()
                    .centralFishClick()
                    .centralFishClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .centralDogsClick()
                    .centralDogsClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .centralReptilesClick()
                    .centralReptilesClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .centralCatsClick()
                    .centralCatsClickResult()
                    .backLinkClick()
                    .backLinkResult()

                    .centralBirdsClick()
                    .centralBirdsClickResult()
                    .backLinkClick()
                    .backLinkResult();
        }

    @Test
    @DisplayName("Навигация по боди страницы (левая группа ссылок) c возвратом через кнопку Back")
    void bodyFeaturesCentralBackTest() {

        aPage.openActionPage()
                .centralFishClick()
                .centralFishClickResult()
                .backClick()
                .backClickResult()

                .centralDogsClick()
                .leftDogsClickResult()
                .backClick()
                .backClickResult()

                .centralReptilesClick()
                .centralReptilesClickResult()
                .backClick()
                .backClickResult()

                .centralCatsClick()
                .centralCatsClickResult()
                .backClick()
                .backClickResult()

                .centralBirdsClick()
                .centralBirdsClickResult()
                .backClick()
                .backClickResult()

                .linkOctoPerfClick()
                .linkOctoPerfClickResult()
                .backClick();
    }

    @Test
    @DisplayName("Навигация по боди страницы (картинки) c возвратом через BackLink")
    void bodyFeaturesPicturesBackLinkTest() {

        aPage.openActionPage()
                .bigBirdPictureClick()
                .bigBirdPictureClickResult()
                .backLinkClick()
                .backLinkResult()

                .fishPictureClick()
                .fishPictureClickResult()
                .backLinkClick()
                .backLinkResult()

                .dogPictureClick()
                .dogPictureClickResult()
                .backLinkClick()
                .backLinkResult()

                .reptilesPictureClick()
                .reptilesPictureClickResult()
                .backLinkClick()
                .backLinkResult()

                .catPictureClick()
                .catPictureClickResult()
                .backLinkClick()
                .backLinkResult()

                .birdPictureClick()
                .birdPictureClickResult()
                .backLinkClick()
                .backLinkResult();
    }

        @Test
        @DisplayName("Навигация по нижней части страницы")
        void footerFeaturesTest() {

            aPage.openActionPage()
                    .linkFooterOctoPerfClick()
                    .linkFooterOctoPerfClickResult()

                    .linkFooterMyBatisClick()
                    .linkFooterMyBatisClickResult();

        }
}
