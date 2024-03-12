import java.io.*;
import java.util.Date;
import java.util.Scanner;


public class File {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("text.txt");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            Date date = new Date();
            writer.write(s + " "+ date);
            writer.flush();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}


