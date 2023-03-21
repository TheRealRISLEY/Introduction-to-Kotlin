fun main(args: Array<String>) {
    println("Enter a Number")
    var number = readln()!!.toInt()

    when (number) {
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")
        5-> println("No Expiry")
        6-> println("Video Bundles")
        7-> println("Okoa Data")
        8-> println("Lipa Mdogo")
        9-> println("Data Plus NEW")
        10-> println("Hot Minutes")
        98-> println("MORE")

        else-> println("Option Not Available")

    }


}