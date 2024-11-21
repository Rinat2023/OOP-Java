public class Seasons {
    public String getSeason (int num){
        switch (num){
            case 1,2,12:{
                return "zima";
            }
            case 3,4,5:{
                return "vesna";
            }
            case 6,7,8:{
                return "leto";
            }
            case 9,10,11:{
                return "osen";
            }
        }
        return "vvedite deystvitelny nomer mesaca";

    }
}
