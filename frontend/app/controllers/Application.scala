package controllers

import play.api.libs.json._
import play.api.mvc._

import scala.concurrent.future

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object Application extends Controller {

  // used for parsing the POST
  implicit val rds = (__ \ 'repo).read[String]

  def index = Action(parse.tolerantJson) {
    request => request.body.validate[String].map {
      case repoName =>
    }

//    val service = new RepositoryService()


//    val repository = future {
//    val stuff = service.getRepository("playframework", "playframework")
//    }

//    val commits = new CommitService().getCommits(stuff)
    /*
    val uri  = url("https://api.github.com/repos/mdotson/metrics-dashboard/commits")

    val responseFut = http(uri.GET)

    val response = Await.result(responseFut, Duration(5, "sec"))

    val json = JsonMethods.parse(response.getResponseBody)

    val commitHistory = json.camelizeKeys.extract[List[CommitInfo]]

    import org.json4s.jackson.Serialization
    val asJson = Serialization.write(commitHistory)

    Ok(views.html.index(response.getResponseBody, asJson))
    */
    Ok(views.html.index("1", "hi"))
  }

}