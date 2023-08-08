import FileWorks.WriteInFileException;
import FileWorks.FileWorks;



import static FileWorks.FileWorks.printAll;
import static InputWorks.InputString.*;



public class Main {
    public static void main(String[] args) throws WriteInFileException {
        InputAb();
        if (more) {
            printAll(abonentArrayList);
        }
}
}
