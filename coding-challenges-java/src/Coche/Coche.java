package Coche;

public class Coche {

    //declaración de atributos
    private String color;
    private double longitud;
    private int plazas;

    //Constructor de parámetros
    public Coche(String color, double longitud, int plazas){
        this.color = color;
        longitud = longitud; //Aquí no es necesario usar this
        this.plazas = plazas;
    }

    //declaración de método get que devuelve el color del coche
    public String getColor(){
        return color;
    }
    //declaración de método set que modifica el color del coche
    public void setColor (String rojo){
        this.color = rojo;
    }

}
