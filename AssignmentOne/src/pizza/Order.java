package pizza;

import java.util.Arrays;
import java.util.Date;

public class Order {
	private int orderId;
	private int noOfPizzas;
	private int[] pizzaId;
	private double totalAmount;
	private Date orderDate;
	private Time orderTime;

	public Order() {

	}

	public Order(int orderId, int noOfPizzas, int[] pizzaId,
			double totalAmount, Date orderDate, Time orderTime) {

		this.orderId = orderId;
		this.noOfPizzas = noOfPizzas;
		this.pizzaId = pizzaId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getNoOfPizzas() {
		return noOfPizzas;
	}

	public void setNoOfPizzas(int noOfPizzas) {
		this.noOfPizzas = noOfPizzas;
	}

	public int[] getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(int[] pizzaId) {
		this.pizzaId = pizzaId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Time getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", noOfPizzas=" + noOfPizzas
				+ ", pizzaId=" + Arrays.toString(pizzaId) + ", totalAmount="
				+ totalAmount + ", orderDate=" + orderDate + ", orderTime="
				+ orderTime + "]";
	}

}
