class calculator{
    int add(int a, int b){
        return a+b;
    }
    int sub(int c, int d){
        return c-d;
    }
    int multiply(int e, int f){
        return e*f;
    }
}

public class FourthTopic{
    public static void main(String args[]){
        calculator cal = new calculator();
        System.out.println(cal.add(4, 5));
        System.out.println(cal.sub(4, 5));
        System.out.println(cal.multiply(4, 5));
    }
    
}
