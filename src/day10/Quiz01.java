package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		for(int i=0; i<6;i++) {
			int lotto = (int)(Math.random()*44)+1;
			set.add(lotto);
			
			}
		if(set.size()<6) {
			int lotto2 = (int)(Math.random()*44)+1;
			set.add(lotto2);
			
			if(set.size()<6) {
				int lotto3 = (int)(Math.random()*44)+1;
				set.add(lotto3);
				
			}
		}
		Iterator it = set.iterator();
		 
			List list = new ArrayList();
			while(it.hasNext()) {
				list.add(it.next());
			}
			Collections.sort(list);
			System.out.println(list);
		
	}

}
