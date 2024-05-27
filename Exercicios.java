public class Exercicios {

    public boolean aux(int a, int d){

        if(a == 0) return true;
        if(d == 0) return false;
        return aux(++a, --d);

    }
    public boolean ex1(int x) throws Exception{

        // se positivo retornar falso
        // se negativo retorna true
        if (x==0) return false;

        return aux(x,x);


    }




}
