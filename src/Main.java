//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrdersManager example = new OrdersManager();
        System.out.println(example.getMaxOrderCustomerName());
        example.removeUnprofitableOrders();
        example.printAllOrders();
    }
}