import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите IP-адреса через пробел: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String IP = "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
        String ip = "\\b"+IP+"\\."+IP+"\\."+IP+"\\."+IP+"\\b";

        Pattern p = Pattern.compile(ip);
        Matcher m = p.matcher(input);
        System.out.println("Корректные IP-адреса:");
        while (m.find())
        {
            System.out.println(m.group());
        }
    }
}