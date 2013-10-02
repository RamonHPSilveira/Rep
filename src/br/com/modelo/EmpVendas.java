package br.com.modelo;





public class EmpVendas  {
    private Empresa empresa;                // empresa
    private String produto_interesse;      // produtos que podem interessa-la

    public String getProduto_interesse() {
        return produto_interesse;
    }

    public void setProduto_interesse(String produto_interesse) {
        this.produto_interesse = produto_interesse;
    }

  

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public EmpVendas() {
    }

    @Override
    public String toString() {
        return "EmpVendas{" + "empresa=" + empresa + ", produto_interesse=" + produto_interesse + '}';
    }

    
  
   
    
    
}
