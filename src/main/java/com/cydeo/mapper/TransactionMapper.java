package com.cydeo.mapper;

import com.cydeo.dto.AccountDTO;
import com.cydeo.dto.TransactionDTO;
import com.cydeo.entity.Account;
import com.cydeo.entity.Transaction;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapper {
    private final ModelMapper modelMapper;

    public TransactionMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //this method will accept Account entity and will convert it to DTO
    public TransactionDTO convertToDTO(Transaction entity){
        return modelMapper.map(entity,TransactionDTO.class);
    }
    //this method will accept DTO and convert it to entity
    public Transaction convertToEntity(TransactionDTO transactionDTO){
        return modelMapper.map(transactionDTO, Transaction.class);
    }
}
