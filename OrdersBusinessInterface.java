package business;

import java.util.List;
import javax.ejb.Local;
import beans.Order;
//import beans.Orders;

@Local
public interface OrdersBusinessInterface 
{
	public List<Order> getOrders();
	public void setOrders(List<Order> orders);
	public void test();
	public Order getOrder(int id);
}