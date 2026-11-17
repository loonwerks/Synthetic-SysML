// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NavigationBasisOwner_supervisorProcess_navigationBasisOwner {

  def initialise(api: NavigationBasisOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposalBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
    api.put_outcomeBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
  }

  def timeTriggered(api: NavigationBasisOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PRESERVE_BASIS_PUBLICATIONS
        //   Publish the selected proposal basis
        api.outcomeBasis == api.proposalBasis,
        // case CASE_05_FULL_BASIS
        //   Three ready sources provide a full basis
        (api.gpsAssessment == EvidenceAssessment.READY &
          api.inertialAssessment == EvidenceAssessment.READY &
          api.barometricAssessment == EvidenceAssessment.READY) ___>: (api.proposalBasis == NavigationBasis.FULL_BASIS),
        // case CASE_06_RELATIVE_BASIS
        //   No GPS with two remaining usable sources is relative
        (api.gpsAssessment == EvidenceAssessment.REJECTED &
          api.inertialAssessment != EvidenceAssessment.REJECTED &
          api.barometricAssessment != EvidenceAssessment.REJECTED) ___>: (api.proposalBasis == NavigationBasis.RELATIVE_BASIS),
        // case CASE_07_LIMITED_BASIS
        //   Partial usable navigation is limited
        (api.gpsAssessment != EvidenceAssessment.REJECTED &
          (api.inertialAssessment != EvidenceAssessment.REJECTED |
            api.barometricAssessment != EvidenceAssessment.REJECTED) &
          (api.gpsAssessment != EvidenceAssessment.READY |
            api.inertialAssessment != EvidenceAssessment.READY |
            api.barometricAssessment != EvidenceAssessment.READY)) ___>: (api.proposalBasis == NavigationBasis.LIMITED_BASIS),
        // case CASE_08_UNUSABLE_BASIS
        //   Insufficient usable navigation is unusable
        (api.gpsAssessment == EvidenceAssessment.REJECTED &
          (api.inertialAssessment == EvidenceAssessment.REJECTED |
            api.barometricAssessment == EvidenceAssessment.REJECTED) |
          api.gpsAssessment != EvidenceAssessment.REJECTED &
            api.inertialAssessment == EvidenceAssessment.REJECTED &
            api.barometricAssessment == EvidenceAssessment.REJECTED) ___>: (api.proposalBasis == NavigationBasis.UNUSABLE_BASIS)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_gpsAssessment() match {
      case Some(gps) =>
        api.get_inertialAssessment() match {
          case Some(inertial) =>
            api.get_barometricAssessment() match {
              case Some(barometric) =>
                val basis: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type =
                  if (gps == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY &
                    inertial == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY &
                    barometric == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS
                  } else if (gps == Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED &
                    inertial != Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED &
                    barometric != Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.RELATIVE_BASIS
                  } else if (gps != Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED &
                    (inertial != Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED |
                      barometric != Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED)) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.LIMITED_BASIS
                  } else {
                    Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS
                  }
                api.put_proposalBasis(basis)
                api.put_outcomeBasis(basis)
              case _ =>
                api.put_proposalBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
                api.put_outcomeBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
            }
          case _ =>
            api.put_proposalBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
            api.put_outcomeBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
        }
      case _ =>
        api.put_proposalBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
        api.put_outcomeBasis(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS)
    }
  }

  def finalise(api: NavigationBasisOwner_Operational_Api): Unit = { }
}
