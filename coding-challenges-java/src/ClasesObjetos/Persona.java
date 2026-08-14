package ClasesObjetos;

import java.util.Objects;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    //Constructor vacio
    public Persona(){
    }

    //Constructor de Copia
    public Persona (Persona p){
        this.nombre = p.nombre;
        this.apellido = p.apellido;
        this.dni = p.dni;
        this.edad = p.edad;
    }

    //Constructor de parametros
    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    //Setters & Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni, edad);
    }
}
