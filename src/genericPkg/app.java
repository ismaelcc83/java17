package genericPkg;

import java.io.IOException;
import java.util.HashSet;

class app{
	
	 public static void main(String[] args) throws IOException {
		 Integer[] i1 = new Integer[2]; i1[0] = 1; i1[1] = 1;
		 Integer[] i2 = new Integer[2]; i2[0] = 1; i2[1] = 1;
		 Integer[] i3 = new Integer[2]; i3[0] = 0; i3[1] = 0;

		 IntegerArraySet ias = new IntegerArraySet();
		 
		 ias.add(i1);
	     ias.add(i2);
         ias.add(i3);
		 
		 for (Integer[] s : ias) {
		    System.out.print(s[0]);
		    System.out.print(",");
		    System.out.println(s[1]);
		}

	 }
}
