package OOP

class House(owner:String, bedrooms:String, price:Int) {


//Initialize our class
    init {
        println("Owner is $owner")
        println("Number of Bedrooms are $bedrooms")
        println("Asking price is $price")
    }
}

fun main(args: Array<String>) {
    var house_one = House("Mike Joe", "2", 700000)
    var house_two = House("Sharon", "3", 900000)
    var house_three = House("Keith", "4", 600000)
}