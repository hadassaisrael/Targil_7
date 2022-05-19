public abstract class  HamburgerDecorator implements Hamburger{

    private Hamburger itsHamburger;

    //Returns the pointer burger type
    public HamburgerDecorator(Hamburger hamburger){
        this.itsHamburger = hamburger;
    }
    // standard constructors
    @Override
    public String serve() {
        return itsHamburger.serve();
    }
}
