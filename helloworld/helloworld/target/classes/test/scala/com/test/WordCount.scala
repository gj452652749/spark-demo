package com.test
import org.apache.spark._
import SparkContext._
object WordCount {

  def main(args: Array[String]) {
//    if (args.length != 2 ){
//      println("usage is org.test.WordCount <master> <input> <output>")
//      return
//    }
  System.setProperty("hadoop.home.dir", "E:\\workplace\\server\\bigdata\\hadoop")
    val conf = new SparkConf()
    conf.setMaster("local[*]").setAppName("My WordCount")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("files/word.txt")
    val result = textFile.flatMap(line => line.split("\\s+"))
      .map(word => (word, 1)).reduceByKey(_ + _)
    result.saveAsTextFile("files/result.txt")
    sc.stop()
  }
}