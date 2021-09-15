package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val GauravUser: User = User("Gaurav","Sharma",23,"Knoldus","gaurav.sharma@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(GauravUser)) thenReturn(true)
    val result = userImpl.createUser(GauravUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(GauravUser)) thenReturn(false)
    val result = userImpl.createUser(GauravUser)
    assert(result.isEmpty)
  }

}
