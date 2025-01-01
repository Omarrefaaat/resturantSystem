//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        staff emploee1 = new staff();
        emploee1.name = "omar" ;
        emploee1.salary=2000;
        emploee1.staffId=59;
        emploee1.printStaffData();
        staff emploee2 = new staff();
        emploee2.name="ali";
        emploee2.salary=1200;
        emploee2.staffId=26;
        emploee2.printStaffData();

        chief emploee3 = new chief();
        emploee3.name = "ahmed";
        emploee3.salary=800;
        emploee3.chiefId=987;
        emploee3.printChiefData();

        chief emploee4 = new chief();
        emploee4.name="said";
        emploee4.salary=265;
        emploee4.chiefId=59;
        emploee4.printChiefData();

        menu item1 = new menu();
        item1.item="pizza";
        item1.price=250;
        item1.printMenuData();

        menu item2 = new menu();
        item2.item="pasta";
        item2.price=200;
        item2.printMenuData();

        menu item3 = new menu();
        item3.item="appetizer";
        item3.price=100;
        item3.printMenuData();

        menu item4 = new menu();
        item4.item="sandwich";
        item4.price=150;
        item4.printMenuData();






    }
}