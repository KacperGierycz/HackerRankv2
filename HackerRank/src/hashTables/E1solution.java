package hashTables;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class E1solution {

    // Complete the checkMagazine function below.
	   static void checkMagazine(String[] magazine, String[] note) {
	        
	        HashMap<String, Integer> magazinW = new HashMap<String, Integer>();
	        HashMap<String, Integer> noteW = new HashMap<String, Integer>();
	        
	        for (String s: note){
	            if (noteW.get(s)==null){
	                noteW.put(s,1);
	            }
	            else{
	                int nrW=noteW.get(s);
	                noteW.put(s,nrW+1);
	            }
	        }
	        
	        for (String s: magazine){
	            if (magazinW.get(s)==null){
	                magazinW.put(s,1);
	            }
	            else{
	                int nrW=magazinW.get(s);
	                magazinW.put(s,nrW+1);
	            }
	        }
	        
	        Set<String> noteWSet=noteW.keySet();
	     //   System.out.println(noteWSet);
	     //   System.out.println(noteW);
	    //    System.out.println(magazinW);
	        boolean no=false;
	        for (String s: noteWSet){
	            
	            if(magazinW.get(s)==null){
	             //   System.out.println("No");
	              //  System.out.println("! exiting null at "+s);
	                    no=true;
	                    break;
	            }
	            else{
	            if (magazinW.get(s)<noteW.get(s)){
	           // System.out.println(magazinW.get(s));
	          //  System.out.println(noteW.get(s));
	            //    System.out.println(magazinW.get(s)<noteW.get(s));
	            //    System.out.println("No");
	            //    System.out.println("exiting at "+s);
	                no=true;
	                break;

	            }
	            }

	        }
	        
	                        if(no==false){
	                    System.out.println("Yes");
	                }
	                else{
	                        System.out.println("No");   
	                }
	    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

