
/**
 * Lockable.java        Author: Nikita Volodin (127196)
 * CS151A,          Assignment 8 - Problem #1
 *
 * Interface for a lockable object
 */
public interface Lockable {
    /**
     * Method to set key to an object
     * @param key Key for this object
     */
    public void setKey(int key);
    
    /**
     * Method to lock an object if @param key is equal to key that was set 
     * in setKey method
     * @param key Key to unlock an object
     */
    public void lock(int key);
    
    /**
     * Method to unlock an object if @param key is equal to key that was set
     * in setKey method
     * @param key 
     */
    public void unlock(int key);
    
    /**
     * Method checks if object locked or unlocked
     * @return True if object is locked
     */
    public boolean locked();
}
