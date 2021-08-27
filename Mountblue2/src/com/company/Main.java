package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        String path="matches.csv";
        String line;
        try{
            BufferedReader br= new BufferedReader(new FileReader(path));
            while(( line= br.readLine())!=null){
                String[] values=line.split((","));

                System.out.println(values[0]);


            }
        }catch(Exception e){

            e.printStackTrace();
        }

    }
}
