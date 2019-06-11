package co.devfoundry.operatingSystem;

import java.time.LocalDateTime;

public class OperatingSystemMemento {

    int backupNumber = 0;
    LocalDateTime backupDate;

    OperatingSystemMemento (OperatingSystem memento) {

        this.backupDate = memento.backupDate;
        this.backupNumber = memento.backupNumber;
    }

    @Override
    public String toString() {
        return "OperatingSystemMemento{" +
                "backupNumber=" + backupNumber +
                ", backupDate=" + backupDate +
                '}';
    }
}
