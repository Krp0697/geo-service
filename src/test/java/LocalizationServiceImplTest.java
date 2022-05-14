import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalizationServiceImplTest {

    private static final LocalizationService service = new LocalizationServiceImpl();

    @Test
    void localeRussian() {
        String russian = service.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        assertEquals(expected, russian);
    }

    @Test
    void localeEnglish() {
        String otherCountry = service.locale(Country.USA);
        String expected = "Welcome";
        assertEquals(expected, otherCountry);
    }
}
