package br.com.modelo;





public class EmpFornecedora {
    
    private Empresa empresa;
    private double comissao;
    private Produto produto;
    
    
    public EmpFornecedora() {
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "EmpFornecedora{" + "empresa=" + empresa + ", comissao=" + comissao + ", produto=" + produto + '}';
    }

   

   
   

   
    
    
    
}
