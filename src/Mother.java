public class Mother extends GrandMother {

    private int weight;

    public Mother(int height, int weight) {
        super(height);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void begatZaSaharom() {
        System.out.println("ZA SAHAROM!!!!!!!!");
    }

    public final void begatZaSaharom(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("ZA SAHAROM!!!!!!!!");
        }
    }

}
