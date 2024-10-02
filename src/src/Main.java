import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private final static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("--------------Es1------------------");
        List<Product> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product book = new Product();
            book.setId(Long.valueOf(i));
            book.setCategory("books");
            book.setName("book "+i);
            Double numeroNonArrotondato = rand.nextDouble(90, 150);
            Double numeroArrotondato =(double) Math.round(numeroNonArrotondato);
            book.setPrice(numeroArrotondato);
            books.add(book);
        }
        System.out.println("Lista libri:");
       books.stream().forEach(book-> System.out.println(book));
        System.out.println("Lista libri costosi:");
        List<Product> libriCostosi = books.stream().filter(book -> book.getPrice() > 100).toList();
        libriCostosi.stream().forEach(book-> System.out.println(book));

        System.out.println("--------------Es2------------------");


        List<Product> babies = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Product baby = new Product();
            baby.setId(Long.valueOf(i));
            baby.setCategory("babies");
            baby.setName("baby "+i);
            Double numeroNonArrotondato = rand.nextDouble(90, 150);
            Double numeroArrotondato =(double) Math.round(numeroNonArrotondato);
            baby.setPrice(numeroArrotondato);
            babies.add(baby);
        }
        System.out.println("Lista libri baby:");
        babies.stream().forEach(baby-> System.out.println(baby));
        System.out.println("Lista libri costosi baby:");
        List<Product> libriCostosibaby = babies.stream().filter(baby -> baby.getPrice() > 100).toList();
        libriCostosibaby.stream().forEach(baby-> System.out.println(baby));


        System.out.println("--------------Es3------------------");


        List<Product> boys = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Product boy = new Product();
            boy.setId(Long.valueOf(i));
            boy.setCategory("boys");
            boy.setName("boy "+i);
            Double numeroNonArrotondato = rand.nextDouble(90, 150);
            Double numeroArrotondato =(double) Math.round(numeroNonArrotondato);
            boy.setPrice(numeroArrotondato);
            boys.add(boy);
        }
        System.out.println("Lista libri boy senza sconto:");
        boys.stream().forEach(baby-> System.out.println(baby));
        System.out.println("Lista libri con sconto 10% :");
        List<Product> sconti = boys.stream()
                .peek(product -> {
                    double sconto = product.getPrice() * 0.9;
                    double prezzoArrotondato = (double) Math.round(sconto);
                    product.setPrice(prezzoArrotondato);
                })
                .toList();
        sconti.stream().forEach(boy-> System.out.println(boy));
        System.out.println("--------------Es4------------------");

    }
}