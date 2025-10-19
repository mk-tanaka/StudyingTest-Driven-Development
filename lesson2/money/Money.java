package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Money {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        Dollar product2 = five.times(3);
        assertEquals(15, product2.amount);
    }
}

class Dollar {
    int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}