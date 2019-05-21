package com.techspark.laughterapp

class Contract {

    interface Presenter{
        fun play(index: Int)
    }
    interface  View{
        fun play(id: Int)
    }
}