package OOP

class Vehicles(owner:String, price:Int, colour:String, type:String, Year:Int ) {

    init {
        println("Owner is $owner")
        println("The Price is $price")
        println("The Colour is $colour")
        println("The Type is $type")
        println("The Year of Manufacture is $Year")
    }

}

fun main(args: Array<String>) {
    var vehicle_one = Vehicles("Rick", 2000000, "Blue", "Van", 2002)
    var vehicle_two = Vehicles("Nick", 6000000, "Yellow", "Van", 2022)
    var vehicle_three = Vehicles("Frankline", 2600000, "Green", "Van", 2019)
    var vehicle_four = Vehicles("Rama", 2050000, "Black", "Van", 2014)
    var vehicle_five = Vehicles("Matel", 8000000, "White", "Lorry", 2011)
}