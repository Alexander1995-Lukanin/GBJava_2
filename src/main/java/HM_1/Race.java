package HM_1;

public class Race {

    public static void main(String[] args) {


        Movement[] movements = {
                new Man(5, 10),
                new Cat(100, 100),
                new Robot(1000, 1000)
        };
        Movement[] obstacles = {
                new Track(10),
                new Wall(20),
                new Track(5),
        };
        for (Movement movement : movements) {
            for (Movement obstacle : obstacles) {
                if (obstacle instanceof Track){
                    if (movement.runTrack()) {
                        System.out.println(movement+" смог пробежать дистанцию");
                    }
                    else {
                        System.out.println(movement+" сошел с дистанции");
                        break;
                }
                }
               else if (obstacle instanceof Wall){
                    if (movement.jumpWall()){
                        System.out.println(movement+" смог преодолеть стену");
                    }
                    else {
                        System.out.println(movement+" сошел с дистанции");
                    }
                }

            }
        }


    }
}
