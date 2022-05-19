public class Salad extends HamburgerDecorator{

    public Salad(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve()
    {
        return super.serve()+ saladTopping();
    }

    private String saladTopping() {
        return " with salad";
    }
}
