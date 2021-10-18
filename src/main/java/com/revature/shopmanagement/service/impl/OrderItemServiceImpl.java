package com.revature.shopmanagement.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.shopmanagement.entity.Order;
import com.revature.shopmanagement.dao.OrderDAO;
import com.revature.shopmanagement.dao.OrderItemDAO;
import com.revature.shopmanagement.dao.ProductDAO;
import com.revature.shopmanagement.dao.StocksDAO;
import com.revature.shopmanagement.dto.OrderItemDTO;
import com.revature.shopmanagement.entity.OrderItem;
import com.revature.shopmanagement.entity.Products;
import com.revature.shopmanagement.mapper.OrderItemMapper;
//import com.revature.shopmanagement.entity.OrderItem;
//import com.revature.shopmanagement.exception.DataBaseException;
//import com.revature.shopmanagement.exception.IdNotFoundException;
//import com.revature.shopmanagement.mapper.OrderItemMapper;
import com.revature.shopmanagement.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	private static final Logger logger = LogManager.getLogger(OrderItemServiceImpl.class);

	@Autowired
	private OrderItemDAO orderItemDAO;
	@Autowired
	private StocksDAO stocksDAO;
	@Autowired
	private OrderDAO orderDAO;
	@Autowired
	private ProductDAO productDAO;

	@Override
	public Long addItems(OrderItemDTO orderItemDTO) {
		Long response = 0L;
		OrderItem orderItemEntity = orderItemDAO.checkOrder(orderItemDTO.getOrder().getOrderId(),
				orderItemDTO.getProduct().getProdId());
		Products product = productDAO.getProductById(orderItemDTO.getProduct().getProdId());
		System.out.println(orderItemEntity);
		if (orderItemEntity == null) {
			orderItemDTO.setPrice(orderItemDTO.getQuantity() * product.getProdPrice());
			OrderItem orderItem = OrderItemMapper.dtoToEntity(orderItemDTO);
			response = orderItemDAO.addItems(orderItem);
			Double sum = orderItemDAO.getSumByOrderId(orderItem.getOrder().getOrderId());
			orderDAO.updateOrder(sum, orderItem.getOrder().getOrderId());
			stocksDAO.updateCount(orderItem.getProduct().getProdId(), orderItemDTO.getQuantity());
		} else {
			orderItemDTO.setPrice(orderItemEntity.getPrice() + (orderItemDTO.getQuantity() * product.getProdPrice()));
			orderItemDTO.setQuantity(orderItemEntity.getQuantity() + orderItemDTO.getQuantity());
			OrderItem orderItem = OrderItemMapper.dtoToEntity(orderItemDTO);
			response = orderItemDAO.updateItems(orderItemEntity.getId(), orderItem);
			Double sum = orderItemDAO.getSumByOrderId(orderItemEntity.getOrder().getOrderId());
			orderDAO.updateOrder(sum, orderItemEntity.getOrder().getOrderId());
			stocksDAO.updateCount(orderItemEntity.getProduct().getProdId(), orderItemDTO.getQuantity());
		}

		return response;
	}

	@Override
	public List<OrderItem> getOrderedItems(Long orderId) {

		return orderItemDAO.getOrderedItems(orderId);
	}
}
