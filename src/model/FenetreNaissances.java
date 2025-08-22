package model;

import javax.swing.*;
import java.awt.*;

public class FenetreNaissances extends JFrame {
    public FenetreNaissances() {
        setTitle("Gestion des Naissances");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel lbl = new JLabel("Fenêtre Naissances (à compléter)", JLabel.CENTER);
        add(lbl, BorderLayout.CENTER);
    }
}