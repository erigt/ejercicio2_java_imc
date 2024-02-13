package dev.erika.imc;

import java.util.Scanner;

import dev.erika.imc.models.Imc;
import dev.erika.imc.models.Person;


/**
 * Hello world!
 */


public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.println("Peso en kilogramos: ");
        double peso = reading.nextDouble();

        System.out.println("Estatura en metros: ");
        double metros = reading.nextDouble();

        Person person = new Person(peso, metros);
        double imc = reading.nextDouble();

        Math.pow(person.getHeight(), 2);

        System.out.println("El IMC es: " + imc);
        reading.close();
        
    }

    

}
