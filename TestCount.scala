
class TestCount {
  def main(args: Array[String]) {
    //已知Jack和Mike两人的语文、数学、英语成绩，求各自总分、平均分

  val sorces = sc.parallelize(Array(("jack",80.0),("jack",90.0),("jack",85.0),("mike",85.0),("mike",92.0),("mike",94.0))

  val score2 = score.combineByKey(score=>(1,score),(c1:(Int,Double),newScore)=>(c1._1+1,c1._2+newScore),(c1:(Int,Double),c2:(Int,Double))=>(c1._1+c2._1,c1._2+c2._2))
  //createCombiner()：score->value值，1->计数作用;
  //mergeValue()：声明key/value形式的变量c1，Int->科目数，Double->科目成绩累加值，newScore->遍历到的新的分数，c1._1->c1的key值，c1._2是c1的value值（再次扫到某人，科目加1，成绩累加）
  //createCombiners()：c1->某个分区最终值，c2->另一个分区的最终值，分区的科目、成绩分别对应相加

  score2.foreach(println)
  //打印出：
 // (jack,(3,255.0))
  //(mike,(3,267.0))

  val average = score2.map{case(name,(num,score))=>(name,score/num)}  //case：判断传过来的数据类型是否匹配

  average.foreach(println)
  //打印出：
 // (mike,89.0)
 // (jake,85.0)

}
}