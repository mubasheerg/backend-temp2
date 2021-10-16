package com.revature.shopmanagement.dao.impl;

import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import com.revature.shopmanagement.dao.OrderItemDAO;
import com.revature.shopmanagement.entity.OrderItem;
import com.revature.shopmanagement.exception.DataBaseException;

@Repository
public class OrderItemDAOImpl implements OrderItemDAO {

	@Autowired
	private OrderItemDAO orderItemDAO;

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Double getSumByOrderId(Long orderId) {
		try {
			Session session = sessionFactory.getCurrentSession();
			return (Double) session.createQuery("SELECT SUM(o.price) FROM OrderItem o WHERE o.order.id=:orderId")
					.setParameter("orderId", orderId).getSingleResult();
		} catch (Exception e) {
			throw new DataBaseException("");
		}

	}

	@Override
	public List<OrderItem> getOrderedItems(Long orderId) {
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<OrderItem> query = session.createQuery("FROM OrderItem o WHERE o.order.id=:orderId", OrderItem.class);
			query.setParameter("orderId", orderId);
			return query.list();
		} catch (Exception e) {
			throw new DataBaseException("");
		}
	}

	@Transactional
	@Override
	public Long saveOrderItem(OrderItem orderItem) {
		try {
			Session session = sessionFactory.getCurrentSession();
			orderItem.setCreatedOn(new Date());
			Long value = (Long) session.save(orderItem);
			return value;
		} catch (Exception e) {
			throw new DataBaseException("Error in database");
		}

	}

	@Override
	public boolean isOrderItemExists(Long orderItemId) {
		return orderItemDAO.isOrderItemExists(orderItemId);
	}

}
