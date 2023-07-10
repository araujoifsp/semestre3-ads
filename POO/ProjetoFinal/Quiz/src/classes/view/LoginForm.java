package classes.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
    
	private static final long serialVersionUID = 1L;
    
	private JLabel lblTitulo; 
    private JLabel lblEmail;
    private JLabel lblSenha;
    private JTextField txtEmail;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private JButton btnSair;
    
    public LoginForm() {
        this.setTitle("Login");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        int x, y, w, h;
        
        this.lblTitulo = new JLabel("Autenticação do Sistema");
        x = 5; y = 10 ; w = getWidth()-5; h = 30; 
        this.lblTitulo.setBounds(x, y, w, h);
        this.add(lblTitulo);
        
        this.lblEmail = new JLabel("E-mail:");
        x = 5; y = 45; w = 105; h = 30;
        this.lblEmail.setBounds(x, y, w, h);
        this.add(lblEmail);
        
        this.txtEmail = new JTextField();
        x = 110; y = 45; w = getWidth()-120; h = 30;
        this.txtEmail.setBounds(x, y, w, h);
        this.add(txtEmail);
        
        this.lblSenha = new JLabel("Senha:");
        x = 5; y = 80; w = 100; h = 30;
        this.lblSenha.setBounds(x, y, w, h);
        this.add(lblSenha);
        
        this.txtSenha = new JPasswordField();
        x = 110; y = 80; w = getWidth()-120; h = 30;
        this.txtSenha.setBounds(x, y, w, h);
        this.add(txtSenha);
        
        this.btnEntrar = new JButton("Entrar");
        x = 5; y = 120; w = getWidth()/2-10; h = 40;
        this.btnEntrar.setBounds(x, y, w, h);
        this.btnEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
            }
        });
        this.add(btnEntrar);
        
        this.btnSair = new JButton("Sair");
        x = getWidth()/2; y = 120; w = getWidth()/2-10; h = 40;
        this.btnSair.setBounds(x, y, w, h);
        this.btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(btnSair);
    }
    
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
