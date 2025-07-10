public class PartyFactory implements OutfitFactory {
    public Top createTop() {
        return new CropTop();
    }

    public Pants createPants() {
        return new Skirt();
    }

    public Shoes createShoes() {
        return new Heels();
    }
}
