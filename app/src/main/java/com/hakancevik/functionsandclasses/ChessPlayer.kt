package com.hakancevik.functionsandclasses

class ChessPlayer(
    var name: String,
    var age: Int,
    var title: String,
    var opening: String
) {


    private var elo: Int = 1500


    // getter
    fun getElo(): Int {
        return this.elo
    }

    // setter
    fun setElo(raiting: Int) {
        this.elo = raiting
    }

    // Property
    /*
    var  name : String = ""
    var  age : Int = 18
    var  title : String = ""
    var  opening : String = ""

    constructor(name: String, age: Int, title: String, opening: String) {
        this.name = name
        this.age = age
        this.title = title
        this.opening = opening
        }

     */

}