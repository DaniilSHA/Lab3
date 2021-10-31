public class Main {
    public static void main(String[] args) {

        System.out.println("демонстрация работы односвязного списка".toUpperCase());
        System.out.println();

        System.out.println("Определение, является ли список пустым, или нет " + SinglyLinkedList.isListIsEmpty());
        System.out.println();

//        РАССКОМЕНТИРОВАТЬ (ЗАКОМЕНТИРОВАВ ВСЕ ОСТАЛЬНОЕ) ДЛЯ ПРОВЕРКИ ВНЕСЕНИЯ И УДАЛЕНИЯ ЭЛЕМЕНТОВ ИЗ СПИСКА + ФУНКЦИИ ПРОВЕРКИ ПУСТОЙ ЛИ СПИСОК
//
//        SinglyLinkedList.addElementInEnd(7);
//        SinglyLinkedList.addElementInEnd(8);
//        SinglyLinkedList.addElementInEnd(12);
//
//
//        try {
//            System.out.println("Печать всех значений списка:");
//            SinglyLinkedList.printList();
//            System.out.println();
//            System.out.println();
//        } catch (EmptyListException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        System.out.println("Определение, является ли список пустым, или нет " + SinglyLinkedList.isListIsEmpty());
//        System.out.println();
//
//        try {
//            System.out.println("Извлечение значения из конца списка c его удалением из списка: " + SinglyLinkedList.getDataFromEndWithDelete());
////      System.out.println("Конечное значение списка: " + SinglyLinkedList.getTailElement().getData());
//            System.out.println();
//        } catch (EmptyListException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println("Извлечение значения из конца списка c его удалением из списка: " + SinglyLinkedList.getDataFromEndWithDelete());
////      System.out.println("Конечное значение списка: " + SinglyLinkedList.getTailElement().getData());
//            System.out.println();
//        } catch (EmptyListException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println("Извлечение значения из конца списка c его удалением из списка: " + SinglyLinkedList.getDataFromEndWithDelete());
////      System.out.println("Конечное значение списка: " + SinglyLinkedList.getTailElement().getData());
//            System.out.println();
//        } catch (EmptyListException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Определение, является ли список пустым, или нет " + SinglyLinkedList.isListIsEmpty());
//        System.out.println();


        SinglyLinkedList.addElementInBeginning(7);
        SinglyLinkedList.addElementInBeginning(8);
        SinglyLinkedList.addElementInBeginning(12);
        SinglyLinkedList.addElementInBeginning(-4);
        SinglyLinkedList.addElementInBeginning(188);
        SinglyLinkedList.addElementInBeginning(999);

        try {
            System.out.println("Печать всех значений списка:");
            SinglyLinkedList.printList();
            System.out.println();
            System.out.println();
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Извлечение значения из начала списка без его удаления из списка: " + SinglyLinkedList.getDataFromBeginningWithoutDelete());
        try {
            System.out.println("Печать всех значений списка:");
            SinglyLinkedList.printList();
            System.out.println();
            System.out.println();
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }



        System.out.println("Извлечение значения из начала списка c его удалением из списка: " + SinglyLinkedList.getDataFromBeginningWithDelete());
        try {
            System.out.println("Печать всех значений списка:");
            SinglyLinkedList.printList();
            System.out.println();
            System.out.println();
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Добавление значения 1000 в конец списка:");
        SinglyLinkedList.addElementInEnd(1000);
        try {
            System.out.println("Печать всех значений списка:");
            SinglyLinkedList.printList();
            System.out.println();
            System.out.println();
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Добавление значения 355 в начало списка:");
        SinglyLinkedList.addElementInBeginning(355);
        try {
            System.out.println("Печать всех значений списка:");
            SinglyLinkedList.printList();
            System.out.println();
            System.out.println();
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Добавление значения 789 в конец списка:");
        SinglyLinkedList.addElementInEnd(789);
        try {
            System.out.println("Печать всех значений списка:");
            SinglyLinkedList.printList();
            System.out.println();
            System.out.println();
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Извлечение значения из конца списка без его удаления из списка: " + SinglyLinkedList.getDataFromEndWithoutDelete());
        try {
            System.out.println("Печать всех значений списка:");
            SinglyLinkedList.printList();
            System.out.println();
            System.out.println();
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Определение, содержит ли список заданное значение -4, или нет " + SinglyLinkedList.isDataInList(-4));
        System.out.println("Определение, содержит ли список заданное значение -40, или нет " + SinglyLinkedList.isDataInList(-40));
        System.out.println();

        System.out.println("Определение, является ли список пустым, или нет " + SinglyLinkedList.isListIsEmpty());
        System.out.println();


    }
}
