package your.group.id.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class BookingPage {

    private SelenideElement searchInput = $("input[name='ss']");
    private SelenideElement searchButton = $("button[type='submit']");

    public void openBookingPage() {
        open("https://booking.com/");
    }

    public void searchForDestination(String destination) {
        searchInput.setValue(destination);
        searchButton.click();
    }
}
