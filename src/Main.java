import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Введите Строку: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.toLowerCase();
        HashMap<Character, Integer> dictionary = new HashMap<>();
        /*циклом перебираем введенный текст
        * если буква уже есть в словаре, до заменяем ее в коллекции с
        * увеличенным счетчиков, если такой буквы нет то добавляем её*/
        for (int i=0; i < text.length(); i++) {
            if(dictionary.containsKey(text.charAt(i))){
                Integer temp = dictionary.get(text.charAt(i));
                dictionary.put(text.charAt(i),temp+1);
            }
            else{dictionary.put(text.charAt(i),1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + ":" + (int)entry.getValue());
        }
    }
}
