
package br.com.modelo;


public class EmpCliente {
   
    private String nome_emp;
    private String cnpj;
    private String endereco;
    private String tel_emp;
    private String produto;
    private int id_empresa;

    public EmpCliente() {
    }

    public String getNome_emp() {
        return nome_emp;
    }

    public void setNome_emp(String nome_emp) {
        this.nome_emp = nome_emp;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel_emp() {
        return tel_emp;
    }

    public void setTel_emp(String tel_emp) {
        this.tel_emp = tel_emp;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    @Override
    public String toString() {
        return "EmpCliente{" + "nome_emp=" + nome_emp + ", cnpj=" + cnpj + ", endereco=" + endereco + ", tel_emp=" + tel_emp + ", produto=" + produto + ", id_empresa=" + id_empresa + '}';
    }
    
    
}
