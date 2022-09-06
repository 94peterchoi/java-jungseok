package ch07;

class MyTv {
    private boolean isPowerOn;
    private int channel = 1;
    private int volume;
    private int prevChannel = 1;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    /* 인스턴스 변수 3개에 대한 getter, setter를 만드시오 */

    public void setPowerOn (boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public void setChannel (int channel) {
        if (MIN_CHANNEL > channel &&  MAX_CHANNEL < channel) {
            return;
        }
        setPrevChannel(this.channel);
        this.channel = channel;
    }

    public void setVolume (int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
    }

    public int getPrevChannel() {
        return prevChannel;
    }

    public void setPrevChannel(int prevChannel) {
        this.prevChannel = prevChannel;
    }

    public boolean getIsPowerOn() {
        return this.isPowerOn;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }

    // 현재 채널을 이전 채널로 변경한다.
    public void gotoPrevChannel () {
        if (this.channel == this.prevChannel) {
            System.out.println("이전으로 이동할 채널이 없습니다.");
            return;
        }
        setChannel(this.prevChannel);
    }
}

class Ex_7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());


    }
}
