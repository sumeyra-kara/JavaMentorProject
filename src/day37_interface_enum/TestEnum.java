package day37_interface_enum;

public class TestEnum {



    public static void main(String[] args) {

        //String browser = "Chrome";


        Browser browser = Browser.SAFARI;

        switch (browser) {
            case SAFARI:
                System.out.println("safari is available");
                break;
            case CHROME:
                System.out.println("chrome is available");
                break;
            case FIREFOX:
                System.out.println("firefox is available");
        }





    }



}
