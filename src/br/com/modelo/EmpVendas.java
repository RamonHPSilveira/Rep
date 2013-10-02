package br.com.modelo;





public class EmpVendas  {
    private int tipo = 1;
    private Empresa empresa;
    private String area;
   
    

   
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
        return "EmpVendas{" + "tipo=" + tipo + ", empresa=" + empresa + ", area=" + area + '}';
    }

  
   
    
    
}
