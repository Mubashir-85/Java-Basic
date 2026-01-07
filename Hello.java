
class Hello{
    public static void main(String args[]){


        int a = 257;
        byte b = (byte)a; //Explicit conversion or type casting (int to byt).
        System.out.println("Explicit"+ " " + b);

        double d = 5.6;
        int c = (int)d; //Explicit conversion or type casting (double to int).
        System.out.println("Explicit"+ " " + c);

        byte f = 56;
        int e = f; //Implicit conversion or type conversion when it automaticallly converts (byte to int).
        System.out.println("Implicit"+ " " + e);

        int num = 7;
        // int result = num++;
        int result2 = ++num;
        // System.out.println((result));
        System.out.println((result2));

        int ab = 8;
        int ba = 8;
        boolean res = ab >= ba; // >= This is called as Relational Operator.
        System.out.println(res);

        int g = 5;
        int h = 6;
        int k = 10;
        int j = 12;

        System.out.println(g < h && k < j ); // && This is the Logical Operator.
        //There are three types of logical operators: 1. && (AND), 2. || (OR), 3. ! (NOT).
        // && returns true only if both operands are true.
        // || returns true if at least one operand is true.
        // ! negates the boolean value -> reverses true to false and false to true.

        boolean flag = true;
        System.out.println(!flag); // prints false
        boolean flag2 = false;
        System.out.println(!flag2); // prints true


        int days = 4;
        switch(days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a Valid Number");                        
        }

        //This is called as Switch case Statement;

        String day = "wed";
        String dayRes = "";
        dayRes = switch(day){
            case "Saturday", "Sunday": yield "8am";
            case "Monday": yield "6am";
            default : yield "7am";
        };
        System.out.println(dayRes);

        //This is modern or updated Switch case statement

        int _marks = 76;
        if(_marks < 35){
            System.out.println("Fail");
        }else if(_marks >= 35 && _marks < 60){
            System.out.println("Pass");
        }else if(_marks > 60 && _marks < 75){
            System.out.println("First Class");
        }else{
            System.out.println("Distinction");
        }

        




        


        



        

        
    }
}