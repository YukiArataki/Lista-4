public class Ponto {
    
    private double x;
    private double y;

    public Ponto() { 
        
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double distancia = Math.sqrt(Math.pow((this.x - outroPonto.x), 2) + Math.pow((this.y - outroPonto.y), 2));
        return distancia;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
    
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre ponto1 e ponto2: " + distanciaPonto1Ponto2);

        Ponto ponto3 = new Ponto(7, 2);
        double distanciaPonto2Coordenadas = ponto2.calcularDistancia(ponto3);
        System.out.println("Distância entre ponto2 e as coordenadas (7,2): " + distanciaPonto2Coordenadas);

        ponto1.setX(10);
        ponto1.setY(3);

        distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Nova distância entre ponto1 e ponto2: " + distanciaPonto1Ponto2);
    }
}