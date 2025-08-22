package model;

public class Aliment {
    private String nom;
    private double cout;
    private String besoinsNutritionnels;
    private int quantiteDisponible;
    public Aliment(String nom, double cout, String besoinsNutritionnels, int quantiteDisponible) {
        this.nom = nom;
        this.cout = cout;
        this.besoinsNutritionnels = besoinsNutritionnels;
        this.quantiteDisponible = quantiteDisponible;
    }
    public String getNom() { return nom; }
    public int getQuantiteDisponible() { return quantiteDisponible; }
    public void setQuantiteDisponible(int qte) { this.quantiteDisponible = qte; }
}