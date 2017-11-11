package ua.sustavov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.sustavov.model.User;
import ua.sustavov.model.Wallet;
import ua.sustavov.model.Wrapper;
import ua.sustavov.service.UserService;
import ua.sustavov.service.WalletService;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserWalletController {

    @Autowired
    private UserService userService;

    @Autowired
    private WalletService walletService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = UserRestURIController.GET_USR, method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable("id") int id) {
        return userService.get(id);
    }

    @RequestMapping(value = UserRestURIController.PUT_USR, method = RequestMethod.PUT)
    public @ResponseBody
    Wrapper updateUser(@PathVariable("id") int id, @RequestBody Wrapper wrapper) {

        User wrapperUser = wrapper.getUser();
        Wallet wrapperWallet = wrapper.getWallet();

        if (wrapperUser == null || wrapperWallet == null) {

        }

        User checkUser = userService.get(id);
        if (checkUser == null) {

        }

        checkUser.setName(wrapperUser.getName());

        User updateUser = userService.update(checkUser);

        Wallet checkWallet = walletService.getByUserId(id);
        checkWallet.setNumber(wrapperWallet.getNumber());
        checkWallet.setSum(wrapperWallet.getSum());
        Wallet updateWallet = walletService.update(checkWallet, id);

        return new Wrapper(updateUser, updateWallet);


    }


}
