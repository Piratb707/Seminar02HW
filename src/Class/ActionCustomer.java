package Class;

/**
 * Класс, описывающий акционного клиента.
 */
public class ActionCustomer {
    private String actionName;
    private int customerId;
    private static int participantsCount;

    /**
     * Конструктор класса ActionCustomer.
     *
     * @param actionName  название акции
     * @param customerId id клиента
     */
    public ActionCustomer(String actionName, int customerId) {
        this.actionName = actionName;
        this.customerId = customerId;
    }

    /**
     * Получить название акции.
     *
     * @return название акции
     */
    public String getActionName() {
        return actionName;
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
     * Получить количество участников в акции.
     *
     * @return количество участников
     */
    public static int getParticipantsCount() {
        return participantsCount;
    }

    /**
     * Установить количество участников в акции.
     *
     * @param count количество участников
     */
    public static void setParticipantsCount(int count) {
        participantsCount = count;
    }
}