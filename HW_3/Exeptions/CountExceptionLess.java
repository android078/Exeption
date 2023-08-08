package Exeptions;

public class CountExceptionLess extends IllegalArgumentException{
    private int needed;
    private int entered;

    public CountExceptionLess(int needed, int entered) {
        super("Введенное количество элементов строки (" + needed +") меньше необходимого (" + entered + ") количества элементов");
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
