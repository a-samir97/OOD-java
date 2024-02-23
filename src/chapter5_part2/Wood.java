package chapter5_part2;

public enum Wood {
    INDIAN, BRAZILIAN, CEDAR;

    public String toString(){
        switch (this) {
            case INDIAN: return "Indian chapter1.Wood";
            case BRAZILIAN: return "Brazilian chapter1.Wood";
            case CEDAR: return "Cedar chapter1.Wood";
            default: return "Default chapter1.Wood";
        }
    }
}
