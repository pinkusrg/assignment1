import scala.annotation.tailrec
import scala.io.StdIn

object Main {

  def main(args : Array[String]): Unit =
  {

    println("Choose the option :")
    println("1. String Interpolation and list.")
    println("2. Maximum element from the list.")
    println("3. nth Fibonacci number.")
    println("4. sum of digits of the factorial.")
        //println("5. 5 to quit..")

    val input = StdIn.readInt()

    //val list = List(12,4,5,6,72)
    val list = List()

    input match {
      case 1 => showList(list)
      case 2 => println (maxFind(list, 0))
      case 3 => println ("Enter nth : "); val n = StdIn.readInt(); nfibonacci(n)
      case 4 => println ("Enter the Number"); val number = StdIn.readInt(); sumOfDigits(number)
      case _ => println ("Choose the correct option..")
    }
  }

  //Question 1
  def showList(digits : List[Int])={

    if(digits.isEmpty) throw new IllegalStateException("List size is null")

    for (i <- 0 to digits.length - 1){
      println (i + " = " + digits(i))
    }
    digits
  }

  //Question 2
  def maxFind(list: List[Int], index: Int): Int={

    if(list.isEmpty){
      throw new IllegalStateException("List size is null")
    }
    println (list)
    @tailrec
    def tailMaxFind(a : Int,i:Int,max:Int): Int={

      if (i < list.length - 1) {
        tailMaxFind(list(i + 1), i+1, if (a > max) a else max)
      }
      else max
    }
    tailMaxFind(list.head,index,list(list.length - 1))

  }

  //Question 3
  def nfibonacci(n:Int)={

    val nfibo = if (n==0) 0 else fibo(0,1, n, 2)

    println("nth element of Fibonacci is : " + nfibo)

    nfibo

  }
  @tailrec
  def fibo(first: Int, second: Int, n: Int,i: Int) : Int ={
    if (i>n) second else fibo(second,first + second, n, i + 1)
  }

  //Question 4
  def sumOfDigits(number:Int)={

    val digits = fact(number,1).toString
    val total = digitSum(digits,0,digits(0).asDigit)

    println("Factorial = " + digits + ",Sum = " + total)

    total
  }

  @tailrec
  def fact(i: Int,res :Int):BigInt = {
    if (i == 1) res else (fact(i - 1,res * i))
  }

  @tailrec
  def digitSum(digits: String, i : Int, res: Int): Int = {

    if (i > digits.length - 2){
      res
    }else{
      digitSum(digits, i + 1, res + (digits( i + 1 ).asDigit))
    }
  }

}
