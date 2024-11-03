package Oct28;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new File("limitation").mkdir();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\example.txt"));
             FileWriter fw = new FileWriter("limitation/serato.txt", true);
             BufferedWriter bw = new BufferedWriter(new FileWriter("limitation/another.txt"))
     ) {
                     String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
            Scanner sc = new Scanner(System.in);
for (int i = 0; i < 5000; i++) {
    String st = sc.nextLine();
    fw.write(st);
    fw.write("\n");
    bw.write(st);
    bw.newLine();
    bw.flush();
}
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File error");
        }
        System.out.println("naa kay gibuhat diri");
    }
}
