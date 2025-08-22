package model;


import javax.swing.*;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {
        setTitle("Gestion d'Élevage");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuAnimaux = new JMenu("Animaux");
        JMenuItem ajouterAnimal = new JMenuItem("Ajouter Animal");

        menuAnimaux.add(ajouterAnimal);
        menuBar.add(menuAnimaux);
        setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Bienvenue dans l'application de gestion d'élevage"));
        add(panel);
    }

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }
}