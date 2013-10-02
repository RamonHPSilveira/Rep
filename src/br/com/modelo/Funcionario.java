
package br.com.modelo;

import java.util.Date;


public class Funcionario extends Pessoa{
    private int id;
    private double salario;
    private String cdt;
    private String observacao;
    private String funcao;
    private Date dt_adm;

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
        return "Funcionario{" + "id=" + id + ", salario=" + salario + ", cdt=" + cdt + ", observacao=" + observacao + ", funcao=" + funcao + ", dt_adm=" + dt_adm + '}';
    }
    
    
}
