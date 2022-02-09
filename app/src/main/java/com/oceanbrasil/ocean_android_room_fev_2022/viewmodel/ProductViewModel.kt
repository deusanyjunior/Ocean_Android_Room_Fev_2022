package com.oceanbrasil.ocean_android_room_fev_2022.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.oceanbrasil.ocean_android_room_fev_2022.model.AppDatabase
import com.oceanbrasil.ocean_android_room_fev_2022.model.ProductEntity

class ProductViewModel(application: Application) :
    AndroidViewModel(application)
{
        val products: LiveData<List<ProductEntity>>

        init {
            val db = AppDatabase.getDatabase(application)

            val productDao = db.productDao()

            val product1 = ProductEntity(null, "Samsung Book", null)
            productDao.create(product1)

            products = productDao.selectAll()
        }
}