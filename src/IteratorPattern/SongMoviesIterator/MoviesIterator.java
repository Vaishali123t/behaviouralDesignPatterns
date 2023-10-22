package IteratorPattern.SongMoviesIterator;

import java.util.List;

public class MoviesIterator implements Iterator{

    List<Product> inventory;
    int currentPosition;

    MoviesIterator(List<Product> products){
        this.inventory=products;
        this.currentPosition=0;
    }

    @Override
    public Product first() {
        return inventory.get(0);
    }

    @Override
    public Product next() {
        if(hasNext()) return inventory.get(currentPosition++);
        return null;
    }

    @Override
    public Product prev() {
        if (currentPosition>0) return inventory.get(currentPosition--);
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentPosition<this.inventory.size()-1;
    }

}
