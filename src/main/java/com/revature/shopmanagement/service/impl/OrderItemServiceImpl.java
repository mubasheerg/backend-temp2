package com.revature.shopmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.shopmanagement.dao.OrderDAO;
import com.revature.shopmanagement.dao.OrderItemDAO;
import com.revature.shopmanagement.dto.OrderItemDTO;
import com.revature.shopmanagement.entity.OrderItem;
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
	private OrderDAO orderDAO;

	@Override
	public String addItems(OrderItemDTO orderItemDTO) {
		OrderItem orderItem = OrderItemMapper.dtoToEntity(orderItemDTO);
		Long id = orderItem.getId();
		if (orderItemDAO.isOrderItemExists(id));
		return null;
	}

	@Override
	public List<OrderItemDTO> getOrderedItems(Long orderId) {
//		try {
//			 if(orderDAO.getOrderById(orderId)==null) {
//					throw new IdNotFoundException("Order id not found");
//			}
//			List<OrderItem> orderItemList = orderItemDAO.getOrderedItems(orderId);
//			if (CollectionUtils.isEmpty(orderItemList)) {
//	 			throw new DataBaseException("Order Item Id Not Found");
//			}
//			else {	
//				List<OrderItemDTO> orderItemDto = new ArrayList<>();
//				orderItemList.stream().forEach(entity -> orderItemDto.add(OrderItemMapper.toDto(entity)));
//				return orderItemDto;
//			}
//		} catch (DataBaseException e) {
//			throw new BusinessLogicException(e.getMessage());
//		}
//	}
		return null;
//}

	}
}
