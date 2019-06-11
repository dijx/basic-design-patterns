package co.devfoundry;

import co.devfoundry.operatingSystem.OperatingSystem;
import co.devfoundry.operatingSystem.OperatingSystemCaretaker;

public class Main {


        public static void main(String[] args) throws InterruptedException {

            OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
            OperatingSystem operatingSystem = new OperatingSystem();

            operatingSystem.createBackup();
            operatingSystemCaretaker.addMemento(operatingSystem.save());
            Thread.sleep(3000);
            operatingSystem.createBackup();
            Thread.sleep(3000);
            operatingSystemCaretaker.addMemento(operatingSystem.save());
            operatingSystem.createBackup();
            Thread.sleep(3000);
            operatingSystem.createBackup();
            operatingSystemCaretaker.addMemento(operatingSystem.save());

            operatingSystemCaretaker.listExistingBackups();

            Thread.sleep(3000);
            operatingSystem.load(operatingSystemCaretaker.getMemento(0));
        }

    }


