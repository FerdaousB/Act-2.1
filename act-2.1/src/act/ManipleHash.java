package act;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManipleHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Key, Valeur;
		
		HashMap<String, Integer> numberMapping = new HashMap<String, Integer>();
		numberMapping.put("one",1 );
		numberMapping.put("Four",4);
		numberMapping.put("Two",2);
		numberMapping.put("Three",3);		
        System.out.println(numberMapping);
        
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Steve", "London");
        map.put("John", "NewYork");
        map.put("Rajeev", "Bengaluru");
        System.out.println(map);
       
        System.out.println("Is the map empty? " + map.isEmpty());
        System.out.println("The size of the map is " + map.size());

        System.out.println(" saisie le key : ");
        Scanner sc = new Scanner(System.in);
        Key = sc.next(); 
        boolean b = map.containsKey(Key);
        if(b)
              System.out.println(" existe ");
        else
        	  System.out.println(" n'existe pas");
        
        System.out.println(" saisie le valeur : ");
        Valeur = sc.next(); 
        boolean b1 = map.containsKey(Key);
        if(b1)
              System.out.println(" existe ");
        else
        	  System.out.println(" n'existe pas");
        
        
        
        System.out.println("Saisir une cle :");
        String e = sc.next();
        System.out.println("Saisir une nouvelle valeur :");
        String f = sc.next();
        map.put(e,f);
        System.out.println(map);
 
        System.out.println(" saisie un key pour avoir le valeur : ");
        Key = sc.next(); 
        System.out.println("The Value is: " + map.get(Key));
        
        System.out.println(" saisie le key que vous voulez le supprimer : ");
        Key = sc.next();
        map.remove(Key);
        System.out.println(" Nouveau map " + map);


        
        System.out.println("Saisir une cle :");
        Key = sc.next();
        System.out.println("Saisir la valeur associe :");
        Valeur = sc.next();
        boolean p=map.remove(Key,Valeur);

        if (p)
        { 
		map.remove(Key);
        System.out.println(map);
        }
        else
        System.out.println(map);


		
	}

}
