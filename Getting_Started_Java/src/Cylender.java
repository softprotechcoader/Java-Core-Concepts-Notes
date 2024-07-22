class Cylender {

     private double height;
    private double radious;


//    Cylender(double height,double radious){
//        this.height=height;
//        this.radious=radious;
//    }



    private double surfaceArea() {
        double sa = 2 * 3.14 * this.radious * this.height;
        return sa;
    }

    private double volume() {
        return 2 * 3.14 * this.radious * this.radious * this.height;
    }

    public void setheightRadius(double height,double radious){
        this.height=height;
        this.radious=radious;
    }

    public void getheightRadius(){
        System.out.println("Height: "+height +"\nRadious: "+radious);
    }

}
