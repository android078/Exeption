package Exeptions;

public class CountDBException extends IllegalArgumentException  {
    private int needed;
    private int entered;

    public CountDBException (int needed, int entered){
        super("Количество полей дня рождения не соттветствует заданному \n Введено " + entered + ", нужно " + needed);
        this.needed = needed;
        this.entered = entered;
        
    }
    
}
