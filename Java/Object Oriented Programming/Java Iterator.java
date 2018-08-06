import java.util.*;
public class Main{
	
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){		
		//moving cursor to next element	  
         Object element = it.next(); //assign iterator value to element
		 
		 //instanceof is a keyword that is used for checking if a reference variable is containing a given type 
		 //of object reference or not.
         if(element instanceof String)//Hints: use instanceof operator
		 //checking to see if element is of type String class
		 
		 	break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}
