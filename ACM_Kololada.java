/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_kololada;

import java.util.Scanner;

/**
 *
 * @author tongd
 */
public class ACM_Kololada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int crack = 0;
        int temp = 0;
        String n = Integer.toBinaryString(num);
        for(int i = 1; i < n.length(); i++) {
            temp++;
            if(n.charAt(i) == '1') crack = temp;
        }
        if(crack == 0) {
            System.out.println(num + " 0");
        }
        else {
            num = num >> (n.length() - 1);
            num = num << (n.length());
            crack++;
            System.out.println(num + " " + crack);
        }
    }
    
}
