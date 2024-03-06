package org.example.pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent>, Comparable<Medicine2>  {
    private List<MedicineComponent> components;
    private int index;
    private String name;

    public Medicine2(String name) {
        this.components = new ArrayList<>();
        this.index = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }
    
    @Override
    public String toString() {
        return "Medicine: " + name + components + "\n";
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Medicine2 o) {

        Collections.sort(this.components, new Comparator<MedicineComponent>() {
            @Override
            public int compare(MedicineComponent o1, MedicineComponent o2) {
                return Double.compare(o1.getPower(), o2.getPower());
            }
        });
        Collections.sort(o.components, new Comparator<MedicineComponent>() {
            @Override
            public int compare(MedicineComponent o1, MedicineComponent o2) {
                return Double.compare(o1.getPower(), o2.getPower());
            }
        });
        double totalPower = 0;
        for (MedicineComponent component : this.components){
            totalPower += component.getPower();
        }
        double ototalPower = 0;
        for (MedicineComponent component : o.components){
            ototalPower += component.getPower();
        }
        return Double.compare(totalPower, ototalPower);
    }
}