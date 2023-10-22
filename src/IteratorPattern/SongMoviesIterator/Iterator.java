package IteratorPattern.SongMoviesIterator;

public interface Iterator {

    public Product first();
    public Product next();
    public Product prev();
    boolean hasNext();

}
