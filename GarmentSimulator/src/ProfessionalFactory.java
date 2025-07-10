public class ProfessionalFactory implements OutfitFactory {
    public Top createTop() {
        return new Blazer();
    }

    public Pants createPants() {
        return new Slacks();
    }

    public Shoes createShoes() {
        return new DressShoes();
    }
}
