package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val GauravEmployee: Employee = Employee("Gaurav","Sharma",23,12000,"Intern","knoldus","gaurav.sharma@knoldus.com")
  val AmanEmployee: Employee = Employee("Aman","singh",24,15000,"Software Engineer","Philips","aman.singh@philips.com")

  val employees: HashMap[String, Employee] = HashMap("Gaurav" -> GauravEmployee, "Aman" -> AmanEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
