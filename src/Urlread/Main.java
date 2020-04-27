package Urlread;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFromUrl read = new ReadFromUrl();
        read.ReadFromURL();
        int i = 1;
        while(true){
            read.ReadFromFile(i);

            i++;

            if(i == 45)break;
        }

    }
}
