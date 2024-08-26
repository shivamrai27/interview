package comparator;

public class Student {
    public Integer id;
    public String name;

     public Student(Integer id, String name){
    this.name = name;
    this.id = id;
    }

    public String toString(){
        return this.id + ": " +this.name;
    }
}
