/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Leis_de_Morgan
 * @author       :  Emiliano Costa
 * @date         :  7 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.23:  (Leis de De Morgan)   
 * ___________________________________________________________________________________________________________________
 * Descrição     :  
        Neste capítulo, discutimos os operadores lógicos &&, &, ||, |, ^ e !. 
        As leis de De Morgan às vezes podem tornar mais convenientes para expressar uma expressão lógica. 
        Essas leis afirmam que a expressão: 
        !(condição1 && condição2) é logicamente equivalente à expressão(!condição1 || !condição2). 
        Além disso, a expressão: 
        !(condição1|| condição2) é logicamente equivalente à expressão (!condição1&& !condição2). 

        Use as leis de De Morgan para escrever expressões equivalentes para cada uma das expressões a seguir, 
        então escreva um aplicativo para mostrar que tanto a expressão original como a nova expressão em cada caso 
        produzem o mesmo valor:

 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_23;


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Leis_de_Morgan 
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
{
    public static void inicio()
    {
        boolean b1;
        boolean b2;

        
        /*Teste A*/
        System.out.println("a) !(x < 5) && !(y >= 7)");
        for(int x = 4; x<7; x++){
            for(int y = 6; y<9; y++){
                b1 = !(x < 5) && !(y >= 7);
                b2 = !((x < 5)||(y >= 7));
                /*se as expressões forem diferentes, imprime essa linha*/
                if(b1 != b2)
                    System.out.printf("Diferente para x = %d e y = %d\n",x,y);
            }
        }
        
        /*Teste B*/
        System.out.println("b) !(a == b) || !(g != 5)");
        for(int a = 1; a<3; a++)
        {
            for(int b = 1; b<3; b++)
            {
                for(int g = 4; g < 6;g++)
                {
                    b1 = !(a == b) || !(g != 5);
                    b2 = !((a == b)&&(g != 5));
                /*se as expressões forem diferentes, imprime essa linha*/
                    if(b1 != b2)
                        System.out.printf("Diferente para x = %d e y = %d\n",a,b);
                }
            }
        }

        /*Teste C*/
        System.out.println("c) !((x <= 8) && (y > 4))");
        for(int x = 7; x<10; x++){
            for(int y = 3; y<6; y++){
                b1 = !((x <= 8) && (y > 4));
                b2 = (!(x <= 8) || !(y > 4));
                /*se as expressões forem diferentes, imprime essa linha*/
                if(b1 != b2)
                    System.out.printf("Diferente para x = %d e y = %d\n",x,y);
            }
        }


        /*Teste D*/
        System.out.println("d) !((i > 4) || (j <= 6))");
        for(int i = 3; i<6; i++){
            for(int j = 5; j<8; j++){
                b1 = !((i > 4) || (j <= 6));
                b2 = (!(i > 4) && !(j <= 6));
                /*se as expressões forem diferentes, imprime essa linha*/
                if(b1 != b2)
                    System.out.printf("Diferente para x = %d e y = %d\n",i,j);
            }
        }


    }
    

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

