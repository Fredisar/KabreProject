package model;

public class Finances {
    private String date;
    private double montant;
    private String categorie;
    public Finances(String date, double montant, String categorie) {
        this.date = date;
        this.montant = montant;
        this.categorie = categorie;
    }

    public double getMontant() { return montant; }

}
