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

        radio.setCurrentStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.maxVol();

        int expected = 2;
        int actual = radio.getCurrentVolume();
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

        radio.setCurrentVolume(10);

        radio.maxVol();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.maxVol();

        int expected = 10;
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

        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
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

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.minVol();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.minVol();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
