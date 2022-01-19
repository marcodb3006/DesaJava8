package pracjava8.PracticasJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	
	List<String> listaCadena;
	List<Integer> listaNum1;
	List<Integer> listaNum2;
	List<Integer> listaNum3;
	
		
    public static void main( String[] args ) {
    	App app = new App();
    	app.llenarListas();
    	app.ordenarListasLambdas();
    }
    
    private void llenarListas() {
    	listaCadena = new ArrayList<>();
    	listaCadena.add("Marco");
    	listaCadena.add("Karla");
    	listaCadena.add("Eusebio");
    	listaCadena.add("Rosy");
    	listaCadena.add("Gabriel");
    	
    	
    	Integer[] c1 = {2, 6, 1, 4, 5, 7};	
    	Integer[] c2 = {1, 3, 2, 4};	
    	Integer[] c3 = {-3, -1,-4};
    	
    	listaNum1 = Arrays.asList(c1);
    	listaNum2 = Arrays.asList(c2);
    	listaNum3 = Arrays.asList(c3);
    	
    }
    
    
    private void ordenarListasLambdas() {
    	
    	List<String> listaCadenaOrdenada = listaCadena.stream().sorted((x,y)-> x.compareToIgnoreCase(y)).toList();
    	listaCadenaOrdenada.forEach(System.out::println);
			
		List<Integer> listaNum1ordenada = listaNum1.stream().sorted((x,y)->x.compareTo(y)).toList();
		listaNum1ordenada.forEach(System.out::println);
 
    }
    
}
