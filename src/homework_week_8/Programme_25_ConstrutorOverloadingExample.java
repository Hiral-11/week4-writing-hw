package homework_week_8;


//Java program to overload constructors
public class Programme_25_ConstrutorOverloadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
Programme_25_ConstrutorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }
    //creating three arg constructor
Programme_25_ConstrutorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
       Programme_25_ConstrutorOverloadingExample s1 = new Programme_25_ConstrutorOverloadingExample(111, "Karan");
        Programme_25_ConstrutorOverloadingExample s2 = new Programme_25_ConstrutorOverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

