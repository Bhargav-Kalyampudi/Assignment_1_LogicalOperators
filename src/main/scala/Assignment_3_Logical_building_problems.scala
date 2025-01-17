object Assignment_3_Logical_building_problems {

  def main(args:Array[String]): Unit = {
    println("************************************************************")
    //question 1: converting to kg to g
    println("question 1: converting to kg to g")
    var a=56
    println(s"the number of grams is ${a*1000}")

    println("************************************************************")
    //question 2: converting deg C to F
    println("question 2: converting deg C to F")
    a=80
    println(s"converting 80 deg to F : ${(a*9/5+32)}")

    println("************************************************************")
    //question 3:Declare and initialize 3 three variable and print the biggest number.
    println("Declare and initialize 3 three variable and print the biggest number.")

    a=900
    var b=900
    var c=110
    if(a>=b && a>=c){
      println(s"the biggest number is ${a}")
    }
    else if(b>=a && b>=c){
      println(s"the biggest number is ${b}")
    }
    else{
      println(s"the biggest number is ${c}")
    }

    println("************************************************************")
    //question 4:java program that performs the following tasks.
    println("java program that performs the following tasks.")
    a=26
    if(101 until  1000 contains(a)){
      println("Wrong number")
    }
    else if(a%2==0){
      print(s"the number ${a} is even and remainder is : ${a%3}")
    }else{
      print(s"the number ${a} is odd and remainder is : ${a%2}")
    }

    println("\n************************************************************")
    //question 5:Check whether the number is in range 0-100 or not.
    println("question 5:Check whether the number is in range 0-100 or not. ")
    a=85

    if(0 to 100 contains(a)){
      if(90 to 100 contains(a)){ println("Super Smart")}
      else if(80 to 90 contains(a)){ println("Smart")}
      else if(70 to 80 contains(a)){ println("Smart Enough")}
      else if(60 to 70 contains(a)){ println("Just Smart")}
      else if(35 to 60 contains(a)){ println("No Smart")}
      else{ println("Dumb")}
    }
    else{
      println("Invalid input: given number is not the range of 0 to 100")
    }

    println("************************************************************")
    //question 6:
    a=10
    b=20
    println("question 6: Basic mathematical operations")
    println("enter the operator from this list [+,-,*,/]")
    var operator=scala.io.StdIn.readLine()
    operator match{
      case "+"=> println(s"The addition ${a+b}")
      case "*"=> println(s"The multiplication ${a*b}")
      case "/"=> println(s"The division ${a/b}")
      case "-"=> println(s"The multiplication ${a-b}")
    }

    println("************************************************************")
    //question 7:Write a program to print 'SEEKHO BIGDATA' for 60 times
    println("question 7:Write a program to print 'SEEKHO BIGDATA' for 60 times")
    for(i<-1 to 5 ){  //instead ot 60, here we provided 5
      println("SEEKHO BIGDATA")
    }

    println("************************************************************")
    //question 8: a program to print all numbers which are divisible by 11 from 250 to 550
    println("print all numbers which are divisible by 11 from 250 to 550")
    for(i<-250 to 550){
      if(i%11==0){println(i)}
    }

    println("************************************************************")
    //question 9:Write a program to sum all the numbers from 56 to 153
    println("question 9: a program to sum all the numbers from 56 to 153")
    a=0
    for(i<-56 to 153){
      a+=i
    }
    println(s"the sum is ${a}")

    println("************************************************************")
    //question 10: Write a program to print all even numbers in range 700 to 900.
    println("question 10: Write a program to print all even numbers in range 700 to 900.")

    for(i<-700 to 900 by 2){
      if(i%2==0){
        println(i)
      }

      println("************************************************************")
      //question 11: Write a program to print all odd numbers from 251 to 51
      println("question 11: Write a program to print all odd numbers from 251 to 51")

      for(i<-251 to 51 by -2){
        if(i%2!=0){ println(i)}
      }

      println("************************************************************")
      //question 12: Write a Program to print the count of the even numbers between the given range.
      println("question 12: Write a Program to print the count of the even numbers between the given range.")
      var count=0
      for(i<-1 to 100){
        if(i%2==0) count+=1
      }
      println(s"In the range of 1 to 100, total even numbers is : ${count}")

      println("************************************************************")
      //question 13: Write a program to print alternate even numbers from 20 to 140. (20,24,28..)
      println("question 13: Write a program to print alternate even numbers from 20 to 140.")
      for(i<-20 to 140 by 4){
        println(i)
      }

      println("************************************************************")
      //question 14: Write a program to print alternate even numbers from 20 to 140. Like  (22,26,30...)
      println("question 14: Write a program to print alternate even numbers from 20 to 140. Like  (22,26,30...)")
      for(i<-20 to 140 by 2){
        println(i)
      }
    }

    println("************************************************************")
    //question 15:Print following series 2*3,3*4,4*5,......16*17 (Print in two ways – pattern & multiplied value)
    println("question 15:Print following series 2*3,3*4,4*5,......16*17")
    for(i<-2 to 10){
      println(s"${i}*${i+1}")
    }

    println("************************************************************")
    //question 16:Write a program to sum all even numbers between 382 and 582.
    println("question 16:Write a program to sum all even numbers between 382 and 582.")
    var sum=0
    for(i<-382 to 582){
      if(i%2==0){sum+=i}
    }
    println(s"The sum of all even numbers in the range of 382 & 582 : ${sum}")

    println("\n************************************************************")
    // question 17 :Write a Program to print the all alphabets by using character Variable
    println("question 17 :Write a Program to print the all alphabets by using character Variable")
    for(i<- 'a' to 'z'){
      print(s"${i} ")
    }

    println("************************************************************")
    //question 18:Write a program to find the average of 24,26,28,.....100.
    println("\nquestion 18:Write a program to find the average of 24,26,28,.....100.")
    var count=0
    sum=0
    for(i<-24 to 100 by 4){
      sum=sum+i
      count+=1
    }
    println(s"the sum is ${sum} and total no of numbers ${count} : Average is ${sum/count} ")

    println("**************************************************************************")
    //question 19: Write programs to sum of the following Series. 5^2 + 6^2 + 7^2 +..........+102^2
    println("question 19: Write programs to sum of the following Series. 5^2 + 6^2 + 7^2 +..........+102^2")
    sum=0
    for(i<-5 to 102){
      sum+=(Math.pow(i,2).toInt)
    }
    println(s"Sum is ${sum}")

    println("**************************************************************************")
    //question 20:Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B, A,B...)
    for(i<-1 to 100){
      if(i==100){ print("A, B")}
      else{print("A, B, ")}
    }
    println()

    println("**************************************************************************")
    //question 21:Write a program to print the series :10@9,9@8,8@7,.....,-5@-6
    print("question 21:Write a program to print the series :10@9,9@8,8@7,.....,-5@-6")
    for(i<-10 to -5 by -1){
      print(s"${i}@${i-1},")
    }

    println("\n**************************************************************************")
    //question 22:Write programs to print the following series. 100,200,300........10000
    println("question 22:Write programs to print the following series. 100,200,300........10000")
    for(i <- 1 to 100){
      print(s"${i*100},")
    }

    println("**************************************************************************")
    // question 23:Write programs to print the following series. 5^2, 7^2,9^2.....25^2
    println("question 23:Write programs to print the following series. 5^2, 7^2,9^2.....25^2")
    for(i <- 5 to 25){
      print(s"${i*i},")
    }

    println("\n**************************************************************************")
    //question 24:Write programs to print the following series. 5,10,5,10,5,10,5 for 7 times
    println("\nquestion 24:Write programs to print the following series. 5,10,5,10,5,10,5 for 7 times")
    for(i <- 1 to 7){
      print(5)
      print(",")
      print(10)
      print(",")
    }

    println("\n**************************************************************************")
    //question 25:Write programs to print the following series. 5*4,5*3,5*2,......5*(-12) [Pattern and multiple values]
    println("\nquestion 25:Write programs to print the following series. 5*4,5*3,5*2,......5*(-12) ")
    for(i<-4 to -12 by -1){
      print(s"5*${i}")
      if(i!= -12){
        print(",")
      }
    }

    println("\n**************************************************************************")
    println("\nquestion 25:Write programs to print the following series. 5*4,5*3,5*2,......5*(-12) in multiple values ")
    for(i<-4 to -12 by -1){
      print(5*i)
      if(i!= -12){
        print(",")
      }
    }

    println("\n**************************************************************************")
    //question 26: Write programs to print the following series. 1,even,3,even,5,even,.......35,even
    println("\nquestion 26: Write programs to print the following series. 1,even,3,even,5,even,.......35,even")
    for(i<-1 to 35){
      print(s"${i},even")
      if(i!=35){print(",")}
    }

    println("\n**************************************************************************")
    //question 27:Write programs to print the following series. 1,2,factor of three,4,5,factor
    //of three, 7,8,factor of three,..........22,23,factor of three.
    println("\nquestion 27:Write programs to print the following series. 1,2,factor of three,4,5,factor of three, 7,8,factor of three,..........22,23,factor of three.")
    for(i<-1 to 24){
      if(i%3!=0){
        print(s"${i}")
      }
      else{
        print("factor of three")
      }
      if(i!=24){
        print(",")
      }
    }

    println("\n**************************************************************************")
    //question 28:Write programs to print the following series. 1,3, divisible by five, 7,9,
    //11,13, divisible by five,.....21,23, divisible by five
    println("question 28:Write programs to print the following series. 1,3, divisible by five, 7,9,11,13, divisible by " +
      "five,.....21,23, divisible by five")
    for(i<- 1 to 25 by 2){

      if(i%5!=0){
        print(s"${i}")
      }
      else{
        print("divisible by five")
      }
      if(i!=25){
        print(",")
      }

    }


    println("\n**************************************************************************")
    //question 29: Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
    println("question 29: Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2")
    for(i<-5 to 51 by 2){
      print(math.pow(i.toFloat/10,2))
      if(i!=51){
        print(",")
      }
    }

    println("\n**************************************************************************")
    //question 30:Write a for loop that never ends?
    println("question 30:Write a for loop that never ends?")
    for(i <- 1 to 5 by -1){
      println(i)
      println("i am in infinity for loop")
    }


    //question 31:Write a Loop inside other loop and observe the execution flow
    for(i<-1 to 5){
      for(j<-1 to 5){
        println(s"outer 'for' loop i value is ${i} , inner 'for' loop j value is ${j} ")
      }
    }










  }
}
