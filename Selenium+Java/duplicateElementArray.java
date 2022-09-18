package takeScreenshot;

public class duplicateElementArray {
	
	/*
	 * Find duplicate words in array.
	 */
	public  void duplicate() {
    String arr[]=new String[] {"w","ww","aa","w","aa"};
	
		 
		 for(int i=0;i<arr.length;i++) {
			
			  for(int j=i+1;j<arr.length;j++) {
				  if(arr[i].equals(arr[j])) {
					  System.out.println("Duplicate element is= "+arr[i]);
					  break;
				  }
				  
			  }
			 
		 }
		
	}
	
	/*
	 * Find duplicate character in String.
	 */
	public  void duplicateCharacter() {
		int count;
	    String str="asascdaa";
	    String arr[]=str.split("");
	    for(int i=0;i<arr.length;i++) {
	    	count=1;
	    	for (int j=i+1;j<arr.length;j++) {
	    		if(arr[i].equals(arr[j])) {
	    			count++;
	    			arr[j]="0";
	    		}
	    		}
	    	if(count>1 && arr[i] !="0") {
	    		System.out.println("duplicate characters is = "+arr[i] + " duplicate count = "+count);
    			
	    	}
	    }}
	/*
	 * Find duplicate character in String.
	 */
	  public  void freeway() {
			int count;
		    String str="asascdaa";
		    char[] chr=str.toCharArray();
		   for(int i=0;i<chr.length;i++) {
			   System.out.println(chr[i]);
		   }
			
		}
	  
	public static void main(String[] args) {
		duplicateElementArray duplicateElementArray=new duplicateElementArray();
		duplicateElementArray.duplicate();
		duplicateElementArray.duplicateCharacter();
		duplicateElementArray.freeway();
	}

}
