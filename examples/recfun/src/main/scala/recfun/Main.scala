package recfun
import common._
import com.sun.javafx.geom.Path2D.Iterator

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==0 || c==r){
      return 1
    }else if(c<0 || r<0)
    {
      return 0
    }
    else{
      return pascal(c-1, r-1) + pascal(c, r-1)  
    }    
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
//     var bal:Int = 0
//    var len:Int = chars.length
//    var ite = chars.iterator
//    while(ite.hasNext){
//      val c:Char = ite.next()
//      if(c =='('){
//        bal = bal+1        
//      }
//      if(c == ')'){
//        if(bal>0)
//        {
//          bal = bal-1;
//        }
//        else{
//          return false;
//        }
//      }
//    }
//    if(bal==0)
//      return true;
//    return false
     
    
     def isBalance(chrs:List[Char],currentCount:Int):Boolean={
       if(chrs.isEmpty){
         if(currentCount==0) true else false
       }
       else{
         chrs.head match {
           case '('=> isBalance(chrs.tail, currentCount+1)
           case ')' => {
             if(currentCount<=0) false
             else isBalance(chrs.tail, currentCount-1)
           }
           case _ => isBalance(chrs.tail, currentCount)
         }
         
       }
     }
     isBalance(chars, 0);
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
