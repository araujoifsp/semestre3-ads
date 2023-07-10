package Questoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Quiz.Menu;

public class Questao4 {
    private JFrame jFrame;
    
    public Questao4(char q1, char q2, char q3) {
        jFrame = new JFrame("Questao 4");
        jFrame.setBounds(400, 200, 800, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        
        JLabel lblTitle = new JLabel("Questao 4: Qual é o principal componente da atmosfera terrestre?"); 
        lblTitle.setBounds(200 , 20, 500, 30);
        jFrame.add(lblTitle);
        
        JButton btnCerto = new JButton("Nitrogênio");
        btnCerto.setBounds(150 , 100, 200, 30);
        jFrame.add(btnCerto);
        
        JButton btnErr1 = new JButton("Oxigênio");
        btnErr1.setBounds(150 , 200, 200, 30);
        jFrame.add(btnErr1);
        
        JButton btnErr2 = new JButton("Dióxido de carbono");
        btnErr2.setBounds(450 , 100, 200, 30);
        jFrame.add(btnErr2);
        
        JButton btnErr3 = new JButton("Hidrogênio");
        btnErr3.setBounds(450 , 200, 200, 30);
        jFrame.add(btnErr3);
        
        btnCerto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Menu menu = new Menu(q1, q2, q3, 'S');
                menu.setVisible(true);
            }
        });
        
        ActionListener perdeuListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Menu menu = new Menu(q1, q2, q3, 'N');
                menu.setVisible(true);
            }
        };
        
        btnErr1.addActionListener(perdeuListener);
        btnErr2.addActionListener(perdeuListener);
        btnErr3.addActionListener(perdeuListener);
        
        jFrame.setVisible(true);
    }
}
