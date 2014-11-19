/*
 * 1-	Codifica un programa que permita o seguinte xogo  para adiviñar un número .
O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar ( entre 1 e 50 )
e o número máximo de intentos que ten o segundo xogador para dar con el . O programa irá sacando por pantaia mensaxes
que orienten o segundo xogador sobre se o número tecleado e maior ou menor que o número a adiviñar . Fai o programa repetitivo.
 */
package boletin10ej1;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class Juego {
    private int numero;
    
public void setNumero (int numero){
    this.numero=numero;
}
public int getNumero(){
    return numero;
}
    
public void adivinarDato(){
 
 for (int i=0; i<9;i++){
 String pedirdato = JOptionPane.showInputDialog("¿Qué número es?");
 int pd = Integer.parseInt(pedirdato);
     if (numero != pd){
         if (numero<=10)
             JOptionPane.showMessageDialog(null, "El número es menor o igual a 10. ");
             if (numero<=20)
                 JOptionPane.showMessageDialog(null, "El número está por debajo de 20, o es 20. ¿Quién sabe?");
                 if (numero <= 30)
                     JOptionPane.showMessageDialog(null, " El número es menor de 30. ¿Lo adivinarás?");
     } else if (numero == pd){
     JOptionPane.showMessageDialog(null, "Pero... Ya lo has adivinado. ¡ENHORABUENA! EL NÚMERO SÍ ERA "+numero+".");
     break;
 }

                 
 }
}
    
    
    
    
    
    
}
