package de.telran.practic._2024_01_15;

import lombok.*;

/**
 * "CATEGORY": "FOOD#1",
 * "NAME": "Pasta#1",
 * "FACTORY": "Barilla#1",
 * "QUANTITY": 150,
 * "ISPACKED": true,
 * "ISADV": false,
 * "PRICE": 1.49,
 * "MARGIN": 15.0,
 * "ISDEBT": false},
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String category;
    private String name;
    private String factor;
    private int quantity;
    private boolean isPacked;
    private boolean isAdv;
    private double price;
    private double margin;
    private boolean isDebt;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", factor='" + factor + '\'' +
                ", quantity=" + quantity +
                ", isPacked=" + isPacked +
                ", isAdv=" + isAdv +
                ", price=" + price +
                ", margin=" + margin +
                ", isDebt=" + isDebt +
                '}';
    }
}
