public class ifelse 
{
    public static void main(String args[]) 
    {
        double box_office_collection = 2220000000.0;
        String movie_review;
        
        if(box_office_collection >= 5000000000.0)
        {
            movie_review = "BLOCKBUSTER";
        }
        else if(box_office_collection >= 2500000000.0)
        {
            movie_review = "HIT";
        }
        else if(box_office_collection >= 1250000000.0)
        {
            movie_review = "AVG";
        }
        else
        {
            movie_review = "FLOP";
        }

        System.out.println("movie_review : " + movie_review);
    }    
}
