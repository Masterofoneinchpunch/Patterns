package com.mooip.code.singleton;

/**
 * Singleton (Creational G04 pattern) Eager Instantiation example.  It is 
 * quite simple.  The question remains whether you actually need to use a singleton or not.
 * When you have a clustered environment it is quite possible that you will have multiple
 * instances of a Singleton.  These are best used when you want to keep something cached.
 * An alternative approach will be Lazy Initalization where you wait until it is called
 * before you initialize (I will have an example in a different class).  Only use that approach
 * when something is "expensive" to cache and you do not possible need it.
 * <p>
 * In <i>Design Patterns in Java</i> (2006) they consider it a Responsibility Pattern because 
 * <q>But the <i>intent</i> of the SINGLETON pattern implies that a specific object bears a
 * responsibility on which other objects rely.</q>
 * 
 * @author masterofoneinchpunch
 */
public final class Singleton {  
    /* Make this public and you can get rid of getInstance method */
    private static final Singleton INSTANCE = new Singleton();
    
    private Singleton() {        
    }
    
    /* Factory Method approach to Singleton */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
