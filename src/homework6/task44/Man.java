package homework6.task44;

import homework6.task44.HummerNail;

public class Man {
    public void hangPicture(HummerNail hummerNail) {
        try {
            System.out.println();
            System.out.println("Нужно повесить картину");
            System.out.println("Нашёл инструменты " + hummerNail.name);
            System.out.println("Повесил картину");

        } catch (NullPointerException e) {
            System.out.println("Ничего не нашёл");
           // System.out.println("Значение поля name - null");// - здесь описание исключения, но без него лучше))

        } finally {
            System.out.println("Лёг на диван. " + (hummerNail == null ?
                    "Надо будет завтра попросить молоток у Петровича" : " Я молодец, заслужил пиво"));
        }

    }
}
