package gatoswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ignacio Leon
 */
public class GatoSwing extends JFrame implements ActionListener {

    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    JButton boton6;
    JButton boton7;
    JButton boton8;
    JButton boton9;
    JButton nuevoJuego;
    String signoActual = "X";

    public GatoSwing() {
        setLayout(null);
        setTitle("Gato");
        boton1 = new JButton("");
        boton2 = new JButton("");
        boton3 = new JButton("");
        boton4 = new JButton("");
        boton5 = new JButton("");
        boton6 = new JButton("");
        boton7 = new JButton("");
        boton8 = new JButton("");
        boton9 = new JButton("");
        nuevoJuego = new JButton("Nuevo Juego");

        boton1.setBounds(2, 2, 98, 98);
        boton2.setBounds(100, 2, 98, 98);
        boton3.setBounds(198, 2, 98, 98);
        boton4.setBounds(2, 100, 98, 98);
        boton5.setBounds(100, 100, 98, 98);
        boton6.setBounds(198, 100, 98, 98);
        boton7.setBounds(2, 198, 98, 98);
        boton8.setBounds(100, 198, 98, 98);
        boton9.setBounds(198, 198, 98, 98);
        nuevoJuego.setBounds(188, 300, 108, 20);

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        add(nuevoJuego);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        nuevoJuego.addActionListener(this);

        nuevoJuego.setEnabled(false);

    }

    public void Ganador() {
        int cont=0;
        if (boton1.getText().equals(boton5.getText()) && boton1.getText().equals(boton9.getText()) && !boton1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton4.setEnabled(false);
            boton6.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        }
        if (boton3.getText().equals(boton5.getText()) && boton3.getText().equals(boton7.getText()) && !boton3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton4.setEnabled(false);
            boton6.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        }
        if (boton1.getText().equals(boton2.getText()) && boton1.getText().equals(boton3.getText()) && !boton1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton4.setEnabled(false);
            boton5.setEnabled(false);
            boton6.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        }
        if (boton4.getText().equals(boton5.getText()) && boton4.getText().equals(boton6.getText()) && !boton4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        }
        if (boton7.getText().equals(boton8.getText()) && boton7.getText().equals(boton9.getText()) && !boton7.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton4.setEnabled(false);
            boton5.setEnabled(false);
            boton6.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        }
        if (boton1.getText().equals(boton4.getText()) && boton1.getText().equals(boton7.getText()) && !boton1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton5.setEnabled(false);
            boton6.setEnabled(false);
            boton8.setEnabled(false);
            boton9.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        }
        if (boton2.getText().equals(boton5.getText()) && boton2.getText().equals(boton8.getText()) && !boton2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton1.setEnabled(false);
            boton3.setEnabled(false);
            boton4.setEnabled(false);
            boton6.setEnabled(false);
            boton7.setEnabled(false);
            boton9.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        }
        if (boton3.getText().equals(boton6.getText()) && boton3.getText().equals(boton9.getText()) && !boton3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, ¡Haz ganado!");
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton4.setEnabled(false);
            boton5.setEnabled(false);
            boton7.setEnabled(false);
            boton8.setEnabled(false);
            nuevoJuego.setEnabled(true);
            cont=1;
        } else {
            if (!boton1.isEnabled() && !boton2.isEnabled() && !boton3.isEnabled() && !boton4.isEnabled() && !boton5.isEnabled() && !boton6.isEnabled() && !boton7.isEnabled() && !boton8.isEnabled() && !boton9.isEnabled()&&cont!=1) {
                JOptionPane.showMessageDialog(null, "Ha sido un Empate");
                nuevoJuego.setEnabled(true);
            }
        }
    }

    public static void main(String[] args) {
        GatoSwing GS = new GatoSwing();
        GS.setVisible(true);
        GS.setBounds(20, 20, 316, 368);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        if (e.getSource() == boton1) {
            if (signoActual.equals("X")) {
                boton1.setText(signoActual);
                signoActual = "O";
            } else {
                boton1.setText(signoActual);
                signoActual = "X";
            }
            boton1.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton2) {
            if (signoActual.equals("X")) {
                boton2.setText(signoActual);
                signoActual = "O";
            } else {
                boton2.setText(signoActual);
                signoActual = "X";
            }
            boton2.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton3) {
            if (signoActual.equals("X")) {
                boton3.setText(signoActual);
                signoActual = "O";
            } else {
                boton3.setText(signoActual);
                signoActual = "X";
            }
            boton3.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton4) {
            if (signoActual.equals("X")) {
                boton4.setText(signoActual);
                signoActual = "O";
            } else {
                boton4.setText(signoActual);
                signoActual = "X";
            }
            boton4.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton5) {
            if (signoActual.equals("X")) {
                boton5.setText(signoActual);
                signoActual = "O";
            } else {
                boton5.setText(signoActual);
                signoActual = "X";
            }
            boton5.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton6) {
            if (signoActual.equals("X")) {
                boton6.setText(signoActual);
                signoActual = "O";
            } else {
                boton6.setText(signoActual);
                signoActual = "X";
            }
            boton6.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton7) {
            if (signoActual.equals("X")) {
                boton7.setText(signoActual);
                signoActual = "O";
            } else {
                boton7.setText(signoActual);
                signoActual = "X";
            }
            boton7.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton8) {
            if (signoActual.equals("X")) {
                boton8.setText(signoActual);
                signoActual = "O";
            } else {
                boton8.setText(signoActual);
                signoActual = "X";
            }
            boton8.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == boton9) {
            if (signoActual.equals("X")) {
                boton9.setText(signoActual);
                signoActual = "O";
            } else {
                boton9.setText(signoActual);
                signoActual = "X";
            }
            boton9.setEnabled(false);
            Ganador();
        }
        if (e.getSource() == nuevoJuego) {
            boton1.setText("");
            boton2.setText("");
            boton3.setText("");
            boton4.setText("");
            boton5.setText("");
            boton6.setText("");
            boton7.setText("");
            boton8.setText("");
            boton9.setText("");

            boton1.setEnabled(true);
            boton2.setEnabled(true);
            boton3.setEnabled(true);
            boton4.setEnabled(true);
            boton5.setEnabled(true);
            boton6.setEnabled(true);
            boton7.setEnabled(true);
            boton8.setEnabled(true);
            boton9.setEnabled(true);
            nuevoJuego.setEnabled(false);
            signoActual = "X";
        }

    }

}
