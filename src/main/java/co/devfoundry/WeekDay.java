package co.devfoundry;

public abstract class WeekDay {


    public final void everyDayIsExactlyTheSame(TypeOfTransport typeOfTransport) {

        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        goHome();
    }

    private void getReady() {
        System.out.println("Preparing to leave...");
    }

    protected void wakeUp() {
        System.out.println("Waking up slowly...");
    }

    protected void summary(int time) {
        System.out.println("Trasa do pracy zajęła: " + time + " minut");
    }

    private void goHome() {
        System.out.println("Powrot do domu");
    }

    protected abstract void work();
    protected abstract int goToWork(TypeOfTransport transport);

}
