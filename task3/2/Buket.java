import java.util.arraylist;
import java.util.List;
class Buket{
    private List<Flower> flowers = new ArrayList();

    public void addFlower(flower f){
        flowers.add(f);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(int i=0;i<flowers.size();i++){
            totalPrice = totalPrice + (flowers.get(i)).getPrice;
        }
    }
    public void showBuket(){
        for(int i=0;i<flowers.size();i++){
            System.out.println(flowers.get(i));
        }
        System.out.println("Общая стоимость:" + getTotalPrice());
    }
}