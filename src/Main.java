import org.json.JSONArray;
import org.json.JSONObject;

void main()
{
    //PUNTO 1
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

    //PUNTO 2
    

}
