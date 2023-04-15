
package Lab01;
public class Estudiante {
    
    String nombre;
    double promedio;
    int eva1, eva2, eva3;

    public Estudiante(String nombre, double promedio, int eva1, int eva2, int eva3) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.eva1 = eva1;
        this.eva2 = eva2;
        this.eva3 = eva3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getEva1() {
        return eva1;
    }

    public void setEva1(int eva1) {
        this.eva1 = eva1;
    }

    public int getEva2() {
        return eva2;
    }

    public void setEva2(int eva2) {
        this.eva2 = eva2;
    }

    public int getEva3() {
        return eva3;
    }

    public void setEva3(int eva3) {
        this.eva3 = eva3;
    }
    
     

    
}
