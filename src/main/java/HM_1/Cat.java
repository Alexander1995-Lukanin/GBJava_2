package HM_1;

public class Cat implements Movement{
    private Integer limitRun;
    private Integer limitJump;
    public Cat ( int limitRun,int limitJump) {
        this.limitRun= limitRun;
        this.limitJump= limitJump;
    }
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public boolean jump() {
        System.out.println("Кот прыгает");
        return false;
    }

    @Override
    public boolean runTrack() {
        return (limitRun>Track.getLongTrack());
    }
    @Override
    public boolean jumpWall() {
            return (limitJump>Wall.getHeightWall());
    }


}
