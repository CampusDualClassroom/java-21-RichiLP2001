package com.campusdual.classroom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
  //Crear una colección de tipo Set e inicializarla
        // como HashSet en el método createHashSet().
        // Luego poblar el conjunto con elementos y
        // devolver el HashSet construído
        Set<String> elements = new HashSet<>();
        elements.add("ELEMENT KPRBC");
        elements.add("ELEMENT YPBTM");
        elements.add("ELEMENT AADXU");
        elements.add("ELEMENT RXCGJ");
        elements.add("ELEMENT WYMVD");
        elements.add("ELEMENT WFGEJ");
        elements.add("ELEMENT TYGBS");
        elements.add("ELEMENT MAPTK");
        elements.add("ELEMENT GJXVE");
        elements.add("ELEMENT BAFGL");
        return elements;
    }


    public static Set<String> createTreeSet() {
        Set<String> elements2 = new TreeSet<>();
        elements2.add("ELEMENT KPRBC");
        elements2.add("ELEMENT YPBTM");
        elements2.add("ELEMENT AADXU");
        elements2.add("ELEMENT RXCGJ");
        elements2.add("ELEMENT WYMVD");
        elements2.add("ELEMENT WFGEJ");
        elements2.add("ELEMENT TYGBS");
        elements2.add("ELEMENT MAPTK");
        elements2.add("ELEMENT GJXVE");
        elements2.add("ELEMENT BAFGL");

        return elements2;
    }

    private static void printSet(Set<String> customSet) {
        //Recorrer cada conjunto usando el método printSet
        // () mostrando por pantalla el valor de cada elemento.
    for(String item : customSet){
        System.out.println(item);
    }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        //Añadir un elemento más a cada conjunto usando el método
        // addElementToSet() y devolver el booleano resultante de la operación.

        return set.add(elementToAdd);

    }

    public static void main(String[] args) {
        createHashSet();
        System.out.println("Contenido del HashSet: ");
        printSet(createHashSet());
        System.out.println("=========================");
        System.out.println("Añadiendo elemento al Hashset: ");
        boolean addedToHashSet = addElementToSet(createHashSet(),"ELEMENTO AAA");
        System.out.println("Elemento añadido: " + addedToHashSet);

        //TREESET
        System.out.println("\n=========================\n ");

        createTreeSet();
        System.out.println("\nContenido del TreeSet: ");
        printSet(createTreeSet());
        System.out.println("Añadiendo elemento al TreeSet: ");
        boolean addedToTreeSet = addElementToSet(createTreeSet(),"ELEMENTO AAA");
        System.out.println("Elemento añadido: " + addedToTreeSet);





    }

}
