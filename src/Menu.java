public class Menu {
    String item ;
    int price ;

    Menu (String item , int price){
        System.out.println("this is menu constructor");
        this.item=item;
        this.price=price;
    }

    public String getItem (){
        return item;
    }
    public void setItem (String item){
        this.item=item;
    }

    public int getPrice (){
        return price;
    }
    public void setPrice (int price){
        this.price=price;
    }

}
