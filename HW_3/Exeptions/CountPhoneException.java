package Exeptions;

public class CountPhoneException extends IllegalArgumentException{
    private int needed;
    private int entered;
    
    public CountPhoneException(int needed, int entered) {
        super("Количество номеров телефонов не соответствует необходимому\n  Введено " + entered + ", необходимо " + needed);
        this.needed = needed;
        this.entered = entered;
    }
}
