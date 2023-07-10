package Questoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Questao3 {
    private JFrame jFrame;
    
    public Questao3(char q1, char q2) {
        jFrame = new JFrame("Questao 3");
        jFrame.setBounds(400, 200, 800, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        
        JLabel lblTitle = new JLabel("Questao 3: Qual é o cientista famoso responsável pela teoria da relatividade?"); 
        lblTitle.setBounds(200, 20, 500, 30);
        jFrame.add(lblTitle);
        
        JButton btnCerto = new JButton("Albert Einstein");
        btnCerto.setBounds(150, 100, 200, 30);
        jFrame.add(btnCerto);
        
        JButton btnErr1 = new JButton("Nikola Tesla");
        btnErr1.setBounds(150, 200, 200, 30);
        jFrame.add(btnErr1);
        
        JButton btnErr2 = new JButton("Galileu Galilei");
        btnErr2.setBounds(450, 100, 200, 30);
        jFrame.add(btnErr2);
        
        JButton btnErr3 = new JButton("Isaac Newton");
        btnErr3.setBounds(450, 200, 200, 30);
        jFrame.add(btnErr3);
        
        btnCerto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Questao4 q4 = new Questao4(q1,q2,'S');
            }
        });
        
        ActionListener perdeuListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Questao4 q4 = new Questao4(q1,q2,'N');
            }
        };
        
        btnErr1.addActionListener(perdeuListener);
        btnErr2.addActionListener(perdeuListener);
        btnErr3.addActionListener(perdeuListener);
        
        jFrame.setVisible(true);
    }
}
