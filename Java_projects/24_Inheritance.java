/* Вы разрабатываете свое собственное приложение 
для редактирования фотографий.
Стандартная бесплатная версия позволяет рисовать 
и писать текст на фотографии. Подписка Pro имеет 
еще 2 функции - возможность использовать эффекты 
и возможность изменять разрешение.

Завершите / исправьте данный код, чтобы 
наследовать класс Pro от стандартного класса 
и успешно выполнить все вызовы данного метода.

Будьте внимательны к модификаторам доступа.
*/

//be attentive to access modifiers
class Standard {
    public void draw() {
        System.out.println("Drawing");
    }

    public void write() {
        System.out.println("Writing");
    }
}
//fix the class
class Pro extends Standard {


    protected void useEffects() {
        System.out.println("Using Effects");
    }

    protected void changeResolution() {
        System.out.println("Changing Resolution");
    }
}

public class Main {
    public static void main(String[] args) {
        Standard standard1 = new Standard();
        Pro pro = new Pro();
       
        //standard version
        standard1.draw();
        standard1.write();
       
        //Pro version
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();
    }
}
