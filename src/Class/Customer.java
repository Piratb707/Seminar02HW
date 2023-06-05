package Class;

/**
 * Класс, описывающий клиента.
 */
public class Customer implements iReturnOrder {
    private int customerId;
    private String name;

    /**
     * Конструктор класса Customer.
     *
     * @param customerId id клиента
     * @param name       имя клиента
     */
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    /**
     * Получить id клиента.
     *
     * @return id клиента
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Получить имя клиента.
     *
     * @return имя клиента
     */
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void processReturn(int orderId) {
        // Логика обработки возврата товара
        System.out.println("Обработка возврата товара для заказа " + orderId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canReturn(int orderId) {
        // Логика проверки возможности возврата товара
        return true;
    }
}