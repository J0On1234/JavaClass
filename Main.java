public class Main{
    public static void main(String[] args){
        Customer customer1 = new Customer("[손님1] ", 10000, false);
        Barista barista = new Barista(3000, 2);

        customer1.order(barista, "아메리카노");

        Customer customer2 = new Customer("[손님2] ", 5000,false);
        customer2.order(barista, "아메리카노");
    }
}