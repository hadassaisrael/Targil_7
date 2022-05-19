public class HamburgerFactory {
    public static Hamburger createHamburger(String code){

        if(code.equalsIgnoreCase("cl")) {
          return new ClassicHamburger();
        }

        else if(code.equalsIgnoreCase("sp")) {
            return new SpicyHamburger();
        }

        else if(code.equalsIgnoreCase("la")) {
            return new LambHamburger();
        }

        else if(code.equalsIgnoreCase("hm")) {
            return new HomemadeHamburger();
        }

        throw new RuntimeException("wrong Hamburger");
    }
}

