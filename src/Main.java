import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Введите Строку: ");
        Scanner scanner = new Scanner(System.in);
        String dataIn = scanner.nextLine();
        HashMap<String, Integer> dictionary = new HashMap<>();
        for (int i=0; i < dataIn.length(); i++) {
            if(dictionary.containsKey(dataIn.charAt(i)+":")){
                Integer temp = dictionary.get(dataIn.charAt(i)+":");
                dictionary.put(dataIn.charAt(i)+":",temp+1);
            }
            else{dictionary.put(dataIn.charAt(i)+":",1);
            }
        }
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
