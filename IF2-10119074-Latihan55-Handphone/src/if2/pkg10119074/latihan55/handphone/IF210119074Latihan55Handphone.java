/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan55.handphone;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android objAndroid = new Android("Samsung", "Android", "Grand", 3000000);
        objAndroid.setKeyStore("234ibfd3840fo");
        BlackBerry objBlackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        objBlackBerry.setPinBB("BHS249");
        WindowsPhone objWindowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        objWindowsPhone.setWpKeyStore("UUUQIJWORJ");

        objAndroid.displayProduct();
        System.out.println("Android Key Store : "+objAndroid.getKeyStore());
        System.out.println("");
        objBlackBerry.displayProduct();
        System.out.println("PIN : "+objBlackBerry.getPinBB());
        System.out.println("");
        objWindowsPhone.displayProduct();
        System.out.println("Wp Key Store : "+objWindowsPhone.getWpKeyStore());
    }
    
}
