import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        iPhone iPhone = new iPhone();

        iPhone.play();
        iPhone.pause();
        
        String search = scanner.nextLine();
        iPhone.web(search);

        String number = scanner.nextLine();
        iPhone.call(number);

        String text = scanner.nextLine();
        iPhone.message(text);
    }
}
