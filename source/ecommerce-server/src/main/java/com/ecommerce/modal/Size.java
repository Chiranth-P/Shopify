package com.ecommerce.modal;


import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Size {

	private String name;
	private int quantity;

}
