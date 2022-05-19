public class Chips extends HamburgerDecorator{

    public Chips(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve()
    {
        return super.serve()+ chipsTopping();
    }

    private String chipsTopping() {
        return " with chips";
    }


}
