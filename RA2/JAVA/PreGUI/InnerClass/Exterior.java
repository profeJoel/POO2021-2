package InnerClass;

public class Exterior{ //Outer Class
    public String descripcion;

    //InnerClass
    class Coordenada{
        public int x;
        public int y;

        public Coordenada(int a, int b){
            this.x = a;
            this.y = b;
        }
    }

    public Exterior(String descripcion){
        this.descripcion = descripcion;
    }
}