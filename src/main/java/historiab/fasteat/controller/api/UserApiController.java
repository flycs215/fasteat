package historiab.fasteat.controller.api;

import historiab.fasteat.ifs.CrudInterface;
import historiab.fasteat.model.network.Header;
import historiab.fasteat.model.network.request.UserApiRequest;
import historiab.fasteat.model.network.response.UserApiResponse;
import historiab.fasteat.service.UserApiLogicService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {


    @Autowired
    private UserApiLogicService userApiLogicService;


    @Override
    @PostMapping("") // /api/user
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        log.info("{} , {}",request);
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // /api/user/{id}
    public Header<UserApiResponse> read(@PathVariable(name = "id") Long id) {
        return null;
    }

    @Override
    @PutMapping("") // /api/user
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return null;
    }
}
