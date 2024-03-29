package chapter5;

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public boolean matches(InstrumentSpec otherSpec){
        if (builder != otherSpec.builder)
            return false;

        if (type != otherSpec.type)
            return false;

        if (topWood != otherSpec.topWood)
            return false;

        if (backWood != otherSpec.backWood)
            return false;

        if ((model != null) && (!model.isEmpty()) && (!model.equals(otherSpec.model)))
                return false;

        return true;
    }
}
