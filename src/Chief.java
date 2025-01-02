public class Chief {
    String name ;
    int salary;
    int chiefId ;

    Chief(String name , int salary,int chiefId){
        System.out.println("this is chief constructor");
        this.name=name;
        this.salary=salary;
        this.chiefId=chiefId;
    }
    Chief(String name , int salary){
        System.out.println("this is chief constructor");
        this.name=name;
        this.salary=salary;
        this.chiefId=0000;
    }
    Chief(String name ){
        System.out.println("this is chief constructor");
        this.name=name;
        this.salary=000;
        this.chiefId=000;
    }
    Chief(){
        System.out.println("this is chief constructor");
        this.name="";
        this.salary=000;
        this.chiefId=000;
    }
    public void print(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(chiefId);
    }
}
