package student;
import java.util.*;

class Invoice{
	String a,b;
    int n;double p;
    Invoice (){
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        n=sc.nextInt();
        p=sc.nextDouble();
    }
    void getInvoiceAmount(){
       System.out.println( n*p);
    }
    void getPartNumber() {
        System.out.println(a);
    }

    void getPartDescription() {
        System.out.println(n);
    }

    void getQuantity() {
        System.out.println(n);
    }

    void getPricePerItem() {
        System.out.println(p);
    }


	public static void main(String[] args) {
		Invoice in = new Invoice();
		in.getInvoiceAmount();
		in.getPartNumber();
		in.getPartDescription();
		in. getQuantity();
		in.getPricePerItem();

	}
}

