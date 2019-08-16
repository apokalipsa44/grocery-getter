package com.michau.repository.clientsRepository;

import com.michau.model.clients.StoreEmployee;
import org.springframework.data.repository.CrudRepository;

public interface StoreEmployeeRepo extends CrudRepository<StoreEmployee, Long> {
}
