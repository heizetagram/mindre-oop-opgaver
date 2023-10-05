package Lucas.CatLimb;

public class main {
    public static void main(String[] args) {
        CatDoor catDoor = new CatDoor();

        Cat c1 = new Cat("c1");
        Cat c2 = new Cat("c2");
        Cat c3 = new Cat("c3");
        Cat c4 = new Cat("c4");
        Cat c5 = new Cat("c5");
        Cat c6 = new Cat("c6");


        catDoor.setMode(CatDoor.Mode.IN_OUT);
        catDoor.registerCat(c1);
        catDoor.registerCat(c5);
        catDoor.registerCat(c6);

        System.out.println("Mode IN/OUT:");
        System.out.println("c1: " + catDoor.canCatEnter(c1));
        System.out.println("c5: " + catDoor.canCatEnter(c5));
        System.out.println("c6: " + catDoor.canCatEnter(c6));

        catDoor.setMode(CatDoor.Mode.ONLY_IN);
        System.out.println("Mode ONLY IN:");
        System.out.println("c1: " + catDoor.canCatEnter(c1));
        System.out.println("c5: " + catDoor.canCatEnter(c5));
        System.out.println("c6: " + catDoor.canCatEnter(c6));

        catDoor.setMode(CatDoor.Mode.ONLY_OUT);
        System.out.println("Mode ONLY OUT:");
        System.out.println("c1: " + catDoor.canCatEnter(c1));
        System.out.println("c5: " + catDoor.canCatEnter(c5));
        System.out.println("c6: " + catDoor.canCatEnter(c6));

        catDoor.setMode(CatDoor.Mode.CLOSED);
        System.out.println("Mode CLOSED:");
        System.out.println("c1: " + catDoor.canCatEnter(c1));
        System.out.println("c5: " + catDoor.canCatEnter(c5));
        System.out.println("c6: " + catDoor.canCatEnter(c6));
    }
}
