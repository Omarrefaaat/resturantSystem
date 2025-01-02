//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu item1 = new Menu("pizza", 1500);
        item1.print();
        Menu item2 = new Menu("pasta");
        item2.print();
        Menu item3 = new Menu();
        item3.print();

        Chief chief1 = new Chief("ahmed ",1500,658);
        chief1.print();
        Chief chief2 = new Chief("omar ",1200);
        chief2.print();
        Chief chief3 = new Chief("alaa ");
        chief3.print();
        Chief chief4 = new Chief();
        chief4.print();

        Staff staff1 = new Staff("hossam",1500,56);
        staff1.print();
        Staff staff2 = new Staff("mahmoud",1900);
        staff2.print();
        Staff staff3 = new Staff("ali");
        staff3.print();
        Staff staff4 = new Staff();
        staff4.print();
    }
}