package your.group.id.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Test;
import your.group.id.pages.BookingPage;
import your.group.id.pages.SearchResultsPage;

import static org.junit.Assert.assertTrue;

public class BookingTest {

    BookingPage bookingPage = new BookingPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Test
    @Description("Тест поиска отелей в Анталье с фильтром 5 звезд")
    public void testSearchHotelsInAntalya() {
        bookingPage.openBookingPage();
        bookingPage.searchForDestination("Анталья");

        String searchResultText = searchResultsPage.getSearchResultText();
        assertTrue("Поиск не отображает Анталью", searchResultText.contains("Анталья"));

        searchResultsPage.selectFiveStars();
        
        assertTrue("Не все отели имеют 5 звезд", searchResultsPage.areAllHotelsFiveStars());
    }
}
