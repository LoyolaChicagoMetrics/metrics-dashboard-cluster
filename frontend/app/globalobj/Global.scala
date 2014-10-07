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
     println("starting!!!")

     // starting 2 frontend nodes and 3 backend nodes
     TransformationFrontend.main(Seq("0").toArray)
//     TransformationBackend.main(Seq("2552").toArray)
//     TransformationBackend.main(Array.empty)
//     TransformationBackend.main(Array.empty)
//     TransformationFrontend.main(Array.empty)
     println("ending!!!")
   }

//     println("starting!!!")
//     startup(Seq("2551", "2552", "0"))
//
//     def startup(ports: Seq[String]): Unit = {
//       ports foreach { port =>
//         // Override the configuration of the port
//         val config = ConfigFactory.parseString("akka.remote.netty.tcp.port=" + port).
//           withFallback(ConfigFactory.load())
//
//         // Create an Akka system
//         val system = ActorSystem("ClusterSystem", config)
//         // Create an actor that handles cluster domain events
//         system.actorOf(Props[SimpleClusterListener], name = "clusterListener")
//       }
//     }
//
//   }
 }
