

public class Main {
    public static void main(String[] args) {
        TVSeries breakingBad = new TVSeries("Breaking Bad", "Vince Gilligan");

        breakingBad.addEpisode(new Episode(1, "Pilot", "A high school chemistry teacher turned methamphetamine producer"));
        breakingBad.addEpisode(new Episode(2, "Cat's in the Bag...", "Walter and Jesse try to dispose of the two bodies"));
        breakingBad.addEpisode(new Episode(3, "...And the Bag's in the River", "Walter and Jesse clean up the mess caused by their first cook"));


        breakingBad.displayEpisodes();
    }
}
