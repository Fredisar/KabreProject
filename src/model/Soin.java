 package model;
public class Soin {
    private String date;
    private String type;
    private String veterinaire;
    private Animaux animal;

    public Soin(String date, String type, String veterinaire, Animaux animal) {
        this.date = date;
        this.type = type;
        this.veterinaire = veterinaire;
        this.animal = animal;
    }

    public String getDate() { return date; }
    public Animaux getAnimal() { return animal; }
}