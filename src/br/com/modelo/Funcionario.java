
package br.com.modelo;

import java.util.Date;


public class Funcionario extends Pessoa{
    private int id;                             // codgigo do funcionario
    private double salario;                    // salario pago mensalmente
    private String cdt;                       // carteira de trabalho
    private String observacao;               // observacao sobre ele ou condicoes de contrato
    private String funcao;                  // funco do funcionario
    private Date dt_adm;                   // data de admissao
    private Regiao regiao;                // regiao
    private double comissao;             // porcentagem sobre as vendas
    
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCdt() {
        return cdt;
    }

    public void setCdt(String cdt) {
        this.cdt = cdt;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Date getDt_adm() {
        return dt_adm;
    }

    public void setDt_adm(Date dt_adm) {
        this.dt_adm = dt_adm;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", salario=" + salario + ", cdt=" + cdt + ", observacao=" + observacao + ", funcao=" + funcao + ", dt_adm=" + dt_adm + ", regiao=" + regiao + ", comissao=" + comissao + '}';
    }

}
