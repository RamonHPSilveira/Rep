
package br.com.modelo;


public class Pedidos {
    private EmpVendas emp_pedido;             // empresa que realiza o pedido
    private EmpFornecedora emp_fornecedora;  // empresa que fornece o produto    
    private int id_pedido;                  // cogigo do pedido
    private Produto produto;               // produto pedido 
    private Cliente cliente;              // cliente que realiza o pedido
    private Funcionario funcionario;     // funcionario que realiza a pre-venda

    public EmpVendas getEmp_pedido() {
        return emp_pedido;
    }

    public void setEmp_pedido(EmpVendas emp_pedido) {
        this.emp_pedido = emp_pedido;
    }

    public EmpFornecedora getEmp_fornecedora() {
        return emp_fornecedora;
    }

    public void setEmp_fornecedora(EmpFornecedora emp_fornecedora) {
        this.emp_fornecedora = emp_fornecedora;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "emp_pedido=" + emp_pedido + ", emp_fornecedora=" + emp_fornecedora + ", id_pedido=" + id_pedido + ", produto=" + produto + ", cliente=" + cliente + ", funcionario=" + funcionario + '}';
    }
    
    
}


