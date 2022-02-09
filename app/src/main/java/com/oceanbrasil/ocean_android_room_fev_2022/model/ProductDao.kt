package com.oceanbrasil.ocean_android_room_fev_2022.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    // CRUD

    // CREATE - INSERT
    @Insert
    fun create(product: ProductEntity)

    // RECOVER - SELECT
    @Query("SELECT * FROM products")
    fun selectAll(): LiveData<List<ProductEntity>>
}