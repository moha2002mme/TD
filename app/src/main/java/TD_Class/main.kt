package TD_Class

//azertyujhgfddsftyuiojhgfdsdfg

fun main(){
   print("donner le nombre.")
    var nomber = readLine()?.toIntOrNull()
    var moy=0
    var con = 0
    if(nomber!=null){
        if(nomber==0){
            var s = readLine()?.toIntOrNull()
            var a =0
                while (s != null && s > 0){
                    moy += s
                    con += 1
                    s = readLine()?.toIntOrNull()
                }
        }
        for(i in 0..nomber-1){

            var n = readLine()?.toIntOrNull()
            if(n!=null && n > 0){
                moy += n
                con+=1
            }
        }
        if (con!=0){
            var f = moy / con
            println("la moyanne ect:$f ")
                when(f){
                in 10..12->println("Assez bien")
                in 12..14->println("Bien")
                in 14..16->println("Trèsbien")
                in 16..20->println("Excellent")
                else->println("Échec")
            }
        }
    }

}
