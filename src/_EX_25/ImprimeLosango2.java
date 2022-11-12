/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  ImprimeLosango2
 * @author       :  Emiliano Costa
 * @date         :  7 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * ___________________________________________________________________________________________________________________
 * Descrição     :  Exercício 5.25  (Programa de impressão de losangos)
        Modifique o aplicativo que você escreveu na Questão 5.24 para ler um número ímpar no intervalo 1 a 19 para 
        especificar o número de linhas no losango. Seu programa então deve exibir um losango do tamanho apropriado
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_25;

import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class ImprimeLosango2
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
{
   public static void inicio()
   {
        int tamanho = input_Valor_Inteiro();
        int centro = (tamanho/2) + 1;
        int delta = 0;

        /*Imprime o Losango, linha a linha*/
        for(int linha = 1;linha <=tamanho;linha++)
        {
            /*Corre por cada linha até o fim! */
            for(int coluna = 1; coluna <= tamanho; coluna++)
            {
                /*Imprime o caractere adequado*/
                if(coluna >= (centro - delta) && coluna <= (centro + delta))
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            /*Próxima Linha*/
            System.out.println(""); 
            
            /*Verifica qual parte do losângulo esta sendo desenhada, a de cima ou a de baixo*/
            if(linha < centro){
                delta++; /*Se é a parte de cima; então o losângulo esta se abrindo;*/
            }else{
                delta--; /*Senão então é a parte de baixo e o losângulo esta se fechando*/
            }
        }    
    }            
   
   /**Procedimento recebe um valor inteiro via cx de dialogo*/
   private static int input_Valor_Inteiro()
   {
        boolean sentinela = true;
        int valor = 0;
        do{
            try 
            {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um um número ímpar no intervalo 1 a 19"));
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, String.format("ERRO: %s",e.getMessage()));
            }
            /*Verifica se valor digitado esta dentro do range.*/
            if(valor > 0 && valor < 20)
            {
                /*Verifica se valor é número impar*/
                if((valor%2)== 1)
                {
                    sentinela = false; /*tudo certo! Sendo assim sai do loop*/
                }else{
                    JOptionPane.showMessageDialog(null, String.format("ERRO: %s","Um valor PAR foi digitado.")) ;
                }
            }else{
                JOptionPane.showMessageDialog(null, String.format("ERRO: %s","Valor digitado esta fora do range.")) ;
            }

        }while(sentinela);
        return valor;
   }
   
   
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

