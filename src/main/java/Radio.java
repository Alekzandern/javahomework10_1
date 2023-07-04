public class Radio {

    private int currentStation = 0;
    private int currentVolume = 0;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationsCount) {

        this.maxStation = stationsCount - 1;
    }


    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 1) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 1) {
            this.currentVolume = 1;
            return;
        }
        if (currentVolume > 100) {
            this.currentVolume = 100;
            return;
        }
        this.currentVolume = currentVolume;
    }
}
