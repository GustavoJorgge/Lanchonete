package atividade.lanchonete;

public class Hamburguer {

    public String nome;
    public Double valor;
    public boolean carneArtesanal;

    public void calcularValor(boolean carneArtesanal){
        if(carneArtesanal){
            this.valor += 8;
        }
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
