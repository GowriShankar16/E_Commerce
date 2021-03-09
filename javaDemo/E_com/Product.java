package javaDemo.E_com;

import javax.persistence.*;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="price")
	private Double price;
	
	@Column(name ="colour")
	private String colour;
	
	@Column(name ="brand")
	private String brand;
	
	@Column(name="Quantity")
	private Integer quantity;
	
	public Product() {
		super();
	}

	public Product( String name, Double price, String colour, String brand,Integer quantity) {
		super();
		
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.brand = brand;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		brand = brand;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setquantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}