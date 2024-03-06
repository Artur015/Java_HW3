package org.example;

import org.example.pharmacy.Medicine;
import org.example.pharmacy.Medicine2;
import org.example.pharmacy.MedicineComponent;
import org.example.pharmacy.impl.Asitromin;
import org.example.pharmacy.impl.Butofan;
import org.example.pharmacy.impl.Penicilinium;
import org.example.pharmacy.impl.Vetbicid;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<MedicineComponent> medList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 50, 25);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
        Butofan butof = new Butofan("Butofan", 30, 70);
        Medicine2 medicine1 = new Medicine2("Med");
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic).addComponent(butof);
//        for (MedicineComponent companent : medicine1) {
//
//        }
//        Iterator<MedicineComponent> med = medicine1;
//        while (medicine1.hasNext()) {
//            System.out.println(med.next());
//        }
//        for (MedicineComponent component : medicine1) {
//            System.out.println(component);
//        }
        medList.add(asitr);
        medList.add(penicilinium);
        medList.add(vetbic);
        medList.add(butof);
        System.out.println(medList);
        Collections.sort(medList, (o1, o2) -> 0);
        System.out.println(medList);
        
    }
}