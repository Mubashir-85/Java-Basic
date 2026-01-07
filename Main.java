// Classes and Object.


class Calculator {
    int a;
    public int add(int n1, int n2){
        a = n1 + n2;
        return a;
    }
}
public class Main {
    public static void main(String args[]){
        int num1 = 4;
        int num2 = 8;
        Calculator cal = new Calculator();
        int res = cal.add(num1 , num2);
        System.out.println(res);

    }
    
}
