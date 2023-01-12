import javax.swing.text.StringContent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException {
        ArrayList<String> arr = new ArrayList<String>();

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        DataFlavor flavor = DataFlavor.stringFlavor;

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter data");
//        String s = input.nextLine();
        String s = (String) clipboard.getData(flavor);
        System.out.println();
        System.out.println();
        System.out.println();

        arr = converter(s);
        StringBuilder tempStr = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            tempStr.append(arr.get(i));
            tempStr.append("\n");
        }
//        String myString = String.valueOf(tempStr);
//        StringSelection stringSelection = new StringSelection(myString);
//        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//        clipboard.setContents(stringSelection, null);

        copyToClipboard(String.valueOf(tempStr));

    }

    static ArrayList<String> converter(String k) {
        ArrayList<String> arr = new ArrayList<String>();

        int j = 0;
        StringBuilder tempStr = new StringBuilder();
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) != ' ' && k.charAt(i) != ',') {
                tempStr.append(k.charAt(i));
            } else if (k.charAt(i) == ',') {
                continue;
            } else if (k.charAt(i) == ' ') {
                arr.add(j, String.valueOf(tempStr));
                j++;
                tempStr.setLength(0);
            }

        }
        arr.add(j, String.valueOf(tempStr));

        return arr;
    }

    static void copyToClipboard(String text) {
        java.awt.Toolkit.getDefaultToolkit().getSystemClipboard()
                .setContents(new java.awt.datatransfer.StringSelection(text), null);
    }
}