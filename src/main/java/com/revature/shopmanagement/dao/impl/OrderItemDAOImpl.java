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
	public Long addItems(OrderItem orderItem) {
		Long id=0L;
		try {
			Session session = sessionFactory.getCurrentSession();
			orderItem.setCreatedOn(new Date());
			id=(Long)session.save(orderItem);
			session.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw new DataBaseException("Error in database");
		}
		return id;

	}

	@Override
	public boolean isOrderItemExists(Long id) {
		Session session = sessionFactory.getCurrentSession();
		OrderItem orderItem = session.get(OrderItem.class, id);
		return (orderItem != null);
	}

	public OrderItem checkOrder(Long orderId, Long productId) {
		System.out.println(orderId + " " + productId);
		Session session = sessionFactory.getCurrentSession();
		Query<OrderItem> query = session
				.createQuery("FROM OrderItem WHERE order.orderId=:orderId AND product.prodId=:prodId",OrderItem.class);
		query.setParameter("orderId", orderId);
		query.setParameter("prodId", productId);
		return query.uniqueResult();
	}
	
	@Transactional
	@Override
	public Long updateItems(Long id,OrderItem orderItem) {
		Long response=0L;
		try {
			Session session = sessionFactory.getCurrentSession();
			System.out.println(orderItem);
			orderItem.setCreatedOn(new Date());
			OrderItem orderItemEntity=session.load(OrderItem.class,id);
			System.out.println(orderItemEntity);
			orderItemEntity.setCreatedOn(orderItem.getCreatedOn());
			orderItemEntity.setPrice(orderItem.getPrice());
			orderItemEntity.setQuantity(orderItem.getQuantity());
			System.out.println(session.merge(orderItemEntity));
			response=id;
		} catch (Exception e) {
			e.printStackTrace();
			throw new DataBaseException("Error in database");
		}
		return response;
	}

}
