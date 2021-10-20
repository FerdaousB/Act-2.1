import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManipuleList {

	private static final int Animal = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nom;
		int pos;
		ArrayList<String>  Animal = new ArrayList<String>  ();
		
		Animal.add("Lion");
		Animal.add("Tiger");
		Animal.add("Cat");
		Animal.add("Dog");
        System.out.println(" Liste 1 : " +Animal);
        System.out.println("  ");
        
		Animal.add(2, "Elephant");
        System.out.println(" Liste 2 : " +Animal);
        System.out.println("  ");
        
        List<String> Copie_list = new ArrayList<String>(Animal);
        System.out.println(" Liste 3 : " +Copie_list);
        System.out.println("  ");
        
        List<String> res =  Stream.concat(Animal.stream(), Copie_list.stream()).collect(Collectors.toList());
        //Animal.addAll(Copie_list); 
        System.out.println(" Liste résultat : "+ res);
        System.out.println("  ");
 	    System.out.println(" Taille du tableau : " + res.size());
        System.out.println("  ");

 	    
 	    System.out.println(" Suppression de l'élément en position :");
        
        System.out.println("  ");
        

        Scanner sc = new Scanner(System.in);
        pos = sc.nextInt();
        System.out.println(" Suppression de l'élément " + res.get(pos-1));
        res.remove(pos-1);
        System.out.println("  ");
        System.out.println(" Nouveau tableau :"+ res);
                   
        
        
        
       
        System.out.println("  ");
 	    System.out.println(" Taille du tableau : " + res.size());	    
        System.out.println("  ");
        
             
 	    System.out.println(" Suppression de de l'animal (nom):");
        Nom = sc.next();
        res.remove(Nom);
        //Set<String> s = new LinkedHashSet<String>(res);  
        System.out.println("  ");
          
        System.out.println(" Nouveau tableau : " + res );
        System.out.println("  ");
	    System.out.println(" Taille du tableau : " + res.size());
        System.out.println("  ");
        
	    System.out.println(" *) Recherche l'élément à la position 1 : " + res.get(pos-1));
        System.out.println("  ");
        
        
	    System.out.println(" *) Verifier si l'animal '" + Nom + "' existe dans le Tableau");
        boolean b = res.contains(Nom);
        System.out.println("  ");
        System.out.println(" ===> " +b);
        System.out.println("  ");

		 Collections.sort(res);  			
	     System.out.println(" Tableau trié :"+ res);

	   
	     
	     //res.sort(); 
	    
	     
        //for (int i = 0; i < Animal.size(); i++) {
          // System.out.println(Animal.get(i));
        // }
        
        //Collections.swap(Animal, 0, 4);
        //System.out.println("Après : "+ Animal);
	}
	     
}
