package co.devfoundry.operatingSystem;

import java.time.LocalDateTime;

public class OperatingSystem {

    int backupNumber = 0;
    LocalDateTime backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = LocalDateTime.now();
        System.out.println("Utworzono nowy backup o numerze " + this.backupNumber + " z datą " + this.backupDate);
    }


    public OperatingSystemMemento save() {
        System.out.println("Zapisywanie stanu z " + this.backupDate);
        return new OperatingSystemMemento(this);
    }

    public void load(OperatingSystemMemento memento) {

        System.out.println("Przywracanie backupu z " + memento.backupDate);
        this.backupDate = memento.backupDate;
        this.backupNumber = memento.backupNumber;

    }



    @Override
    public String toString() {
        return "OperatingSystem{" +
                "backupNumber=" + backupNumber +
                ", backupDate=" + backupDate +
                '}';
    }
}
