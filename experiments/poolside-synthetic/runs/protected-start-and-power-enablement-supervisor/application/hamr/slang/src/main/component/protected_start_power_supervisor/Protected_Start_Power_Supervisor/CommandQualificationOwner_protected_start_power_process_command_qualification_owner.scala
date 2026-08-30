// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CommandQualificationOwner_protected_start_power_process_command_qualification_owner {

  def initialise(api: CommandQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_command_facts(Protected_Start_Power_Supervisor.QualifiedCommandFacts.example())
    api.put_command_fault(Base_Types.Boolean_example())
  }

  def timeTriggered(api: CommandQualificationOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee COMMAND_QUALIFICATION_TOTAL
        //   qualified command facts per command report status
        (api.command_report.status == Validity.Valid &
          api.qualified_command_facts.command == api.command_report.command |
          api.command_report.status == Validity.Invalid &
            api.qualified_command_facts.command == Command.None) &
          api.qualified_command_facts.selfTestResetRequested == (api.command_report.status == Validity.Valid &
            api.command_report.command == Command.Off |
            api.command_report.status == Validity.Valid &
              api.command_report.command == Command.EnterMaintenance) &
          api.command_fault == (api.command_report.status == Validity.Invalid)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_command_report: Option[Protected_Start_Power_Supervisor.CommandReport] = api.get_command_report()
    api.logInfo(s"Received on data port command_report: ${apiUsage_command_report}")
  }

  def finalise(api: CommandQualificationOwner_Operational_Api): Unit = { }
}
