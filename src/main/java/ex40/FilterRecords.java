/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex40;


import java.util.*;

public class FilterRecords {
    public static void main(String[] args) {
        FilterRecords myapp = new FilterRecords();
        List<Map<String, String>> listOfMaps;
        listOfMaps = HashAssign();
        ArrayList lastName = Sort();
        String searchValue = input();
        myapp.output(lastName, listOfMaps, searchValue);
    }

    private static String input(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter a search string: ");

        return input.nextLine();
    }

    private static List<Map<String, String>>  HashAssign() {
        List<Map<String, String>> listOfMaps = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Johnson", "John Johnson,Manager,2016-12-31,");
        Map<String, String> map2 = new HashMap<>();
        map2.put("Xiong", "Tou Xiong,Software Engineer,2016-10-05,");
        Map<String, String> map3 = new HashMap<>();
        map3.put("Michaelson", "Michaela Michaelson,District Manager,2015-12-19,");
        Map<String, String> map4 = new HashMap<>();
        map3.put("Jacobson", "Jake Jacobson,Programmer,,");
        Map<String, String> map5 = new HashMap<>();
        map3.put("Jackson", "Jacquelyn Jackson,DBA,,");
        Map<String, String> map6 = new HashMap<>();
        map3.put("Webber", "Sally Webber,Web Developer,2015-12-18,");
        listOfMaps.add(map1);
        listOfMaps.add(map2);
        listOfMaps.add(map3);
        listOfMaps.add(map4);
        listOfMaps.add(map5);
        listOfMaps.add(map6);



        return listOfMaps;
    }
    private static ArrayList Sort() {
        ArrayList list = new ArrayList();
        list.add("Johnson");
        list.add("Xiong");
        list.add("Michaelson");
        list.add("Jacobson");
        list.add("Jackson");
        list.add("Webber");

        Collections.sort(list);
        return list;
    }
    private void output(ArrayList lastNames, List<Map<String, String>> listOfMaps, String SearchValue){
        ArrayList<String> partition;
        System.out.print("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|------------------\n");
        for (Object lastName : lastNames) {
            for (Map<String, String> map : listOfMaps) {
                for (String key : map.keySet()) {
                    if (lastName.equals(key)) {
                        partition = decipher(map.get(key));
                        Stringcompare(SearchValue, partition);
                    }
                }
            }
        }
    }

    private String nameSpace(String Name){
        StringBuilder Space = new StringBuilder();
        for(int i=0; i<(20-Name.length()); i++){
            Space.append(" ");
        }
        Space.append("|");
        return Space.toString();
    }
     public void Stringcompare(String SearchValue, ArrayList<String> partition){
        String NameSpace;
        String PositionSpace;
        if(partition.get(0).contains(SearchValue)){
            NameSpace = nameSpace(partition.get(0));
            PositionSpace = positionSpace(partition.get(1));
            System.out.printf("%s%s %s%s %s\n", partition.get(0), NameSpace, partition.get(1), PositionSpace, partition.get(2));
        }
    }

    private String positionSpace(String Name){
        StringBuilder Space = new StringBuilder();
        for(int i=0; i<(18-Name.length()); i++){
            Space.append(" ");
        }
        Space.append("|");
        return Space.toString();
    }
    public ArrayList decipher(String Map){
        ArrayList<String> partition = new ArrayList();
        StringBuilder current = new StringBuilder();
        for(int i=0; i<Map.length(); i++){
            if(Map.charAt(i) == ','){
                partition.add(current.toString());
                current = new StringBuilder();
            }
            else{
                current.append(Map.charAt(i));
            }
        }
        return partition;
    }

}