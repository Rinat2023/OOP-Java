import java.util.Arrays;

public class Flower {
    String flowerName;
    String freshness;
    int price;

    public int getExpensivePrice(Flower[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i].price);
        }
        return max;
    };

    public String[] sortByFreshness(Flower[] arr){
        String[] newArr = new String[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].freshness.equals("svejiy")){
                newArr[count] = arr[i].flowerName;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].freshness.equals("ne svejiy")){
                newArr[count] = arr[i].flowerName;
                count++;
            }
        }
       return newArr;
    };
}
