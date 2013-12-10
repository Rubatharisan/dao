package domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	
	@Id
	private int id;
	private int product;
	private int quantity;
	private Date startDate;
	private Date finishDate;
	
	public Order(){
		product = 0;
		quantity = 0;
		startDate = null;
		finishDate = null;
	}
	
	public Order(int product, int quantity, Date startDate, Date finishDate){
		this.product = product;
		this.quantity = quantity;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	
}
