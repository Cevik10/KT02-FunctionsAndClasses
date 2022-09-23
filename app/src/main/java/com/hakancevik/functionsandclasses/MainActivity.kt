package com.hakancevik.functionsandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hakancevik.functionsandclasses.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //private lateinit var resultText : TextView
    //resultText = findViewById(R.id.resultText)  // initialize in onCreate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        mFactorial(5)
        val x = sum(7294439, 324424)
        println("X: $x")

        binding.resultText.text = "Result: $x"


        // Object - Instance
        val carlsen = ChessPlayer("Magnus Carlsen", 27, "GM", "London")
        val hansNiemann = ChessPlayer("Hans Niemann", 19, "IM", "Ruy-Lopez")

        carlsen.age = 31
        hansNiemann.title = "GM"


        carlsen.setElo(2978)
        hansNiemann.setElo(1943)

        println("name: " + carlsen.name)
        println("Magnus age: " + carlsen.age)
        println("Magnus title: " + carlsen.title)
        println("Magnus opening: " + carlsen.opening)
        println("Magnus elo: " + carlsen.getElo())


        println("\nname: " + hansNiemann.name)
        println("Hans N. age: " + hansNiemann.age)
        println("Hans N. title: " + hansNiemann.title)
        println("Hans N. opening: " + hansNiemann.opening)
        println("Hans N. elo: " + hansNiemann.getElo())


        // Nullability
        // Nullable (?) && Non-null

        var myPoem: String? = null
        var myAward: Int? = null

        myPoem = "Covenant"


        // 1) Null safety

        if (myPoem != null) {
            println("Poem: " + myPoem);
        } else println("Null")

        if (myAward != null) {
            println("Award: " + myPoem)
        } else println("0")

        // 2) Safe call

        println(myAward?.compareTo(13))

        // 3) elvis

        val awardCount = myAward?.compareTo(11) ?: -1
        println("award count: $awardCount")


    }


    // return void / unit
    private fun mFactorial(number: Int) {
        var sum = 1
        if (number > 0) {
            for (i in 2..number) {
                sum *= i
            }
            println("${number}! = $sum")
        }
    }

    // return Int
    private fun sum(a: Int, b: Int): Int {
        return a + b
    }


}