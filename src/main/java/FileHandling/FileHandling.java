package FileHandling;

import java.io.*;

public class FileHandling {

    public static void main(String[] args) {


        File textip = new File("C:\\Users\\91938\\Desktop\\FileHandling.txt");

        File textOP = new File("C:\\Users\\91938\\Desktop\\FileHandling-copy.txt");
        FileInputStream fip = null;
        FileOutputStream fop = null;


        try {
            fip = new FileInputStream(textip);
            fop = new FileOutputStream(textOP);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fip.available());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i =0;

        try {
            while ((i =fip.read()) != -1){
                fop.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            if (fip != null){
                try {
                    fip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fop != null){
                try {
                    fop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }



}
