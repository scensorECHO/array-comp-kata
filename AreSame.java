import java.util.*;

public class AreSame {
	
  public static boolean comp(int[] a, int[] b) {
    if(a.length != b.length)
      return false;
    LinkedList<Integer> listB = new LinkedList<>(Arrays.asList(b));
    for(int i=0;i<a.length;i++){
      ListIterator<Integer> iter = listB.listIterator();
      while(iter.hasNext()){
        if(iter.next()==a[i]){
          iter.remove();
          break;
        }
        return false;   
      }
    }
    return true;
    
  }
}
