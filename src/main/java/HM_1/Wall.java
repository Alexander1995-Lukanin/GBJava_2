package HM_1;

public class Wall implements Movement {
    private static Integer heightWall;

    public static Integer getHeightWall() {
        return heightWall;
    }

    public Wall(Integer heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public void run() {

    }

    @Override
    public boolean jump() {

        return false;
    }

    @Override
    public boolean runTrack() {
        return false;
    }

    @Override
    public boolean jumpWall() {
        System.out.println("Стена перепрыгнута");
        return true;
    }
}
