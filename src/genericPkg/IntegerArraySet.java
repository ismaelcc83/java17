package genericPkg;

import java.util.HashSet;

public class IntegerArraySet extends HashSet<Integer[]> {
	private static final long serialVersionUID = -8737928301689596882L;

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