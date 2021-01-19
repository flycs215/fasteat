package historiab.fasteat.repository;

import historiab.fasteat.FasteatApplicationTests;
import historiab.fasteat.model.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends FasteatApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void creat(){
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderAt(LocalDateTime.now());

        // orderDetail.setUserId(1L);
        // orderDetail.setItemId(1L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        Assertions.assertNotNull(newOrderDetail);


    }
}
