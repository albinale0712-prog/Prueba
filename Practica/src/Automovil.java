import javax.swing.*;

public class Automovil {

    private int id;
    private String marca;
    private String modelo;
    private double precio;
    private String tipoTransmision;

    // Constructor vacío
    public Automovil() {
    }

    // Constructor con parámetros
    public Automovil(int id, String marca, String modelo,
                     double precio, String tipoTransmision) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoTransmision = tipoTransmision;
    }

    public void ingresarAutomovil(Automovil autos[], int pos) {
        if (pos >= autos.length) {
            System.out.println("Vector lleno");
            return;
        }
        setId(Integer.parseInt(JOptionPane.showInputDialog("Digite el ID")));
        setMarca(JOptionPane.showInputDialog("Digite la marca"));
        setModelo(JOptionPane.showInputDialog("Digite el modelo")); // CORREGIDO
        setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio")));
        setTipoTransmision(JOptionPane.showInputDialog("Digite el tipo de transmisión"));
        autos[pos] = new Automovil(getId(), getMarca(), getModelo(), getPrecio(), getTipoTransmision());
    }

    public void ordenarAutos(Automovil autos[], int contador) {
        for (int i = 0; i < contador; i++) {
            for (int j = i + 1; j < contador; j++) {
                if (autos[i].getPrecio() < autos[j].getPrecio()) {
                    Automovil temp = autos[i];
                    autos[i] = autos[j];
                    autos[j] = temp; // CORREGIDO: antes era autos[i] = temp
                }
            }
        }
        System.out.println("Vector ordenado correctamente"); // CORREGIDO: temp no existe aquí
    }

    public int posicionMasCaro(Automovil autos[], int contador) {
        if (contador == 0) {
            return -1;
        }

        int posicion = 0;
        double mayor = autos[0].getPrecio();

        for (int i = 1; i < contador; i++) {
            if (autos[i].getPrecio() > mayor) {
                mayor = autos[i].getPrecio();
                posicion = i;
            }
        }

        return posicion; // CORREGIDO: antes era return i;
    }

    public void imprimirAutos(Automovil autos[], int contador) {
        if (contador == 0) {
            System.out.println("No hay automóviles registrados");
            return;
        }

        for (int i = 0; i < contador; i++) {
            System.out.println("ID: " + autos[i].getId());
            System.out.println("Marca: " + autos[i].getMarca()); // CORREGIDO: sin \n extra
            System.out.println("Modelo: " + autos[i].getModelo()); // CORREGIDO: sin \n extra
            System.out.println("Precio: ₡" + autos[i].getPrecio());
            System.out.println("Transmisión: " + autos[i].getTipoTransmision());
            System.out.println("----------------------\n");
        }
    }

    public void imprimirMayores35000000(Automovil autos[], int contador) {
        boolean enc = false;

        for (int i = 0; i < contador; i++) {
            if (autos[i].getPrecio() > 35000000) { // CORREGIDO: autos[i] en lugar de autos
                System.out.println("ID: " + autos[i].getId());
                System.out.println("Marca: " + autos[i].getMarca());
                System.out.println("Modelo: " + autos[i].getModelo());
                System.out.println("Precio: ₡" + autos[i].getPrecio());
                System.out.println("Transmisión: " + autos[i].getTipoTransmision());
                System.out.println("----------------------\n");
                enc = true;
            }
        }

        if (!enc) {
            System.out.println("No existen automóviles con precio mayor a ₡35.000.000");
        }
    }

    // GET Y SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
}