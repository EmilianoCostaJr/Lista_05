/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Interest
 * @author       :  Emiliano Costa
 * @date         :  31 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.18:  (Programa de juros compostos modificado)
 * ___________________________________________________________________________________________________________________
 * Descrição     :  
        Modifique o aplicativo na Figura 5.6 para utilizar apenas inteiros para calcular os juros compostos. 
        [Dica: trate todas as quantidades monetárias como números inteiros em centavos. Então, divida o resultado em 
        suas partes dólar e centavos utilizando as operações divisão e resto, respectivamente. 
        Insira uma vírgula entre as partes dólar e centavos.]
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_18;


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Interest 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{
    /**Exercicio 5.18; tem ERRO e não esta finalizado*/
    public static void inicio()
    {
        int amount;
        int principal = 100000;  /*valor em centavos*/
        int rate = 5;               /*Percentual*/
        
        //Exibe cabeçalhos
        System.out.printf("%s%20s \n","Ano","Saldo");
        
        /*Loop cria tabela*/
        for (int ano = 1; ano <= 10; ano++){
            amount = principal * (int)Math.pow(1 + (rate/100), ano);
            System.out.printf("%3d%,20.2f\n",ano,amount);
        }/*Fim Loop cria tabela*/

    }
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

