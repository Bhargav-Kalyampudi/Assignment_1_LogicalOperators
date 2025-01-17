object Assignment_1_LogicalOperators {

  def main(args: Array[String]): Unit = {

    // question 1: Check for Even AND Positive Number
    println("Enter the number to check both even & postive")
    var a = scala.io.StdIn.readInt()
    if (a >= 0 && a % 2 == 0) {
      print("Yes: Both even and positive")
    }
    else {
      print("No: it's not both even and positive")
    }

    // Question 2: Check whether number < -10 or number > 10
    println("\nEnter the number to Check whether number < -10 or number > 10")
    var b=scala.io.StdIn.readInt()
    if( b < -10 || b > 10){
      print("Yes: number < -10 or number > 10 ")
    }else{
      print("No: number < -10 or number > 10 ")
    }

    // Question 3: Check whether the number is even and not divisible by 3
    println("\nEnter the number to Check whether the number is even and not divisible by 3")
    var c=scala.io.StdIn.readInt()

    if(c%2==0 && c%3!=0){
      println("yes:the number is even and not divisible by 3")
    }
    else{
      println("No:the number is even and not divisible by 3")
    }

    //question 4:number either divisible by 4 or 6
    println("Enter the number to Check whether it is either divisible by 4 or 6")
    var d=scala.io.StdIn.readInt()
    if( d%4==0 || d%6==0){
      println("Yes: it is either divisible by 4 or 6 ")
    }
    else{
      println("No: it is either divisible by 4 or 6 ")
    }

    //question 5:Eligibility for Voting OR Driving
    print("Enter your age: to check your eligibility ")
    var age=scala.io.StdIn.readInt()
    if(age>=18){
      print(" Eligibility for both Voting OR Driving")
    }
    else if(age>16){
      print("Eligible for only driving")
    }
    else{
      print("Not eligible for both voting and driving")
    }

    //question 6: Multiple Range Check
    println("\nEnter the number to check in Multiple ranges ")
    var number=scala.io.StdIn.readInt()
    if( (1 to 10 contains number) || (20 to 30  contains number)){
      print("yes: it is present in the range")
    }
    else{
      print("No: it is not present in the range")
    }

    //question 7: check whether the number is both negative and odd
    print("\nenter the number to check both negative and odd")
    var e=scala.io.StdIn.readInt()
    if(e<0 && e%2!=0){
      println("yes: it is both negative and odd number")
    }
    else{
      println("No: it is not both negative and odd number")
    }

    //question 8:Eligibility for Senior Discount OR Student Discount:

    println("Enter the number to check the Eligibility for Senior Discount OR Student Discount:")
    var f=scala.io.StdIn.readInt()

    if(f>60){
      println("Senior Discount")
    }
    else if(f<25){
      println("Student discount")
    }
    else{
      println("No discount")
    }


    //question 9: Divisibility by 5 AND 7

    println("Enter the number to check the divisibility by 5 & 7")
    var g=scala.io.StdIn.readInt()
    if(g%5==0 && g%7==0){
      println("divisible by both 5 and 7")
    }else{
      println("Not divisible by both 5 and 7")
    }

    //question 10: check whether the number is non-negative or even)
    print("\nenter the number to check both non negative or even")
    var h=scala.io.StdIn.readInt()
    if(h>0 || h%2==0){
      println("yes: it is non negative or even")
    }
    else{
      println("No: it is non negative or even")
    }

    //question 11:Check for Prime AND Odd Number

    println("Enter the number to check for Prime AND Odd Number")
    var j=scala.io.StdIn.readInt()
    if(j==3 || j==5 || j==7 || (j%2!=0 && j%3!=0 && j%5!=0 && j%7!=0)){
      print("the number is prime number")
    }
    else{
      if(j==2){
        println("Even prime number")
      }
      else {
        println("Not a prime number")
      }
    }

    //question 12:Eligibility for Discount OR Free Shipping
    println("\nEnter the number to check Eligibility for Discount OR Free Shipping")
    var k=scala.io.StdIn.readInt()
    if(k>150){
      println("Eligible for Discount")
    }
    else if(k>100){
      println("Eligible for free shipping")
    }
    else{
      println("No eligible for discount or free shipping")
    }

    //question 13:Divisibility by 3 OR 8:
    print("\nenter the number to check divisibility by 3 or 8")
    var l=scala.io.StdIn.readInt()
    if(l%3==0 || l%8==0){
      println("yes: it is divisible by 3 or 8")
    }
    else{
      println("No: it is divisible by 3 or 8")
    }

    //question 14: Check for Non-Positive AND Even Number
    print("enter the number to check both non-positive and even")
    var m=scala.io.StdIn.readInt()
    if(m<0 && m%2==0){
      println("yes: it is both non-positive and even")
    }
    else{
      println("No: it is both non-positive and even")
    }

    //question 15:Age Group Classification with AND
    println("Enter the Age for Group Classification")
    var n=scala.io.StdIn.readInt()
    if(n<13){println("Child")}
    else if(n>13 && n<19){println("Teenager")}
    else{println("Adult")}

    //question 16: Check for Divisibility by 2 OR 5:

    a=54
    if(a%2==0 || a%5==0){
      println("This number is divisible by 2 or 5")
    }else{
      println("This number is not divisible by 2 or 5")
    }

    //question 17:Eligibility for Senior Discount AND Student Discount:
    // it seems question is wrong "age>60 && age<25" --> it won't be possible

    //question 18 is not given

    //question 19:Check for Multiple of 3 AND 7:
    a=54
    if(a%3==0 && a%7==0){
      println("This number is divisible by 3 or 7")
    }else{
      println("This number is not divisible by 3 or 7")
    }

    //question 20:Check for Multiple of 5 or 9:
    a=45
    if(a%5==0 || a%9==0){
      println("This number is divisible by 5 or 9")
    }else{
      println("This number is not divisible by 5 or 9")
    }

    //question 21:Check for Odd AND Not Divisible by 4.
    a=15
    if(a%2!=0){
      println("This number is Odd number AND Not Divisible by 4")
    }else{
      println("This number is not Odd number.")
    }

    //question 22:Check for Multiple of 3 and 5:
    a=15
    if(a%3==0 && a%5==0){
      println("This number is divisible by 3 and 5")
    }else{
      println("This number is not divisible by 3 and 5")
    }

    //question 23:Eligibility for Discount OR Membership Benefits:
    var amount=180
    var Loyalty_Card= true
    if(amount>200){
      println("Eligible for discount")
    }
    else if(Loyalty_Card){
      println("Eligible for membership benefits")
    }
    else {
      println("Not eligible for both discount and membership benefits")
    }

    //question 24:Divisibility by 2 OR 3:
    a=15
    if(a%3==0 || a%2==0){
      println("This number is divisible by 2 or 3")
    }else{
      println("This number is not divisible by 2 or 3")
    }

    //question 25:Check for Positive AND Not Divisible by 3
    a=7
    if(a%3!=0 || a>=0){
      println("This number is Positive AND Not Divisible by 3")
    }else{
      println("This number is Positive AND Not Divisible by 3")
    }

    //question 26:Eligibility for Senior Discount AND Not a New Customer
    var age2=70
    var new_customer=true
    if(age2>65 && !new_customer){
      println("Eligibility for Senior Discount")
    }
    else{
      println("Not eligibility for Senior Discount")
    }

    //question 27:Check for Odd OR Prime Number
    a=11
    if(a%2!=0 || (a==2 || a==3 || a==5 || a==7 || (a%2!=0 && a%3!=0 && a%5!=0 && a%7!=0))){
      println("this number is odd or prime number")
    }
    else{
      println("this number is not an odd or not a prime number")
    }

    //question 28:Eligibility for Discount AND Free Shipping
    amount=120
    if(amount>150){
      println("Eligible for discount")
    }
    else if(amount>100){
      println("Eligible for free shipping")
    }
    else{
      println("Not eligible for either discount or free shipping")
    }

    //question 29:Check for Non-Negative AND Not Divisible by 7
    a=14
    if(a>0 && a%7!=0){
      println("this number is both Non-Negative AND Not Divisible by 7")
    }
    else{
      println("this number is not both Non-Negative AND Not Divisible by 7")
    }

    //question 30:Eligibility for Student Discount OR Free Trial
    age= 22
    var Free_Trial=true

    if(age>25){
      println("Eligible for student discount")
    }
    else if(Free_Trial){
      println("Eligible for free trail")
    }
    else{
      println("Not eligible for both student discount and free trail")
    }

    //question 31:Check for Divisibility by 4 OR 6
    a=24
    if(a%4==0 || a%6==0){
      println("This number is divisible by 4 or 6")
    }else{
      println("This number is not divisible by 4 or 6")
    }



  }
}
