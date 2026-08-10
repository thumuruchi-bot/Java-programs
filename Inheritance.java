class Animal{
    void sound(){
        System.out.print("Animal makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.print("Dog barks");
    }
}
public class Main{
    public static void main(String[]args){
        Dog d=new Dog();
        d.sound();
        d.bark();
    }
}
