
fun main(){
//    val diceRange: IntRange = 1..6
    val myFirstDice = Dice(20)
    val twelve = Dice(12)
//    println(myFirstDice.sides)
    println(myFirstDice.roll())
    println(twelve.roll())
}

class Dice(private val numSides: Int){
//    var sides = 6
    fun roll ():Int{
        val randomNumber = (1..numSides).random(); return randomNumber
    }
}