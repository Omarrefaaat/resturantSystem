public class Menu {
    String item ;
    int price ;

    Menu (String item , int price){
        System.out.println("this is menu constructor");
        this.item=item;
        this.price=price;
    }
    Menu (String item ){
        System.out.println("this is menu constructor");
        this.item=item;
        this.price=00;
    }
    Menu (){
        System.out.println("this is menu constructor");
        this.item="";
        this.price=00;
    }
    public void print(){
        System.out.println(item);
        System.out.println(price);
    }
}
