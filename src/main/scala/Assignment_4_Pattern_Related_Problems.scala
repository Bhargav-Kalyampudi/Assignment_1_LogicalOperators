object Assignment_4_Pattern_Related_Problems {


  def main(args:Array[String]): Unit = {

   //question 1:Program to print a right-angled triangle pattern
   println("----------------- question 1: Program to print a right-angled triangle pattern ----------")
   for(i<- 1 to 5){
     for(j<-1 to i){
       print("* ")
     }
     println()
   }

    //question 2:Program to print a square pattern
    println("----------------------------- question 2:Program to print a square pattern ----------")
    for(i<-1 to 4){
      for(j<-1 to 4){
        print("* ")
      }
      println()
    }

    //question 3:Inverted Triangle Pattern
    println("----------------------- question 3:Inverted Triangle Pattern ------------------")
    for(i<-5 to 1 by -1){
      for(j<-1 to i){
        print("* ")
      }
      println()
    }

    //question 4:HOLLOW PATTERN
    println("-------------------- question 4:HOLLOW PATTERN ------------------------")
    var start=1
    var end=4
    for(i<-1 to 4){
      if(i==start || i==end){println("* * * * * *")}
      else{
        println("*     * ")
      }
    }

    //question 5:
    println("Question 5")
    var star=true
    var under_score=false
    for(i<-1 to 5){
      for(j<-1 to i){

        if(star && !under_score){
          print("*")
          star=false
          under_score=true
        }
        else{
          print(" - ")
          star=true
          under_score=false
        }
      }
      star=true
      under_score=false
      println()
    }

    //question 6:
    println("-------------- question 6 --------------")
    for(i<-1 to 9){

      if(i<=5){
        print(" "*((9-(i+i-1))/2))
        print("*"*(i+i-1))
        print(" "*((9-(i+i-1))/2))
      }
      else{
        print(" "*((9-(2*(9-i)+1))/2))
        print("*"*(2*(9-i)+1))
        print(" "*((9-(2*(9-i)+1))/2))
      }
      println()
    }


    //question 7:

    println("------------------------- Question 7 ---------------------------------")
    start=0
    end=0
    var dummy=0

    for(i<-1 to 2){

      if(i==1){
        start=7
        end=1
        dummy = -2
      }else{
        start=1
        end=7
        dummy = 2
      }
      for(j<-start to end by dummy){
        print(" "*((7-j)/2))
        print("*"*j)
        print(" "*((7-j)/2))
        println()
      }

    }

    //question 8: Butterfly pattern
    println("----------------------- question 8: Butterfly pattern -----------------------------------")
    start=0
    end=0
    dummy=0

    for(i<- 1 to 3){

      if(i==2){
        print("*****")
        println()
      }
      else{

        if(i<2){
          start=1
          end=2
          dummy=1
        }else{
          start=2
          end=1
          dummy= -1
        }
        for(j<- start to end by dummy){
          print("*"*j)
          print(" "*(5-(2*j)))
          print("*"*j)
          println()
        }

      }


    }


    //question 9:
    println("----------------------- question 9 ----------------------------------------------------")
    dummy=4
    for(i<-1 to 9){
      if(i<=5){
        print("*"*(5-dummy))
        println()
      }
      else{
        print("*"*(5+dummy))
        println()
      }
      dummy=dummy-1
    }


    //question 10:
    println("--------------------------- question 10 ----------------------------------------")
    for(i<-1 to 9 by 2 ){
      print(" "*((9-i)/2))
      print("*"*i)
      print(" "*((9-i)/2))
      println()
    }






  }

}
