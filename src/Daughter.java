public final class Daughter extends Mother {

    private String wear;
    private Language language;

    public String getWear() {
        return wear;
    }

    public Language getLanguage() {
        return language;
    }

    public Daughter(int height, int weight, String wear, Language language) {
        super(height, weight);
        this.wear = wear;
        this.language = language;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Daughter{" +
                "wear='" + wear + '\'' +
                ", language=" + language +
                '}' + "Weight:" + getWeight());
    }
}
