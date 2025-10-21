import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

void main()
{
    //PUNTO 1
    /*
    Persona p1 = new Persona("Ciro", 19, 47559600, 'm');
    Persona p2 = new Persona("Juan", 18, 48332929, 'm');
    Persona p3 = new Persona("Zoe", 20, 45689338, 'f');


    JSONObject objeto1 = p1.toJson();
    JSONObject objeto2 = p2.toJson();
    JSONObject objeto3 = p3.toJson();

    JSONArray arrayDeJson = new JSONArray();

    arrayDeJson.put(objeto1);
    arrayDeJson.put(objeto2);
    arrayDeJson.put(objeto3);

    JsonUtiles.grabarUnJson(arrayDeJson, "persona.json");
    */

    //PUNTO 2
    /*
    JSONArray arregloo = new JSONArray(JsonUtiles.leerUnJson("persona.json"));

    for (int i = 0; i < arregloo.length(); i++)
    {
        System.out.println("\n" + arregloo.get(i).toString());
    }
    //System.out.println(arregloo); otra forma
    */

    // PUNTO 3
    /*
    Curso c1 = new Curso("Comision 1", "1");

    c1.agregarPersona(p1);
    c1.agregarPersona(p2);
    c1.agregarPersona(p3);

    JSONObject objectoClase = c1.toJson();


    JSONArray arregloJson = new JSONArray();

    arregloJson.put(objectoClase);

    JsonUtiles.grabarUnJson(arregloJson, "curso.json");


    //LECTURA

    JSONArray arregloDelCurso = new JSONArray(JsonUtiles.leerUnJson("curso.json"));

    System.out.println(arregloDelCurso);

     */

    //PUNTO 4
    Biblioteca biblioteca1 = new Biblioteca("Biblioteca UTN");

    biblioteca1.agregarLibro("Barcos");
    biblioteca1.agregarLibro("Python");
    biblioteca1.agregarLibro("Java");
    biblioteca1.agregarLibro("Programacion");

    JSONObject objeto = biblioteca1.toJson();

    JSONArray array = new JSONArray();

    array.put(objeto);

    JsonUtiles.grabarUnJson(array, "biblioteca.json");

    //LEER

    JSONArray array2 = new JSONArray(JsonUtiles.leerUnJson("biblioteca.json"));

    System.out.println(array2);
}
