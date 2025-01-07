package employee;

public class Chef {
    private String name ;
    private int salary;
    private int chiefId ;

    public Chef(String name, int salary, int chiefId){
        System.out.println("this is chief constructor");
        this.name=name;
        this.salary=salary;
        this.chiefId=chiefId;
    }

    public int getChiefId (){
        return chiefId;
    }
    public void setChiefId (int chiefId ){
        this.chiefId=chiefId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getSalary (){
        return salary;
    }
    public void setSalary (int salary){
        this.salary=salary;
    }


    public void print(){
        System.out.println(name );
        System.out.println(salary);
        System.out.println(chiefId);
    }
}
