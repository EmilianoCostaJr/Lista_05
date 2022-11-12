/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Calcula_PI
 * @author       :  Emiliano Costa
 * @date         :  11 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.20:  (Calculando o valor de Calcula_PI)
 * ___________________________________________________________________________________________________________________
 * Descrição     :  Calcula o valor de PI a partir de uma série infinita
                    PI = (4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + ...

                    Imprima uma tabela que mostre o valor aproximado de PI calculando os 200.000 primeiros termos dessa 
                    série. Quantos termos você tem de utilizar antes de primeiro obter um valor que começa com 3,14159?    
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_20;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Calcula_PI
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{

    public static void inicio() 
    {
        double myPi = 0.0;
        int myPi5 =0;
        boolean sentinela = true;
        int match = 0;
        
        for (int i = 0; i < 200000; i++){
            if(i%2==0){
                myPi += 4.00/(i*2+1);
            }else{
                myPi -= 4.00/(i*2+1);
            }
             
            System.out.printf("%d == %.5f\n",i ,myPi);

            if (sentinela == true){//Acha o primeiro termo cujo valor de pi é igual 3.14159
                myPi5 = (int)(myPi * 100000);
                if(myPi5 == 314159){
                    sentinela = false;
                    match = i + 1;
                }    
            }
        }
        System.out.printf("Primeiro termo onde temos PI = 3.14159 é o de número: %d\n",match);
    }
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
