package Exeptions;
public class CountExceptionMore extends IllegalArgumentException{
    private int needed;
    private int entered;
    
    public CountExceptionMore(int needed, int entered) {
        super("Введенное количество элементов строки (" + needed +") больше необходимого (" + entered + ") количества элементов");
        this.entered = entered;
        this.needed = needed;

    }
    public int getNeeded() {
        return needed;
    }
    public int getEntered() {
        return entered;
    }
}
