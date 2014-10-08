package globalobj

import akka.actor.{Props, ActorSystem}
import com.typesafe.config.ConfigFactory
import play.api.{Application, GlobalSettings}
import sample.cluster.transformation.{TransformationBackend, TransformationFrontend}

/**
 * Created by mdotson on 10/7/14.
 */
object Global extends GlobalSettings {

   /**
    * This is called when the application starts. Here we start the loop for adding commit history.
    *
    * @param app
    */
   override def onStart(app: Application) {

     TransformationFrontend.main(Seq("0").toArray)
   }
 }
