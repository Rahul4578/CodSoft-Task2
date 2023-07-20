import java.io.BufferedReader;
import java.io.FileReader;
public class Wordcount {
    public static void main(String[] args) throws Exception{
        String line;
        int count = 0;
        FileReader file = new FileReader("Rahul.txt");
        BufferedReader br = new BufferedReader(file);
        while((line = br.readLine())!=null)
        {
            String words[] = line.split("");
            count = count + words.length;

        }
        System.out.println("No of words"+count);
        br.close();
    }
    
}
