
package br.com.persistencia;

import br.com.modelo.Funcionario;
import br.com.persistencia.dao.FuncionarioDAO;
import java.util.List;


public class FuncionarioImplements implements FuncionarioDAO{

    @Override
    public int salve(Funcionario f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
