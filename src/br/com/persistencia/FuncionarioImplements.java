
package br.com.persistencia;

import br.com.modelo.Funcionario;
import br.com.persistencia.dao.FuncionarioDAO;
import com.sun.imageio.stream.StreamCloser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;


public class FuncionarioImplements implements FuncionarioDAO{
    private static final String INSERT = "insert into funcionario(nome,idade,rg,cpf,telefone,email,sexo,id,salario,cdt"
            + "observacao,funcao,dt_adm,regiao,comissao) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
    
    @Override
    public int salve(Funcionario f) {
        if (f.getId()== 0) {
            return insert(f);
        }else{
            return update(f);
        }
    }
    
    private int insert(Funcionario f){
        Connection con =null;
        PreparedStatement pstm =null;
        int retorno =-1;
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            
            pstm.setString(1, f.getNome());
            pstm.setInt(2, f.getIdade());
            pstm.setString(3, f.getRg());
            pstm.setString(4, f.getCpf());
            pstm.setString(5, f.getTelefone());
            pstm.setString(6, f.getEmail());
            pstm.setString(7, f.getSexo());
            pstm.setDouble(8, f.getSalario());
            pstm.setString(9, f.getCpf());
            pstm.setString(10, f.getObservacao());
            pstm.setString(11, f.getFuncao());
            pstm.setDate(12, new java.sql.Date(f.getDt_adm().getTime()));
            pstm.setInt(13, f.getRegiao().getId_regiao());
            pstm.setDouble(14, f.getComissao());
            pstm.execute();
            
            try(ResultSet rs = 
                    pstm.getGeneratedKeys()){
               if (rs.next()){
                   retorno = rs.getInt(1);
               } 
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+e);}
        finally{
            try{
                ConnectionFactory.closeConnection(con,pstm);
            }catch(Exception e){JOptionPane.showMessageDialog(null,"Erro ao fechar conexao ao inserir"+e);}
        }
        return retorno;
    }
    
    private int update(Funcionario f){
       Connection con =null;
        PreparedStatement pstm =null;
        int retorno =-1;
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            
            pstm.setString(1, f.getNome());
            pstm.setInt(2, f.getIdade());
            pstm.setString(3, f.getRg());
            pstm.setString(4, f.getCpf());
            pstm.setString(5, f.getTelefone());
            pstm.setString(6, f.getEmail());
            pstm.setString(7, f.getSexo());
            pstm.setDouble(8, f.getSalario());
            pstm.setString(9, f.getCpf());
            pstm.setString(10, f.getObservacao());
            pstm.setString(11, f.getFuncao());
            pstm.setDate(12, new java.sql.Date(f.getDt_adm().getTime()));
            pstm.setInt(13, f.getRegiao().getId_regiao());
            pstm.setDouble(14, f.getComissao());
            pstm.execute();
            
            retorno = f.getId();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+e);}
        finally{
            try{
                ConnectionFactory.closeConnection(con,pstm);
            }catch(Exception e){JOptionPane.showMessageDialog(null,"Erro ao fechar conexao ao inserir"+e);}
        }
        return retorno;
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
