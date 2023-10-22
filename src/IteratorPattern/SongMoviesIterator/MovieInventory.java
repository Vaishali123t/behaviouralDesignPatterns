package IteratorPattern.SongMoviesIterator;

import java.util.ArrayList;
import java.util.List;

public class MovieInventory implements ProductInventory{

    private List<Product> products= new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public Iterator createIterator() {
        return new MoviesIterator(products);
    }
}
