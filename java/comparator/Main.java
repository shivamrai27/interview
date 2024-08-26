package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(32);
        list.add(39);
        list.add(12);
//        Collections.sort(list, (a,b)->b-a);
//        System.out.println(list);

        // with normal sort method you cant sort on the basis of class variable member
Student s1 = new Student(1, "Shivam");
Student s2 = new Student(2, "Shivansh");
Student s3 = new Student(3, "sawan");
Student s4 = new Student(4, "Satyam");

        List<Student> objectList = new ArrayList<>();
        objectList.add(s1);
        objectList.add(s2);
        objectList.add(s3);
        objectList.add(s4);

        Collections.sort(objectList, (a,b)-> b.id- a.id);
        System.out.println(objectList);
    }
}
