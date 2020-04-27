package Urlread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReadFromUrl {



    private List<String> list = new ArrayList<String>();

    public ReadFromUrl() {


    }

    public List<String> getList(){

        return this.list;

    }



    public void ReadFromURL() throws IOException{
        String inputline = "";
        URL boken = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt");

        BufferedReader bf = new BufferedReader(new InputStreamReader(boken.openStream()));
        while((inputline = bf.readLine()) != null){

            getList().add(inputline);

        }

        bf.close();


    }
    public void startwith(String letter){
        int count = 0;

        for (var i:getList()) {
            if(i.startsWith(letter)){
                count++;


            }

        }
        System.out.println("Antal ord med " + letter + " antal bokstäver: " + count);

    }



    public void ReadFromFile(int num){
        int count = 0;

        for (var i:getList()) {
            if(i.length() == num){
                count++;


            }

        }
        System.out.println("Antal ord med " + num + " antal bokstäver: " + count);

    }
}
