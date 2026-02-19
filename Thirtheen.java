import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student : [Age = " + age + " Name : " + name + "]";
    }
    @Override
    public int compareTo(Student s){
        if(this.age > s.age){
            return 1;
        }else{
            return -1;
        }
    }
}

public class Thirtheen {
    public static void main(String args[]){
        
        List<Student> list = new ArrayList<>();
        list.add(new Student(15, "Arjit"));
        list.add(new Student(18, "Tanmay"));
        list.add(new Student(23, "Sam"));
        list.add(new Student(12, "Rohit"));

        Collections.sort(list);
        for(Student s : list){
            System.out.println(s);
        }
    }

    
    
}
