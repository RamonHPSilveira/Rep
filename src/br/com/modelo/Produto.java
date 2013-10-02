
package br.com.modelo;


public class Produto {
    private String des_produto;
    private String nome_prod;
    private double custo;
    private int id_produto;
    private int id_empresa;
    private String observacoes;
    private EmpFornecedora emp_fornecedora;

    public Produto() {
    }

    public String getDes_produto() {
        return des_produto;
    }

    public void setDes_produto(String des_produto) {
        this.des_produto = des_produto;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Produto{" + "des_produto=" + des_produto + ", nome_prod=" + nome_prod + ", custo=" + custo + ", id_produto=" + id_produto + ", id_empresa=" + id_empresa + ", observacoes=" + observacoes + '}';
    }
    
    
    
}
