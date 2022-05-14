import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

class GeoServiceImplTest {

    static GeoService service = new GeoServiceImpl();
    static Country country = Country.USA;

    @Test
    void usaIp() {
        Location location = service.byIp("96.0.0.1");
        Assertions.assertEquals(country, location.getCountry());
    }

    @Test
    void foreignIp() {
        Location location = service.byIp("172.0.32.11");
        Assertions.assertNotEquals(country, location.getCountry());
    }

}
