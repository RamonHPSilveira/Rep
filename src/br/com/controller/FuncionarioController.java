
package br.com.controller;

import br.com.modelo.Funcionario;
import br.com.persistencia.FuncionarioImplements;

import br.com.persistencia.dao.FuncionarioDAO;
import java.util.List;


public class FuncionarioController {
    
    public int salvar(Funcionario f){
        FuncionarioDAO dao = new FuncionarioImplements();
        return dao.salve(f);
    }
    
    public boolean remove(int codigo){
        FuncionarioDAO dao = new FuncionarioImplements();
        return dao.remove(codigo);
    }
    
    public List<Funcionario> listarTodos(){
        FuncionarioDAO dao = new FuncionarioImplements();
        return dao.listAll();
    }
}
