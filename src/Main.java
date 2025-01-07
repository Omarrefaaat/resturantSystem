import employee.Chef;
import employee.Staff;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Chef chief1 = new Chef("ahmed" ,2500,156);
        chief1.setChiefId(156);
        chief1.setName("ahmed omar");
        chief1.setSalary(2600);

        System.out.println(chief1.getName() + "\n" + chief1.getChiefId()+ "\n" + chief1.getSalary());

        Staff staff1 = new Staff("omar" , 2500,159);
        staff1.setName("omar ali");
        staff1.setSalary(2687);
        staff1.setStaffId(658);

        System.out.println(staff1.getName() + "\n" + staff1.getStaffId()+ "\n" + staff1.getSalary());

        Menu menu1 = new Menu("pizza", 150);
        menu1.setItem("pasta");
        menu1.setPrice(160);

        System.out.println(menu1.getItem() +"\n"+ menu1.getPrice());




    }
}