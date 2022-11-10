
import javax.swing.JOptionPane;


public class uso_reproductor {

    public static void main(String[] args) {

        reproductor_CD maquina1 = new reproductor_CD();

        System.out.println("\n\tDatos por defecto de la máquina 1");
        System.out.println("Marca: " + maquina1.getMarca());
        System.out.println("Modelo: " + maquina1.getModelo());
        System.out.println("Año de fabricación: " + maquina1.getAnio());
        System.out.println("Número de pistas: " + maquina1.getNum_pistas());
        System.out.println("Precio: " + maquina1.getPrecio());

        System.out.println("--------------------------------------------------------------");

        reproductor_CD maquina2 = new reproductor_CD();
        maquina2.setMarca("Sony");
        maquina2.setModelo("Jav-8");
        maquina2.setAnio("2022-11-09");
        maquina2.setNum_pistas(4);
        maquina2.setPrecio(35.47);

        System.out.println("\n\tDatos de la máquina 2");
        System.out.println("Marca: " + maquina2.getMarca());
        System.out.println("Modelo: " + maquina2.getModelo());
        System.out.println("Año de fabricación: " + maquina2.getAnio());
        System.out.println("Número de pistas: " + maquina2.getNum_pistas());
        System.out.println("Precio: " + maquina2.getPrecio());

        System.out.println("--------------------------------------------------------------");

        reproductor_CD maquina3 = new reproductor_CD();
        System.out.println("\nIngrese los datos de su máquina custom shop\n");

        String marca_aux = JOptionPane.showInputDialog("Ingrese su marca: ");
        String modelo_aux = JOptionPane.showInputDialog("Ingrese el modelo: ");
        String anio_aux = JOptionPane.showInputDialog("Ingrese el año de fabricación (aaaa-mm-dd): ");
        int numPistas_aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pistas: "));
        double precio_aux = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
        maquina3.setMarca(marca_aux);
        maquina3.setModelo(modelo_aux);
        maquina3.setAnio(anio_aux);
        maquina3.setNum_pistas(numPistas_aux);
        maquina3.setPrecio(precio_aux);

        System.out.println("\n\tDatos de la máquina 3");
        System.out.println("Marca: " + maquina3.getMarca());
        System.out.println("Modelo: " + maquina3.getModelo());
        System.out.println("Año de fabricación: " + maquina3.getAnio());
        System.out.println("Número de pistas: " + maquina3.getNum_pistas());
        System.out.println("Precio: " + maquina3.getPrecio());
    }//FIN DEL MÉTODO DE MAIN

}//FIN DE LA CLASE USO_REPRODUCTOR
