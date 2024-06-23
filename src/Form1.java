import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    public JPanel panel1;
    private JLabel label_numero1;
    private JTextField primer_numero;
    private JLabel label_numero2;
    private JTextField segundo_numero;
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton division;
    private JLabel respuesta;

    public Form1() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(primer_numero.getText());
                double numero2 = Double.parseDouble(segundo_numero.getText());
                double suma = numero1 + numero2;
                respuesta.setText(String.valueOf(suma));
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(primer_numero.getText());
                double numero2 = Double.parseDouble(segundo_numero.getText());
                double resta = numero1 - numero2;
                respuesta.setText(String.valueOf(resta));
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(primer_numero.getText());
                double numero2 = Double.parseDouble(segundo_numero.getText());
                double multiplicacion = numero1 * numero2;
                respuesta.setText(String.valueOf(multiplicacion));
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(primer_numero.getText());
                double numero2 = Double.parseDouble(segundo_numero.getText());
                if (numero2 != 0) {
                    respuesta.setText(String.valueOf(numero1 / numero2));
                }else{
                    respuesta.setText("Error, es division para cero");
                }
            }
        });
    }
}
