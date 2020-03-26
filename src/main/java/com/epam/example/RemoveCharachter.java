package com.epam.example;
public class RemoveCharachter {
    public String remove(String string) {
         String result = string.toUpperCase();

         if(result.length()>=2){
             String first = result.substring(0,2).replace("A","");
             String two = result.substring(2);
             result = first.concat(two);
         }
         if(result.equals("A")){
             result="";
         }
         return result;

    }
}