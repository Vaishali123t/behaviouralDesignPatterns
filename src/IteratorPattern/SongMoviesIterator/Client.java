package IteratorPattern.SongMoviesIterator;

public class Client {

    public static void main(String[] args) {

        // create movies
        Product movie1= new Movies("ZNMD");
        Product movie2= new Movies("PK");
        Product movie3= new Movies("");

        ProductInventory movieInventory= new MovieInventory();
        movieInventory.addProduct(movie1);
        movieInventory.addProduct(movie2);
        movieInventory.addProduct(movie3);

        Iterator moviesIterator= movieInventory.createIterator();
        Product currProduct= moviesIterator.first();

        while(currProduct!=null){

            System.out.println("Product: "+currProduct.getName());
            currProduct=moviesIterator.next();

        }

        System.out.println("______________________________________");

        // create songs, song inventory and iterate over it
        Product song1= new Song("Magic shop");
        Product song2= new Song("Lover");

        ProductInventory productInventory= new SongInventory();
        productInventory.addProduct(song1);
        productInventory.addProduct(song2);

        Iterator songIterator= productInventory.createIterator();
        Product currSong= songIterator.first();

        while (currSong!=null){
            System.out.println("Playing: "+currSong.getName());
            currSong= songIterator.next();
        }

    }

}
