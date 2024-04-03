import java.util.ArrayList;
import java.util.List;


class TVSeries {
    private String seriesName;
    private String producer;
    private List<Episode> episodes;

    public TVSeries(String seriesName, String producer) {
        this.seriesName = seriesName;
        this.producer = producer;
        this.episodes = new ArrayList<>();
    }

    public String getSeriesName() {
        return seriesName;
    }

    public String getProducer() {
        return producer;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public void displayEpisodes() {
        System.out.println("Series: " + seriesName);
        System.out.println("Producer: " + producer);
        System.out.println("Episodes:");
        for (Episode episode : episodes) {
            episode.display();
        }
    }
}
