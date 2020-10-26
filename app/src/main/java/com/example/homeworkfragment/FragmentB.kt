package com.example.homeworkfragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_b.*
import kotlin.math.pow

class FragmentB : Fragment (), View.OnClickListener{
    val TAG = "FragmentB"

    interface OnSelectedButtonListenerB{
        fun onButtonB(number : Int)
    }
    override fun onAttach(context: Context) {
        Log.d(TAG,"onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)


    }
    override fun onClick(v: View?) {
        val listener = activity as FragmentB.OnSelectedButtonListenerB?
        listener?.onButtonB(subfact(textViewB.text.toString().toInt()).toInt())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"onCreateView")
        val rootView = inflater.inflate(R.layout.fragment_b,container,false)
        val butB = rootView.findViewById<Button>(R.id.buttonB)
        butB.setOnClickListener(this)
        return  rootView
       // return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"onActiviteCreated")
        val bundle = arguments
        if(bundle != null) {
            textViewB.text = bundle.getInt("value").toString()
        }
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"onDetach")
        super.onDetach()
    }
    fun subfact(argument: Int) : Double {
        var result: Double = 0.0
        result = fact(argument) * subfactsup(argument)
        return result
    }
    fun subfactsup(argument: Int) : Double {
        var result: Double = 1.0
        var temp: Double = -1.0
        for(index in 1..argument) {
            result +=  temp.pow(index)/fact(index)
        }
        return result
    }
    fun fact(argument: Int) : Int {
        var result : Int = 1
        for (index in 1..argument) {
            result *= index
        }
        return result
    }
}