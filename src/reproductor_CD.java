public class reproductor_CD {

    String marca;
    String modelo;
    String anio;
    int num_pistas;
    double precio;


    /*Constructor*/
    public reproductor_CD(){
        marca = "Panasonic";
        modelo = "Rx5-5";
        anio = "2019-10-03";
        num_pistas = 3;
        precio = 25.48;
    }


    /*Métodos*/

    public void encender(){     }
    public void apagar(){     }
    public void reproducir(){     }
    public void detener(){     }
    public void adelantar(){     }
    public void retroceder(){     }
    public void grabar(){     }


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


    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }


    public int getNum_pistas() {
        return num_pistas;
    }

    public void setNum_pistas(int num_pistas) {
        this.num_pistas = num_pistas;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}//FIN DE REPRODUCTOR_CD
