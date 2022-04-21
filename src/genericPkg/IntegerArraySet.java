package genericPkg;

import java.io.IOException;
import java.util.HashSet;

//Implementación de un Set donde sus elementos son Integer[]
public class IntegerArraySet extends HashSet<Integer[]> {
		
	private static final long serialVersionUID = 5210441881235565345L;

	public static void execute() throws IOException {
		Integer[] i1 = new Integer[2];
		Integer[] i2 = new Integer[2];
		Integer[] i3 = new Integer[2];
		i1[0] = 1; i1[1] = 1;
		i2[0] = 1; i2[1] = 1; //el elemento i2 es igual que i1
		i3[0] = 0; i3[1] = 0;
			 
		IntegerArraySet ias = new IntegerArraySet();			 
		ias.add(i1);
		ias.add(i2); //como ya existe un elemento igual no se añade
		ias.add(i3);
			 
		for (Integer[] s : ias) {
			System.out.print(s[0]);
			System.out.print(",");
			System.out.println(s[1]);
		}
	}
	
	//Reescribimos la función add para que no pueda haber repetidos
	public boolean add(Integer[] o) {
		boolean exists = false;
		for(Object i : super.toArray()) {
			Integer[] iasI = (Integer[])i;
			boolean iaE = true;
			for(int j=0;j<iasI.length;j++) {
				if(iasI[j].equals(o[j])) {
					iaE = iaE && true;
				} else {
					iaE = iaE && false;
				}
			}
			if(iaE) {
				exists = true;
			}
		}
		if(!exists) return super.add(o);
		else return false;
	}	

 }