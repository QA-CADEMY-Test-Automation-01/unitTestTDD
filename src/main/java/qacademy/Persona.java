package qacademy;

public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAge() {
        return age;
    }

    private String apellido;
    private int age;


    public Persona(String nombre, String apellido) {
        this.nombre = StringUtils.capitalizeWord(nombre);
        this.apellido = StringUtils.capitalizeWord(apellido);
    }

    public Persona(String nombre, String apellido, int age) {
        this(nombre, apellido);
        this.age = age;
    }


    public String getFullName() {

        return "".concat(nombre).concat(" ").concat(apellido);
    }


    public String getPersonJson() {
        return String.format("{\"Name\":\"%s\",\"Apellido\":\"%s\",\"Full Name\":\"%s\",\"Age\":\"%s\"}", this.getNombre(), this.getApellido(), this.getFullName(), String.valueOf(this.getAge()));
    }
}
