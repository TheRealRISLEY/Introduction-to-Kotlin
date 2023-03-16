fun main(args: Array<String>) {
    println("Enter Your Weight")
    var weight:Int = readLine()!!.toInt()

    println("Enter Your Height")
    var height:Float = readLine()!!.toFloat()

    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }
    else if (bmi <= 29){
        println("Normal Weight")
    }
    else{
        println("Obese")
    }

}