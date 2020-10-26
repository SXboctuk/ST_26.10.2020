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

class FragmentA : Fragment(), View.OnClickListener {
    val TAG = "FragmentA"

    interface OnSelectedButtonListenerA{
        fun onButtonA(number : Int)
    }

    override fun onAttach(context: Context) {
        Log.d(TAG,"onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"onCreateView")
        val rootView = inflater.inflate(R.layout.fragment_a,container,false)
        val butA = rootView.findViewById<Button>(R.id.buttonA)
        butA.setOnClickListener(this)
        return  rootView
        //return inflater!!.inflate(R.layout.fragment_a,container,false)
       // return super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onClick(v: View?) {
       val listener = activity as OnSelectedButtonListenerA?
        listener?.onButtonA(editTextNumberDecimalA.text.toString().toInt())
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"onActiviteCreated")
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


}