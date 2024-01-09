package com.cydeo.repository;

import com.cydeo.dto.TransactionDTO;
import com.cydeo.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query(value="SELECT*FROM transactions ORDER BY create_date DESC LIMIT 10", nativeQuery = true)
    List<Transaction> findLast10Transactions();
//Native query
//@Query(value = "SELECT * FROM transactions ORDER BY account_id DESC", nativeQuery = true)
//JPQL query
@Query(value = "SELECT t FROM Transaction t WHERE t.sender.id =?1 OR t.receiver.id=?1")
    List<Transaction> findTransactionListByAccountId(Long id);


//    List<TransactionDTO> transactionDTOList = new ArrayList<>();
//
//    public TransactionDTO save(TransactionDTO transactionDTO) {
//        transactionDTOList.add(transactionDTO);
//        return transactionDTO;
//    }
//
//    public List<TransactionDTO> findAll() {
//        return transactionDTOList;
//    }
//
//    public List<TransactionDTO> findLast10Transactions() {
//
//
//        return transactionDTOList.stream().sorted(Comparator.comparing(TransactionDTO::getCreateDate).reversed()).limit(10).collect(Collectors.toList());
//    }
//    public List<TransactionDTO> findTransactionListByAccountId(Long id){
//        return transactionDTOList.stream().filter(transactionDTO -> transactionDTO.getSender().equals(id) || transactionDTO.getReceiver().equals(id)).collect(Collectors.toList());
//    }
}
