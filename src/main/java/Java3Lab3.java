import java.io.*;
import java.util.ArrayList;

public class Java3Lab3 {

    public static void main(String[] args) {

       // vuvodFaila("1.txt");
        Chtenie("2.txt");

    }

    public static void vuvodFaila(String nameFile)
    {
        ArrayList<Integer> mass = new ArrayList<Integer>();
        try {
            FileInputStream fileInput = new FileInputStream(nameFile);
            int i;
            while (!((i = fileInput.read()) == -1))
            {
                mass.add(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int b: mass) {
            System.out.println(b);
        }

    }

    public static void Chtenie(String name)
    {
        try {
            FileInputStream fin = new FileInputStream(name);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fin));
            String str;
            while ((str = reader.readLine()) != null)
            {
                System.out.println(str);
            }
            reader.close();
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
