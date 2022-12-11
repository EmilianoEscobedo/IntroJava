////////////////////////////////////////////
// Exercise one - Functions

/* public class Main {
    public static void main(String[] args){
        System.out.println(suma(10,20,30));
        Car myCar = new Car();
        myCar.plusDoor();
        System.out.println(myCar.doors);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}
class Car{
    public int doors = 0;

    public void plusDoor(){
        this.doors++;
    }
} */

////////////////////////////////////////////////////
// Ezercise two - Conditionals

/* public class Main {
    public static void main(String[] args){
       
        int numberIf = 10;
        
        if (numberIf > 0){
            System.out.println("The number is positive");
            }else if(numberIf < 0){
            System.out.println("The number is negative");
            } else{
            System.out.println("The number is zero");
            };
        
        int numberWhile = 0;
        
        while (numberWhile < 3){
            numberWhile++;
            System.out.println("While executed");
            };
        
        do {
            numberWhile++;
            System.out.println("While executed");
            } while (numberWhile == 0);
       
        for (numberFor = 0; numberFor =< 3; numberFor++){
             System.out.println(numberFor);
            };
        
        String season = "summer";
        
        switch (season){
            case "summer":
                System.out.println("its summer");
                break;
            case "autumn":
                System.out.println("its summer");
                break;
            case "winter":
                System.out.println("its summer");
                break;
            case "spring":
                System.out.println("its summer");
                break;
            default:
                System.out.println("its not a season");
           }
    }

} */

//////////////////////////////////////////////////////////////
//Excercise three - Classes

/*
public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setAge() = 26;
        person1.setName() = "Emiliano";
        person1.setPhone() = 22341222314;
        
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getPhone());
    }
}

class Person {
    private int age;
    private String name;
    private int phone;
    
    public void setAge(int val){
        this.age = val;    
    }
    
    public void setName(String val){
        this.name = val;    
    }
    
    public void setPhone(int val){
        this.phone = val;    
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPhone(){
        return this.phone;
    }
    
}*/
/////////////////////////////////////
// Excercise four - Classes - inheritance, interfaces and polymorphism

public class Main {
    public static void main(String[] args){
        Client client1 = new Client();
        client1.name = "Emilio";
        System.out.println("Hello! my name is " + client1.name);
        client1.age = 26;
        System.out.println("I have " + client1.age + "years old");
        client1.phone = 3332422235;
        System.out.println("my phone is " + client1.phone);
        client1.credit = 2000;
        System.out.println("I have " + client1.credit + "USD in credit");
        
        Worker worker1 = new Worker();
        worker1.name = "Pepe";
        System.out.println("Hello! iam a worker, and my name is " + worker1.name);
        worker1.age = 26;
        System.out.println("I have " + worker1.age + "years old");
        worker1.phone = 3332422235;
        System.out.println("my phone is " + worker1.phone);
        worker1.salary = 2000;
        System.out.println("My monthly salary is " + worker1.salary);
    }
}

class Person {
    public int age;
    public String name;
    public int phone;
}

class Client extends Person {
    public int credit;
}

class Worker extends Person {
    public int salary;
}
