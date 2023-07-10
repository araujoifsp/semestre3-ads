package cadUsuario;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import module.Usuario;

public class JPanelFormCadastroUsuario extends JPanel {

	private static final long serialVersionUID = 1L;

	public Usuario usuario;
	public FormCadUsuarios jFrameContainer = null;

	public JTextField idUsuarioField;
	public JTextField emailField;
	public JPasswordField senhaField;
	public JComboBox<String> nivelUsuarioField;
	public JTextField nomeField;
	public JFormattedTextField cpfField;
	public JTextField enderecoField;
	public JTextField bairroField;
	public JTextField cidadeField;
	public JComboBox<String> ufField;
	public JFormattedTextField cepField;
	public JFormattedTextField telefoneField;
	public JTextField fotoField;
	public JComboBox<String> ativoField;

	public JButton createButton = new JButton("Novo");
	public JButton updateButton = new JButton("Salvar");
	public JButton deleteButton = new JButton("Excluir");

	public JPanelFormCadastroUsuario(FormCadUsuarios jFrame) {
		this(null, jFrame);
		this.jFrameContainer = jFrame;
	}

	public JPanelFormCadastroUsuario(Usuario usuario, FormCadUsuarios jFrame) {
		this.jFrameContainer = jFrame;
		if (usuario == null) {
			usuario = new Usuario(0, "email@exemplo.com", "senha", 1, "Nome", "000.000.000-00", "Endereço", "Bairro","Cidade", "UF", "00000-000", "(00) 00000-0000", "caminho/para/foto.jpg", "1");
		}
		this.usuario = usuario;

		this.setLayout(new GridLayout(0, 3));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = 2;

		this.add(new JLabel("Cadastro de Usuários:"));

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(createButton);
		buttonPanel.add(updateButton);
		buttonPanel.add(deleteButton);
		this.add(buttonPanel, gbc);

		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novoUsuario();
			}
		});
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});

		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				delete();
			}
		});

		try {
			MaskFormatter telefoneMask = new MaskFormatter("(##) ####-####");
            telefoneMask.setPlaceholderCharacter('_');
            telefoneField = new JFormattedTextField(telefoneMask);
            telefoneField.setText(usuario.getTelefone());
            telefoneField.setColumns(15);
            
			MaskFormatter cepMask = new MaskFormatter("#####-###");
            cepMask.setPlaceholderCharacter('_');
            cepField = new JFormattedTextField(cepMask);
            cepField.setText(usuario.getCep());
            cepField.setColumns(10);
		
            MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
            cpfMask.setPlaceholderCharacter('_');
            cpfField = new JFormattedTextField(cpfMask);
            cpfField.setText(usuario.getCpf());
            cpfField.setColumns(15);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		this.add(new JLabel("ID Usuário"));
		idUsuarioField = new JTextField(String.valueOf(usuario.getIdUsuario()));
		this.add(idUsuarioField, gbc);

		this.add(new JLabel("Email"));
		emailField = new JTextField(usuario.getEmail());
		this.add(emailField, gbc);

		this.add(new JLabel("Senha"));
		senhaField = new JPasswordField(usuario.getSenha());
		this.add(senhaField, gbc);

		this.add(new JLabel("Nível de Usuário"));
		nivelUsuarioField = new JComboBox<>(new String[] { "1,Cliente", "2,Funcionário", "3,Caixa", "4,Financeiro","5,Gerente", "6,Diretor", "7,Administrador" });
		nivelUsuarioField.setSelectedIndex(usuario.getIdNivelUsuario() - 1);
		this.add(nivelUsuarioField, gbc);

		this.add(new JLabel("Nome"));
		nomeField = new JTextField(usuario.getNome());
		this.add(nomeField, gbc);

		this.add(new JLabel("CPF"));
		this.add(cpfField, gbc);

		this.add(new JLabel("Endereço"));
		enderecoField = new JTextField(usuario.getEndereco());
		this.add(enderecoField, gbc);

		this.add(new JLabel("Bairro"));
		bairroField = new JTextField(usuario.getBairro());
		this.add(bairroField, gbc);

		this.add(new JLabel("Cidade"));
		cidadeField = new JTextField(usuario.getCidade());
		this.add(cidadeField, gbc);

		this.add(new JLabel("UF"));
		ufField = new JComboBox<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS","MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" });
		ufField.setSelectedItem(usuario.getUf());
		this.add(ufField, gbc);
		
		this.add(new JLabel("CEP"));
		this.add(cepField, gbc);

		this.add(new JLabel("Telefone"));
		this.add(telefoneField, gbc);

		this.add(new JLabel("Foto"));
		fotoField = new JTextField(usuario.getFoto());
		this.add(fotoField, gbc);

		this.add(new JLabel("Ativo"));
		ativoField = new JComboBox<>(new String[] { "Sim", "Não" });
		ativoField.setSelectedItem(usuario.getAtivo().equals("1") ? "Sim" : "Não");
		this.add(ativoField, gbc);
		
	}

	public void save() {
		updateUsuarioFromFields();
		usuario.save();
		this.jFrameContainer.refreshTable();
	}

	public void novoUsuario() {
		jFrameContainer.novoUsuario();
	}

	public void delete() {
		updateUsuarioFromFields();
		usuario.delete();
		jFrameContainer.jPanelFormCadastroUsuario.loadUsuario(new Usuario());
		jFrameContainer.refreshTable();
	}

	public void loadUsuario(Usuario usuario) {
		this.usuario = usuario;
		updateFieldsFromUsuario();
	}

	private void updateUsuarioFromFields() {
		usuario.setIdUsuario(Integer.parseInt(idUsuarioField.getText()));
		usuario.setEmail(emailField.getText());
		usuario.setSenha(new String(senhaField.getPassword()));
		usuario.setIdNivelUsuario(nivelUsuarioField.getSelectedIndex() + 1);
		usuario.setNome(nomeField.getText());
		usuario.setCpf(cpfField.getText());
		usuario.setEndereco(enderecoField.getText());
		usuario.setBairro(bairroField.getText());
		usuario.setCidade(cidadeField.getText());
		usuario.setUf(ufField.getSelectedItem().toString());
		usuario.setCep(cepField.getText());
		usuario.setTelefone(telefoneField.getText());
		usuario.setFoto(fotoField.getText());
		usuario.setAtivo(ativoField.getSelectedItem().equals("Sim") ? "S" : "N");
	}

	public void updateFieldsFromUsuario() {
		idUsuarioField.setText(String.valueOf(usuario.getIdUsuario()));
		emailField.setText(usuario.getEmail());
		senhaField.setText(usuario.getSenha());
		nivelUsuarioField.setSelectedIndex(usuario.getIdNivelUsuario() - 1);
		nomeField.setText(usuario.getNome());
		cpfField.setText(usuario.getCpf());
		enderecoField.setText(usuario.getEndereco());
		bairroField.setText(usuario.getBairro());
		cidadeField.setText(usuario.getCidade());
		ufField.setSelectedItem(usuario.getUf());
		cepField.setText(usuario.getCep());
		telefoneField.setText(usuario.getTelefone());
		fotoField.setText(usuario.getFoto());
		ativoField.setSelectedItem(usuario.getAtivo().equals("S") ? "Sim" : "Não");
	}
}
