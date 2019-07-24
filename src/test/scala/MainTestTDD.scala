import org.scalatest.{FlatSpec, FunSuite, Matchers}

//Test Driven
class MainTestTDD extends FunSuite {


  test("Q1. Main.show_list"){

    assertThrows[IllegalStateException](Main.showList(List()))

  }

  test("Q2. Main.findMax"){
    assert(Main.maxFind(List(2,4,11,3,66,4),0) == 66)
    assert(Main.maxFind(List(0,1,2),0) == 2)
    assert(Main.maxFind(List(3,2,1),0) == 3)
    //assert(Main.maxFind(List(),0) == IllegalStateException)

    assertThrows[IllegalStateException](Main.maxFind(List(),0))

  }

  test("Q3. Main.nthfibonacci"){
   /* assertResult(34){
      Main.n_fibonacci(10)
    }*/
    assert(Main.nfibonacci(10) == 55)
    assert(Main.nfibonacci(20) == 6765)
    assert(Main.nfibonacci(0) == 0)
    assert(Main.nfibonacci(1) == 1)
    assert(Main.nfibonacci(2) == 1)
  }

  test("Q4. Main.sum_of_digits"){
    assert(Main.sumOfDigits(5) == 3)
    assert(Main.sumOfDigits(8) == 9)
  }




}
