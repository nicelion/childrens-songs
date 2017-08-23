/**
 * This program sings the song Old MacDonald Had a Farm.
 * 
 * Version 1 - Refactoring eliminates code duplication and makes it easier to add more animals.
 *
 * @author Jon Cooper
 * @version August 18, 2016 (v1)
 */


public class OldMacDonald1
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
        System.out.println("With a " + s + " " + s + " here and a " + s + " " + s +  " there.");
        System.out.println("Here a " + s + ", there a " + s + ", everywhere a " + s + ", " + s + ".");  
    }
 
    
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our song a title

        // a duck
        eieio();
        hadA("duck");
        withA("quack");
        eieio();
        System.out.println();
        
        
        // a cow
        eieio();
        hadA("cow");
        withA("moo");
        eieio();
        System.out.println();
        
        
        // a horse
        eieio();
        hadA("horse");
        withA("neigh");
        eieio();
        System.out.println();


        // a dog
        eieio();
        hadA("dog");
        withA("woof");
        eieio();
        System.out.println();   


        // a cat
        eieio();
        hadA("cat");
        withA("meow");
        eieio();
        System.out.println();   


        // a giraffe
        eieio();
        hadA("giraffe");
        withA("???????");
        eieio();
        System.out.println();   

    }
    
}
