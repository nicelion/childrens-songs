/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    public static void hadA(String a) 
    { 
        System.out.println("And on that farm he had a " + a + ", E I E I O.");
    }


    public static void withA(String s) 
    { 
        System.out.println("With a " + s + " " + s +  " here and a " + s + " " + s +  " there.");
        System.out.println("Here a " + s + ", there a " + s + ", everywhere a " + s + ", " + s + ".");  
    }

    
    public static void singIt(String a, String s) 
    {
        eieio();
        hadA(a);
        withA(s);
        eieio();
        System.out.println();
    }

    
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
