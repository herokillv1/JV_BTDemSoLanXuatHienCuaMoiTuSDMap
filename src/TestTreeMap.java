import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class TestTreeMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vài chữ vào");
        String sc = scanner.nextLine().toUpperCase();

        String[] arr = sc.split("\\s");

        Map<String ,Integer> treeMap = new TreeMap<>();

        for (int i=0 ; i<arr.length;i++){
            if (treeMap.containsKey(arr[i])){
                int value = treeMap.get(arr[i])+1;
                treeMap.put(arr[i],value);
            }else {
                treeMap.put(arr[i],1);
            }
        }

        for (Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

    }
}
