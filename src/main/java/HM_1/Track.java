package HM_1;

public class Track implements Movement {
    private static Integer longTrack;


    public static Integer getLongTrack() {
        return longTrack;
    }

    public Track(Integer longTrack) {
        this.longTrack = longTrack;
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
        System.out.println("Трек пройден");
        return true;

    }

    @Override
    public boolean jumpWall() {
        return false;

    }
}
