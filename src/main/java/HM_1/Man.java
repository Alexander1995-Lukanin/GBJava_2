package HM_1;

public class Man implements Movement {
    private Integer limitRun;
    private Integer limitJump;

    public Man(int limitRun, int limitJump) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public boolean jump() {
        System.out.println("Человек прыгает");
        return false;
    }

    @Override
    public boolean runTrack() {
        return limitRun > Track.getLongTrack();
    }

    @Override
    public boolean jumpWall() {
        return limitJump > Wall.getHeightWall();
    }

}
