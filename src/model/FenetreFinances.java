package model;

import javax.swing.*;
import java.awt.*;

public class FenetreFinances extends JFrame {
    public FenetreFinances() {
        setTitle("Gestion des Finances");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel lbl = new JLabel("Fenetre Finances (à compléter)", JLabel.CENTER);
        add(lbl, BorderLayout.CENTER);
    }
}
