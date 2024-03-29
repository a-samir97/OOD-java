package chapter1;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLISON, RYAN, PRS, ANY;

    public String toString() {
        switch (this){
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case COLLINGS: return "Collings";
            case OLISON: return "Olison";
            case RYAN: return "Ryan";
            case PRS: return "Prs";
            case ANY: return "Any";
            default: return "Default";
        }
    }
}
