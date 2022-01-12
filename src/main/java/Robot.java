public class Robot implements Movement{
    private Integer limitRun;
    private Integer limitJump;
    public Robot ( int limitRun,int limitJump) {
        this.limitRun= limitRun;
        this.limitJump= limitJump;
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
        if (limitRun>Track.getLongTrack()){
            return true;
        }
        return false;
    }
    @Override
    public boolean jumpWall() {
        if (limitJump>Wall.getHeightWall()){
            return true;
        }
        return false;
    }


}
