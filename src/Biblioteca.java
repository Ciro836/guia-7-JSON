import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Biblioteca implements ToJson
{
    private String nombreBiblioteca;
    private final ArrayList<String> libros;

    public Biblioteca(String nombreBiblioteca)
    {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new ArrayList<>();
    }

    public String getNombreBiblioteca()
    {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca)
    {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public ArrayList<String> getLibros()
    {
        return libros;
    }

    public void agregarLibro(String libro)
    {
        libros.add(libro);
    }

    public void eliminarLibro(String libro)
    {
        libros.remove(libro);
    }

    @Override
    public JSONObject toJson()
    {
        JSONObject objeto = new JSONObject();
        JSONArray ArregloLibros = new JSONArray();

        objeto.put("nombreBiblioteca", nombreBiblioteca);

        for (int i = 0; i < libros.size(); i++)
        {
            JSONObject librito = new JSONObject();
            librito.put("libro numero: " + i, libros.get(i));
            ArregloLibros.put(librito);
        }

        objeto.put("libros", ArregloLibros);

        return objeto;
    }
}
