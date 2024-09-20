import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {

    public static String[] agrandirTab(String[] tab) {
        String[]newTab=new String [tab.length+1];
        if (tab==null){
            return null;
        }else{
             for(int i=0; i< tab.length; i++){
            newTab[i]=tab[i];
        }
        newTab[newTab.length - 1]=null;
        return newTab;
        }
    }

    
    public static String[] lireMots() {
    	Scanner s = new Scanner(System.in);
    	
    	String[] mots = new String[1];
    	
    	String next = s.nextLine();
    	while(!next.equalsIgnoreCase("stop")) {
    		mots[mots.length-1]=next;
    		mots = agrandirTab(mots);
    		next = s.nextLine();
    	}
    	s.close();
    	
        return mots;
    }

    
    public static String[] trier(String[] mots) {
    	String[] copy = Arrays.copyOf(mots, mots.length);
    	Arrays.sort(copy);
        return copy;
    }

   
    public static void main(String[] args) {
        System.out.println("Veuillez entrer les mots:");
    	String[] mots = lireMots();
    	
    	mots = Arrays.copyOf(mots, mots.length-1);
    	
    	mots = trier(mots);
    	    	
    	for(String m : mots)
    		System.out.println(m);
    }
}
