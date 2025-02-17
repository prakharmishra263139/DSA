class Student{
    String name;
    int age;
    String rollNumber;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Invalid age");
        }

    }
    public void  setRollNumber(String rollNumber){
        this.rollNumber=rollNumber;
    }

    public String getRollNumber(){
        return rollNumber;
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollNumber);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Prakhar Mishra");
        st.setAge(20);
        st.setRollNumber("123");

        st.displayDetails();

        st.setAge(-1);

        System.out.println(st.getName());
        System.out.println(st.getRollNumber());

    }
}
