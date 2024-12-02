public class Rectangle {
    private double longeur;
    private  double largeur;

    public  Rectangle(double longeur, double largeur){
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double calculeAire(){
        return longeur*largeur;
    }

    public double calculePerimetre(){
        return (longeur+largeur)*2;
    }

    public  void displayResultat(){
        System.out.println("Aire = "+calculeAire());
        System.out.println("Perimetre = "+calculePerimetre());
    }
}
