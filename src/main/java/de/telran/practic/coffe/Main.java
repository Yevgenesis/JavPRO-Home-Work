package de.telran.practic.coffe;

public class Main {

}

class cup {
    String logo;
    Coffee coffee;
    Lid lid;

    public cup(String logo, Coffee coffee) {
        this.logo = logo;
        this.coffee = coffee;
    }


    class Lid {
        String logo;

        public Lid(String logo) {
            this.logo = logo;
        }
    }
}


class Coffee {
    String Name;
    String brand;

    public Coffee(String name, String brand) {
        this.Name = name;
        this.brand = brand;
    }
}
