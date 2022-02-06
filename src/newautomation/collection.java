package newautomation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al= new ArrayList();
		al.add("sohan");
		al.add("gjhh");
		al.add("sohan");
		al.add(null);
		System.out.println(al);
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		for(int i=0;i<al.size();i++) 
		{
			System.out.println(al.get(i));
		}
	LinkedList ll= new LinkedList();
	     ll.add("chavan");
	     ll.add("chavan");
	     ll.add(null);
	     ll.add("kumar");
	     System.out.println(ll);
	     Iterator itr1 = ll.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr1.next());
	    
	     }
	              for(int i=0; i<ll.size(); i++) {
	            	  System.out.println(ll.get(i));
	              }
	               Vector v = new Vector();
	               v.add("rhaul");
	               v.add(null);
	               v.add("rahul");
	               System.out.println(v);
	               Iterator itr3= v.iterator();
	               
	               while(itr3.hasNext()) {
	            	   System.out.println(itr3.next());
	               }
	            	   for(int i=0; i<v.size(); i++) {
	            		   System.out.println(v.get(i));
	            	   }
	            	   
	            	   HashSet hs =new HashSet();
	            	   hs.add("dhoni");
	            	   hs.add("ghsjs");
	            	   hs.add("dhoni");
	            	   System.out.println(hs);
	            	  Iterator it=  hs.iterator();
	            	  while(it.hasNext()) 
	            	  {
	            		  System.out.println(it.next());
	            	  }
	            	  PriorityQueue pq=new PriorityQueue();
	            		 pq.add("tiger");
	            		pq.add("tiger");
	            		//pq.add(null);
	            		 System.out.println(pq);
	            		  
	            	Iterator itn= pq.iterator();
	            	while(itn.hasNext()) {
	            		System.out.println(itn.next());
	            	}
	            	
	            	HashMap<Integer,String>hmap=new	HashMap<Integer,String>();
	            	  hmap.put(1, "fggg");
	            	  hmap.put(2, "rty");
	            	  hmap.put(3,"don");
	            	  System.out.println(hmap.get(3));
	            	     for(int a=1; a<=hmap.size(); a++) {
	            	    	 System.out.println(hmap.get(a));
	            	     }
	            	     Hashtable<Integer,String> htable=new  Hashtable<Integer,String>();
	            			htable.put(1, "rushikesh");
	            			htable.put(2, "rushikeshs");
	            			htable.put(3, "jayshri");
	            			System.out.println(htable);
	            			for(int b=1;b<=htable.size();b++) {
	            				System.out.println(htable.get(b));
	            			}
	               
	}
	
	
}