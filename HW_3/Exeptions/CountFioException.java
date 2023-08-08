package Exeptions;

public class CountFioException extends IllegalArgumentException{
    private int needed;
    private int entered;

    public CountFioException(int needed, int entered) {
        super("Количество параметров ФИО не соответствует необходимому\n  Введено " + entered + ", необходимо " + needed);
        this.needed = needed;
        this.entered = entered;

    }
    
}
