import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoGram977BHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        String inputString = scanner.next();
        StringBuilder sb = new StringBuilder(inputString);
        HashMap<String,Integer> myMap = new HashMap<>();

        for(int i =0; i<inputString.length(); i++){
            int value = 0;
            if((i+1)<=inputLength-1) {
               if(myMap.containsKey(sb.charAt(i)+""+sb.charAt(i+1))) {
                   int TempValue = myMap.get(sb.charAt(i)+""+sb.charAt(i+1));
                   TempValue++;
                   myMap.put((sb.charAt(i) + "" + sb.charAt(i + 1)), TempValue);
               }else{
                   value++;
                   myMap.put((sb.charAt(i) + "" + sb.charAt(i + 1)), value);
               }
           }
        }
      //  System.out.println(myMap);
      //  System.out.println(Collections.max(myMap.values()));
        int maxValues = Collections.max(myMap.values());
        for (Map.Entry<String,Integer> entry: myMap.entrySet()){
            if (entry.getValue() == maxValues){
                System.out.println(entry.getKey());break;
            }
        }
    }
}
