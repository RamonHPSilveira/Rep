
package br.com.modelo;


public class Regiao {
    private int id_regiao;              // codigo da regiao
    private String observacoes;        // observacao
    private String nome_regiao;       // nome da regiao

    public Regiao() {
    }

    public int getId_regiao() {
        return id_regiao;
    }

    public void setId_regiao(int id_regiao) {
        this.id_regiao = id_regiao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getNome_regiao() {
        return nome_regiao;
    }

    public void setNome_regiao(String nome_regiao) {
        this.nome_regiao = nome_regiao;
    }

    @Override
    public String toString() {
        return "Regiao{" + "id_regiao=" + id_regiao + ", observacoes=" + observacoes + ", nome_regiao=" + nome_regiao + '}';
    }
    
    
}
