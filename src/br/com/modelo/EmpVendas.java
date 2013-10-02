package br.com.modelo;





public class EmpVendas  {
    private Empresa empresa;
    private String area;
    private String produto_interesse;

    public String getProduto_interesse() {
        return produto_interesse;
    }

    public void setProduto_interesse(String produto_interesse) {
        this.produto_interesse = produto_interesse;
    }
    

   
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
        return "EmpVendas{" + "empresa=" + empresa + ", area=" + area + ", produto_interesse=" + produto_interesse + '}';
    }

    

    

  
   
    
    
}
