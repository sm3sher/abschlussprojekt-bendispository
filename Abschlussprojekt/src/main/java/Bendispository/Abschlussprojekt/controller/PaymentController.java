package Bendispository.Abschlussprojekt.controller;

import Bendispository.Abschlussprojekt.repos.transactionRepos.PaymentTransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @Autowired
    PaymentTransactionRepo paymentTransactionRepo;

    @GetMapping(path = "/profile/PaymentTransaction")
    public String concludeTransaction(Model model){
        return "/";
    }
}