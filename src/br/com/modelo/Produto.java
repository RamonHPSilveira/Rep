
package br.com.modelo;


public class Produto {
    private String des_produto;
    private String area;
    private String nome_prod;
    private double custo_compra;
    private double custo_venda;
    private int id_produto;
    private String observacoes;
   

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

    @Override
    public String toString() {
        return "Produto{" + "des_produto=" + des_produto + ", area=" + area + ", nome_prod=" + nome_prod + ", custo=" + custo + ", id_produto=" + id_produto + ", observacoes=" + observacoes + '}';
    }

   
   
   
    
    
}
