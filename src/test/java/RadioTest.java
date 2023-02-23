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

        radio.setCurrentStation(-1);

        radio.next();

        int expected = 1;
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

        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
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

        radio.setCurrentVolume(8);

        radio.maxVol();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        radio.maxVol();

        int expected = 7;
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

        radio.setCurrentVolume(2);

        radio.maxVol();

        int expected = 3;
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

        radio.setCurrentStation(2);

        radio.prev();

        int expected = 1;
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

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
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

        radio.setCurrentVolume(3);

        radio.minVol();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

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

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.minVol();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        radio.minVol();

        int expected = 1;
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

        radio.setCurrentVolume(9);

        radio.minVol();

        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
