public class Exercicios {

    public static boolean aux(int a, int d){

        if(a == 0) return true;
        if(d == 0) return false;
        return aux(++a, --d);

    }
    //é negativo
    public static boolean ex1(int x){

        // se positivo retornar falso
        // se negativo retorna true
        if (x==0) return false;

        return aux(x,x);


    }
    //somar
    public static int ex2(int x1, int x2){
        if (x2 == 0) return x1 ;
        if(ex1(x2))
        {
            return ex2(--x1, ++x2);
        }
        return ex2(++x1, --x2);
    }

    //subtrair
    public static int ex3(int x1, int x2){
        if (x2 == 0) return x1;
        if(ex1(x2)){
            return ex3(++x1, ++x2);
        }
        return ex3(--x1, --x2);
    }








}
