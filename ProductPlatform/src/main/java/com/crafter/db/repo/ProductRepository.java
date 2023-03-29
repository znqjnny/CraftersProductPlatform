package com.crafter.db.repo;

import com.crafter.db.entity.Product;
import com.mongodb.lang.NonNull;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


public interface ProductRepository {

    @NonNull
    List<Product> list();

    void save(@NonNull @NotNull @Valid Product product);
}
