package First_week;

public class Opp {
    public static void main(String[] args) {
        Veriable v = new Veriable();

        v.i = 10;
        v.j = 20;

        System.out.printf("%d, %d 곱하기는 : %d", v.i,v.j, v.sum());
    }
}

class Veriable {
    int i = 0;
    int j = 0;

    int sum(){
        return i * j;
    }
}
