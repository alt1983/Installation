
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        StringBuilder res = new StringBuilder();

        File dir1 = new File("D://Games/src");
        File dir2 = new File("D://Games/res");
        File dir3 = new File("D://Games/savegames");
        File dir4 = new File("D://Games/temp");
        File dir5 = new File("D://Games/src/main");
        File dir6 = new File("D://Games/src/test");
        File dir7 = new File("D://Games/res/drawables");
        File dir8 = new File("D://Games/res/vectors");
        File dir9 = new File("D://Games/res/icons");
        File file1 = new File("D://Games/src/main", "Main.java");
        File file2 = new File("D://Games/src/main", "Utils.java");
        File file3 = new File("D://Games/temp", "temp.txt");

        if (dir1.mkdir()) {
            res.append("Каталог src создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir2.mkdir()) {
            res.append("Каталог res создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir3.mkdir()) {
            res.append("Каталог savegames создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir4.mkdir()) {
            res.append("Каталог temp создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir5.mkdir()) {
            res.append("Каталог src/main создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir6.mkdir()) {
            res.append("Каталог src/test создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir7.mkdir()) {
            res.append("Каталог res/drawables создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir8.mkdir()) {
            res.append("Каталог res/vectors создан");
            res.append(System.getProperty("line.separator"));
        }
        if (dir9.mkdir()) {
            res.append("Каталог res/icons создан");
            res.append(System.getProperty("line.separator"));
        }

        try {
            if (file1.createNewFile()) {
                res.append("Файл src/main/Main.java создан");
                res.append(System.getProperty("line.separator"));
            }
            if (file2.createNewFile()) {
                res.append("Файл src/main/Utils.java создан");
                res.append(System.getProperty("line.separator"));

            }
            if (file3.createNewFile()) {
                res.append("Файл temp/temp.txt создан");
                res.append(System.getProperty("line.separator"));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String result = res.toString();

        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt", false)) {
            writer.write(result);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}


