/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Fatoriais
 * @author       :  Emiliano Costa
 * @date         :  9 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.13:  (Fatoriais) 
 * ___________________________________________________________________________________________________________________
 * Descrição     :  Fatoriais costumam ser utilizados em problemas de probabilidade. 
                    O fatorial de um inteiro positivo n (escrito como n! e pronunciado como “fatorial de n”) é igual ao 
                    produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais de 
                    1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. 
                    Que dificuldade poderia impedir você de calcular o fatorial de 100?
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_13;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Fatoriais 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{
    public static void inicio()  {
    long fatorial = 1;
     
        System.out.printf("%6s%24s\n","Numero","Fatorial");
             
        for (int i = 1; i <= 20; i++)        {
            fatorial *=i;
            System.out.printf("%6d%24d\n",i,fatorial);
        }
    }
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/