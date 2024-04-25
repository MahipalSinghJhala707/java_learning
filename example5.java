public class example5 {
    public void fruits(){
        String fruits[] = {"Apple","Cherry","Mango","Papaya Expert"};
        System.out.println("Fruits");
        for(int i =0; i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
    }
    static void vegetables(){
        String vegies[]={"Onion","Potato","Ladyfinger"};
        System.out.println("Vegetables");
        for(int i=0;i<vegies.length;i++){
            System.out.println(vegies[i]);
        }
    }
    public static void main(String[] args) {
        example5 ex5 = new example5();
        ex5.fruits();
        System.out.println();
        vegetables();
    }
}
