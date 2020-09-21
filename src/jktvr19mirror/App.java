/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19mirror;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {

    public void run() {
        System.out.println(" ------ MIRROR ------ ");
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Количество символов в строке: "+str.length());
        System.out.println("Перевернутая строка: ");
        char[] chStr = str.toCharArray();
        char[] rChStr = new char[str.length()];
        for (int i = 0; i < rChStr.length; i++) {
            rChStr[i] = chStr[(rChStr.length - 1) - i];

        }
        //System.out.println(Arrays.toString(rChStr));
        String rStr = new String(rChStr);
        System.out.println(rStr);
        System.out.print("Второе слово этой строки: ");
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" ",firstSpace+1);
        if(firstSpace < 0) System.out.println("Нет второго слова.");
        else if(secondSpace < 0) { 
            System.out.println(str.substring(firstSpace+1));
        }else{
            System.out.println(str.substring(firstSpace+1, secondSpace));
        }
        
    }

}
