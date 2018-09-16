package exercise3

object MapsSolution {

  import Maps._

  def averageAge(users: Seq[User]): Map[String, Int] = 
    users
      .groupBy(_.name)
      .mapValues(_.map(_.age).sum / users.length)

  def numberOfFrodos(users: Map[String, User]): Int = users.count(_._1 == "Frodo")

  def underaged(users: Map[String, User]): Map[String, User] = users.filter(_._2.age >= 1000)
}
