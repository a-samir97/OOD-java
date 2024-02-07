package chapter3;

public class DoorDogSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);

        System.out.println(" Fido starts barking ...");
        recognizer.recgonize("Barkingggggg...");

        System.out.println("\nFido has gone outside ...");

        System.out.println("\nFido's all done ....");

        try{
            Thread.currentThread().wait(1000);
        } catch (Exception e) { }
        System.out.println("... but he's stuck outside ..");
        System.out.println("\nFido starts barking ...");
        recognizer.recgonize("Barking");
        System.out.println("\nFido back inside ...");
    }
}
