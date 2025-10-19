package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Money {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    
    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
    }

    @Test
    public void testYenMultiplication() {
        assertEquals(new Yen(10), new Yen(1).times(10));
        assertEquals(new Yen(15), new Yen(1).times(15));
    }
}

class Dollar {
    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}

class Yen {
    private int amount;
    public Yen(int amount) {
        this.amount = amount;
    }

    public Yen times(int multiplier) {
        return new Yen(amount * multiplier);
    }

    public boolean equals(Object object) {
        Yen yen = (Yen) object;
        return amount == yen.amount;
    }
}