package globalobj

//import frontend.TransformationFrontend

import frontend.TransformationFrontend
import play.api.{Application, GlobalSettings}

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
