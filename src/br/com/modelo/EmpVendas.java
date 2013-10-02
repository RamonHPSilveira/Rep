package br.com.modelo;





public class EmpVendas extends Empresa {
    
    private String area;
    private double vendas;
    private double val_pedidos;
    private String pedidos;
    private int id_func_responsavel;
    private int id_cliente_responsavel;
    private String produto_comp;
    private String produto_interesse;

    public String getProduto_comp() {
        return produto_comp;
    }

    public void setProduto_comp(String produto_comp) {
        this.produto_comp = produto_comp;
    }

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

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getVal_pedidos() {
        return val_pedidos;
    }

    public void setVal_pedidos(double val_pedidos) {
        this.val_pedidos = val_pedidos;
    }

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }

    public int getId_func_responsavel() {
        return id_func_responsavel;
    }

    public void setId_func_responsavel(int id_func_responsavel) {
        this.id_func_responsavel = id_func_responsavel;
    }

    public int getId_cliente_responsavel() {
        return id_cliente_responsavel;
    }

    public void setId_cliente_responsavel(int id_cliente_responsavel) {
        this.id_cliente_responsavel = id_cliente_responsavel;
    }

    public EmpVendas() {
    }

    @Override
    public String toString() {
        return "EmpVendas{" + "area=" + area + ", vendas=" + vendas + ", val_pedidos=" + val_pedidos + ", pedidos=" + pedidos + ", id_func_responsavel=" + id_func_responsavel + ", id_cliente_responsavel=" + id_cliente_responsavel + ", produto_comp=" + produto_comp + ", produto_interesse=" + produto_interesse + '}';
    }

   
    
    
}
