public class Main {
    public static void main(String[] args) {

        System.out.println("демонстрация работы односвязного списка".toUpperCase());
        System.out.println();

//        SinglyLinkedList.addElementInEnd(7);
//        SinglyLinkedList.addElementInEnd(8);
//        SinglyLinkedList.addElementInEnd(12);
//        SinglyLinkedList.addElementInEnd(-4);
//        SinglyLinkedList.addElementInEnd(188);
//        SinglyLinkedList.addElementInEnd(999);


        SinglyLinkedList.addElementInBeginning(7);
        SinglyLinkedList.addElementInBeginning(8);
        SinglyLinkedList.addElementInBeginning(12);
        SinglyLinkedList.addElementInBeginning(-4);
        SinglyLinkedList.addElementInBeginning(188);
        SinglyLinkedList.addElementInBeginning(999);

        System.out.println("Начальное значение списка: " + SinglyLinkedList.getHeadElement().getData());
        System.out.println("Конечное значение списка: " + SinglyLinkedList.getTailElement().getData());
        System.out.println();

        System.out.println("Извлечение значения из начала списка без его удаления из списка: " + SinglyLinkedList.getDataFromBeginningWithoutDelete());
        System.out.println("Начальное значение списка: " + SinglyLinkedList.getHeadElement().getData());
        System.out.println();

        System.out.println("Извлечение значения из начала списка c его удалением из списка: " + SinglyLinkedList.getDataFromBeginningWithDelete());
        System.out.println("Начальное значение списка: " + SinglyLinkedList.getHeadElement().getData());
        System.out.println();

        System.out.println("Добавление значения 1000 в конец списка:");
        SinglyLinkedList.addElementInEnd(1000);
        System.out.println("Начальное значение списка: " + SinglyLinkedList.getHeadElement().getData());
        System.out.println("Конечное значение списка: " + SinglyLinkedList.getTailElement().getData());
        System.out.println();

        System.out.println("Добавление значения 355 в начало списка:");
        SinglyLinkedList.addElementInBeginning(355);
        System.out.println("Начальное значение списка: " + SinglyLinkedList.getHeadElement().getData());
        System.out.println("Конечное значение списка: " + SinglyLinkedList.getTailElement().getData());
        System.out.println();

        System.out.println("Добавление значения 789 в конец списка:");
        SinglyLinkedList.addElementInEnd(789);
        System.out.println("Начальное значение списка: " + SinglyLinkedList.getHeadElement().getData());
        System.out.println("Конечное значение списка: " + SinglyLinkedList.getTailElement().getData());
        System.out.println();


    }
}
