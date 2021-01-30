package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio echo = new Radio();

    @Test
    public void shouldNextStation() {
        int currentStation = 9;
        echo.setCurrentStation(currentStation);
        echo.nextRadioStation();
        assertEquals(0, echo.getCurrentStation());
    }

    @Test
    public void shouldNextStation1() {
        int currentStation = 5;
        echo.setCurrentStation(currentStation);
        echo.nextRadioStation();
        assertEquals(6, echo.getCurrentStation());
    }

    @Test
    public void shouldNextStation2() {
        int currentStation = 10;
        echo.setCurrentStation(currentStation);
        echo.nextRadioStation();
        assertEquals(1, echo.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        int currentStation = 0;
        echo.setCurrentStation(currentStation);
        echo.prevRadioStation();
        assertEquals(9, echo.getCurrentStation());
    }

    @Test
    public void shouldPrevStation1() {
        int currentStation = -1;
        echo.setCurrentStation(currentStation);
        echo.prevRadioStation();
        assertEquals(9, echo.getCurrentStation());
    }

    @Test
    public void shouldPrevStation2() {
        int currentStation = 5;
        echo.setCurrentStation(currentStation);
        echo.prevRadioStation();
        assertEquals(4, echo.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation() {
        int RadioStation = 7;
        int currentStation = 2;
        echo.setCurrentStation(currentStation);
        echo.inputRadioStation(RadioStation);
        assertEquals(7, echo.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation1() {
        int RadioStation = 10;
        int currentStation = 2;
        echo.setCurrentStation(currentStation);
        echo.inputRadioStation(RadioStation);
        assertEquals(2, echo.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation2() {
        int RadioStation = -1;
        int currentStation = 2;
        echo.setCurrentStation(currentStation);
        echo.inputRadioStation(RadioStation);
        assertEquals(2, echo.getCurrentStation());
    }

    @Test
    public void shouldSoundVolumePlus() {
        int currentVolume = 10;
        echo.setCurrentVolume(currentVolume);
        echo.soundVolumePlus();
        assertEquals(10, echo.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumePlus1() {
        int currentVolume = 5;
        echo.setCurrentVolume(currentVolume);
        echo.soundVolumePlus();
        assertEquals(6, echo.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumePlus2() {
        int currentVolume = 11;
        echo.setCurrentVolume(currentVolume);
        echo.soundVolumePlus();
        assertEquals(1, echo.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMin() {
        int currentVolume = 5;
        echo.setCurrentVolume(currentVolume);
        echo.soundVolumeMin();
        assertEquals(4, echo.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMin1() {
        int currentVolume = 0;
        echo.setCurrentVolume(currentVolume);
        echo.soundVolumeMin();
        assertEquals(0, echo.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMin2() {
        int currentVolume = -1;
        echo.setCurrentVolume(currentVolume);
        echo.soundVolumeMin();
        assertEquals(0, echo.getCurrentVolume());
    }


}
