package cadUsuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import module.Usuario;

public class UsuarioTableModel extends AbstractTableModel {
	
    private static final long serialVersionUID = 1L;
	private List<Usuario> data = new ArrayList<>();
    private String[] columnNames = {
        "ID", "Email", "Senha", "Nível de Usuário", "Nome", "CPF", "Endereço", "Bairro",
        "Cidade", "UF", "CEP", "Telefone", "Foto", "Ativo"
    };

    public void setData(List<Usuario> data) {
        this.data = data;
        this.fireTableDataChanged();
    }

    public Usuario getUserAt(int row) {
        return data.get(row);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = data.get(rowIndex);
        switch (columnIndex) {
            case 0: return usuario.getIdUsuario();
            case 1: return usuario.getEmail();
            case 2: return usuario.getSenha();
            case 3: return usuario.getIdNivelUsuario();
            case 4: return usuario.getNome();
            case 5: return usuario.getCpf();
            case 6: return usuario.getEndereco();
            case 7: return usuario.getBairro();
            case 8: return usuario.getCidade();
            case 9: return usuario.getUf();
            case 10: return usuario.getCep();
            case 11: return usuario.getTelefone();
            case 12: return usuario.getFoto();
            case 13: return usuario.getAtivo();
            default: return null;
        }
    }
}
