/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Triplos_de_Pitagoras
 * @author       :  Emiliano Costa
 * @date         :  11 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.21:  (Triplos de Pitágoras) 
 * ___________________________________________________________________________________________________________________
 * Descrição     :   
        Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros. 
        O conjunto de três valores inteiros para os comprimentos dos lados de um triângulo retângulo é chamado triplos 
        de Pitâgoras. Os comprimentos dos três lados devem satisfazer a relação de que a soma dos quadrados de dois dos 
        lados é igual ao quadrado da hipotenusa. 

        Escreva um aplicativo para exibir uma tabela dos triplos de Pitágoras para side1, side2 e a hypocenuse, 
        todos não maiores que 500. 
        
        Use um loop for triplamente aninhado que tenta todas as possibilidades.
        Esse é um método de computação de "força bruta”. Você aprenderá nos cursos de ciência da computação mais 
        avançados que para muitos problemas interessantes não há uma abordagem algorítmica conhecida além do uso de 
        força bruta absoluta.
   
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 


package _EX_21;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Triplos_de_Pitagoras
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{
    public static void inicio()
    {
        System.out.printf("%6s\t%6s\t%10s\n","side1","side2","hypotenuse");
        for (int hypotenuse = 0; hypotenuse <= 500; hypotenuse++)
        {
            for (int side2 = 0; side2 < hypotenuse; side2++)
            {
                for (int side1 = 0; side1 <= side2; side1++)
                {
                    /*Verifica se os valores de (side1,side2 e hypotenuse) formam um triplo de Pitagoras*/
                    if (Math.pow(side1,2)+Math.pow(side2, 2)== Math.pow(hypotenuse, 2))
                    {
                        System.out.printf("%6d\t%6d\t%10d\n",side1,side2,hypotenuse);
                    }
                }/*fim side1*/
            }/*fim for side2*/
        } /*fim for hipotenuse*/     
    }
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
