package exercise1;

/**
 *
 * @author vinit.jangir
 */
class Student implements Comparable<Student>{
    private String name;
    private int age;
    
    public Student(){
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // Implementing compareTo for Comparable
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); 
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
    
}
