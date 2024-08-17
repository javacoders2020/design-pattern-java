package com.example.singleton.main;

import com.example.singleton.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		//This will cause an error because the constructor is private
		//Singleton singleton = new Singleton();
		
	      
		// Step 5: Obtain the singleton instance or singleton object for the first time
        Singleton first = Singleton.getInstance();

        /* Step 6: Use the singleton instance to call the desired method */
        first.doSomething();
        
        /* Step 7: Retrieve the singleton instance again. The constructor is not called, 
         *  and no new object is created. */

        Singleton second = Singleton.getInstance();

        
        /* Use the second singleton instance to call the method again */
        
        second.doSomething();
        
        }
}



