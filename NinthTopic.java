class Mobile{
    int price;
    String brand;
    static String name;

    public void show(){
        System.out.println("Brand: " + brand + ", Name: " + name + ", Price: " + price);
    }
}

public class NinthTopic {

    //static variable belongs to the class rather than any object
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        Mobile.name = "SmartPhone";  
        m1.price = 999;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        Mobile.name = "SmartPhone"; 
        m2.price = 799;


        m1.show();
        m2.show();
    }
    
}
