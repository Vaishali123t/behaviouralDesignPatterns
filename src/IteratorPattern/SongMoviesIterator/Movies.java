package IteratorPattern.SongMoviesIterator;

public class Movies implements Product{

    private String name;

    public Movies(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
