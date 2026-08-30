// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StationReportAssessment_supervisor_process_station_report_assessment {

  def initialise(api: StationReportAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_station_facts(Docking_Access_Supervisor.StationFacts(
      F, F, Docking_Access_Supervisor.StationProgress.NONE, F, F,
      Docking_Access_Supervisor.Correlation.NONE))
  }

  def timeTriggered(api: StationReportAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_station_facts(Docking_Access_Supervisor.StationFacts(
      F, F, Docking_Access_Supervisor.StationProgress.NONE, F, F,
      Docking_Access_Supervisor.Correlation.NONE))
  }

  def finalise(api: StationReportAssessment_Operational_Api): Unit = { }
}
