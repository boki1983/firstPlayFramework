/**
  * Created by bernie on 2016/6/28.
  */

package controllers

import javax.inject.{Inject, Singleton}
import play.api._
import play.api.mvc._


@Singleton
class Application @Inject() () extends Controller {

  def name = Action { Ok("Jim") }

}
