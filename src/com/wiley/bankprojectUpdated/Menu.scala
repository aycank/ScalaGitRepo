package com.wiley.bankprojectUpdated

import scala.io.StdIn.readInt

object Menu {
  def main(args: Array[String]): Unit = {
    // Instance Variable
    var bank = new Bank
  }
  def runMenu(): Unit = {
    var choiceBank: Int = 0
    while (choiceBank != 10) {
      println("Please select one of the following options:\n" +
        "1. Add Account\n" +
        "2. Existing User\n" +
        "10. Exit")
      choiceBank = readInt()
      //choiceBank match {
        //case 1 => bank.addCustomer()
        //case 2 => if(bank.existingCustomer()) customer()
        //case 10 => System.exit(0)
      //}
    }
  }
}

