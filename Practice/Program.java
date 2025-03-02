

 interface Animal {
    public void eat();
    public void speak();
    public void sleep();
    
    
}

 class Dog implements Animal{
    public void eat(){
        System.out.println("Dog can eat");
    }
    
    public void speak(){
        System.out.println("Dog can speak:wo-wo");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }
   
 }

public class Program
{
    public static void main(String[] args) {
       Dog d = new Dog();
       d.eat();
       d.speak();
    }
}