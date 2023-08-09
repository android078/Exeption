package FileWorks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import Abonents.Abonents;


public class FileWorks {
    /**
     * Печать данных из массива абонентов в файлы
     * @param list
     * @throws WriteInFileException
     */
    public static void printAll(ArrayList<Abonents> list) throws WriteInFileException {
        String tempName;
        ArrayList<Abonents> tempArr;
        String wrString = "";
        String fileName = "";
        int printCount = 0;
        HashSet<String> tempSet = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            tempName = list.get(i).lname;
            tempArr = new ArrayList<>();
                if (!tempSet.contains(tempName)) {
                    tempSet.add(tempName);
                    tempArr = new ArrayList<>();
                    tempArr = getNamesakes(list, tempName);
                    fileName = "HW_3\\" + tempName + ".txt";
                    //fileName = "HW_3.txt";
                    try (FileWriter writer = new FileWriter(fileName)) {
                        wrString = "";
                        for (int j = 0; j < tempArr.size(); j++) {
                            wrString += tempArr.get(j);
                            wrString += "\n";
                        }
                        System.out.println("fileName: " + fileName);
                        writer.write(wrString);
                        writer.write("\n");
                        writer.flush();
                        writer.flush();
                    } catch (IOException e) {
                        throw new WriteInFileException("Запись в файл не удалась", e);
                    }
                }
                }
        }

    /**
     * Метод поиска однофамильцев
     * @param abList
     * @param pos
     * @return
     */
    public static ArrayList<Abonents> getNamesakes(ArrayList<Abonents> abList, String pos) {
        ArrayList<Abonents> tempArr = new ArrayList<>();
        String tempName = pos;
        for (int i = 0; i < abList.size(); i++) {
            if (abList.get(i).lname.equals(tempName)) {
                tempArr.add(abList.get(i));
            }
        }
        return  tempArr;
    }
}
