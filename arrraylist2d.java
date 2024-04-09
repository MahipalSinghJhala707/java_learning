import java.util.*;
public class arrraylist2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceries = new ArrayList<>();
        ArrayList<String> BakeryList = new ArrayList<>();
        BakeryList.add("Cake");
        BakeryList.add("Crosant");
        BakeryList.add("Bread");
        ArrayList<String> DrinkList = new ArrayList<>();
        DrinkList.add("Coke");
        DrinkList.add("Coffee");
        ArrayList<String> healthyList = new ArrayList<>();
        healthyList.add("Salad");
        healthyList.add("Fruits");
        healthyList.add("Milk");
        
        groceries.add(BakeryList);
        groceries.add(DrinkList);
        groceries.add(healthyList);


        System.out.println(groceries);
        System.out.println(groceries.get(1));
        System.out.println(groceries.get(0).get(2));


    }
}
