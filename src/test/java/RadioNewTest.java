import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioNewTest {

    @Test
    public void test() {
        Radio radio = new Radio(29);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
