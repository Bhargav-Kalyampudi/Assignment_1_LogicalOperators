object Assignment_2_ForLoop {

  def main(args: Array[String]): Unit = {

    //question 1:Print numbers from 1 to 5 using a "for" loop.
    println("question 1: Printing 1to 5 numbers")
    for (i <- 1 to 5) {
      println(i)
    }

    //question 2: Print even numbers from 2 to 10 using a "while" loop.
    var a = 2
    println("question 2: printing even numbers from 2 to 10 using a 'while'' loop.")
    while (a <= 10) {
      println(a)
      a += 2
    }

    //question 3:Calculate the sum of all numbers from 1 to 50 using a for loop.
    a = 0
    println("question 3: Calculate the sum of all numbers from 1 to 50 using a for loop.")
    for (i <- 1 to 50) {
      a = a + i
    }
    println(s"The total sum of 1 to 50 is : {${a}}")

    // question 4:Print the square of numbers from 1 to 5 using a for loop.
    println("question 4:Print the square of numbers from 1 to 5 using a for loop.")
    for (i <- 1 to 5) {
      //println(Math.pow(i,2))
      println(i * i)
    }

    //question 5:Print the reverse of a given list using a while loop.

    var arr = Array("A", "B", "C", "D", "E", "F")
    println(s"the original array is {${arr.mkString("Array(", ", ", ")")}}")
    var index = arr.length - 1
    println("Reversing the array")
    while (index >= 0) {
      print(arr(index))
      index = index - 1
      print(" ")
    }

    //question 6:Generate and print the first 5 multiples of 3 using a for loop.
    println("question 6:Generate and print the first 5 multiples of 3 using a for loop.")
    for (i <- 1 to 5) {
      println(i * 3)
    }

    //question 7:Print odd numbers from 1 to 15 using a while loop.
    println("question 7:Print odd numbers from 1 to 15 using a while loop.")
    a = 1
    while (a <= 15) {
      println(a)
      a += 2
    }

    // question 8:Calculate the factorial of a given number using a for loop.
    a = 1
    println("question 8:Calculate the factorial of a given number using a for loop.")
    println("Enter the number for which you want to find the factorial")
    var num = scala.io.StdIn.readInt()
    for (i <- 1 to num) {
      a = a * i
    }
    println(s"The factorial of number a is : ${a}")

    // question 9:Print the characters of a string in reverse order using a for loop.
    var name = "Bhargav"
    println("question 9:Print the characters of a string in reverse order using a for loop.")
    println(s"the original string is ${name}")
    for (i <- name.length - 1 to 0 by -1) {
      print(name(i))
      print(" ")
    }

    //question 10: Check if a number is prime using a While loop.
    a = 1
    var count = 0
    println("question 10: Check if a number is prime using a While loop.")
    println("Enter the number to check prime or not")
    var num1 = scala.io.StdIn.readInt()
    if (num1 == 2) {
      println(" the given number is even prime number 2")
    }
    else {
      while (a <= 7) {
        if (num1 % a == 0 && num1 % 2 != 0) {
          count += 1
        }
        a += 2
      }
      if (if (num1 > 9) count == 1 else count == 2) {
        println("the given number is a prime number")
      }
      else {
        println("the given number is not a prime number")
      }
    }

    //question 11:Print the elements of a list in reverse order using a for loop.
    println("question 11:Print the elements of a list in reverse order using a for loop.")
    println(s"the original array is {${arr.mkString("Array(", ", ", ")")}}")
    index = arr.length - 1
    println("Reversing the array")
    while (index >= 0) {
      print(arr(index))
      index = index - 1
      print(" ")
    }

    //question 12: Find the sum of all even numbers from 1 to 20 using a while loop.
    println("question 12: Find the sum of all even numbers from 1 to 20 using a while loop.")
    var sum = 0
    a = 2
    while (a <= 20) {
      sum += a
      a = a + 2
    }
    println(s"The sum of 1 to 20 is : ${sum}")

    //Print_the_pattern
    println("Print the pattern")
    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print("*")
        print(" ")
      }
      println()
    }

    //question 13: Check if a string is a palindrome using for loop.
    name = "Bha16ahB"
    var name1 = ""
    var len = name.length.toFloat
    println(s"the given string is ${name}")
    for (i <- name.length - 1 to 0 by -1) {
      print(i)
      name1 = name1.concat(name(i).toString)
    }
    println(s"\nthe reverse string of original is ${name1}")
    if (name == name1) {
      println("The given string is a palindrome")
    }
    else {
      println("The given string is not a palindrome")
    }

    //question 14 : Print the cube of numbers from 1 to 3 using a while loop.
    println("question 14 : Print the cube of numbers from 1 to 3 using a while loop.")
    for (i <- 1 to 3) {
      println(math.pow(i, 3).toInt)
    }


    //question 15: Count the number of vowels in a given string using a for loop.
    println("question 15: Count the number of vowels in a given string using a for loop.")
    var value1 = Array('a', 'e', 'i', 'o', 'u')
    name = "Bhargavooo"
    count = 0
    for (i <- 0 until name.length) {
      if (value1.contains(name(i))) {
        count += 1
      }
    }
    println(s"the no of vowels in the ${name} is : ${count}")


    //question 16: Print the elements of a list using a While loop.
    println(s"the original array is {${arr.mkString("Array(", ", ", ")")}}")
    index = 0
    println("printing the array's elements")
    while (index <= arr.length - 1) {
      print(arr(index))
      index = index + 1
      print(" ")
    }

    //question 17: Calculate the product of numbers from 1 to 5 using a for loop.
    println("question 17: Calculate the product of numbers from 1 to 5 using a for loop.")
    var product = 1
    for (i <- 2 to 5) {
      product *= i
    }
    println(s"the product of 1 to 5 is ${product}")

    //Print the pattern

    println("Print the pattern")
    for (i <- 1 to 4) {
      for (j <- 1 to i) {
        print(s"${i} ")
      }
      println()
    }

    //question 18: Check if a given number is a perfect square using a while loop.
    num = 144
    println("question 18: Check if a given number is a perfect square using a while loop")
    var flag = true
    println(s" the number is ${num}")
    var i = 1
    while (i*i<=num) {
      if (i*i == num) {
        flag=false
      }
      i+=1
    }
    if (!flag) {
      println(s"the given number ${num} is perfect square : ${i-1} * ${i-1}")
    }else{
      println(s"the given number ${num} is not a perfect square")
    }

  }
}


