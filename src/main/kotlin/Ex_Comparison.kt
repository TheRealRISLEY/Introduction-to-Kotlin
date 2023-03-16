fun main(args: Array<String>) {
    print("Enter Your Marks")
    var marks:Int = readln()!!.toInt()

    if (marks >= 80 )
    {
        print("A - Congratulations")}

    else if (marks >= 60){
        print("B - Good Trial")}

    else if (marks >= 40){
        print("C - Good")}

    else if (marks >= 20){
        print("D - Trial")}

    else if (marks >= 10){
        print("E - You have to Repeat")}
    
}