public class GetterSetter
{
    private String Name;
    private int age;

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getName()
    {
        return Name;
    }

    public void setAge(int age)
    {
        if(age >0)
        {
            this.age = age;
        }
        else{
            System.out.println("Age must be positive value");
        }
    }

    public int getAge()
    {
        return age;
    }

    public static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        gs.setName("Sandesh");
        gs.setAge(23);
        System.out.println("The name of Student is " + gs.getName() + "and age is " + gs.getAge());
    }
}