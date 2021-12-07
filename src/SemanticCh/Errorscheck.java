package SemanticCh;

import java.util.ArrayList;

public class Errorscheck {
    public  static ArrayList<String> Errorscheck =new ArrayList<>();

    public Errorscheck()
    {
        Errorscheck.add("\n Error order1 $$ : Html id attribute repeated in document level."); // order 1
        Errorscheck.add("\n Error order2 $$ : the iterator variable is repeated.");            // order 2
        Errorscheck.add("\n Error order3 $$ : invalid list li outside (ol/ul).");              // order 3
        Errorscheck.add("\n Error order4 $$ : Exist cp-app nested.");                           // order 4
        Errorscheck.add("\n Error order5 $$ : Each html element has at most one Structural attribute.");  // order 5
        Errorscheck.add("\n Error order6 $$ : img tag must has src attribute.");                 // order 6
        Errorscheck.add("\n Error order7 $$ : Anchor tag <a> must has href attribute ");          // order 7
        Errorscheck.add("\n Error order8 $$ : (Date) pipes should receive one character only");                           // order 8
        Errorscheck.add("\n Error order9 $$ : (currency) pipe should receive one character only");   // order 9
        Errorscheck.add("\n Error order10 $$ : (uppercase or lowercase) Should not receive any parameter. ");     // order 10


    }

//
//    static public boolean CreateFile(String ErrorFile)
//    {   ErrorFileName=ErrorFile;
//        Gson gson = new Gson();
//        String jsonString = gson.toJson("");
//        try {
//            FileWriter fileWriter = new FileWriter("./"+ErrorFile+".json");
//            fileWriter.write(jsonString);
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return true;
//    }
//    static public boolean AddToFile(String error)
//    {
//        Gson gson = new Gson();
//        BufferedReader br;
//        try {
//            br = new BufferedReader(new FileReader("./"+ErrorFileName+".json"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            return false;
//        }
//        String s=gson.fromJson(br,String.class);
//        s+=" "+error;
//        String jsonString = gson.toJson(s);
//        try {
//            FileWriter  fileWriter = new FileWriter("./"+ErrorFileName+".json");
//            fileWriter.append(jsonString);
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//    static public void PrintAllFile()
//    {Gson gson = new Gson();
//        BufferedReader br;
//        try {
//            br = new BufferedReader(new FileReader("./"+ErrorFileName+".json"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            return;
//        }
//        String errors = gson.fromJson(br, String.class);
//        System.out.println(errors);
//    }
}
