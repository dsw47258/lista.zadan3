package zad2;

public class zad1obiekty {
    public static void main(String[] args) {
        Lipstick lipstick1 = new Lipstick("Pinko");
        System.out.println("lipstick1 before using setter: ");
        System.out.println(lipstick1);
        lipstick1.setColor("RED");
        System.out.println("lipstick1 after using setter: ");
        System.out.println(lipstick1);

        Lipstick lipstick2 = new Lipstick("Chanel");
        lipstick2.setColor("black");
        System.out.println(lipstick2);

        Lipstick lipstick3 = new Lipstick("Golden Rose", "red","liquid",7,12,true);
        System.out.println(lipstick3);

        Lipstick lipstick4 = new Lipstick("Yves laure", "blue","stick",5,8,false);
        System.out.println(lipstick4);

        Lipstick lipstick5 = new Lipstick("Gucci","pink","liquid",5);
        lipstick5.setLength(8);
        lipstick5.setRecycled(true);
        System.out.println(lipstick5);

        Lipstick lipstick6 = new Lipstick("Gucci","violet","stick",7);
        lipstick6.setLength(8);
        lipstick6.setRecycled(true);
        System.out.println(lipstick6);
    }
}

