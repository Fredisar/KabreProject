package model;

import javax.swing.*;
import java.awt.*;

public class FenetreAliments extends JFrame {
    public FenetreAliments() {
        setTitle("Gestion des Aliments");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel lbl = new JLabel("Fenetre Aliments (à compléter)", JLabel.CENTER);
        add(lbl, BorderLayout.CENTER);
    }
}