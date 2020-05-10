import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileToListUtils {
    public static List<Kid> readFileToKidList (File file) {
        List<Kid> chosenListName = new ArrayList<>();

        try {
            FileReader myFileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(myFileReader);
            bufferReader.readLine();
            String fileLine;

            while ((fileLine = bufferReader.readLine()) != null) {
                String[] personArray = fileLine.split(";");
                for (int i = 0; i < personArray.length; i++) {
                    Kid temp = new Kid(personArray[0], personArray[1],
                            personArray[2],personArray[3],personArray[4]);
                    chosenListName.add(temp);
                }
            }
            return chosenListName;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List readFileToToyList (File file) {
        List<Toy> listToys = new ArrayList<>();

        try {
            FileReader myFileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(myFileReader);
            bufferReader.readLine();
            String fileLine;

            while ((fileLine = bufferReader.readLine()) != null) {
                String[] toyArray = fileLine.split(";");
                for (int i = 0; i < toyArray.length; i++) {

                    Toy temp = new Toy(toyArray[0], toyArray[1],
                            toyArray[2], toyArray[3]);
                    listToys.add(temp);
                }
            }
            return listToys;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
