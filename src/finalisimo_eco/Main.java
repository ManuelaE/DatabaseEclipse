package finalisimo_eco;

import java.io.IOException;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		try {
			String url = "https://ecofinal-349b8.firebaseio.com/";

			String reference = url + "usuarios.json";

			Estudiante manuela = new Estudiante("12345", "bmmu", "12345678", "domi@gmail.com");
			Gson g = new Gson();
			String json = g.toJson(manuela);

			//post /push -  crea una rama aleatoria
			//String rama = WEBUtilDomi.JsonByPOSTrequest(reference, json);
			//System.out.println(rama);
			
			
			WEBUtilDomi.PUTrequest(reference, json);
			
			String respuesta = WEBUtilDomi.GETrequest(reference);
			System.out.println(respuesta);
			
			//string = claves y estudiante = valores
			//para leer una lista
			Type tipo = new TypeToken<  HashMap<String, Estudiante>  >() {
			}.getType();
			
			HashMap<String, Estudiante> lista = g.fromJson(respuesta, tipo);
			//System.out.println(lista.size());
			System.out.println(lista.get("-LRxrVTeEbK5JXxjsQga").getNombre());
			
			//como iterar en un hashmap
			for (String key : lista.keySet()) {
				Estudiante e = lista.get(key);
				System.out.println(key);
				//System.out.println(e.getNombre());
				
				
			}
			
			
			
			//para leer una vez
			String ac = WEBUtilDomi.GETrequest(url+"admin.json");
			Estudiante Stiven = g.fromJson(ac, Estudiante.class);
			System.out.println(Stiven.getNombre());
			
			WEBUtilDomi.DELETErequest(url+"nfae.json", "");
			WEBUtilDomi.DELETErequest(url+"usuarios/-LRxrVTeEbK5JXxjsQga.json", "");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
