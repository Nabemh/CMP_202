package Swing;

import javax.swing.*;
import java.awt.*;

public class XandO {
    JFrame tictac = new JFrame("X and O");
    JButton btnone = new JButton();
    JButton btntwo = new JButton();
    JButton btnthree = new JButton();
    JButton btnfour = new JButton();
    JButton btnfive = new JButton();
    JButton btnsix = new JButton();
    JButton btnseven = new JButton();
    JButton btneight = new JButton();
    JButton btnnine = new JButton();
    void drawUI() {
        tictac.add(btnone);
        tictac.add(btntwo);
        tictac.add(btnthree);
        tictac.add(btnfour);
        tictac.add(btnfive);
        tictac.add(btnsix);
        tictac.add(btnseven);
        tictac.add(btneight);
        tictac.add(btnnine);
        tictac.setLayout(new GridLayout(3,3));
        tictac.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tictac.setSize(400,400);
        tictac.setVisible(true);
    }
}
