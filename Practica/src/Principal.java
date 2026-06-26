import javax.swing.JOptionPane;

//Ejercicio de investigacion grupo 2 

public class Principal {

    public static void main(String[] args) {

        Automovil autos [] = new Automovil[0];
        int contador = 0
        int opcion=0;

        Automovil obj = new Automovil();
        while (opcion <= 5){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENÚ\n\n"
                            + "1. Ingresar automóvil\n"
                            + "2. Ordenar de mayor a menor precio\n"
                            + "3. Posición del automóvil más caro\n"
                            + "4. Imprimir automóviles\n"
                            + "5. Automóviles mayores a ₡35.000.000\n"
                            + "6. Salir"));

            switch (opcion)
            case 1:
                obj.ingresarAutomovil(autos, contador);
                if (contador < autos.length) {
                    contador++;
                }
                break;

            case 2:
                obj.ordenarAutos(autos, contador);
                break;

            case 3:
                int pos = posicionMasCaro(autos, contador);
                if (pos == -1)
                    System.out.println("No hay automóviles registrados");
                else {
                    System.out.println("La posición del automóvil más caro es: " + pos);
                    System.out.println("El automóvil es: " + autos[pos].getModelo());
                    break;

                    case 4:
                        obj.imprimirAutos(autos, contador);
                        break;

                    case 5:
                        obj.imprimirMayores35000000(autos, contador);
                        break;

                    case 6:
                        System.out.println("Fin del programa");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }
        } //cierra while
    }
}