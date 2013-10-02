
package br.com.modelo;

import java.util.Date;


public class Cliente extends Pessoa{
   
    private Date dt_nascimento;                         // data nascimento
    private String interesses;                         // o que o cliente gosta
    private String observacoes;                       // observacoes sobre ele
    private int id_cliente;                          // codigo do cliente
    private Vendas vendas;                          // compras feitas por ele
    private Amigos amigo_comum;                    // amigos que possui em comumou, contatos de efeito, ou contatos dentro da empresa
    private Empresa empresa;                      // empresa que o cliente trabalha
 
            
            
    public Amigos getAmigo_comum() {
        return amigo_comum;                         
    }

    public void setAmigo_comum(Amigos amigo_comum) {
        this.amigo_comum = amigo_comum;
    }


    public Cliente() {
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dt_nascimento=" + dt_nascimento + ", interesses=" + interesses + ", observacoes=" + observacoes + ", id_cliente=" + id_cliente + ", vendas=" + vendas + ", amigo_comum=" + amigo_comum + ", empresa=" + empresa + '}';
    }

  
 

}
