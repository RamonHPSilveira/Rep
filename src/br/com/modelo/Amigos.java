
package br.com.modelo;
//Amigos ou influentes dentro da empresa cliente
public class Amigos extends Pessoa {

   private String funcao;           //funcao ou area de trabalho
   private String observacoes;     // observacoes

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Amigos{" + "funcao=" + funcao + ", observacoes=" + observacoes + '}';
    }
    
    
}
