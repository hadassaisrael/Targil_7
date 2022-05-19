public class OnionRings extends  HamburgerDecorator{

    public OnionRings(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve()+ onionRingsTopping() ;
    }

    private String onionRingsTopping() {
        return " with onion rings";
    }
}
