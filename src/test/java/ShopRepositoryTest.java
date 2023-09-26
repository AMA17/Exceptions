import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    ShopRepository repo = new ShopRepository();
    Product product1 = new Product(11, "Книга", 100);
    Product product2 = new Product(20, "Игрушка", 3000);
    Product product3 = new Product(55, "Хлеб", 20);

    @Test
    public void RemoveWhenProductExist() {
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(55);

        Product[] actual = repo.findAll();
        Product[] expected = {product1, product2};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RemoveWhenProductNotExist() {

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);


        Assertions.assertThrows(NotFoundException.class, () -> repo.remove(100));
    }
}
