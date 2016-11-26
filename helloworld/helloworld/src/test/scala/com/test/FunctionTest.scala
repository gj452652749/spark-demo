package com.test
import scala.math._
object FunctionTest {
  def main (arg:Array[String]){
    val fun = ceil _;
    var num=3.14
    println(fun(num));
    var triple=(x:Double) =>x*3
    println(triple(num));
    println(funcPara { fun });
    println(funcPara { triple });
    var mulFunc=mulBy(5);
    println(mulFunc(num));
  }
  def funcPara(f:(Double)=>Double)=f(0.25)
  def mulBy(factor:Double)=(x:Double)=>x*factor
}