import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class program {

    public static void main(String[] args) {
        String cmd = "";
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dict = new ArrayList<>();

        while (!cmd.equals("exit")) {
            cmd = scanner.nextLine();
            if (cmd.contains("~")) {
                String[] cmdarr = cmd.split("~");
                if (cmdarr[0].equals("print"))
                    getItem(Integer.parseInt(cmdarr[1]), dict);
                else
                    addItem(cmdarr[0] , Integer.parseInt(cmdarr[1]), dict);
            }
        }

        scanner.close();
    }

    public static void addItem(String word,int index, ArrayList<String> dict) {
        if (index < 0)
            throw new NumberFormatException("Negative index");
        while (dict.size() < index + 1)
            dict.add(null);
        dict.set(index, word);
        
    }

    public static void getItem(int index, ArrayList<String> dict) {
        if (index < 0 || dict.size() < index) {
            System.out.println("Wrong index");
            return;
        }
        System.out.println(dict.get(index));
    }
}