package historiab.fasteat.repository;

import historiab.fasteat.FasteatApplicationTests;
import historiab.fasteat.model.entity.Item;
import historiab.fasteat.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends FasteatApplicationTests {

    // Dependency Injection (DI)
    @Autowired
    public UserRepository userRepository;

    @Test
    public void create(){

        String account = "Test02";
        String password = "Test02";
        String status = "REGISTERED";
        String email = "Test03@gmail.com";
        String phoneNumber = "010-1111-3333";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setRegisteredAt(registeredAt);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);

        User newUser = userRepository.save(user);

        Assertions.assertNotNull(newUser);

    }

    @Test
    @Transactional
    public void read(){


        User user = userRepository.findByPhoneNumber("010-1111-2222");

        if(user != null){
            user.getOrderGroupList().stream().forEach(orderGroup -> {

                System.out.println("--------------주문묶음--------------");
                System.out.println("수령인 : " + orderGroup.getRevName());
                System.out.println("수령지 : " + orderGroup.getRevAddress());
                System.out.println("총금액 : " + orderGroup.getTotalPrice());
                System.out.println("총수량 : " + orderGroup.getTotalQuantity());
                System.out.println("--------------주문상세--------------");

                orderGroup.getOrderDetailList().forEach(orderDetail -> {
                    System.out.println("주문 상품 : " + orderDetail.getItem().getName());
                    System.out.println("고객센터 번호 : " + orderDetail.getItem().getPartner().getCallCenter());
                    System.out.println("주문의 상태 : " + orderDetail.getStatus());
                    System.out.println("도착예정일자 : " + orderDetail.getArrivalDate());



                });

            });
        }

        Assertions.assertNotNull(user);


    }

    @Test

    public void update(){

    }


    @Test
    public void delete(){

    }

}
