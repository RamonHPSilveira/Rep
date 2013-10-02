
package br.com.modelo;


public class Produto {
    private String des_produto;             // descricao
    private String area;                   // area que pode atuar o produto 
    private String nome_prod;             // nome comercial  
    private double custo_compra;         // custo que o fornecedor cobra
    private double custo_venda;         // custo que sera imposto ao cliente
    private int id_produto;            // codigo do produto
    private String observacoes;       // observacoes
    private String nome_original;    // nome original
   

    public Produto() {
    }
     public String getNome_original() {
        return nome_original;
    }

    public void setNome_original(String nome_original) {
        this.nome_original = nome_original;
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


    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getCusto_compra() {
        return custo_compra;
    }

    public void setCusto_compra(double custo_compra) {
        this.custo_compra = custo_compra;
    }

    public double getCusto_venda() {
        return custo_venda;
    }

    public void setCusto_venda(double custo_venda) {
        this.custo_venda = custo_venda;
    }

    @Override
    public String toString() {
        return "Produto{" + "des_produto=" + des_produto + ", area=" + area + ", nome_prod=" + nome_prod + ", custo_compra=" + custo_compra + ", custo_venda=" + custo_venda + ", id_produto=" + id_produto + ", observacoes=" + observacoes + ", nome_original=" + nome_original + '}';
    }

    
 
}
