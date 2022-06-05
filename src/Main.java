
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        StringBuilder res = new StringBuilder();

        String[] dirs = {"D://Games/src", "D://Games/res", "D://Games/savegames", "D://Games/temp",
                "D://Games/src/main", "D://Games/src/test", "D://Games/res/drawables", "D://Games/res/vectors", "D://Games/res/icons"};
        String[][] files = {{"D://Games/src/main", "Main.java"}, {"D://Games/src/main", "Utils.java"}, {"D://Games/temp", "temp.txt"}};

        for (int i = 0; i < dirs.length; i++) {
            File dir = new File(dirs[i]);
            if (dir.mkdir()) {
                res.append(("Каталог " + dirs[i] + " создан"));
                res.append(System.getProperty("line.separator"));
            }
        }

        try {
            for (int i = 0; i < files.length; i++) {
                File file = new File(files[i][0], files[i][1]);
                if (file.createNewFile()) {
                    res.append(("Файл " + files[i][0] + "/" + files[i][1] + " создан"));
                    res.append(System.getProperty("line.separator"));
                }
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