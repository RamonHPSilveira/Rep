
package br.com.modelo;


public class Vendas {
    
    private EmpFornecedora emp_fornecedora; // empresa que fornece
    private EmpVendas emp_vendas;          // empresa que compra
    private int id_venda;                 // codigo da venda
    private Produto produto;             // produto vendido
    private Funcionario funcionario;   // funcionario que realiza a venda

    public EmpFornecedora getEmp_fornecedora() {
        return emp_fornecedora;
    }

    public void setEmp_fornecedora(EmpFornecedora emp_fornecedora) {
        this.emp_fornecedora = emp_fornecedora;
    }

    public EmpVendas getEmp_vendas() {
        return emp_vendas;
    }

    public void setEmp_vendas(EmpVendas emp_vendas) {
        this.emp_vendas = emp_vendas;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Vendas{" + "emp_fornecedora=" + emp_fornecedora + ", emp_vendas=" + emp_vendas + ", id_venda=" + id_venda + ", produto=" + produto + ", funcionario=" + funcionario + '}';
    }
    
    
}
