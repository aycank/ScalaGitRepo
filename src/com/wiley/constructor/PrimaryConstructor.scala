package com.wiley.constructor

class PrimaryConstructor(i : Int, name : String) {
  def showDetails() : Unit = {
    println(i + " " + name)
  }
}

object Temp extends App{
  var s = new PrimaryConstructor(1, "Bruh")
  s.showDetails()
}
