class Student{
    int rollno;
    String name;
    int marks;
}

public class EightTopic {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "Alice";
        s1.marks = 95;

        Student s2 = new Student();
        s2.rollno = 102;
        s2.name = "Robert";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 103;
        s3.name = "John";
        s3.marks = 85;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        //Nornal For Loop
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        //Enhanced For Loop
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }


        // System.out.println("Student 1: " + s1.rollno + ", " + s1.name + ", " + s1.marks);
    }
    
}
