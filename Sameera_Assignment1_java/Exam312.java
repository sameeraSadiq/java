

public class Exam312 {
    public static void main(String[] args) {
        String parNumber="A002";
        String partDescription="Apple";
    int quantityInGraam=500;
    Double pricePerItem= 9.6;
        // Double total=quantityInGraam*pricePerItem;
    if (quantityInGraam < 0) {
        System.out.println(0);
    }
    else if (pricePerItem < 0) {
        System.out.println(0.0);
    }
    else {
    Double total=quantityInGraam*pricePerItem;
        System.out.println(total);
    }
    }
}
    

