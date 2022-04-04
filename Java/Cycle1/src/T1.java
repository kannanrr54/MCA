import java.util.*;
class T1 {
    public static void main(String[] args) {
        System.out.println("Enter product details\nEnter product name");
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        System.out.println("Enter product type");
        String type=s.nextLine();
        System.out.println("Enter product price");
        String price=s.nextLine();
        System.out.println("-----------------------------------\n");
        System.out.println("Name : "+name+"\nType : "+type+"\nPrice : "+price);
    }
}