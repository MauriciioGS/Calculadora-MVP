package com.unam.calculadoramvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.unam.calculadoramvp.R
import com.unam.calculadoramvp.databinding.ActivityOperationBinding
import com.unam.calculadoramvp.interfaces.OperationPresenter
import com.unam.calculadoramvp.interfaces.OperationView
import com.unam.calculadoramvp.presenter.OperationPresenterImpl
import java.lang.NumberFormatException

class OperationActivity : AppCompatActivity(), OperationView {

    private lateinit var binding: ActivityOperationBinding
    private lateinit var opPresenter : OperationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOperationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        opPresenter = OperationPresenterImpl(this)
    }

    override fun showResult(res: String) {
        binding.textView.text = res
    }

    override fun invalidOperation() {
        Toast.makeText(this, "Operación inválida, intenta nuevamente", Toast.LENGTH_SHORT)
            .show()
    }

    fun suma(view: View) {
        try {
            val a = binding.editTextTextPersonName.text.toString().toInt()
            val b = binding.editTextTextPersonName2.text.toString().toInt()
            opPresenter.add(a,b)
        }catch (exc : NumberFormatException){
            invalidOperation()
        }
    }

    fun resta(view: View) {
        try {
            val a = binding.editTextTextPersonName.text.toString().toInt()
            val b = binding.editTextTextPersonName2.text.toString().toInt()
            opPresenter.sub(a,b)
        }catch (exc : NumberFormatException){
            invalidOperation()
        }
    }

    fun multiplica(view: View) {
        try {
            val a = binding.editTextTextPersonName.text.toString().toInt()
            val b = binding.editTextTextPersonName2.text.toString().toInt()
            opPresenter.mult(a,b)
        }catch (exc : NumberFormatException){
            invalidOperation()
        }
    }

    fun divide(view: View) {
        try {
            val a = binding.editTextTextPersonName.text.toString().toInt()
            val b = binding.editTextTextPersonName2.text.toString().toInt()
            opPresenter.div(a,b)
        }catch (exc : NumberFormatException){
            invalidOperation()
        }
    }


}