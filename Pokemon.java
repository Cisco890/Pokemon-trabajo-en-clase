public abstract class Pokemon{
protected String nombre;
protected int gen; //número de generación
protected int id;
protected String tipo;

public Pokemon( String nombre, int gen, int id, String tipo){
        this.nombre = nombre;
        this.gen = gen;
        this.id = id; 
        this.tipo = tipo;
}

    public abstract void morder();
    //     System.out.println(this.nombre + "ha mordido");
    //     }


    public abstract void arañar();
    //     System.out.println(this.nombre + "ha arañado");
    //     }

    public void imprimirInformacion(){
        System.out.println("Nombre" + this.nombre);
        System.out.println("Gen" + this.gen);
        System.out.println("ID" + this.id);
        System.out.println("Tipo" + this.tipo);
    }

    

}