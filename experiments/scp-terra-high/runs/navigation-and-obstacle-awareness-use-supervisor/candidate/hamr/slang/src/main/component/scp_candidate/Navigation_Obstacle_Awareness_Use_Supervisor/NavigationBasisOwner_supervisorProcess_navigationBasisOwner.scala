// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object NavigationBasisOwner_supervisorProcess_navigationBasisOwner {

  def initialise(api: NavigationBasisOwner_Initialization_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_NAVIGATION_BASIS_publications
        api.proposalBasis == api.outcomeBasis,
        // guarantee INITIAL_NAVIGATION_BASIS_full
        api.gpsAssessment == EvidenceAssessment.READY &
          api.inertialAssessment == EvidenceAssessment.READY &
          api.barometricAssessment == EvidenceAssessment.READY ___>:
          api.proposalBasis == NavigationBasis.FULL_BASIS,
        // guarantee INITIAL_NAVIGATION_BASIS_relative
        api.gpsAssessment == EvidenceAssessment.REJECTED &
          api.inertialAssessment != EvidenceAssessment.REJECTED &
          api.barometricAssessment != EvidenceAssessment.REJECTED ___>:
          api.proposalBasis == NavigationBasis.RELATIVE_BASIS,
        // guarantee INITIAL_NAVIGATION_BASIS_limited
        api.gpsAssessment != EvidenceAssessment.REJECTED &
          (api.inertialAssessment != EvidenceAssessment.REJECTED |
            api.barometricAssessment != EvidenceAssessment.REJECTED) &
          (api.gpsAssessment != EvidenceAssessment.READY |
            api.inertialAssessment != EvidenceAssessment.READY |
            api.barometricAssessment != EvidenceAssessment.READY) ___>:
          api.proposalBasis == NavigationBasis.LIMITED_BASIS,
        // guarantee INITIAL_NAVIGATION_BASIS_unusable
        api.gpsAssessment == EvidenceAssessment.REJECTED &
          (api.inertialAssessment == EvidenceAssessment.REJECTED |
            api.barometricAssessment == EvidenceAssessment.REJECTED) |
          api.gpsAssessment != EvidenceAssessment.REJECTED &
            api.inertialAssessment == EvidenceAssessment.REJECTED &
            api.barometricAssessment == EvidenceAssessment.REJECTED ___>:
          api.proposalBasis == NavigationBasis.UNUSABLE_BASIS
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposalBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS)
    api.put_outcomeBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS)
  }

  def finalise(api: NavigationBasisOwner_Operational_Api): Unit = { }

  def timeTriggered(api: NavigationBasisOwner_Operational_Api): Unit = {
    val g: EvidenceAssessment.Type = api.get_gpsAssessment().get
    val i: EvidenceAssessment.Type = api.get_inertialAssessment().get
    val b: EvidenceAssessment.Type = api.get_barometricAssessment().get
    val basis: NavigationBasis.Type =
      if (g == EvidenceAssessment.READY & i == EvidenceAssessment.READY & b == EvidenceAssessment.READY) NavigationBasis.FULL_BASIS
      else if (g == EvidenceAssessment.REJECTED & i != EvidenceAssessment.REJECTED & b != EvidenceAssessment.REJECTED) NavigationBasis.RELATIVE_BASIS
      else if (g != EvidenceAssessment.REJECTED & (i != EvidenceAssessment.REJECTED | b != EvidenceAssessment.REJECTED)) NavigationBasis.LIMITED_BASIS
      else NavigationBasis.UNUSABLE_BASIS
    api.put_proposalBasis(basis)
    api.put_outcomeBasis(basis)
  }
}
