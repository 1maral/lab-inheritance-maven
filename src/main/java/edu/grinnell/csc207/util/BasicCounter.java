package edu.grinnell.csc207.util;

public class BasicCounter implements Counter{

    /*
     * fields
     */

    int count;
    int start;

    /*constructor
     * 
     */
    
    public BasicCounter (int val){
     this.count = val;
     this.start = val;
     //System.err.printf("BasicCounter(%d)\n", val); 
    }

    /*increment, add one to the count
     * @exception throws exception if the count is already the maximum integer value.
     */
    public void increment()throws Exception{
        this.count +=1;
    }
    
    /*reset: resrs count to start
     */
    public void reset (){
        this.count = this.start;
    }

    /*toString. It returns a string of the form "[" + this.count + "]".
     * @return String result
     */
    public String toString(){
        return "[" + this.count + "]";
    }

    /*get, return the value of count
     * @return int Count
     */
    public int get(){
        return this.count;
    }
}
