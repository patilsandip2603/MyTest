package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArraysListDemo {

	public static void main(String[] args) 
	{
	  
		 List<String> lists = new ArrayList<String>();
		 
		 lists.add("Manas");
		 lists.add("Sandip");
		 lists.add("Patil");
		 lists.add("kasoda");
		 
		/* 
		 for(String listss : lists )
		 {
			 System.out.println(listss);
			 
		 }  */
		 
		 for(int i = 0;i<lists.size();i++)
		 {
			 
			 System.out.print("Element added at --> " + i + " : " );
			 System.out.println(lists.get(i));
		 }
		 
	/*	 System.out.println(lists.size());
		 System.out.println("Element added at 0 : " +lists.get(0));
		 System.out.println("Element added at 1 : " +lists.get(1));
		 System.out.println("Element added at 2 : " +lists.get(2));
		 System.out.println("Element added at 3 : " +lists.get(3));*/
		 
		     	
	}

}
