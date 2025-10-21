import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Curso implements ToJson
{
    private String nombreCurso;
    private String codigo;
    private final ArrayList<Persona> personas;

    public Curso(String nombreCurso, String codigo)
    {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.personas = new ArrayList<>();
    }

    public String getNombreCurso()
    {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso)
    {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public ArrayList<Persona> getPersonas()
    {
        return personas;
    }

    public void agregarPersona(Persona p)
    {
        personas.add(p);
    }

    public void eliminarPersona(Persona p)
    {
        personas.remove(p);
    }

    @Override
    public JSONObject toJson()
    {
        JSONObject object = new JSONObject();
        JSONArray arrayPersonas = new JSONArray();

        object.put("nombreCurso", nombreCurso);
        object.put("codigo", codigo);

        for (Persona p : personas)
        {
            JSONObject objeto = p.toJson();
            arrayPersonas.put(objeto);
        }

        object.put("personas", arrayPersonas);

        return object;
    }
}
