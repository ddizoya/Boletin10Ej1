/*
 1-	Codifica un programa que permita o seguinte xogo  para adiviñar un número .
O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar ( entre 1 e 50 )
e o número máximo de intentos que ten o segundo xogador para dar con el . O programa irá sacando por pantaia mensaxes
que orienten o segundo xogador sobre se o número tecleado e maior ou menor que o número a adiviñar . Fai o programa repetitivo.

 */
package boletin10ej1;

/**
 *
 * @author David
 */
public class Boletin10ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Juego jg = new Juego ();
     
     jg.mandarDato();
     if ((jg.mandarDato()<=50)&&(jg.mandarDato()>=1))
            jg.adivinarDato();
     
        
        
        
    }
    
}
