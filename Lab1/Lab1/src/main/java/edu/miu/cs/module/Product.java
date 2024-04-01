package edu.miu.cs.module;

import java.time.LocalDate;
import java.util.Objects;

public class Product implements Comparable<Object> {
    private Long productId;
    private String name;
    private LocalDate dateSupplied;
    private Integer quantityStock;
    private Double unitPrice;

    public Product() {
        this(null, null, null, null, null);
    }

    public Product(String name) {
        this(null, name, null, null, null);
    }

    public Product(Long productId, String name, LocalDate dateSupplied, Integer quantityStock, Double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityStock = quantityStock;
        this.unitPrice = unitPrice;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return " {" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", dateSupplied='" + dateSupplied + '\'' +
                ", quantityStock=" + quantityStock +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public String printXML(){
        return "  <product " + "productId="+this.productId + " name="+this.name + " dateSupplied="+this.dateSupplied + " qauntityInStock="+this.quantityStock + " unitPrice="+this.unitPrice + ">";
    }

    public String printCSV(){
        return this.productId + ", " + this.name + ", " + this.dateSupplied + ", " + this.quantityStock + ", " + this.unitPrice;
    }


}
