package com.example.counter48.helper

import com.example.counter48.presenter.Presenter
import com.example.counter48.model.CounterModel

class Injector {

    companion object{
        fun getPresenter(): Presenter {
            return Presenter()
        }
        fun getModel(): CounterModel {
            return CounterModel()
        }
    }

}