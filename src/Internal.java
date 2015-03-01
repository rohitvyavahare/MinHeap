
public class Internal extends Node{

	private Node left , right;
    private String data;
    
    
  
    public Internal(String newData)
    {
        left =  NULL;
        right = NULL;
        data = newData;
    }


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public void setLeft(Internal left) {
		this.left = left;
	}


	public void setRight(Internal right) {
		this.right = right;
	}


	public Internal getLeft() {
		return left;
	}


	public Internal getRight() {
		return right;
	}
	
	public int height() {
		
		int leftHeight = left != null ? left.height() : 0;
		int rightHeight = right != null ? right.height() : 0;
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	private String swap(String newData)
	{
		
		String prevData = data;
		data = newData;
		return newData = prevData;

	} 

	
	public void addToLeft(String newData) {
		
		int currentLeftHeight, currentRightHeight;
		
		if(left == null)
	    	left = new Internal(newData);
		
		else{
			
			if(left.data.compareTo(newData) >= 0)
				newData = left.swap(newData);
			
			if(left.left == null)
			{
				left.left = new Internal(newData);
				return ;
			}
			else if(left.left != null && left.right == null)
			{
				left.right = new Internal (newData);
				return ;
			}
			else if( left.right != null )
			{
				currentRightHeight = left.right.height();
				currentLeftHeight = left.left.height();
				
				if(currentLeftHeight <= currentRightHeight)
					left.addToLeft(newData);
				else
					right.addToRight(newData);
			}
			
				}
	}
	
	public void addToRight(String newData){
		int  currentLeftHeight, currentRightHeight;
		
		if(right == null)
	    	right = new Internal(newData);
		else{
				
		if(right.data.compareTo(newData) >= 0)
				newData = right.swap(newData);
		if(right.left == null)
		{
			right.left = new Internal(newData);
			return ;
		}
		else if(right.left != null && right.right == null)
		{
			right.right = new Internal (newData);
			return ;
		}
		else if( right.right != null )
		{
			currentRightHeight = right.height();
			currentLeftHeight = left.height();
			
			if(currentLeftHeight <= currentRightHeight)
				right.addToLeft(newData);
			else
				right.addToRight(newData);
		}
	}
	}
	
	public boolean isLeaf()
	{
		 if(left == null && right == null)
			 return true;
		 return false;
	}
}

