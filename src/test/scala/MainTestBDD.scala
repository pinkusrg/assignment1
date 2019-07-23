import org.scalatest.FunSpec

class MainTestBDD extends FunSpec{

  describe("Q1. List Print"){
    it(" should not take empty list"){
     // val list = Main.show_list(List())
      assertThrows[IllegalStateException](Main.show_list(List()))
    }
  }
  describe("Q2. Finding Max"){

    it(" should output 66 for list "+List(1,2,66,4)){ assert(Main.maxFind(List(2,4,11,3,66,4),0) == 66) }
    it(" should output 2 for list "+List(0,1,2)) { assert(Main.maxFind(List(0,1,2),0) == 2)}
    it("should output 3 for list "+List(3,2,1)) { assert(Main.maxFind(List(3,2,1),0) == 3)}

    it(" should not accept empty list : ") { assertThrows[IllegalStateException](Main.maxFind(List(),0))}
  }

  describe("Q3. Nth Fibonacci "){
    it(" should output 55 for n equal to 10 ") {assert(Main.n_fibonacci(10) == 55) }
  }

  describe("Q4. Sum of digits "){
    it(" should output 3 for input 5 ") { assert(Main.sum_of_digits(5) == 3) }
  }
}
