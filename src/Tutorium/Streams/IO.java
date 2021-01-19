package Tutorium.Streams;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

public class IO {

    public static List <String> readLines(String fileName){
        List <String> result = new ArrayList<>();
        File file = new File(fileName);
        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){
            readLine(bufferedReader, result);
        }
        catch (FileNotFoundException fnfEx) {
            fnfEx.printStackTrace(System.err);
        }
        catch (IOException ioEx){
            ioEx.printStackTrace(System.err);
        }
        finally{
            return result;
        }
    }
    public static List <String> readLInesCompressed(String fileName) {
        List <String> result = new ArrayList<>();
        File file = new File(fileName);
        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                ZipInputStream gzipInputStream = new ZipInputStream(fileInputStream);
                InputStreamReader inputStreamReader = new InputStreamReader(gzipInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
                ){
            readLine(bufferedReader, result);
        }
        catch(FileNotFoundException fnFEx){
            fnFEx.printStackTrace(System.err);
        }
        catch(IOException ioEx){
            ioEx.printStackTrace(System.err);
        }
        finally{
            return result;
        }
    }

    private static void readLine(BufferedReader bufferedReader, List <String> result) throws IOException{
        String line = bufferedReader.readLine();
        while(line!=null){
            result.add(line);
            line = bufferedReader.readLine();
        }
    }

    public static void main (String [] args){
        List <String> absatz = new ArrayList<>();
        List <String> absatzZip = new ArrayList<>();
        absatz = readLines("/Users/beppostrassenkehrer/IdeaProjects/MUP/src/Tutorium/Streams/file.txt");
        absatzZip = readLInesCompressed("/Users/beppostrassenkehrer/IdeaProjects/MUP/src/Tutorium/Streams/file.txt.zip");
        System.out.println(absatz.toString());
        System.out.println(absatzZip.toString());
    }

}
