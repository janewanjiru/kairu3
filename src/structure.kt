fun main() {
var people=Human("lawrence",23,65)
    people.eat(2)
    println(people.weight)
    people.speak("believable")
    people.birthday(1)
    var documents=Human.user("Jane","Wanjiru","kairuwanjirujane@gmail.com","0724256548","classroom1")
    ""
    println(documents.email)
    println (documents.firstName)
}
class Human(var name:String,var age:Int,var weight:Int){
  fun eat(foodWeight:Int):Int{
      println("I am eating $foodWeight kgs of food")
      weight=weight+foodWeight
      return weight
  }
    fun speak(speech:String) {
        println(speech)

    }
    fun birthday(birthday:Int) {
        age=age+1
        println(age)

    }
    class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)
    }
