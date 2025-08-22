package ul;
import connectionDB.DatabaseConnection;
import model.*;
import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface() {
        setTitle("Application de Gestion d'Élevage");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));

        // Boutons
        JButton btnAnimaux = new JButton("Gestion des Animaux");
        JButton btnNaissances = new JButton("Gestion des Naissances");
        JButton btnSoins = new JButton("Gestion des Soins");
        JButton btnAliments = new JButton("Gestion des Aliments");
        JButton btnFinances = new JButton("Gestion des Finances");
        JButton btnQuitter = new JButton("Quitter");

        // Ajout au panel
        panel.add(btnAnimaux);
        panel.add(btnNaissances);
        panel.add(btnSoins);
        panel.add(btnAliments);
        panel.add(btnFinances);
        panel.add(btnQuitter);

        add(panel);

        // Actions
        btnAnimaux.addActionListener(e -> {
            new FormulaireAjoutAnimal(); // ouvre la fenêtre de gestion animaux
        });

        btnNaissances.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Module Naissances à développer");
        });

        btnSoins.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Module Soins à développer");
        });

        btnAliments.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Module Aliments à développer");
        });

        btnFinances.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Module Finances à développer");
        });

        btnQuitter.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        // Vérifier la connexion BD
        if (ConnectionDB.seConnecter() != null) {
            SwingUtilities.invokeLater(() -> {
                new Interface().setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null, "Erreur : impossible de se connecter à la base !");
        }
    }
}