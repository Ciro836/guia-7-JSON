import org.json.JSONObject;

public class Persona implements ToJson
{
    private String nombre;
    private int edad;
    private int dni;
    private Character sexo;

    public Persona(String nombre, int edad, int dni, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getDni()
    {
        return dni;
    }

    public void setDni(int dni)
    {
        this.dni = dni;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    @Override
    public JSONObject toJson()
    {
        JSONObject objeto = new JSONObject();

        objeto.put("nombre", nombre);
        objeto.put("edad", edad);
        objeto.put("dni", dni);
        objeto.put("sexo", sexo);

        return objeto;
    }
}
