package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import classes.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Menu extends JFrame {
    private JTextField textField;
    private String nome;

    public Menu(char q1, char q2, char q3, char q4) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Formulário");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Digite seu nome");
        label.setHorizontalAlignment(JLabel.CENTER);
        textField = new JTextField();
        JButton enviarButton = new JButton("Enviar");
        JButton sairButton = new JButton("Sair");

        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(label);
        panel.add(textField);
        panel.add(enviarButton);
        panel.add(sairButton);
        add(panel, BorderLayout.CENTER);

        enviarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nome = textField.getText();
              
                int total = 0;
                
                if(q1 == 'S') {
                	total = total+1;
                }
                if(q2 == 'S') {
                	total = total+1;
                }
                if(q3 == 'S') {
                	total = total+1;
                }
                if(q4 == 'S') {
                	total = total+1;
                }
                
                Pontuacao pont = new Pontuacao(0, nome, q1, q2, q3, q4,total);
                pont.save();
                
                ResultSet rs = pont.listAll();
                Resultado r = new Resultado(rs);
              
                dispose();
            }
        });

        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public String getNome() {
        return nome;
    }

}