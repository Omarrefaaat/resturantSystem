public class Staff {
    String name ;
    double salary;
    int staffId ;

    Staff(String name , double salary , int staffId){
        System.out.println("this is staff constructor");
    this.name = name;
    this.salary=salary;
    this.staffId=staffId;
    }
    Staff(String name , double salary ){
        System.out.println("this is staff constructor");
    this.name = name;
    this.salary=salary;
    this.staffId=00;
    }
    Staff(String name ){
        System.out.println("this is staff constructor");
    this.name = name;
    this.salary=00;
    this.staffId=00;
    }
    Staff(){
        System.out.println("this is staff constructor");
    this.name = "";
    this.salary=00;
    this.staffId=00;
    }

    public void print(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(staffId);
    }
}
