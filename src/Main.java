import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        File myFile = new File("G:\\JAVA\\IdeeaProjects - Marian\\TemaCraciun\\cildren.csv");
        List<Kid> chosenListName = FileToListUtils.readFileToKidList(myFile);

        File myFile2 = new File("G:\\JAVA\\IdeeaProjects - Marian\\TemaCraciun\\toys.csv");
        List<Toy> listToys = FileToListUtils.readFileToToyList(myFile2);
        ToyInnator toyInnator = new ToyInnator();
        Map<Kid, Toy> kidsPresentsMap = toyInnator.givePresents(chosenListName, listToys);
        for (Map.Entry<Kid, Toy> entry : kidsPresentsMap.entrySet()) {
            if (entry.getValue() == null) {
                System.out.println(entry.getKey() + " ... this kid was naughty!");
            }
            else {
                System.out.println(entry.getKey() + " has received " + entry.getValue());
            }
        }
    }
}
