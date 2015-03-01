
public class MinHeap {
	private Internal root;
	

		/**
	   * This method inputs a node and string .
	   * @return The value newData as a String.
	   * It swaps the node data with input data and returns newData
	   */
	
	private String swap(Internal node, String data)
	{
		
		String newData = node.getData();;
		node.setData(data);
		return newData;

	} 
	
	/**
	   * This method inputs data string .
	   * It insert the node data at appropriate location 
	   * calculating height of left and right child.
	   */
	
	public void insert(String newData)
	{
	 
	    int currentLeftHeight, currentRightHeight;
	 
	    	
	    if(root == null)
	    	root = new Internal(newData);

	    else
	    {
	    		
	    	if(root.getData().compareTo(newData) >= 0)
	    		newData = swap(root, newData);			  	
			
			currentRightHeight = root.getRight()!= null ? root.getRight().height(): -1;
			currentLeftHeight = root.getLeft()!= null ? root.getLeft().height() : -1;
				
			if(currentLeftHeight <= currentRightHeight )
			{
			  root.addToLeft(newData);
			 
			}
		
			else
			{
              root.addToRight(newData);
             
			}
		 }	        
	}
	/**
	   * This method used to make string containing preorder traversal
	   * ending with ing only.  
	   * @return The value as a String.
	   */
	   public String printOnlyIng()
	   {
		    String printString = new String();			 
			printString=printOnlyIng(root, printString);
		    return printString;
	
	   }
	   
	   public String toString() 
	   {
			String printString = new String();			 
			printString=toString(root, printString);
		    return printString;
	   }
		
	   
	   /**
		   * This method used to make string containing preorder traversal
		   * of all elements.  
		   * @return The value as a String.
		   */
	   private String toString(Internal root,String printString) 
	    {
			  if(root == null) return printString;
			  
			  printString = printString.concat(root.getData());
			  System.out.println(printString);
			  printString = toString(root.getLeft(),printString);
			  printString = toString(root.getRight(),printString);
			  
			  return printString;
	    }
        
        private String printOnlyIng(Internal root,String printString) 
    	{
    			if(root == null) return printString;

    			if (root.getData().endsWith("ing") == true)
    			  printString = printString.concat(root.getData());
    			
    			printString = printOnlyIng(root.getLeft(),printString);
    			printString = printOnlyIng(root.getRight(),printString);
    			
    			return printString;
    	}

        
     }
		  
