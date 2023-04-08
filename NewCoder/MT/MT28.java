/*Created by @Kurt LEE. Last Modified on 4/8/23, 12:04 PM.*/
package NewCoder.MT;

import java.util.Scanner;

public class MT28 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < t; i++) {
                String phoneNum = scanner.nextLine();
                if (isValid(phoneNum)) {
                    String networkIdentifier = phoneNum.substring(0, 3);
                    if (networkIdentifier.equals("133")
                            || networkIdentifier.equals("153")
                            || networkIdentifier.equals("180")
                            || networkIdentifier.equals("181")
                            || networkIdentifier.equals("189")) {
                        System.out.println("China Telecom");
                    } else if (networkIdentifier.equals("130")
                            || networkIdentifier.equals("131")
                            || networkIdentifier.equals("155")
                            || networkIdentifier.equals("185")
                            || networkIdentifier.equals("186")) {
                        System.out.println("China Unicom");
                    } else if (networkIdentifier.equals("135")
                            || networkIdentifier.equals("136")
                            || networkIdentifier.equals("150")
                            || networkIdentifier.equals("182")
                            || networkIdentifier.equals("188")) {
                        System.out.println("China Mobile Communications");
                    }
                } else {
                    System.out.println("-1");
                }
            }
        }

        private static boolean isValid(String phoneNum) {
            return phoneNum.matches("^\\d{11}$");
        }
    
    
}
