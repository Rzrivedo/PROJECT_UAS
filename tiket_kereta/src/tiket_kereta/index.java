/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket_kereta;

/**
 *
 * @author Zulham Nur
 */
public class index {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koneksi.getKoneksi();
        new login().setVisible(true);
    }
    
   public static void oke(){
    new beranda().setVisible(true);
    }
    
}
