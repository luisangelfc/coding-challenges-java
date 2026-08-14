package ClasesObjetos;

import java.util.Scanner;

public class AppPersonas {
    public static void main(String[] args) {
        //Creamos un scanner
        Scanner input = new Scanner(System.in);
        // Crear una instancia
        Persona persona = new Persona();
        //dar valores a los atributos
        System.out.println("Digite el nombre de la persona: ");
        persona.setNombre(input.nextLine());
        System.out.println("Digite el apellido de la persona: ");
        persona.setApellido(input.nextLine());
        System.out.println("Digite el dni de la persona: ");
        persona.setDni(input.nextLine());
        System.out.println("Digite el numero de la persona: ");
        persona.setEdad(input.nextInt());

        //mostrar info
        System.out.println(persona);

    }
}
