package IteratorPattern.SongMoviesIterator;

import java.util.ArrayList;
import java.util.List;

public class SongInventory implements ProductInventory{

    private List<Product> products=new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public Iterator createIterator() {
        return new SongIterator(this.products);
    }
}
