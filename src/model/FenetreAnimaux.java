package model;
import connectionDB.DatabaseConnection;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FenetreAnimaux extends JFrame {
    private JTextField txtNom, txtEspece, txtRace;

    public FenetreAnimaux() {
        setTitle("Gestion des Animaux");
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Nom :"));
        txtNom = new JTextField();
        panel.add(txtNom);

        panel.add(new JLabel("Espèce :"));
        txtEspece = new JTextField();
        panel.add(txtEspece);

        panel.add(new JLabel("Race :"));
        txtRace = new JTextField();
        panel.add(txtRace);

        JButton btnEnregistrer = new JButton("Enregistrer");
        panel.add(btnEnregistrer);

        add(panel);

        // Action du bouton
        btnEnregistrer.addActionListener(e -> enregistrerAnimal());
    }

    private void enregistrerAnimal() {
        String nom = txtNom.getText();
        String espece = txtEspece.getText();
        String race = txtRace.getText();

        Connection con = DatabaseConnection.seConnecter();
        if (con != null) {
            try {
                String sql = "INSERT INTO animaux (nom, espece, race) VALUES (?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nom);
                pst.setString(2, espece);
                pst.setString(3, race);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "✅ Animal enregistré avec succès !");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "❌ Erreur : " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "❌ Pas de connexion à la base !");
        }
    }
}