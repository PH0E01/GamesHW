import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GameInstallation {
    public static void main(String[] args) {
        File gamesFolder = new File("C://GameHW");
        boolean success = gamesFolder.mkdirs();

        StringBuilder log = new StringBuilder();

        if (success) {
            log.append("Directory games created successfully.\n");

            File srcFolder = new File("C://GameHW/src");
            srcFolder.mkdirs();
            log.append("Directory src created.\n");

            File mainFolder = new File("C://GameHW/src/main");
            mainFolder.mkdirs();
            log.append("Directory main created.\n");

            try {
                File mainJavaFile = new File("C://GameHW/src/main/main.java");
                boolean created = mainJavaFile.createNewFile();
                if (created) {
                    log.append("File main.java created.\n");
                } else {
                    log.append("Failed to create file main.java.\n");
                }

                File utilsJavaFile = new File("C://GameHW/src/main/utils.java");
                created = utilsJavaFile.createNewFile();
                if (created) {
                    log.append("File utils.java created.\n");
                } else {
                    log.append("Failed to create file utils.java.\n");
                }

                File resFolder = new File("C://GameHW/games/res");
                resFolder.mkdirs();
                log.append("Directory res created.\n");

                File drawables = new File("C://GameHW/games/res/drawables");
                drawables.mkdirs();
                log.append("Directory drawables created.\n");

                File vectors = new File("C://GameHW/games/res/vectors");
                vectors.mkdirs();
                log.append("Directory vectors created.\n");

                File icons = new File("C://GameHW/games/res/icons");
                icons.mkdirs();
                log.append("Directory icons created.\n");

                File savegames = new File("C://GameHW/games/savegames");
                savegames.mkdirs();
                log.append("Directory savegames created.\n");

                File tempFolder = new File("C://GameHW/games/temp");
                tempFolder.mkdirs();
                log.append("Directory temp created.\n");

                File tempFile = new File("C://GameHW/games/temp/temp.txt");
                created = tempFile.createNewFile();
                if (created) {
                    log.append("File temp.txt created.\n");
                } else {
                    log.append("Failed to create file temp.txt.\n");
                }

                File tempTxtFile = new File(tempFolder, "temp.txt");
                try {

                    BufferedWriter writer = null;
                    try {
                        writer = new BufferedWriter(new FileWriter(tempTxtFile));
                        writer.append(log);
                    } finally {
                        if (writer != null) writer.close();
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

