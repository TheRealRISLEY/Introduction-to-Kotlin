fun main(args: Array<String>) {
    var weight = 80
    var height = 1.9

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