
public abstract class Node {
	 abstract int height();
	 
	 
    public static final Node NULL = new Node(){
    	public int height (){return 0;}
    };        

}
