public class ListaMain {
    public static void main(String[] args) {
        Lista lista = new Lista(10);

        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(5);
        System.out.println("==========================");
        System.out.println("E X I B I N D O   T O D O S");
        lista.getAll();
        System.out.println("==========================");
        System.out.println("E X I B I N D O   I N D I C E");
        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println("==========================");
        System.out.println("R E M O V E N D O   P O R   I N D I C E");
        lista.remove(0);
        lista.remove(0);
        lista.getAll();
        System.out.println("==========================");
        System.out.println("R E M O V E N D O   P O R   E L E M E N T O");
        lista.removeElement(5);
        lista.getAll();
    }
}
