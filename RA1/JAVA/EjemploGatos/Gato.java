package EjemploGatos;

public class Gato{
    //Atributos
    private String name;
    private String sex;
    private int age;
    private int weight;
    private String color;
    private String texture;

    //Métodos
    //Constructor
    //public Gato(){}
    public Gato(String name, String sex, int age, int weight, String color, String texture){
        //clausula "this", indica que la variable es un atributo del objeto
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    public String darInformacion(){
        return "Información Gato:\n\tname: " + this.name + "\n\tsex: " + this.sex + "\n\tage: " + this.age + "\n\tweight: " + this.weight + "\n\tcolor: " + this.color + "\n\ttexture: " + this.texture;
    }

    public void addAge(){
        this.age++;
    }

    public void changeColor(String newColor){
        String[] colores = {"blanco", "marrón", "gris", "bicolor", "rojizo", "rubio"};
        boolean aceptedColor = false;
        for(String color: colores){
            if(newColor.equals(color))
                aceptedColor = true;
        }
        if(aceptedColor)
            this.color = newColor;
        else
            System.out.println("El color no es aceptado");
    }
}