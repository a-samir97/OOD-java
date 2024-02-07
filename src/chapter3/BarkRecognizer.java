package chapter3;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recgonize(String bark){
        System.out.println("BarkRecognizer: Heard a " + bark);
        door.open();
    }
}
