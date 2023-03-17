package atividade.lanchonete;

public class Pizza {

    public String nome;
    public Double valor;
    public boolean possuiBorda;

    public void CalcularValor(Boolean possuiBorda) {
        if (possuiBorda) {
            this.valor += 5;
        }
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome () {
            return nome;
        }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
