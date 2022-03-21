/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica2;

/**
 *
 * @author marco
 */
public class DATA {
    private String CATEGORIA;   
 private String CANTIDAD;

    public DATA(String CATEGORIA, String CANTIDAD) {
        this.CATEGORIA = CATEGORIA;
        this.CANTIDAD = CANTIDAD;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public String getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(String CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
}
}