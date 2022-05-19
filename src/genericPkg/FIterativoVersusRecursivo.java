package genericPkg;

import java.io.IOException;

//Implementación del mismo algoritmo de forma iterativa versus recursiva
public class FIterativoVersusRecursivo{
	
	 public static void execute() throws IOException {
		 
		 String[] arr = {"s","a","m","e","t","h","i","n","g"};
		 
		 System.out.print("ITERATION -> ");
   		 String strIte = printIteration(arr);
   		 System.out.println("");
   		 
   		 System.out.print("RECURSIVE -> ");
		 String strRec = printRecursive(arr,0);
		 System.out.println("");
		 
		 System.out.println("stringIteration -> "+strIte.replaceAll("\\s+",""));
		 System.out.println("stringRecursive -> "+strRec.replaceAll("\\s+",""));		 
	 }
	 
	 public static String printIteration(String[] arr) {		 
		 String strout = "";
		 for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i] + "-");
		    strout += arr[i] + "+";
		 }
		 return strout;
	 }
	 
	 public static String printRecursive(String[] arr, int i) {		 
		 String strOut = "";
		 if(i<arr.length) {
			System.out.print(arr[i] + "-");
			strOut += arr[i] + "+" + printRecursive(arr,i+1);
		 }
		return strOut;
	 }
}
