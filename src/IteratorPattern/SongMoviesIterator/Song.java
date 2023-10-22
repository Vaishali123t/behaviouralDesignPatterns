package IteratorPattern.SongMoviesIterator;

public class Song  implements Product{

    private String name;

    public Song(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
