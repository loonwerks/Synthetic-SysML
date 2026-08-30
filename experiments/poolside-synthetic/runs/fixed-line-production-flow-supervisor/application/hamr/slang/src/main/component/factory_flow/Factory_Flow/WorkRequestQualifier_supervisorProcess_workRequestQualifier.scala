// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object WorkRequestQualifier_supervisorProcess_workRequestQualifier {

  def initialise(api: WorkRequestQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee SafeAdmissionInitialization
        //   During contract evaluation for the initialization phase,
        //   WorkRequestQualifier shall set admissionToMaterial assessment
        //   to Factory Flow AdmissionAssessment NoRequest,
        //   admissionToMaterial work id to Factory Flow WorkId NoWork,
        //   admissionToPriority assessment to Factory Flow AdmissionAssessment
        //   NoRequest, and admissionToPriority work id to Factory Flow WorkId
        //   NoWork.
        api.admissionToMaterial == Factory_Flow.AdmissionFact(
          assessment = Factory_Flow.AdmissionAssessment.NoRequest,
          work_id = Factory_Flow.WorkId.NoWork) &
          api.admissionToPriority == Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.NoRequest,
            work_id = Factory_Flow.WorkId.NoWork)
        // END INITIALIZES ENSURES
      )
    )

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_admissionToMaterial(Factory_Flow.AdmissionFact(
      assessment = Factory_Flow.AdmissionAssessment.NoRequest,
      work_id = Factory_Flow.WorkId.NoWork))
    api.put_admissionToPriority(Factory_Flow.AdmissionFact(
      assessment = Factory_Flow.AdmissionAssessment.NoRequest,
      work_id = Factory_Flow.WorkId.NoWork))
  }

  def timeTriggered(api: WorkRequestQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case RequestAbsent
        //   If presentedWork presence is Factory Flow RequestPresence None,
        //   WorkRequestQualifier shall set admissionToMaterial assessment to
        //   Factory Flow AdmissionAssessment NoRequest, admissionToMaterial
        //   work id to Factory Flow WorkId NoWork, admissionToPriority
        //   assessment to Factory Flow AdmissionAssessment NoRequest, and
        //   admissionToPriority work id to Factory Flow WorkId NoWork.
        (api.presentedWork.presence == Factory_Flow.RequestPresence.None) ___>: (
          api.admissionToMaterial == Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.NoRequest,
            work_id = Factory_Flow.WorkId.NoWork) &
            api.admissionToPriority == Factory_Flow.AdmissionFact(
              assessment = Factory_Flow.AdmissionAssessment.NoRequest,
              work_id = Factory_Flow.WorkId.NoWork)),
        // case RequestEligible
        //   If presentedWork presence is Present, presentedWork validity is
        //   Valid, presentedWork work id is W1 or W2, and presentedWork product
        //   is AngleProduct, WorkRequestQualifier shall set admissionToMaterial
        //   assessment to Eligible, admissionToMaterial work id to presentedWork
        //   work id, admissionToPriority assessment to Eligible, and
        //   admissionToPriority work id to presentedWork work id.
        (api.presentedWork.presence == Factory_Flow.RequestPresence.Present &
          api.presentedWork.validity == Factory_Flow.Validity.Valid &
          (api.presentedWork.work_id == Factory_Flow.WorkId.W1 |
            api.presentedWork.work_id == Factory_Flow.WorkId.W2) &
          api.presentedWork.product == Factory_Flow.ProductKind.AngleProduct) ___>: (
          api.admissionToMaterial == Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.Eligible,
            work_id = api.presentedWork.work_id) &
            api.admissionToPriority == Factory_Flow.AdmissionFact(
              assessment = Factory_Flow.AdmissionAssessment.Eligible,
              work_id = api.presentedWork.work_id)),
        // case RequestMalformed
        //   If presentedWork presence is Present and it is not the case that
        //   (presentedWork validity is Valid and work id is W1 or W2 and
        //   product is AngleProduct), WorkRequestQualifier shall set
        //   admissionToMaterial assessment to Malformed, admissionToMaterial
        //   work id to NoWork, admissionToPriority assessment to Malformed,
        //   and admissionToPriority work id to NoWork.
        (api.presentedWork.presence == Factory_Flow.RequestPresence.Present &
          !(api.presentedWork.validity == Factory_Flow.Validity.Valid &
            (api.presentedWork.work_id == Factory_Flow.WorkId.W1 |
              api.presentedWork.work_id == Factory_Flow.WorkId.W2) &
            api.presentedWork.product == Factory_Flow.ProductKind.AngleProduct)) ___>: (
          api.admissionToMaterial == Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.Malformed,
            work_id = Factory_Flow.WorkId.NoWork) &
            api.admissionToPriority == Factory_Flow.AdmissionFact(
              assessment = Factory_Flow.AdmissionAssessment.Malformed,
              work_id = Factory_Flow.WorkId.NoWork))
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val apiUsage_presentedWork: Option[Factory_Flow.PresentedWorkRequest] = api.get_presentedWork()
    api.logInfo(s"Received on data port presentedWork: ${apiUsage_presentedWork}")

    apiUsage_presentedWork match {
      case Some(pr) =>
        if (pr.presence == Factory_Flow.RequestPresence.None) {
          // case RequestAbsent
          api.put_admissionToMaterial(Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.NoRequest,
            work_id = Factory_Flow.WorkId.NoWork))
          api.put_admissionToPriority(Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.NoRequest,
            work_id = Factory_Flow.WorkId.NoWork))
        } else if (pr.presence == Factory_Flow.RequestPresence.Present &
          pr.validity == Factory_Flow.Validity.Valid &
          (pr.work_id == Factory_Flow.WorkId.W1 |
            pr.work_id == Factory_Flow.WorkId.W2) &
          pr.product == Factory_Flow.ProductKind.AngleProduct) {
          // case RequestEligible
          val eligible: Factory_Flow.AdmissionFact = Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.Eligible,
            work_id = pr.work_id)
          api.put_admissionToMaterial(eligible)
          api.put_admissionToPriority(eligible)
        } else {
          // case RequestMalformed
          val malformed: Factory_Flow.AdmissionFact = Factory_Flow.AdmissionFact(
            assessment = Factory_Flow.AdmissionAssessment.Malformed,
            work_id = Factory_Flow.WorkId.NoWork)
          api.put_admissionToMaterial(malformed)
          api.put_admissionToPriority(malformed)
        }
      case None() =>
        val malformed: Factory_Flow.AdmissionFact = Factory_Flow.AdmissionFact(
          assessment = Factory_Flow.AdmissionAssessment.Malformed,
          work_id = Factory_Flow.WorkId.NoWork)
        api.put_admissionToMaterial(malformed)
        api.put_admissionToPriority(malformed)
    }
  }

  def finalise(api: WorkRequestQualifier_Operational_Api): Unit = { }
}
