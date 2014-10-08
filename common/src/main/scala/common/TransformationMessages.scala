package sample.cluster.transformation

final case class TransformationResult(text: String)

final case class JobFailed(reason: String, job: TransformationJob)

case object BackendRegistration

final case class TransformationJob(text: String)
//#messages
