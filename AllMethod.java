public class AllMethod {
    void method(){
        Gen< Integer> iOb;

        iOb = new Gen< Integer> (1) ;

        iOb.showType();

        int v = iOb . getob();
        System.out.println ( "Знaчeниe : "+ v ) ;
        System.out.println ();

        Gen<String> strOb = new Gen<String> ( "Тест обобщений " ) ;

        strOb.showType();

        String str = strOb.getob();
        System.out.println( "Знaчeниe : "+ str) ;
    }

    void method2(){
        NonGen iob;
        iob = new NonGen ( 2 ) ;
        iob.showТype();
        int v = ( Integer) iob.getob() ;
        System.out.println("Знaчeниe: " + v ) ;
        System.out.println();
        NonGen strOb = new NonGen ("Tecт без обобщений" );
        strOb.showТype();
        String str = (String) strOb.getob() ;
        System.out.println ( "Знaчeниe: "+ str) ;
        //Этот код компилируется, но он принципиально не верный!
        //iob = strOb ;
        //v = (Integer) iob.getob();//Ошибка во время выполнения!
    }

    void method3(){
        TwoGen< Integer, String> tgObj = new TwoGen< Integer, String> (3, "Обобщения") ;
        tgObj.showТypes(); ;
        int v = tgObj.getob1();
        System.out.println( "Знaчeниe: "+ v) ;
        String str = tgObj.getob2();
        System. out . println ( "Знaчeниe: " + str ) ;
    }
}