
package br.com.persistencia.dao;

import br.com.modelo.Funcionario;
import java.util.List;


public interface FuncionarioDAO {
//Opcoes para funcionario
    int salve(Funcionario f);
    boolean remove (int codigo);
    List<Funcionario> listAll();
}
