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
    // módulo
    public static int ex4(int x1){

        if(x1 == 0) return x1;
        if(ex1(x1)){

            return ex2(1,ex4(++x1));

        }
        return ex2(1, ex4(--x1));
    }
    //multiplicação
    public static int ex5(int x1, int x2){
        if(x1 == 0) return x1;
        if(x2 == 0) return x2;
        if(ex1(x2)){
            return -ex5(x1, ex3(0,x2));
        }
        return ex2(x1, ex5(x1, --x2));
    }
    //exponente
    public static int ex6(int x1, int x2){
        if(x2 == 0) return 1;
        if(ex1(x2)){
            return 0;
        }
        return ex5(x1, ex6(x1, --x2));
    }
    //divisão

    public static int ex7(int x1, int x2)throws Exception{
        if(x2 == 0) throw new Exception("Não pode dividir por 0");
        if(x2 == 1) return x1;
        if(ex9(ex4(x1),ex4(x2))) return 0;


        if(ex1(x1) == ex1(x2)){
            return ex2(ex7(ex3(x1, x2),x2),1);
        }
        return ex3(ex7(ex2(x1,x2),x2),1);
    }
    //resto da divisão
    public static int ex8 (int x1, int x2) throws Exception{
        if(x2 == 0) throw new Exception("Não é possivel dividir por 0");
        if(x2 == 1) return x1;
        if(ex9(ex4(x1), ex4(x2))) return x1;

        if(ex1(x1) == ex1(x2)){
            return ex2(ex7(ex3(x1, x2),x2),1);
        }
        return ex3(ex7(ex2(x1,x2),x2),1);
    }

    public static boolean ex9(int x1, int x2){
        //retorna true x1<x2
        //retorna false x1>x2
        if(x1 == x2) return false;

        if(ex1(x1)){
            if(ex1(x2)){
                if(x1 == 0) return false;

                return ex9(++x1, ++x2);
            }
            return true;
        }
        if(ex1(x2)){
            return false;
        }
        return ex9(--x1, --x2);


    }
    public static boolean ex10(int x1, int x2){
        if(x1 == x2) return true;

        if(ex1(x1)){
            if(ex1(x2)){
                if(x1 == 0) return false;

                return ex10(++x1, ++x2);
            }
            return true;
        }
        if(ex1(x2)){
            return false;
        }
        return ex10(--x1, --x2);

    }
    public static boolean ex11(int x1, int x2){

        if(x1 == x2) return false;

        if(ex1(x1)){
            if(ex1(x2)){
                if(x1 == 0) return true;

                return ex11(++x1, ++x2);
            }
            return false;
        }
        if(ex1(x2)){
            return true;
        }
        return ex11(--x1, --x2);


    }
    public static boolean ex12(int x1, int x2){

        if(x1 == x2) return true;

        if(ex1(x1)){
            if(ex1(x2)){
                if(x1 == 0) return true;

                return ex12(++x1, ++x2);
            }
            return false;
        }
        if(ex1(x2)){
            return true;
        }
        return ex12(--x1, --x2);


    }
    public static boolean ex13(int x1, int x2){
        if(x1 == x2) return false;
        return true;
    }











}
