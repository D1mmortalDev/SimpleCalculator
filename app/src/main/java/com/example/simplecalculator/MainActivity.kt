package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var input1:Double=0.0
    private var input2:Double=0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{
            input1=binding.editTxtInput1.text.toString().toDouble()
            input2=binding.editTxtInput2.text.toString().toDouble()
            val sum ={num1:Double,num2:Double->num1+num2}
            binding.txtViewResult.text = "The sum is ${sum(input1,input2).toString()} "
        }

        binding.btnSubtract.setOnClickListener{
            input1=binding.editTxtInput1.text.toString().toDouble()
            input2=binding.editTxtInput2.text.toString().toDouble()
            val difference ={num1:Double,num2:Double->num1-num2}
            binding.txtViewResult.text = "The difference is ${difference(input1,input2).toString()}"
        }

        binding.btnMultiply.setOnClickListener{
            input1=binding.editTxtInput1.text.toString().toDouble()
            input2=binding.editTxtInput2.text.toString().toDouble()
            val product ={num1:Double,num2:Double->num1*num2}
            binding.txtViewResult.text = "The product is ${product(input1,input2).toString()}"
        }

        binding.btnDivide.setOnClickListener{
            input1=binding.editTxtInput1.text.toString().toDouble()
            input2=binding.editTxtInput2.text.toString().toDouble()
            val quotient ={num1:Double,num2:Double->num1/num2}
            binding.txtViewResult.text = "The quotient is ${quotient(input1,input2).toString()}"
        }
    }

}


