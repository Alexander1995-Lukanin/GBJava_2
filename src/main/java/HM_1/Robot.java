package HM_1;

public class Robot implements Movement {
    private Integer limitRun;
    private Integer limitJump;

    public Robot(int limitRun, int limitJump) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public boolean jump() {
        System.out.println("Робот прыгает");
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
