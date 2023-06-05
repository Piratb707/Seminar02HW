import Class.Customer;
import Class.ActionCustomer;
/**
 * Главный класс программы для тестирования.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создание акционного клиента
        ActionCustomer actionCustomer = new ActionCustomer("Summer Sale", 123);
        ActionCustomer.setParticipantsCount(1000);

        // Вывод информации о клиенте и акции
        System.out.println("Action Name: " + actionCustomer.getActionName());
        System.out.println("Customer ID: " + actionCustomer.getCustomerId());
        System.out.println("Participants Count: " + ActionCustomer.getParticipantsCount());

        // Создание клиента
        Customer customer = new Customer(456, "John Smith");

        // Вызов методов интерфейса iReturnOrder
        customer.processReturn(789);
        boolean canReturn = customer.canReturn(789);
        System.out.println("Can Return: " + canReturn);
    }
}
