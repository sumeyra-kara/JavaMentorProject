package day06_TernaryAndSwitch;

public class C03_Switch {
    public static void main(String[] args) {
        //kullanıcıdan bir harf alalım.
        // o harfle başlayan günler varsa yazdıralım
        // yoksa geçersiz harf yazdıralım

        char harf = 'C';

        if (harf == 'p' || harf == 'P') {
            System.out.println("Pazartesi, Persembe, Pazar");
        } else if (harf == 's' || harf == 'S') {
            System.out.println("Salı");
        } else if (harf == 'c' || harf == 'C') {
            System.out.println("Carsamba, Cuma, Cumartesi");
        } else {
            System.out.println("Gecersiz harf");
        }

        System.out.println("---------------------");

        harf = 'c';

        switch (harf) {
            case 'p', 'P':
                System.out.println("Pazartesi, Persembe, Pazar");
                break;
            case 's', 'S':
                System.out.println("Salı");
                break;
            case 'c', 'C':
                System.out.println("Carsamba, Cuma, Cumartesi");
                break;
            default:
                System.out.println("Gecersiz harf");
        }

        System.out.println("---------------------");

        String result = harf == 'p' || harf == 'P'
                ? "Pazartesi, Persembe, Pazar"
                : harf == 's' || harf == 'S'
                ? "Salı"
                : harf == 'c' || harf == 'C'
                ? "Carsamba, Cuma, Cumartesi" : "Gecersiz harf";

        System.out.println("result = " + result);

        int outerSwitch = 1;
        int innerSwitch = 2;

        switch (outerSwitch) {
            case 1 -> {
                switch (innerSwitch) {
                    case 1 -> {
                        if (outerSwitch == 1) {
                            System.out.println("if");
                        } else if (outerSwitch > 1) {
                            System.out.println("else if");
                        } else {
                            System.out.println("else");
                        }
                    }
                    case 2 -> System.out.println("inner 2");
                    default -> System.out.println("inner default");
                }

            }
            case 2 -> System.out.println("outer 2");
            default -> System.out.println("outer default");
        }
    }
}
