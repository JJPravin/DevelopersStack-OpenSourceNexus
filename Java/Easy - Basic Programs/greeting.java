/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 16.02.2024
* Description : Greeting Program
*/
/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 24/06/2024
 * Description : Removing warning messages
 */

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What's your name?");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, " + name + "!");

        scanner.close();
    }
}
