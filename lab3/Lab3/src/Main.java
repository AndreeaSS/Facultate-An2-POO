public class Main {

    public static void main(String[] args) {
        CandyBag bag = new CandyBag();
        CandyBox p1 = new Lindt("chocolate", "Indonesia", 2, 4, 5);
        bag.addCandyBox(p1);
        CandyBox p2 = new Lindt("strawberry", "Spain", 3, 3, 3);
        bag.addCandyBox(p2);
        CandyBox p3 = new Lindt("chocolate", "Indonesia", 1, 2, 1);
        bag.addCandyBox(p3);
        CandyBox p4 = new Lindt("melon", "Turkey", 2, 4, 5);
        bag.addCandyBox(p4);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));

        for(int i = 0; i < bag.present.size(); i++) {
            if(bag.present.get(i) instanceof Lindt) {
                ((Lindt) bag.present.get(i)).printLindtDim();
            }
        }

        Area a = new Area(bag, 128, "Izvorului");
        a.getBirthdayCard();

    }
}
