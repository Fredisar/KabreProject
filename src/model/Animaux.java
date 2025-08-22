package model;

public class Animaux {
    private String nom;
    private String espece;
    private String race;
    private String dateNaissance;
    private String etatSante;

    public Animaux(String nom, String espece, String race, String dateNaissance, String etatSante) {
        this.nom = nom;
        this.espece = espece;
        this.race = race;
        this.dateNaissance = dateNaissance;
        this.etatSante = etatSante;
    }

    public String getNom() { return nom; }
    public String getEspece() { return espece; }
    public String getRace() { return race; }
    public String getDateNaissance() { return dateNaissance; }
    public String getEtatSante() { return etatSante; }

    public void setEtatSante(String etatSante) { this.etatSante = etatSante; }
}