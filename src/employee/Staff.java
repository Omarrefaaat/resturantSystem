package employee;

public class Staff {
    private String name ;
    private double salary;
    private int staffId ;

    public Staff(String name , double salary , int staffId){
        System.out.println("this is staff constructor");
    this.name = name;
    this.salary=salary;
    this.staffId=staffId;
    }
    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name=name;
    }

    public double getSalary (){
        return salary;
    }
    public void setSalary (double salary){
        this.salary=salary;
    }
    public int getStaffId (){
        return staffId;
    }
    public void setStaffId (int staffId){
        this.staffId=staffId;
    }


    public void print(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(staffId);
    }
}
