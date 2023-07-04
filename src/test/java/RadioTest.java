import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void StationTest() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(17);

        int expected = 17;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(-1);
        radio.setCurrentStation(10);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxStationTest() {

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDefaultNextBehavior() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDefaultPrevBehavior() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testJumpNextBehavior() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testJumpPrevBehavior() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncrease() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        expected = 100;
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecrease() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        expected = 1;
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(101);
        expected = 100;
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(50);
        expected = 50;
        actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}