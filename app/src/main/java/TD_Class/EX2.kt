package TD_Class

class  Animal(var nom : String, var age : Int){
    fun  afficherDetails(){
        println("le nom : $nom est age : $age ans")
    }
}
fun main(){
    var A1 = Animal("lion",20)
    var A2 = Animal("pain",5)
    A1.afficherDetails()
    A2.afficherDetails()
}