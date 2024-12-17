package your.group.id.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class SearchResultsPage {

    private SelenideElement filterButton = $("button[data-testid='filter-button']");
    private SelenideElement fiveStarsCheckbox = $("input[name='class']");
    private SelenideElement hotelRating;

    public void selectFiveStars() {
        filterButton.click();
        fiveStarsCheckbox.click();
        // 
    }

    public boolean areAllHotelsFiveStars() {
        // 
        return $$(".sr_property_block").stream()
                .allMatch(hotel -> hotel.$(".bui-review-score__badge").getText().contains("5"));
    }

    public String getSearchResultText() {
        return $("h1").getText(); 
    }
}
