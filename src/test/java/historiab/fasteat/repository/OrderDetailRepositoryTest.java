package historiab.fasteat.repository;

import historiab.fasteat.FastestApplicationTests;
import historiab.fasteat.model.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends FastestApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void creat(){
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setStatus("WAITING");
        orderDetail.setArrivalDate(LocalDateTime.now().plusDays(2));
        orderDetail.setQuantity(1);
        orderDetail.setTotalPrice(BigDecimal.valueOf(900000));

//        orderDetail.setOrderGroupId(1L);
//        orderDetail.setItemId(1L);

        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("AdminServer");



        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        Assertions.assertNotNull(newOrderDetail);


    }
}
