package chapter5;

public class MandolinSpec extends InstrumentSpec{
    private  Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;

        if(!(otherSpec instanceof MandolinSpec))
            return false;

        MandolinSpec spec = (MandolinSpec) otherSpec;

        return style.equals(spec.style);
    }
}
