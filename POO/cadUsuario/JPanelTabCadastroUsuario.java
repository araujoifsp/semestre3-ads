package cadUsuario;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import module.Usuario;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JPanelTabCadastroUsuario extends JPanel {
	
    private static final long serialVersionUID = 1L;
	private JPanelFormCadastroUsuario form;
    private UsuarioTableModel tableModel;
    private JTable table;

    public JPanelTabCadastroUsuario(JPanelFormCadastroUsuario form) {
        super(new BorderLayout());
        this.setForm(form);

        tableModel = new UsuarioTableModel();
        table = new JTable(tableModel);

        // Adicionando evento de clique duplo à tabela
        table.addMouseListener(new MouseInputAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Usuario usuario = tableModel.getUserAt(table.getSelectedRow());
                    form.loadUsuario(usuario);
                }
            }
        });

        this.add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void loadUsuarios(ResultSet rs) {
        try {
            List<Usuario> usuarios = new ArrayList<>();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setIdNivelUsuario(rs.getInt("idNivelUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setUf(rs.getString("uf"));
                usuario.setCep(rs.getString("cep"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setFoto(rs.getString("foto"));
                usuario.setAtivo(rs.getString("ativo"));
                usuarios.add(usuario);
            }
            tableModel.setData(usuarios);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public JPanelFormCadastroUsuario getForm() {
		return form;
	}

	public void setForm(JPanelFormCadastroUsuario form) {
		this.form = form;
	}
}
