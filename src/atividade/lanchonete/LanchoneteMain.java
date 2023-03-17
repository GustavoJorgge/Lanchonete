package atividade.lanchonete;

import javax.swing.JOptionPane;

public class LanchoneteMain {
    public static void main(String[] args) {

        Hamburguer hamburguer = new Hamburguer();
        Pizza pizza = new Pizza();
        int escolha=3;

        //Tratando o erro caso o usuario digite algo sem ser uma das opções.
        try {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua escolha? \n 1. Hamburguer \n 2. Pizza \n 3. Sair"));
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"VALOR INCORRETO!","ERRO!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Saindo! Faça novamente o pedido!", "Exit", JOptionPane.ERROR_MESSAGE);
        }

        switch (escolha){
            case 1:
                String nomehamburguer = JOptionPane.showInputDialog("Entre com o nome do Hamburguer:");
                hamburguer.setNome(nomehamburguer);
                //Tratando erro, caso o usuario não digite um valor valida, ou seja, um valor numerico.
                try {
                    Double valorhamburguer = Double.valueOf(JOptionPane.showInputDialog("Entre com o valor do Hamburguer:"));
                    hamburguer.setValor(valorhamburguer);
                }catch(NumberFormatException erro){
                    JOptionPane.showMessageDialog(null,"VALOR INCORRETO!","ERRO!",JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Saindo! Faça novamente o pedido!","Exit",JOptionPane.INFORMATION_MESSAGE);
                }

                String carneArtesanal =JOptionPane.showInputDialog("Carne artesanal? S - Sim N - Não");
                if(carneArtesanal.equals("S")){
                     hamburguer.calcularValor(true);
                }
                JOptionPane.showMessageDialog(null,"Hamburguer :" + hamburguer.getNome() + "\nValor: " + hamburguer.getValor());
                JOptionPane.showMessageDialog(null, "Aguarde seu pedido! :)","Pedido concluido!",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
               String nomepizza = JOptionPane.showInputDialog("Entre com o nome da Pizza: ");
               pizza.setNome(nomepizza);

               try {
                   Double valorpizza = Double.valueOf(JOptionPane.showInputDialog("Entre com o valor da Pizza: "));
                   pizza.setValor(valorpizza);
               }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null,"VALOR INCORRETO!","ERRO!",JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null,"Saindo! Faça novamente o pedido!","ERRO", JOptionPane.ERROR_MESSAGE);
                }

               String possuiBorda = JOptionPane.showInputDialog("Possui borda? S - Sim N - Não");

               if(possuiBorda.equals("S")){
                   pizza.CalcularValor(true);
               }
               JOptionPane.showMessageDialog(null, "Pizza: " + pizza.getNome() + "\nValor:" + pizza.getValor());
               JOptionPane.showMessageDialog(null, "Aguarde seu pedido! :)","Pedido concluido!",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Saindo!","Exit",JOptionPane.INFORMATION_MESSAGE);
            default:

        }

    }
}