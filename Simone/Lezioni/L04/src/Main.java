public class Main {

    public static void main(String[] args) {
        Weapon AK47 = new Weapon(3.72f, 200.23f, 60);

        Weapon revolver = new Weapon(2.22f, 120, 6);

        AK47.shoot();
        revolver.shoot();
        System.out.println(AK47);
        System.out.println(revolver);
        System.out.println(Weapon.MAX_MAGAZINE);
        Weapon.MAX_MAGAZINE = 85;
        System.out.println(AK47);
        System.out.println(revolver);
        System.out.println(Weapon.MAX_MAGAZINE);
        AK47.MAX_MAGAZINE = 201;
        System.out.println(AK47);
        System.out.println(revolver);
        System.out.println(Weapon.MAX_MAGAZINE);
    }
}



