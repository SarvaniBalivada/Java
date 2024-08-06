public class Student {
    private String name;
    private String rollnumber;
    private int marks;
    public void setName(String n){
        name=n;
    }
    public void setRollNumber(String n){
        rollnumber=n;
    }
    public void setMarks(int n){
        marks=n;
    }
    public String getName(){
        return name;
    }
    public String getRollNumber(){
        return rollnumber;
    }
    public int getMarks(){
        return marks;
    }
}
class StudentDemo{
    public static void main(String[] args){
    Student s1=new Student();
   s1.setName("Sarvani");
   s1.setRollNumber("23PA1A0518");
   s1.setMarks(98);
    System.out.println(s1.getName());
    System.out.println(s1.getRollNumber());
    System.out.println(s1.getMarks());}
}
