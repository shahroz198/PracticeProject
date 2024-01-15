package com.example.foodorderingapp.ClassRepo

import com.example.foodorderingapp.R
import com.example.foodorderingapp.modelClass.BurgerDetailClass

class DataRepo {
    fun listofData():List<BurgerDetailClass>{
        var dataList = mutableListOf<BurgerDetailClass>()
        dataList.add(BurgerDetailClass(R.drawable.burger,"Cheese Burger","12"))
        dataList.add(BurgerDetailClass(R.drawable.burger,"Cheese Burger","12"))
        dataList.add(BurgerDetailClass(R.drawable.burger,"Cheese Burger","12"))
        dataList.add(BurgerDetailClass(R.drawable.burger,"Cheese Burger","12"))
        dataList.add(BurgerDetailClass(R.drawable.burger,"Cheese Burger","13"))
        dataList.add(BurgerDetailClass(R.drawable.burger,"Cheese Burger","14"))
        dataList.add(BurgerDetailClass(R.drawable.burger,"Cheese Burger","15"))
        return dataList
    }
}