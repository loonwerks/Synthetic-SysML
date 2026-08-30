// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner {

  def initialise(api: BrakePedalQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_pedal_facts(Protected_Start_Power_Supervisor.QualifiedPedalFacts.example())
    api.put_pedal_fault(Base_Types.Boolean_example())
  }

  def timeTriggered(api: BrakePedalQualificationOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PEDAL_QUALIFICATION_TOTAL
        //   qualified pedal facts per brake pedal report status and condition
        api.qualified_pedal_facts.pedalStartCondition == (api.brake_pedal_report.status == Validity.Valid &
          api.brake_pedal_report.condition == PedalCondition.Pressed) &
          api.pedal_fault == (api.brake_pedal_report.status == Validity.Invalid)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_brake_pedal_report: Option[Protected_Start_Power_Supervisor.BrakePedalReport] = api.get_brake_pedal_report()
    api.logInfo(s"Received on data port brake_pedal_report: ${apiUsage_brake_pedal_report}")
  }

  def finalise(api: BrakePedalQualificationOwner_Operational_Api): Unit = { }
}
