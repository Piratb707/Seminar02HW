package Class;

/**
 * Интерфейс для возврата товара.
 */
public interface iReturnOrder {
    /**
     * Метод для обработки возврата товара.
     *
     * @param orderId идентификатор заказа
     */
    void processReturn(int orderId);

    /**
     * Метод для проверки возможности возврата товара.
     *
     * @param orderId идентификатор заказа
     * @return true, если возврат возможен, иначе - false
     */
    boolean canReturn(int orderId);
}