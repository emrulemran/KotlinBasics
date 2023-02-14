fun main(args: Array<String>) {
    println("Hello World!")

    var name:String = "new york city"
    println(name)

    println(name.get(1))


    test("a", "b")

  var result = mul(10, 25)
    println(result)
}



fun test(n:String, m:String){

    println( n + " " + m)
}


public fun mul(a:Int, b:Int):Int{

return a * b
}