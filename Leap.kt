import java.util.*
fun main(a:Array<String>){
  var sr=Scanner(System.`in`)
    var year:Int=sr.nextInt()
    if(year%4==0)
        print("Leap Year")
    else
        print("Not a Leap Year")
}
