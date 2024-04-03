
class Episode extends Occurrence {
    private int number;
    private String title;
    private String storySynopsis;

    public Episode(int number, String title, String storySynopsis) {
        this.number = number;
        this.title = title;
        this.storySynopsis = storySynopsis;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getStorySynopsis() {
        return storySynopsis;
    }

    @Override
    void display() {
        System.out.println("Episode " + number + ": " + title);
        System.out.println("Synopsis: " + storySynopsis);
    }
}
