abstract class Flower{
    protected String name;
    protected double price;
    protected int fresh;
     Flower(String name,double price,int fresh){
         this.name=name;
         this.price=price;
         this.fresh=fresh;
     }
     public double getPrice{
         return price;
    }
    public String getName(){
         return name;
    }
    public int getFresh(){
         return fresh;
    }
}