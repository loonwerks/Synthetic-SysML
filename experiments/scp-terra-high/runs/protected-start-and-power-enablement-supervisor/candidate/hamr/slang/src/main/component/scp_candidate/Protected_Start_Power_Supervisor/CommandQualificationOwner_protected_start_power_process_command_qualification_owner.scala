// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CommandQualificationOwner_protected_start_power_process_command_qualification_owner {

  def initialise(api: CommandQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_command_facts(Protected_Start_Power_Supervisor.QualifiedCommandFacts(Protected_Start_Power_Supervisor.Command.None, F))
    api.put_command_fault(F)
  }

  def timeTriggered(api: CommandQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_command_report() match {
      case Some(report) =>
        val valid = report.status == Protected_Start_Power_Supervisor.Validity.Valid
        val command: Protected_Start_Power_Supervisor.Command.Type =
          if (valid) report.command else Protected_Start_Power_Supervisor.Command.None
        api.put_qualified_command_facts(Protected_Start_Power_Supervisor.QualifiedCommandFacts(
          command, valid && (command == Protected_Start_Power_Supervisor.Command.Off ||
            command == Protected_Start_Power_Supervisor.Command.EnterMaintenance)))
        api.put_command_fault(!valid)
    }
  }

  def finalise(api: CommandQualificationOwner_Operational_Api): Unit = { }
}
