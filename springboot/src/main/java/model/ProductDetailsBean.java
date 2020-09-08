package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;


@Data
public class ProductDetailsBean {
    @Getter
    String productName;
    @Getter
    double price;
    @Setter''
    int totalCntProduct;
}
