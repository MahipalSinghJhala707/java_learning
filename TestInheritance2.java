class animal {
    void Eat(){System.out.println("eating...");}
}
class Dgo extends animal {
    void bark(){System.out.println("Barking...");}
}
class babyDgo extends Dgo{
    void weep(){System.out.println("weeping...");}
}

class TestInheritance2{
    public static void main(String[] args){
        babyDgo d= new babyDgo();
        d.weep();
        d.bark();
        d.Eat();
    }
}
