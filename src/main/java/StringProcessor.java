import java.io.*;
import java.util.Scanner;

public class StringProcessor {

    String str;

    public StringProcessor(String strInput) {

        this.str = strInput;
    }

    public static String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        return br.readLine();
    }


    public void replaceText(final String find, final String replace) {

        str = str.replace(find, replace);
    }

    public String showResult() {

        System.out.print(str);
        return str;
    }




    public static void main (String ... args)throws IOException {
        StringProcessor processor = new StringProcessor(StringProcessor.readInputText());

        Scanner in = new Scanner(System.in);
        System.out.print("Find what: ");
        String find = in.nextLine();
        System.out.print("Replace with: ");
        String replace = in.nextLine();
        in.close();

        processor.replaceText(find, replace);
        processor.showResult();
    }
}