package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) { // psvm
        MovieReview inception = new MovieReview();
        inception.title = "인셉션 ";
        inception.review = "인생은 무한루프";

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃타임 ";
        abouttime.review = "인생시간영화";

        MovieReview[] moviereview = {inception, abouttime};

        for (MovieReview m : moviereview) {
            System.out.println(m.title + m.review);
        }
    }
}
