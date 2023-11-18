public class Main {

   static long startTime = System.currentTimeMillis();
    
    public static void main(String[] args)
    {  
       // Call timeElapsed
       long w = whileLoop();
       long f = forLoop();
       System.out.println("\nWhile: " + w + " miliseconds" + "\nFor: " + f + " miliseconds");
    }
     
    // This method runs a while loop and measures the time elapsed from the 
    // start of the program. 
    public static long whileLoop()
    {
        int x = 100;
        while (x > 0)
        {
            System.out.println(x);
            x = x - 1;
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime; 
        System.out.print("This program took "+ duration + " Milliseconds to run.");
        return duration;
    }
    public static long forLoop() {
    	for(int x = 100; x>0; x--) {
    		System.out.println(x);
    	}
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime; 
        System.out.print("This program took "+ duration + " Milliseconds to run.");
        return duration;
    }

}
