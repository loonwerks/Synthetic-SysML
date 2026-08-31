// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor {

  def initialise(api: TreatmentCapabilityAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_filter_facts(FilterCapabilityFacts(FilterBranchBlowerDisposition.Untrusted, FilterBranchPathDisposition.Untrusted))
    api.put_humidity_facts(HumidityCapabilityFacts(HumidityBranchBlowerDisposition.Untrusted, HumidityBranchHumidifierDisposition.Untrusted, HumidityBranchDehumidifierDisposition.Untrusted))
    api.put_blower_fact(BlowerCapabilityFact(RoutineBranchBlowerDisposition.Untrusted))
    api.put_capability_set(CapabilitySet(ComposerBlowerDisposition.Untrusted, ComposerFilterDisposition.Untrusted, ComposerHumidifierDisposition.Untrusted, ComposerDehumidifierDisposition.Untrusted))
  }

  def timeTriggered(api: TreatmentCapabilityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee BLOWER_CAPABILITY_CLASSIFICATION
        api.readiness.validity == Validity.Invalid &
          api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted |
          api.readiness.validity == Validity.Valid &
            api.readiness.blowerReadiness == BlowerReadiness.Ready &
            api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready |
          api.readiness.validity == Validity.Valid &
            api.readiness.blowerReadiness == BlowerReadiness.Failed &
            api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed |
          api.readiness.validity == Validity.Valid &
            api.readiness.blowerReadiness == BlowerReadiness.Unknown &
            api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown,
        // guarantee FILTER_CAPABILITY_CLASSIFICATION
        api.readiness.validity == Validity.Invalid &
          api.capability_set.sharedFilterDisposition == ComposerFilterDisposition.Untrusted |
          api.readiness.validity == Validity.Valid &
            api.readiness.filterUnit == FilterUnitReadiness.Ready &
            api.capability_set.sharedFilterDisposition == ComposerFilterDisposition.Ready |
          api.readiness.validity == Validity.Valid &
            api.readiness.filterUnit == FilterUnitReadiness.Failed &
            api.capability_set.sharedFilterDisposition == ComposerFilterDisposition.Failed |
          api.readiness.validity == Validity.Valid &
            api.readiness.filterUnit == FilterUnitReadiness.Unknown &
            api.capability_set.sharedFilterDisposition == ComposerFilterDisposition.Unknown,
        // guarantee HUMIDIFIER_CAPABILITY_CLASSIFICATION
        api.readiness.validity == Validity.Invalid &
          api.capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Untrusted |
          api.readiness.validity == Validity.Valid &
            api.readiness.humidifier == HumidifierReadiness.Ready &
            api.capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready |
          api.readiness.validity == Validity.Valid &
            api.readiness.humidifier == HumidifierReadiness.Failed &
            api.capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Failed |
          api.readiness.validity == Validity.Valid &
            api.readiness.humidifier == HumidifierReadiness.Unknown &
            api.capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Unknown,
        // guarantee DEHUMIDIFIER_CAPABILITY_CLASSIFICATION
        api.readiness.validity == Validity.Invalid &
          api.capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Untrusted |
          api.readiness.validity == Validity.Valid &
            api.readiness.dehumidifier == DehumidifierReadiness.Ready &
            api.capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready |
          api.readiness.validity == Validity.Valid &
            api.readiness.dehumidifier == DehumidifierReadiness.Failed &
            api.capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Failed |
          api.readiness.validity == Validity.Valid &
            api.readiness.dehumidifier == DehumidifierReadiness.Unknown &
            api.capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Unknown,
        // guarantee CAPABILITY_FANOUT_COHERENCE
        api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready &
          api.filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready &
          api.humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
          api.blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready |
          api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed &
            api.filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Failed &
            api.humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Failed &
            api.blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Failed |
          api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown &
            api.filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Unknown &
            api.humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Unknown &
            api.blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Unknown |
          api.capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted &
            api.filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Untrusted &
            api.humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Untrusted &
            api.blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Untrusted
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_readiness() match {
      case Some(readiness) =>
        val valid = readiness.validity == Validity.Valid
        val blower: ComposerBlowerDisposition.Type = if (!valid) ComposerBlowerDisposition.Untrusted
          else if (readiness.blowerReadiness == BlowerReadiness.Ready) ComposerBlowerDisposition.Ready
          else if (readiness.blowerReadiness == BlowerReadiness.Failed) ComposerBlowerDisposition.Failed else ComposerBlowerDisposition.Unknown
        val filter: ComposerFilterDisposition.Type = if (!valid) ComposerFilterDisposition.Untrusted
          else if (readiness.filterUnit == FilterUnitReadiness.Ready) ComposerFilterDisposition.Ready
          else if (readiness.filterUnit == FilterUnitReadiness.Failed) ComposerFilterDisposition.Failed else ComposerFilterDisposition.Unknown
        val humidifier: ComposerHumidifierDisposition.Type = if (!valid) ComposerHumidifierDisposition.Untrusted
          else if (readiness.humidifier == HumidifierReadiness.Ready) ComposerHumidifierDisposition.Ready
          else if (readiness.humidifier == HumidifierReadiness.Failed) ComposerHumidifierDisposition.Failed else ComposerHumidifierDisposition.Unknown
        val dehumidifier: ComposerDehumidifierDisposition.Type = if (!valid) ComposerDehumidifierDisposition.Untrusted
          else if (readiness.dehumidifier == DehumidifierReadiness.Ready) ComposerDehumidifierDisposition.Ready
          else if (readiness.dehumidifier == DehumidifierReadiness.Failed) ComposerDehumidifierDisposition.Failed else ComposerDehumidifierDisposition.Unknown
        api.put_capability_set(CapabilitySet(blower, filter, humidifier, dehumidifier))
        val filterBlower: FilterBranchBlowerDisposition.Type = if (blower == ComposerBlowerDisposition.Ready) FilterBranchBlowerDisposition.Ready
          else if (blower == ComposerBlowerDisposition.Failed) FilterBranchBlowerDisposition.Failed
          else if (blower == ComposerBlowerDisposition.Unknown) FilterBranchBlowerDisposition.Unknown else FilterBranchBlowerDisposition.Untrusted
        val humidityBlower: HumidityBranchBlowerDisposition.Type = if (blower == ComposerBlowerDisposition.Ready) HumidityBranchBlowerDisposition.Ready
          else if (blower == ComposerBlowerDisposition.Failed) HumidityBranchBlowerDisposition.Failed
          else if (blower == ComposerBlowerDisposition.Unknown) HumidityBranchBlowerDisposition.Unknown else HumidityBranchBlowerDisposition.Untrusted
        val routineBlower: RoutineBranchBlowerDisposition.Type = if (blower == ComposerBlowerDisposition.Ready) RoutineBranchBlowerDisposition.Ready
          else if (blower == ComposerBlowerDisposition.Failed) RoutineBranchBlowerDisposition.Failed
          else if (blower == ComposerBlowerDisposition.Unknown) RoutineBranchBlowerDisposition.Unknown else RoutineBranchBlowerDisposition.Untrusted
        val filterPath: FilterBranchPathDisposition.Type = if (filter == ComposerFilterDisposition.Ready) FilterBranchPathDisposition.Ready
          else if (filter == ComposerFilterDisposition.Failed) FilterBranchPathDisposition.Failed
          else if (filter == ComposerFilterDisposition.Unknown) FilterBranchPathDisposition.Unknown else FilterBranchPathDisposition.Untrusted
        val humidifierPath: HumidityBranchHumidifierDisposition.Type = if (humidifier == ComposerHumidifierDisposition.Ready) HumidityBranchHumidifierDisposition.Ready
          else if (humidifier == ComposerHumidifierDisposition.Failed) HumidityBranchHumidifierDisposition.Failed
          else if (humidifier == ComposerHumidifierDisposition.Unknown) HumidityBranchHumidifierDisposition.Unknown else HumidityBranchHumidifierDisposition.Untrusted
        val dehumidifierPath: HumidityBranchDehumidifierDisposition.Type = if (dehumidifier == ComposerDehumidifierDisposition.Ready) HumidityBranchDehumidifierDisposition.Ready
          else if (dehumidifier == ComposerDehumidifierDisposition.Failed) HumidityBranchDehumidifierDisposition.Failed
          else if (dehumidifier == ComposerDehumidifierDisposition.Unknown) HumidityBranchDehumidifierDisposition.Unknown else HumidityBranchDehumidifierDisposition.Untrusted
        api.put_filter_facts(FilterCapabilityFacts(filterBlower, filterPath))
        api.put_humidity_facts(HumidityCapabilityFacts(humidityBlower, humidifierPath, dehumidifierPath))
        api.put_blower_fact(BlowerCapabilityFact(routineBlower))
    }
  }

  def finalise(api: TreatmentCapabilityAssessor_Operational_Api): Unit = { }
}
