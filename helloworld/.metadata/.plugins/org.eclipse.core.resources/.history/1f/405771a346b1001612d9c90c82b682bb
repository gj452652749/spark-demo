package com.test

object HelloWorldO {
  def main(args:Array[String]){
    println("hello World!");
    println("add:"+addInt(4,5));
    doLoop();
  }
  def addInt(a:Int,b:Int) :Int={
    var sum:Int=0;
    sum=a+b;
    return sum;
  }
  def doLoop():Unit={
    for(i <- 1 to 10) println(i);
    var array=Array(1,2,3);
    var doubleArray=for(ele<-array) yield ele*2;
    for(i<-doubleArray) println(i);
  }
}