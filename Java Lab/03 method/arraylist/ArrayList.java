import java.util.*;
 
class ArrayList{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Jack");            		
		al.add("Tyler");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
