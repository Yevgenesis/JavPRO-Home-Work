package de.telran.homeWork.hw_14;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Node {
    private int key;
    private String value;
    private Node left;
    private Node right;

    public void printNode() {
        System.out.println(value);
    }
}
