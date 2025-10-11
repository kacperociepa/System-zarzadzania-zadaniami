
package systemzarzadaniazadaniami;

import java.util.Scanner;

public class SystemZarzadaniaZadaniami {
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("========System zarządzania zadaniami=========");
        System.out.println("Witaj. Stworz projekt: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.next();
        Projekt projekt1= new Projekt(a, b);
        projekt1.wyswietlInfo();
    }
    
}
