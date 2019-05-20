package com.techspark.laughterapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup




class LaughFragment : Fragment(),Contract.View {

    lateinit var presenter: Contract.Presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        presenter = LaughPresenter(this)
        return inflater.inflate(R.layout.fragment_laugh, container, false)
    }



}
