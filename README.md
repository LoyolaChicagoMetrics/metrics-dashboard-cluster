Change hostname to be equal to the ip address of the box running this app

Run this on 192.168.1.7 (backend)

sbt "run-main sample.cluster.transformation.SimpleClusterApp 2551"
sbt "run-main sample.cluster.transformation.SimpleClusterApp 2552"

Then run this on 192.168.1.2 frontend:
sbt "run-main sample.cluster.transformation.SimpleClusterApp 0"