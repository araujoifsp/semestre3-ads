package cadUsuario;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import module.Usuario;

public class FormCadUsuarios extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public Usuario usuario = new Usuario();
	public JPanelFormCadastroUsuario jPanelFormCadastroUsuario = new JPanelFormCadastroUsuario(usuario, this);
	public JPanelTabCadastroUsuario  jPanelTabCadastroUsuario  = new JPanelTabCadastroUsuario(jPanelFormCadastroUsuario);
	
	public FormCadUsuarios() {
		super("Cadastro de Usuários");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new GridLayout(2, 1));
		
		jPanelTabCadastroUsuario.loadUsuarios(usuario.list());		
		jPanelFormCadastroUsuario.setLayout(new GridLayout(0, 2));
		jPanelTabCadastroUsuario.setLayout(new GridLayout(1, 1));
		
		JScrollPane scrollPaneForm = new JScrollPane(jPanelFormCadastroUsuario);
		JScrollPane scrollPaneTab = new JScrollPane(jPanelTabCadastroUsuario);
		
		this.getContentPane().add(scrollPaneForm);
		this.getContentPane().add(scrollPaneTab);
		this.setVisible(true);
	}
	
	public void refreshTable() {
		jPanelTabCadastroUsuario.loadUsuarios(usuario.list());
	}
	
	public void novoUsuario() {
		this.usuario = new Usuario();
		this.jPanelFormCadastroUsuario.loadUsuario(usuario);
		this.repaint();
	}
	
	public static void main(String[] args) {
		new FormCadUsuarios();
	}
}
