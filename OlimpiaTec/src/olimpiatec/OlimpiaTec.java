/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author LuisGuillermo
 */
public class OlimpiaTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Students esteban = new Students("Esteban", "A01411558");
        Sports futbol = new Sports("Futbol");
        futbol.addStudent(esteban);
        System.out.println(futbol);
        System.out.println(esteban);
    }
    
    
   
}
