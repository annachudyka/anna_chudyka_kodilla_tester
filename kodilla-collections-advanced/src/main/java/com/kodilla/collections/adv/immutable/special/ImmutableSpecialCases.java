package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {

        Integer a=1160, c=112;
        /*
        są to 2 różne zmienne, wskazujące na 2 różne obiekty w pamięci komputera - mimo, że w obiektach tych
        zapisana jest ta sama wartość
         */
        Integer b=1160, d=112;
        System.out.println(a==b);
        /*
        porównwanie tych zmiennych poprzez == sprawia że porównujemy zawartość zmiennych, czyli adresy wskazywanych
        obiektów. Ponieważ obiekty są różne to również ich adresy są różne. Wynik porówanania jest false
         */
        System.out.println(a.equals(b));
        /*
        obiekty porównujemy poprzez boolean equals(Object o). W wyniku tego porównania powinnyśmy dostać true,
        bo oba obiekty zawierają tę samą wartość.
         */
        System.out.println(c==d);
        /*
        wynikiem porównania jest true - zmienna c i d mają zapisany taki sam adres w pamięci komputera, czyli
        wskazują na ten sam obiekt. BO Integer posiada z góry utworzone obiekty dla liczb w zakresie -128-127. Zakres
        ten odpowiada zakresowy wartości, który można zapisać w jednym bajcie pamięci. Dzięki temu używanie małych liczb nie
        powoduje zapełniania pamięci komputera nowymi obiektami - Java używa utworzonych wcześniej obiektów.
        Dlatego w przypadku liczb o zakresie wartości -128-127 adresy obiektów przechowujących te liczby będą takie same
        jeśli stworzymy kilka zmiennych o tej samej wartości.
         */
        System.out.println(c.equals(d));

        String x="This is string";
        String y="This is string";
        System.out.println(x==y);
        /*
        w wyniku porównania dostaniemy true. Java optymalizuje przechowywanie obiektów typu String bo często mogą
        zawierać długie łańcuchy. Przy tworzeniu nowej zmiennej Java sprawdzza czy posiada zmienną o takiej zawartości
        jeśli tak zostanie ona wykorzystana ponownie= 2 zmienne będą wskazywały na ten sam obiekt w pamięci komputera
         */
        System.out.println(x.equals(y));
    }
}
