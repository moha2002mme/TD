package TD_Class

class CompteBancaire(var titulaire : String,var solde : Double){
    fun  depot(a :Double){
        solde += a
    }
    fun retrait(r : Double){
        if( solde >= r && r>0){
            solde-= r
        }else{
            println("inpossible!!!")
        }

    }
    fun afficherSolde(){
        println("titulaire : $titulaire est solde : $solde DH")
    }

}
fun main(){
    var T1 = CompteBancaire("mohammed",500.0)
    var T2 = CompteBancaire("saide",1000.0)
    T1.depot(500.0)
    T2.retrait(500.0)
    T1.afficherSolde()
    T2.afficherSolde()
}