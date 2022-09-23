package ch11;

import java.util.HashSet;

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }


    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + (isKwang ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SutdaCard{" +
                "num=" + num +
                ", isKwang=" + isKwang +
                '}';
    }

}

public class Ex11_5 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println("set = " + set);

    }


}
