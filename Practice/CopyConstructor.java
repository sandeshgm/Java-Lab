public class CopyConstructor {
    String name;
    int age;
    public CopyConstructor()
    {
        System.out.println("Default Constructor");
    }
    public CopyConstructor(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public CopyConstructor(CopyConstructor C)
    {
        this.name = C.name;
        this.age = C.age;
    }

    public static void main(String[] args) {
        CopyConstructor CC1 = new CopyConstructor("Ram",22);
        CopyConstructor CC2 = new CopyConstructor(CC1);
        System.out.println("Name is " + CC2.name);
        System.out.println("Name is " + CC2.age);
    }
}
