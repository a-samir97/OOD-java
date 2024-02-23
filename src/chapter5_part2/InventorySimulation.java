package chapter5_part2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InventorySimulation {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.CEDAR);

        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List matchingInstruments = inventory.search(clientSpec);

        if(!matchingInstruments.isEmpty()) {
            System.out.println("you might like these instruments ...");
            for(Iterator i = matchingInstruments.iterator(); i.hasNext();) {
                Instrument instrument = (Instrument) i.next();
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("We have a " + spec.getProperty("instrumentType"));
            }
        } else {
            System.out.println("Sorry we have nothing for you bro...");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.CEDAR);
        properties.put("instrumentType", InstrumentType.GUITAR);
        inventory.addInstrument("12212", 100.15, new InstrumentSpec(properties));
    }
}
