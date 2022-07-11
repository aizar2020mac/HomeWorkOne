public class Main {
    public static void main(String[] args) {

        Mother mother = new Mother(175, 60);
        mother.begatZaSaharom();
        mother.getInfo();
        Daughter liza = new Daughter(160, 50, "MODNAYA", Language.RUSSIAN);
        liza.begatZaSaharom(10);
        liza.getInfo();
        Daughter aidana = new Daughter(165, 53, "KLASSIK", Language.KYRGYZ);
        aidana.begatZaSaharom(8);
        aidana.getInfo();

    }
}