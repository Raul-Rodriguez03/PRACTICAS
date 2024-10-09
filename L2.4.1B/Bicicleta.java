public class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    // Getters y Setters
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public void mostrarInfo() {
        System.out.println("Bicicleta con cuadro de material: " + cuadro.getMaterial() + ", color: " + cuadro.getColor() + ", tamano: " + cuadro.getTamano());
        System.out.println("Rueda delantera de tamano: " + ruedaDelantera.getTamano() + ", tipo: " + ruedaDelantera.getTipo() + ", material: " + ruedaDelantera.getMaterial());
        System.out.println("Rueda trasera de tamano: " + ruedaTrasera.getTamano() + ", tipo: " + ruedaTrasera.getTipo() + ", material: " + ruedaTrasera.getMaterial());
    }

    public class Rueda {
        private int tamano;
        private String tipo;
        private String material;

        // Constructor
        public Rueda(int tamano, String tipo, String material) {
            this.tamano = tamano;
            this.tipo = tipo;
            this.material = material;
        }

        // Getters y Setters
        public int getTamano() {
            return tamano;
        }

        public void setTamano(int tamano) {
            this.tamano = tamano;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }

    public class Cuadro {
        private String material;
        private String color;
        private double tamano;

        // Constructor
        public Cuadro(String material, String color, double tamano) {
            this.material = material;
            this.color = color;
            this.tamano = tamano;
        }

        // Getters y Setters
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getTamano() {
            return tamano;
        }

        public void setTamano(double tamano) {
            this.tamano = tamano;
        }
    }
}
