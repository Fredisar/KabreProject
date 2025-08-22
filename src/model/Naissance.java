package model;

public class Naissance {
    private String date;
    private int nombre;
    private Animaux parent1;
    private Animaux parent2;

    public Naissance(String date, int nombre, Animaux parent1, Animaux parent2) {
        this.date = date;
        this.nombre = nombre;
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public String getDate() { return date; }
    public int getNombre() { return nombre; }
}
