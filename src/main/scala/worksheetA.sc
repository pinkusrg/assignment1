def maxFind(list: List[Int], index: Int): Int={

  def tail_maxFind(a : Int,i:Int,max:Int): Int={

    println(i)
    if(i < list.length-1) {
      tail_maxFind(list(i+1), i+1, if (a > max) a else max)
    }
    else{
      max
    }
  }
  tail_maxFind(list(0),index,list(list.length-1))
}


val list = List(1,14,522,60,70)

val max = maxFind(list,0)
println(max)

//def sum(str: String) : Int = {
//    if (str.length > 0) str(0).toInt + sum(str.drop(0)) else 0
//
//  }
//
//val a = sum("54")
//println(a)