public class Area {

    CandyBag bag;
    int number;
    String street;

    public Area(){

    }

    public Area(CandyBag bag, int number, String street) {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println(street + ", " + number);
        System.out.println("    " + "Happy birthday!!!");
        String yourPresent = "";

        for(int i = 0; i < bag.present.size(); i++) {
            yourPresent += bag.present.get(i).toString() + '\n';
        }
        System.out.println(yourPresent);
    }
}
