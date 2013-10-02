
package br.com.modelo;

import java.util.Date;


public class Cliente extends Pessoa{
   
    private Date dt_nascimento;
    private String interesses;
    private String observacoes;
    private int id_cliente;
    private String compras;
    private String amigo_comum;
    private int id_empresa;

    public String getAmigo_comum() {
        return amigo_comum;
    }

    public void setAmigo_comum(String amigo_comum) {
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

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dt_nascimento=" + dt_nascimento + ", interesses=" + interesses + ", observacoes=" + observacoes + ", id_cliente=" + id_cliente + ", compras=" + compras + ", amigo_comum=" + amigo_comum + '}';
    }

    
    
    
}
