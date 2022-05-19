public class FriedEgg extends HamburgerDecorator{

    public FriedEgg(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve()
    {
        return super.serve()+ friedEggTopping();
    }

   // will return a topping of fried egg
    private String friedEggTopping() {
        return " with fried egg";
    }
}
