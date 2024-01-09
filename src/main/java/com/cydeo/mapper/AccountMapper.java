package com.cydeo.mapper;

import com.cydeo.dto.AccountDTO;
import com.cydeo.entity.Account;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    private final ModelMapper modelMapper;

    public AccountMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
//this method will accept Account entity and will convert it to DTO
    public AccountDTO convertToDTO(Account entity){
        return modelMapper.map(entity,AccountDTO.class);
    }
//this method will accept DTO and convert it to entity
    public Account convertToEntity(AccountDTO accountDTO){
        return modelMapper.map(accountDTO, Account.class);
    }
}
