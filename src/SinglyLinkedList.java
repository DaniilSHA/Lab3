public class SinglyLinkedList {
    private int data;
    private SinglyLinkedList nextElement;
    private static SinglyLinkedList bufferElement;
    private static SinglyLinkedList headElement;
    private static SinglyLinkedList tailElement;


    public SinglyLinkedList(int data) {
        setData(data);
        setNextElement(SinglyLinkedList.bufferElement);
        if (getNextElement() == null) tailElement = this;
    }

    public static void printList() throws EmptyListException {
        if (headElement == null) throw new EmptyListException("список пуст");
        SinglyLinkedList checkElement = headElement;
        while (checkElement.getNextElement() != null) {
            System.out.print(checkElement.getData());
            System.out.print(" ");
            checkElement = checkElement.getNextElement();
        }
        System.out.print(checkElement.getData());
    }

    public static void deleteDataFromList(int data) {
        if (isDataInList(data)) {

            while (headElement.getData() == data) {
                headElement = headElement.getNextElement();
            }

            while (tailElement.getData() == data) {
                SinglyLinkedList checkElement = headElement;
                while (checkElement.getNextElement() != tailElement)
                    checkElement = checkElement.getNextElement();
                checkElement.setNextElement(null);
                tailElement = checkElement;
            }

            int counter = 0;
            SinglyLinkedList checkElement = headElement;
            while (checkElement != tailElement) {
                if (checkElement.getData() == data) counter++;
                checkElement = checkElement.getNextElement();
            }

            for (int i = 0; i < counter; i++) {
                checkElement = headElement;
                SinglyLinkedList checkElementBefore = null;
                while (checkElement != tailElement) {
                    if (checkElement.getData() == data) {
                        checkElementBefore.setNextElement(checkElement.getNextElement());
                    }
                    checkElementBefore = checkElement;
                    checkElement = checkElement.getNextElement();
                }
            }
        }
    }

    public static boolean isListIsEmpty() {
        if (headElement == null) return true;
        else return false;
    }

    public static boolean isDataInList(int data) {
        SinglyLinkedList checkElement = headElement;
        while (checkElement.getNextElement() != null) {
            if (checkElement.getData() == data) return true;
            checkElement = checkElement.getNextElement();
        }
        if (checkElement.getData() == data) return true;
        return false;
    }

    public static int getDataFromEndWithoutDelete() {
        return tailElement.getData();
    }

    public static int getDataFromEndWithDelete() throws EmptyListException {
        if (headElement == tailElement) {
            int data = headElement.getData();
            headElement = null;
            tailElement = null;
            return data;
        } else if (headElement.nextElement == tailElement) {
            int data = tailElement.getData();
            headElement.setNextElement(null);
            tailElement = headElement;
            return data;
        } else {
            int data = tailElement.getData();
            SinglyLinkedList checkElement = headElement;
            while (checkElement.getNextElement() != null) {
                if (tailElement == checkElement.getNextElement()) {
                    checkElement.setNextElement(null);
                    break;
                }
                checkElement = checkElement.getNextElement();
            }
            tailElement = checkElement;
            return data;
        }
    }

    public static int getDataFromBeginningWithoutDelete() {
        return headElement.getData();
    }

    public static int getDataFromBeginningWithDelete() {
        int data = headElement.getData();
        headElement = headElement.getNextElement();
        return data;
    }

    public static void addElementInEnd(int data) {
        bufferElement = null;
        SinglyLinkedList newElement;
        SinglyLinkedList reffForMethod;
        if (SinglyLinkedList.getTailElement() != null) {
            reffForMethod = SinglyLinkedList.getTailElement();
            newElement = new SinglyLinkedList(data);
            reffForMethod.nextElement = newElement;
        } else {
            newElement = new SinglyLinkedList(data);
            headElement = newElement;
        }


    }

    public static void addElementInBeginning(int data) {
        bufferElement = headElement;
        SinglyLinkedList newElement = new SinglyLinkedList(data);
        headElement = newElement;
    }


    public static SinglyLinkedList getHeadElement() {
        return headElement;
    }

    public static SinglyLinkedList getTailElement() {
        return tailElement;
    }


    public static void setHeadElement(SinglyLinkedList headElement) {
        SinglyLinkedList.headElement = headElement;
    }

    public static void setTailElement(SinglyLinkedList tailElement) {
        SinglyLinkedList.tailElement = tailElement;
    }

    public int getData() {
        return data;
    }

    public SinglyLinkedList getNextElement() {
        return nextElement;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextElement(SinglyLinkedList nextElement) {
        this.nextElement = nextElement;
    }

    public static SinglyLinkedList getBufferElement() {
        return bufferElement;
    }


}
