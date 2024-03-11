package day03_Review_OperatorsAndConcatenation;

public class C01_ArithmeticOperators {
    public static void main(String[] args) {


        //++t -->pre increment
        //t++ -->post increment
        //--t -->pre decrement
        //t-- -->post decrement

        // t nin değerini 1 arttırın ve yeni değerini oluşturacağınız u variable'ına atayın
        int t = 10;
        t++;
        int u = t;

        System.out.println("t : " + t + " u: " + u);

        // t nin değerini u ya atayın sonra bir arttırın

        t = 10;
        u = t;
        t++;

        System.out.println("t : " + t + " u: " + u);


        //java bu işlemi tek satırda yapmak istemiş
        // t nin değerini 1 arttırın ve yeni değerini oluşturacağınız u variable'ına atayın
        t = 10;
        u = ++t;
        System.out.println("t : " + t + " u: " + u);

        // t nin değerini u ya atayın sonra bir arttırın
        t = 10;
        u = t++;

        System.out.println("t : " + t + " u: " + u);


        System.out.println("---------------------");

        t = 10;
        u = t++;

        int w = u++ + t;

        System.out.println("t : " + t + " u: " + u + " w: " + w);

        System.out.println("---------------------");

        int x = 1;
        int y = 1;

        boolean bl = x++ < ++y;  //x still 1 but y is 2 whem the operation is done.

        System.out.println("bl = " + bl);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("---------------------");

        int i = 10;
        int j = 20;
        int k = (j += i) / 5;
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        System.out.println("---------------------");

        int a = 3;
        int b = 2;
        int c = 1;
        int r1 = a * b / c + 1;  //7
        int r2 = a / b * c + 1;  //2
        int r3 = a * (b / (c + 1)); //3

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------");

        int aVar = 9;

        boolean bl_2 = aVar-- < 9;

        System.out.println("bl_2 = " + bl_2);

        System.out.println("---------------------");

        int m = 1;
        int n = 0;

        boolean bl_3 = m++ > ++n;

        System.out.println("bl_3 = " + bl_3);

        System.out.println("---------------------");

        int num = 100;
        int num_1 = num++;
        int num_2 = ++num;
        int num_3 = num++;

        System.out.println("num = " + num);  //103
        System.out.println("num_1 = " + num_1);  //100
        System.out.println("num_2 = " + num_2);  //102
        System.out.println("num_3 = " + num_3);  //102

        System.out.println("---------------------");

        int rakam = 10;
        int rakam_1 = 3;
        int rakam_2 = 5;
        int rakam_3 = 20;
        int rakam_4 = 16;

        int result;  //deklare yaptım
        //result+=rakam;   //result=result+rakam;  hata verir çünkü result başlatılmayabilir.
        result = rakam--;
        result *= rakam_1;
        result /= rakam_2;
        result += rakam_3;
        result -= rakam_4;

        System.out.println("result = " + result);  //10
        System.out.println("rakam = " + rakam);  //9

        result=-rakam;

        System.out.println("result = " + result);

        System.out.println(-(result));

        System.out.println("---------------------");

        int z=36;
        int h=5;

//   int return=z%h;   return kelimesi javada tanımlı bir keyword olduğundan variable ismi olarak kullanılmaz.
        z%=h;  //---> z =z % h;
        System.out.println("z = " + z);

        //arithmetic exception
        int sayi1=5;
        int sayi2=0;

      //  int sonuc=sayi1/sayi2;


    }
}
