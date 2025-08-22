package model;

import javax.swing.*;
import java.awt.*;

public class FenetreSoins extends JFrame {
    public FenetreSoins() {
        setTitle("Gestion des Soins");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel lbl = new JLabel("Fenêtre Soins (à compléter)", JLabel.CENTER);
        add(lbl, BorderLayout.CENTER);
    }
}