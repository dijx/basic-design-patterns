package co.devfoundry.operatingSystem;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    List<OperatingSystemMemento> backups = new ArrayList<>();


    public void addMemento (OperatingSystemMemento memento) {

        System.out.println("Dodawanie backupu z dnia " + memento.backupDate + " pod indexem " + backups.size());
        backups.add(memento);
    }

    public OperatingSystemMemento getMemento(int index) {
        System.out.println("Przywracanie backupu z dnia " + backups.get(index).backupDate);
        return backups.get(index);
    }

    public void listExistingBackups() {

        System.out.println("Istniejące backupy:");

        for (OperatingSystemMemento backup : backups) {
            System.out.println("Numer: " + backup.backupNumber + ", data: " + backup.backupDate);
        }
    }
}
