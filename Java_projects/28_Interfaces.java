/* Вы любите всех животных, и у вас есть собака и 
кошка в качестве домашних животных.
Данная вам программа определяет абстрактный класс 
Animal и имеет унаследованные от него классы Dog и Cat.
Реализуйте интерфейс Swimmer и Player и переопределите 
их методы swim() и play(), чтобы вызовы данного метода 
выводили следующие сообщения:

swim():
Dog => "Dog is swimming"
Cat => "Cat is swimming"
play():
Dog => "Dog is playing"
Cat => "Cat is playing"

Вы можете реализовать несколько интерфейсов - написав 
их имена попеременно через запятую.
Реализуйте интерфейсы Swimmer и Player только для 
класса Animal, затем переопределите методы swim() 
и play() в унаследованных классах.
*/

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.swim();
        dog.play();
        cat.swim();
        cat.play();
 
    }
 }
 
 interface Swimmer {
    void swim();
 }
 
 interface Player {
    void play();
 }
 
 abstract class Animal {
    abstract void swim();
    abstract void play();
 }
 
 class Dog extends Animal {
    void swim() {
       System.out.println("Dog is swimming");
    }
    void play() {
       System.out.println("Dog is playing");
    }
 }
 
 class Cat extends Animal {
  void swim() {
       System.out.println("Cat is swimming");
    }
    void play() {
       System.out.println("Cat is playing");
    }
 }