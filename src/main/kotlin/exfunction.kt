fun main(args: Array<String>) {

    add()
    multiply()
}
fun add(){
    println("Enter First Number")
    var Num1:Int = readln()!!.toInt()

    println("Enter Second Number")
    var Num2:Int = readln()!!.toInt()

    var result = Num1 + Num2
    println(result)

}

fun multiply() {
    println("Enter First Number")
    var Numb1: Int = readln()!!.toInt()

    println("Enter Second Number")
    var Numb2: Int = readln()!!.toInt()

    var result = Numb1 * Numb2
    println(result)
}