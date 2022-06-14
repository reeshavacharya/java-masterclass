public class SpeedConverter {

    public static long tomilesperhour(double kilometersperhour){
        if(kilometersperhour<0){
            return -1;
        }
        return Math.round(kilometersperhour/1.609);
    }

    public static void printConversion(double kilometersperhour){
        if (kilometersperhour<0)
        {
            System.out.println("INVALID VALUE!");
        }

        long milesperhour= tomilesperhour(kilometersperhour);
        System.out.println(kilometersperhour+" km/h = "+milesperhour+" mi/h");

    }

}


