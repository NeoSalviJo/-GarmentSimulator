public class CasualFactory implements OutfitFactory {
    public Top createTop() {
        return new TShirt();
    }

    public Pants createPants() {
        return new Jeans();
    }

    public Shoes createShoes() {
        return new Sneakers();
    }
}
