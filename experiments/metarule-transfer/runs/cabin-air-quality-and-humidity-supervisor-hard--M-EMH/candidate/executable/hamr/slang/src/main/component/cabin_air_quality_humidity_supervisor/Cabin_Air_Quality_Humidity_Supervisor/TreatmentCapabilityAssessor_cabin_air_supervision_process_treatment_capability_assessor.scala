// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor {

  def initialise(api: TreatmentCapabilityAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_filter_facts(Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts(
      Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Untrusted,
      Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Untrusted))
    api.put_humidity_facts(Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts(
      Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Untrusted,
      Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Untrusted,
      Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Untrusted))
    api.put_blower_fact(Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact(
      Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Untrusted))
    api.put_capability_set(Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet(
      Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Untrusted,
      Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Untrusted,
      Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Untrusted,
      Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Untrusted))
  }

  def timeTriggered(api: TreatmentCapabilityAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_readiness() match {
      case Some(readiness) if readiness.validity == Cabin_Air_Quality_Humidity_Supervisor.Validity.Valid =>
        val blower: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Type =
          if (readiness.blowerReadiness == Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Ready
          else if (readiness.blowerReadiness == Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.Failed)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Unknown
        val filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Type =
          if (readiness.filterUnit == Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Ready
          else if (readiness.filterUnit == Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.Failed)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Unknown
        val humidifier: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Type =
          if (readiness.humidifier == Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Ready
          else if (readiness.humidifier == Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.Failed)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Unknown
        val dehumidifier: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Type =
          if (readiness.dehumidifier == Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Ready
          else if (readiness.dehumidifier == Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.Failed)
            Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Unknown
        api.put_capability_set(Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet(blower, filter, humidifier, dehumidifier))
        api.put_filter_facts(Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts(
          if (blower == Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Ready) Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Ready
          else if (blower == Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Failed) Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Unknown,
          if (filter == Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Ready) Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Ready
          else if (filter == Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Failed) Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Unknown))
        api.put_humidity_facts(Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts(
          if (blower == Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Ready) Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Ready
          else if (blower == Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Failed) Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Unknown,
          if (humidifier == Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Ready) Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Ready
          else if (humidifier == Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Failed) Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Unknown,
          if (dehumidifier == Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Ready) Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Ready
          else if (dehumidifier == Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Failed) Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Unknown))
        api.put_blower_fact(Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact(
          if (blower == Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Ready) Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Ready
          else if (blower == Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Failed) Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Failed
          else Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Unknown))
      case _ =>
        api.put_filter_facts(Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts(
          Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Untrusted,
          Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Untrusted))
        api.put_humidity_facts(Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts(
          Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Untrusted,
          Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Untrusted,
          Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Untrusted))
        api.put_blower_fact(Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact(
          Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Untrusted))
        api.put_capability_set(Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet(
          Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Untrusted,
          Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Untrusted,
          Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Untrusted,
          Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Untrusted))
    }
  }

  def finalise(api: TreatmentCapabilityAssessor_Operational_Api): Unit = { }
}
