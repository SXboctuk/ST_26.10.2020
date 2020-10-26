package com.example.homeworkfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_c.*

class MainActivity : AppCompatActivity() , FragmentA.OnSelectedButtonListenerA , FragmentB.OnSelectedButtonListenerB , FragmentC.OnSelectedButtonListenerC {

    val manager = supportFragmentManager

    val fragmenta = FragmentA()
    val fragmentb = FragmentB()
    val fragmentc = FragmentC()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragmenta)
            commit()
        }

    }

    override fun onButtonA(numberA : Int) {
        val bundleb = Bundle()
        bundleb.putInt("value",numberA)
        fragmentb.arguments = bundleb

        manager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragmentb)
            addToBackStack(null)
            commit()
        }
    }

    override fun onButtonB(numberB: Int) {
        val bundlec = Bundle()
        bundlec.putInt("value",numberB)
        fragmentc.arguments = bundlec

        manager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragmentc)
            addToBackStack(null)
            commit()
        }
    }
    override fun onButtonC() {
        manager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragmenta)
            for(i in 0..manager.backStackEntryCount)
            {
                manager.popBackStack();
            }
            commit()
        }
    }
}