package chapter5;

public enum Style {
    STYLE_A, STYLE_F;

    @Override
    public String toString() {
        switch (this) {
            case STYLE_A -> {
                return "A";
            }
            case STYLE_F -> {
                return "F";
            }
            default -> {
                return "Another style";
            }
        }
    }
}
