package homework4;

public class Movie {
    String title;
    String genre;
    int rating;


    void playIt() {
        System.out.println("playing the movie");
    } Movie(String mTitle, String mGenre, int mRating){
        title = mTitle;
        genre = mGenre;
        rating = mRating;
    }

}
