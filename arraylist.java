import java.util.ArrayList ; 
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Pasta");
        food.add("Burger");
        food.add("Fries");
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
