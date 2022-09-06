package ch07;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 배열 SutdaCard를 적절히 초기화 하시오.
        SutdaCard sutdaCard = new SutdaCard();

        for (int i=1; i<=CARD_NUM; i++) {
            int number = i;
            if (number > 10) {
                number = number - 10;
            }
            boolean isKwnag = false;
            if (i == 1 || i == 3 || i ==8) {
                isKwnag = true;
            }
            cards[i-1] = new SutdaCard(number, isKwnag);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Ex_7_1 {
    public static void main(String[] args) {
        SutdaDeck deck =new SutdaDeck();

        for (int i=0; i<deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}
