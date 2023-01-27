/* Транспортные средства могут быть классифицированы 
в зависимости от того, какой источник энергии их питает. 
Данная вам программа имеет 3 класса транспортных 
средств: транспортное средство, электромобиль и 
гибридное транспортное средство.

Классы ElectricVehicle и HybridVehicle наследуются 
от класса Vehicle.

Завершите программу, переопределив метод resource() 
в унаследованных классах, чтобы данные вызовы работали 
правильно.

Подкласс может реализовать метод родительского 
класса на основе его требований.

*/

class Main {
   public static void main(String[] args) {
       
       Vehicle vehicle = new Vehicle();
       Vehicle electric = new ElectricVehicle();
       Vehicle hybrid = new HybridVehicle();
       
       //calls
       vehicle.start();
       vehicle.resource();

       electric.start();
       electric.resource();
       
       hybrid.start();
       hybrid.resource();
   }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}
class ElectricVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use electricity");
    }
}
class HybridVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use both petrol and electricity");
    }
}