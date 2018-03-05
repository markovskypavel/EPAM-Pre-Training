package by.markovsky.tasknine.application.model.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by Pavel Markovsky on 04.03.2018.
 */
public class FileWork {

    //Reads text from txt-file in resources
    public static String readTextFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(FileWork.class.getClassLoader().getResource(fileName).toURI())));
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(fileLine + "\n");
            }
            bufferedReader.close();
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

}
