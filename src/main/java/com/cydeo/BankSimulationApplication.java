package com.cydeo;

import com.cydeo.service.AccountService;
import com.cydeo.service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankSimulationApplication {

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(BankSimulationApplication.class, args);

        //get account and transaction service beans
        AccountService accountService = container.getBean(AccountService.class);
        TransactionService transactionService = container.getBean(TransactionService.class);

        //create 2 account sender and receiver
//       AccountDTO sender =  accountService.createNewAccount(BigDecimal.valueOf(70), new Date(), AccountType.CHECKING, 1L);
//
//       AccountDTO receiver = accountService.createNewAccount(BigDecimal.valueOf(50), new Date(), AccountType.CHECKING, 2L);
//        AccountDTO sender2 =  accountService.createNewAccount(BigDecimal.valueOf(70333), new Date(), AccountType.CHECKING, 1L);
//
//        AccountDTO receiver2 = accountService.createNewAccount(BigDecimal.valueOf(50500), new Date(), AccountType.CHECKING, 2L);
//        AccountDTO sender3 =  accountService.createNewAccount(BigDecimal.valueOf(70000), new Date(), AccountType.CHECKING, 1L);
//
//        AccountDTO receiver3 = accountService.createNewAccount(BigDecimal.valueOf(5000), new Date(), AccountType.CHECKING, 2L);
////       Account receiver2 = null;
////
////       accountService.listAllAccount().forEach(System.out::println);
////       transactionService.makeTransfer(sender,receiver,new BigDecimal(40),new Date(),"Transaction 1");
////        System.out.println(transactionService.findAllTransaction().get(0));
////        accountService.listAllAccount().forEach(System.out::println);
    }
@Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
