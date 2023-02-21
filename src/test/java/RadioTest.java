import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

  @Test
    public void test() {
      Radio radio = new Radio();

      radio.setCurrentStation(0);

      radio.next();

      int expected = 1;
      int actual = radio.getCurrentStation();
      Assertions.assertEquals(expected, actual);
  }

   {
    Radio radio = new Radio();

    radio.setCurrentVolume(0);

    radio.maxVol();

    int expected = 1;
    int actual = radio.getCurrentVolume();
    Assertions.assertEquals(expected, actual);
  }

  {
    Radio radio = new Radio();

    radio.setCurrentStation(3);

    radio.prev();

    int expected = 2;
    int actual = radio.getCurrentStation();
    Assertions.assertEquals(expected, actual);
  }

  {
    Radio radio = new Radio();

    radio.setCurrentVolume(1);

    radio.minVol();

    int expected = 0;
    int actual = radio.getCurrentVolume();
    Assertions.assertEquals(expected, actual);
  }

}
