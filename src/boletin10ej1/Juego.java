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
    
public int mandarDato(){
 
 String pedirdato= JOptionPane.showInputDialog(null,"Introduce un número:");
 int pd = Integer.parseInt(pedirdato);
  
 if ((pd>=1)&&(pd<=50)){
     return numero;
 } else {
     JOptionPane.showMessageDialog(null, "Se ha equivocado. El número debe estar \nentre 1 y 50.");
 }
 return 0;
 
}    

public void adivinarDato(){
 String pedirdato = JOptionPane.showInputDialog("Introduce número:");
 int pd = Integer.parseInt(pedirdato);
 
 for (int i=0; i<9;i++){
     if (numero != pd)
         if (numero<=10)
             JOptionPane.showMessageDialog(null, "El número es menor o igual a 10. Tira otra vez.");
             if (numero<=20)
                 JOptionPane.showMessageDialog(null, "El número está por debajo de 20, o es 20. ¿Quién sabe?");
                 if (numero > 20)
                     JOptionPane.showMessageDialog(null, "El número es mayor a 20. ¿Lo adivinarás?");
     
     else if (numero == pd){
     JOptionPane.showMessageDialog(null, "Lo has conseguido. ¡Enhorabuena! ♥");
     break;
 }
             
 }
}
    
    
    
    
    
    
}
