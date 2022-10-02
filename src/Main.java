public class Main {
    public static void main(String[] args) {

        WaitList<Integer> cont1 = new WaitList<Integer>();
        for (int i = 0; i < 5; i++) {
            cont1.add(i);
        }
        System.out.println(cont1.toString());
        System.out.println("Содержит ли 3? - " + cont1.contains(3));
        System.out.println("WaitList пуст? - " + cont1.isEmpty());
        System.out.println("Удаляем первый элемент - " + cont1.remove());
        System.out.println(cont1.toString());
        System.out.println();

        BoundedWaitList<Integer> cont2 = new BoundedWaitList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            cont2.add(i);
        }
        System.out.println(cont2.toString());
        System.out.println("Содержит ли 3? - " + cont2.contains(3));
        System.out.println("WaitList пуст? - " + cont2.isEmpty());
        System.out.println("Попробуем удалить первый элемент - " + cont2.remove());
        System.out.println(cont2.toString());
        System.out.println("Попробуем добавить элементы (размер списка равен = " + cont2.getCapacity() + ")");
        System.out.println("Добавим 5");
        cont2.add(5);
        System.out.println(cont2.toString());
        System.out.println("Добавим 6");
        cont2.add(6);
        System.out.println(cont2.toString());
        System.out.println();

        UnfairWaitList<Integer> cont3 = new UnfairWaitList<Integer>();
        for (int i = 0; i < 5; i++) {
            cont3.add(i);
        }
        System.out.println(cont3.toString());
        System.out.println("Попробуем удалить 2");
        cont3.remove(2);
        System.out.println(cont3.toString());
        System.out.println("Переместим 1 в конец");
        cont3.moveToBack(1);
        System.out.println(cont3.toString());
    }
}