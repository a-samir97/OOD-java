package chapter2;

public class DoorDogSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println();
        remote.pressButton();

        System.out.println("\nFido has gone outside ...");

        System.out.println("\nFido's all done ....");

        try{
            Thread.currentThread().wait(1000);
        } catch (Exception e) { }
        System.out.println("... but he's stuck outside ..");
        System.out.println("\nFido starts barking ...");
        System.out.println("\nSo customer grabs the remote control to open the door");
        remote.pressButton();

        System.out.println("\nFido back inside ...");
    }
}
