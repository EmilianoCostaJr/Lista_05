/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Interest
 * @author       :  Emiliano Costa
 * @date         :  11 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.14:  (Programa de juros compostos modificado)
 * ___________________________________________________________________________________________________________________
 * Descrição     :  Modifique o aplicativo de juros compostos da Figura 5.6 para repetir os passos para taxas de juros 
                    de 5 %, 6 %, 7 %, 8 %, 9 % e 10 %. Utilize um loop for para variar a taxa de juros.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_14;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Interest
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{
   
    public static void inicio()
    {
        double amount;
        double principal = 1000.0;
        double rate;
        
        //Exibe cabeçalhos
        System.out.printf("%s%20s \n","Ano","Saldo");

        /*Loop que cria tabela*/
        for (int i = 5; i <= 10; i++){
            rate = (double)i / 100.0;
            System.out.printf("Juros de %d\n",i);
            for (int ano = 1; ano <= 10; ano++){
                amount = principal * Math.pow(1 + rate, ano);
                System.out.printf("%3d%,20.2f\n",ano,amount);
            }
        }
    }
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
