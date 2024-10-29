package com.campusdual.classroom;

import java.util.*;

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
        Set<String> ElHashSet = (createHashSet());
        System.out.println("Contenido del HashSet: ");
        printSet(ElHashSet);
        System.out.println("=========================");
        System.out.println("Añadiendo elemento al Hashset: ");
        boolean nuevoElemento1 = addElementToSet(ElHashSet,"ELEMENTO AAA");
        System.out.println("Elemento añadido: " + nuevoElemento1);
        System.out.println("Nuevo contenido del Hashset: ");
        printSet(ElHashSet);

        System.out.println("Añadiendo elemento al Hashset: ");
        boolean nuevoElemento2 = addElementToSet(ElHashSet,"ELEMENTO AAA");
        System.out.println("Elemento añadido: " + nuevoElemento2);
        System.out.println("Nuevo contenido del Hashset: ");
        printSet(ElHashSet);

        //TREESET
        System.out.println("\n=========================\n ");

        Set<String> elTreeSet = createTreeSet();
        System.out.println("\nContenido del TreeSet: ");
        printSet(elTreeSet);
        System.out.println("Añadiendo elemento al TreeSet: ");
        boolean addedToTreeSet = addElementToSet(elTreeSet,"ELEMENTO AAA");
        System.out.println("Elemento añadido: " + addedToTreeSet);
        printSet(elTreeSet);
        System.out.println("añadir otro elemento: ");
        addElementToSet(elTreeSet,"ELEMENTO AAA");
        boolean nuevoElemento =addElementToSet(elTreeSet,"ELEMENTO AAA");
        System.out.println("Elemento añadido: " + nuevoElemento);






    }

}
