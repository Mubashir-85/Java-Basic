

class Loop{
    public static void main(String args[]){
        int i = 1;
        // While Loop and nested While Loop
        while (i <= 5) {
            System.out.println(i);
            int j = 1;
            while (j < 4) {
                System.out.println("Inner Loop" + j);
                j++;
            }
            i++;
        };


        //Do While Loop
        int k = 10;
        do{
            System.out.println("Do While "+k);
            k++;
        }while(k <= 5);

        //For Loop

        for(int l = 1;l<=5;l++){
            System.out.println("For Loop "+l);

        }

        System.out.println("Tables With For Loop");
        int table = 2;
        for(int m = 1; m <= 10; m++){
            System.out.println(table + " x " + m + " = " + (table * m));
        }

        
    }
}
