package br.com.empresa;





public class EmpFornecedora extends Empresa {
    
    private double comissao;
    private int vendas_concluidas;
    private int vendas_planejadas;
    private String descricao_produto;

    public EmpFornecedora() {
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

   

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getVendas_concluidas() {
        return vendas_concluidas;
    }

    public void setVendas_concluidas(int vendas_concluidas) {
        this.vendas_concluidas = vendas_concluidas;
    }

    public int getVendas_planejadas() {
        return vendas_planejadas;
    }

    public void setVendas_planejadas(int vendas_planejadas) {
        this.vendas_planejadas = vendas_planejadas;
    }

    @Override
    public String toString() {
        return "EmpFornecedora{" + "comissao=" + comissao + ", vendas_concluidas=" + vendas_concluidas + ", vendas_planejadas=" + vendas_planejadas + ", descricao_produto=" + descricao_produto + '}';
    }

   

   
    
    
    
}
