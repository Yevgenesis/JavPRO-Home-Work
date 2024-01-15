package de.telran.practic._2024_01_15;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handler {
    List<Product> productList = new ArrayList<>();

    public void parseString(String str) {
        Product product = new Product();
        String regEx = "\\(\\w+\\)(\\w+)#(\\d{1,})]\\[([\\w+]+[\\s\\w+]*)#\\d{1,}]\\[([\\w+]+[[-\\s]\\w+]*)#\\d{1,}]\\[(\\d{1,})#\\d{1,}]\\[(\\w+)#\\d{1,}]\\[(\\w+)#\\d{1,}]\\[([0-9]+.?[0-9]+)?#\\d{1,}]\\[([0-9]+.?[0-9]+)?#\\d{1,}]\\[(\\w+)#\\d{0,}]\\z";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            product.setCategory(matcher.group(1));
            product.setId(Integer.parseInt(matcher.group(2)));
            product.setName(matcher.group(3));
            product.setFactor(matcher.group(4));
            product.setQuantity(Integer.parseInt(matcher.group(5)));
            product.setPacked(Boolean.parseBoolean(matcher.group(6)));
            product.setAdv(Boolean.parseBoolean(matcher.group(7)));
            product.setPrice(Double.parseDouble(matcher.group(8)));
            product.setMargin(Double.parseDouble(matcher.group(9)));
            product.setDebt(Boolean.parseBoolean(matcher.group(10)));
        }
        this.productList.add(product);
    }

    public void printProducts() {
        for (Product each : productList) {
            System.out.println(each);
        }
    }


}
