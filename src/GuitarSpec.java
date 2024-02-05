import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood topWood, backWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood topWood,
                      Wood backWood, int numStrings){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.numStrings = numStrings;
    }
    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec otherSpec) {

        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel().toLowerCase()))) {
            return false;
        }

        if (builder != otherSpec.getBuilder()) {
            return false;
        }

        if (type != otherSpec.getType()) {
            return false;
        }

        if (backWood != otherSpec.getBackWood()) {
            return false;
        }

        if (topWood != otherSpec.getTopWood()) {
            return false;
        }
        return numStrings == otherSpec.getNumStrings();
    }
}
