// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier {

  def initialise(api: MaterialCorrelationQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee SafeMaterialInitialization
        //   During contract evaluation for the initialization phase,
        //   MaterialCorrelationQualifier shall set materialFact assessment to
        //   Factory Flow MaterialAssessment MaterialUnknown.
        api.materialFact.assessment == Factory_Flow.MaterialAssessment.MaterialUnknown
        // END INITIALIZES ENSURES
      )
    )

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_materialFact(Factory_Flow.MaterialFact(
      assessment = Factory_Flow.MaterialAssessment.MaterialUnknown))
  }

  def timeTriggered(api: MaterialCorrelationQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case MaterialReadyCorrelated
        //   If materialObservation validity is Factory Flow Validity Valid and
        //   materialObservation work id equals admission work id,
        //   MaterialCorrelationQualifier shall set materialFact assessment to
        //   Factory Flow MaterialAssessment MaterialReady.
        (api.materialObservation.validity == Factory_Flow.Validity.Valid &
          api.materialObservation.work_id == api.admission.work_id) ___>: (
          api.materialFact.assessment == Factory_Flow.MaterialAssessment.MaterialReady),
        // case MaterialUnavailableCorrelated
        //   If materialObservation validity is Valid and materialObservation
        //   work id equals admission work id and materialObservation
        //   disposition is Factory Flow StepDisposition Unavailable,
        //   MaterialCorrelationQualifier shall set materialFact assessment to
        //   Factory Flow MaterialAssessment MaterialUnavailable.
        (api.materialObservation.validity == Factory_Flow.Validity.Valid &
          api.materialObservation.work_id == api.admission.work_id &
          api.materialObservation.disposition == Factory_Flow.StepDisposition.Unavailable) ___>: (
          api.materialFact.assessment == Factory_Flow.MaterialAssessment.MaterialUnavailable),
        // case MaterialUnknownOrInapplicable
        //   If it is not the case that (materialObservation validity is Valid
        //   and materialObservation work id equals admission work id),
        //   MaterialCorrelationQualifier shall set materialFact assessment to
        //   Factory Flow MaterialAssessment MaterialUnknown.
        !(api.materialObservation.validity == Factory_Flow.Validity.Valid &
          api.materialObservation.work_id == api.admission.work_id) ___>: (
          api.materialFact.assessment == Factory_Flow.MaterialAssessment.MaterialUnknown)
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val apiUsage_materialObservation: Option[Factory_Flow.MaterialHandoffObservation] = api.get_materialObservation()
    api.logInfo(s"Received on data port materialObservation: ${apiUsage_materialObservation}")
    val apiUsage_admission: Option[Factory_Flow.AdmissionFact] = api.get_admission()
    api.logInfo(s"Received on data port admission: ${apiUsage_admission}")

    apiUsage_materialObservation match {
      case Some(obs) =>
        if (obs.validity == Factory_Flow.Validity.Valid &
          obs.work_id == api.admission.work_id) {
          if (obs.disposition == Factory_Flow.StepDisposition.Unavailable) {
            // case MaterialUnavailableCorrelated
            api.put_materialFact(Factory_Flow.MaterialFact(
              assessment = Factory_Flow.MaterialAssessment.MaterialUnavailable))
          } else {
            // case MaterialReadyCorrelated
            api.put_materialFact(Factory_Flow.MaterialFact(
              assessment = Factory_Flow.MaterialAssessment.MaterialReady))
          }
        } else {
          // case MaterialUnknownOrInapplicable
          api.put_materialFact(Factory_Flow.MaterialFact(
            assessment = Factory_Flow.MaterialAssessment.MaterialUnknown))
        }
      case None() =>
        // case MaterialUnknownOrInapplicable
        api.put_materialFact(Factory_Flow.MaterialFact(
          assessment = Factory_Flow.MaterialAssessment.MaterialUnknown))
    }
  }

  def finalise(api: MaterialCorrelationQualifier_Operational_Api): Unit = { }
}
