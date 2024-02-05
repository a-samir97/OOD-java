public enum Wood {
    INDIAN, BRAZILIAN, CEDAR;

    public String toString(){
        switch (this) {
            case INDIAN: return "Indian Wood";
            case BRAZILIAN: return "Brazilian Wood";
            case CEDAR: return "Cedar Wood";
            default: return "Default Wood";
        }
    }
}
