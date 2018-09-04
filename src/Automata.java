import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Automata {
	int i;
	char[] cadena;
	boolean acepta;
	private BufferedReader br;
	
	public void recorreArchivo() throws IOException{
		String linea;
		String pal;
		
		br = new BufferedReader (new FileReader("/home/karen/Desktop/vocales.txt"));
		
		//Se recorre el archivo linea por linea
		String temp = null;
		String bfRead;
		while((bfRead = br.readLine())!=null){
		//haz el ciclo, mientras bfRead tiene datos
		temp = temp + bfRead + "\n";
		}
		linea = temp;
		
	        StringTokenizer st = new StringTokenizer (linea);
	 
	      //Se analiza token por toquen y se envia a analizaCadena()
	      // bucle por todas las palabras
	        while (st.hasMoreTokens())
	        {
	            pal = st.nextToken();
	            eQ0(pal);
	        }
		
	}
	
	public void llenarArray() {
		
	}
	
	public void eQ0(String c) {
		
		cadena=c.toCharArray();
		
		acepta= false;
		i=0;
		System.out.println("Entro");
		if(i<cadena.length) {
			if(cadena[i]=='a'||cadena[i]=='A') {
				i++;
				eQ1();
				
			}
			
			else {
				i++;
			}
			
		}
		
		if(i==cadena.length) {
			System.out.println("Error");
		}
		
	}
	
	public void eQ1() {
		acepta= false;
		if(i<cadena.length) {
			if(cadena[i]=='e') {
				i++;
				eQ2();
			}
			else {
				i++;
			}
			
			
			
		}
		
	}
	
	public void eQ2() {
		acepta= false;
		if(i<cadena.length) {
			if(cadena[i]=='i') {
				i++;
				eQ3();
			}
			
			else{
				i++;
			}
			
		}
		
	}
	
	public void eQ3() {
		if(i<cadena.length) {
			
			if(cadena[i]=='o') {
				i++;
				eQ4();
			}
			
			else {
				i++;
			}
			
			
		}
		acepta= false;
		
	}
	
	public void eQ4() {
		acepta= false;
		if(i<cadena.length) {
			
			if(cadena[i]=='u') {
				eQ5();
			}
			
			else {
				i++;
			
				try {
					if(i>cadena.length) {
						
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
		
	}
	
	public void eQ5() {
		acepta= true;
		eFinal();
		
	}
	
	public void eFinal() {
		if(acepta==true) {
			
			System.out.print("Cadena Valida: ");
			System.out.println(cadena);
		}
	}
	
	
	
}
