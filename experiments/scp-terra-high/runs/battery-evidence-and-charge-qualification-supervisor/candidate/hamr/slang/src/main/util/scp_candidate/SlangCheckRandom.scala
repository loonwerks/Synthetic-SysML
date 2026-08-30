// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryCapacityBand.scala

BatteryCheck.scala

BatteryAssessment.scala

LifecycleContext.scala

ChargeContextQualification.scala

BatteryReadinessAdvice.scala

ChargerConnection.scala

ChargeActivity.scala

ChargerPathQualification.scala

ChargeSessionState.scala

ChargeEligibilityEnvelope.scala

ChargeRequest.scala

ChargeDecision.scala

SnapshotPreSessionState.scala

SnapshotNextSessionState.scala

SnapshotChargeDisposition.scala

ChargeReason.scala

ChargePermission.scala

FlightControlBatteryNotice.scala

PilotSessionState.scala

PilotChargeDisposition.scala

PilotAdvisory.scala

ChargeSessionSnapshot.scala

PilotBatteryStatus.scala

Base_Types.scala

BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Containers.scala

ChargeContextQualifier_supervisorProcess_chargeContextQualifier_Containers.scala

ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Containers.scala

ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_Containers.scala

ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_Containers.scala

ChargeSessionController_supervisorProcess_chargeSessionController_Containers.scala

FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Containers.scala

PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/

@msig trait RandomLibI {
  def gen: org.sireum.Random.Gen

  def get_numElement: Z
  def set_numElement(s: Z): Unit

  // ========  Z ==========
    def get_Config_Z: Config_Z
    def set_Config_Z(config: Config_Z): RandomLib

    def nextZ(): Z = {
      val conf = get_Config_Z

      var r: Z = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextZ()
          else
            gen.nextZBetween(S64.Min.toZ, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextZBetween(conf.low.get, S64.Max.toZ)
          else
            gen.nextZBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_Z.attempts >= 0) {
       for (i <- 0 to get_Config_Z.attempts) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  B ==========}
    def get_Config_B: Config_B
    def set_Config_B(config: Config_B): RandomLib

    def nextB(): B = {
      var r = gen.nextB()
      if(get_Config_B.attempts >= 0) {
       for (i <- 0 to get_Config_B.attempts) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      } else {
       while(T) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  C ==========
    def get_Config_C: Config_C
    def set_Config_C(config: Config_C): RandomLib

    def nextC(): C = {
      val conf = get_Config_C

      var r: C = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextC()
          else
            gen.nextCBetween(C.fromZ(0), conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextCBetween(conf.low.get, C.fromZ(1114111))
          else
            gen.nextCBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_C.attempts >= 0) {
       for (i <- 0 to get_Config_C.attempts) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  R ==========
    def get_Config_R: Config_R
    def set_Config_R(config: Config_R): RandomLib

    def nextR(): R = {
      val conf = get_Config_R

      var r: R = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextR()
          else
            gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
          else
            gen.nextRBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_R.attempts >= 0) {
       for (i <- 0 to get_Config_R.attempts) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F32 ==========
    def get_Config_F32: Config_F32
    def set_Config_F32(config: Config_F32): RandomLib

    def nextF32(): F32 = {
      val conf = get_Config_F32

      var r: F32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF32()
          else
            gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
          else
            gen.nextF32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F32.attempts >= 0) {
       for (i <- 0 to get_Config_F32.attempts) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F64 ==========
    def get_Config_F64: Config_F64
    def set_Config_F64(config: Config_F64): RandomLib

    def nextF64(): F64 = {
      val conf = get_Config_F64

      var r: F64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF64()
          else
            gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
          else
            gen.nextF64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F64.attempts >= 0) {
       for (i <- 0 to get_Config_F64.attempts) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S8 ==========
    def get_Config_S8: Config_S8
    def set_Config_S8(config: Config_S8): RandomLib

    def nextS8(): S8 = {
      val conf = get_Config_S8

      var r: S8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS8()
          else
            gen.nextS8Between(S8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS8Between(conf.low.get, S8.Max)
          else
            gen.nextS8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S8.attempts >= 0) {
       for (i <- 0 to get_Config_S8.attempts) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S16 ==========
    def get_Config_S16: Config_S16
    def set_Config_S16(config: Config_S16): RandomLib

    def nextS16(): S16 = {
      val conf = get_Config_S16

      var r: S16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS16()
          else
            gen.nextS16Between(S16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS16Between(conf.low.get, S16.Max)
          else
            gen.nextS16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S16.attempts >= 0) {
       for (i <- 0 to get_Config_S16.attempts) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S32 ==========
    def get_Config_S32: Config_S32
    def set_Config_S32(config: Config_S32): RandomLib

    def nextS32(): S32 = {
      val conf = get_Config_S32

      var r: S32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS32()
          else
            gen.nextS32Between(S32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS32Between(conf.low.get, S32.Max)
          else
            gen.nextS32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S32.attempts >= 0) {
       for (i <- 0 to get_Config_S32.attempts) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S64 ==========
    def get_Config_S64: Config_S64
    def set_Config_S64(config: Config_S64): RandomLib

    def nextS64(): S64 = {
      val conf = get_Config_S64

      var r: S64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS64()
          else
            gen.nextS64Between(S64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS64Between(conf.low.get, S64.Max)
          else
            gen.nextS64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S64.attempts >= 0) {
       for (i <- 0 to get_Config_S64.attempts) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U8 ==========
    def get_Config_U8: Config_U8
    def set_Config_U8(config: Config_U8): RandomLib

    def nextU8(): U8 = {
      val conf = get_Config_U8

      var r: U8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU8()
          else
            gen.nextU8Between(U8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU8Between(conf.low.get, U8.Max)
          else
            gen.nextU8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U8.attempts >= 0) {
       for (i <- 0 to get_Config_U8.attempts) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U16 ==========
    def get_Config_U16: Config_U16
    def set_Config_U16(config: Config_U16): RandomLib

    def nextU16(): U16 = {
      val conf = get_Config_U16

      var r: U16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU16()
          else
            gen.nextU16Between(U16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU16Between(conf.low.get, U16.Max)
          else
            gen.nextU16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U16.attempts >= 0) {
       for (i <- 0 to get_Config_U16.attempts) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U32 ==========
    def get_Config_U32: Config_U32
    def set_Config_U32(config: Config_U32): RandomLib

    def nextU32(): U32 = {
      val conf = get_Config_U32

      var r: U32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU32()
          else
            gen.nextU32Between(U32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU32Between(conf.low.get, U32.Max)
          else
            gen.nextU32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U32.attempts >= 0) {
       for (i <- 0 to get_Config_U32.attempts) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U64 ==========
    def get_Config_U64: Config_U64
    def set_Config_U64(config: Config_U64): RandomLib

    def nextU64(): U64 = {
      val conf = get_Config_U64

      var r: U64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU64()
          else
            gen.nextU64Between(U64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU64Between(conf.low.get, U64.Max)
          else
            gen.nextU64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U64.attempts >= 0) {
       for (i <- 0 to get_Config_U64.attempts) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ============= String ===================

  def get_Config_String: Config_String
  def set_Config_String(config: Config_String): RandomLib

  def nextString(): String = {

    var length: Z = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
    var str: String = ""
    for(r <- 0 until length){
      str = s"${str}${nextC().string}"
    }

    if(get_Config_String.attempts >= 0) {
      for (i <- 0 to get_Config_String.attempts) {
        if(get_Config_String.filter(str)) {
          return str
        }
        if(get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    } else {
      while(T) {
        if (get_Config_String.filter(str)) {
          return str
        }
        if (get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.DataContent ===================

  def get_Config__artDataContent: Config__artDataContent
  def set_Config__artDataContent(config: Config__artDataContent): RandomLib

  def next_artDataContent(): art.DataContent = {
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload_Id, _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload_Id, _artDataContent_DataTypeId.utilEmptyContainer_Id)

    if(get_Config__artDataContent.additiveTypeFiltering) {
       callEnum = get_Config__artDataContent.typeFilter
    } else {
       for(h <- get_Config__artDataContent.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: art.DataContent = c match {
      case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
      case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload _).apply()
      case _artDataContent_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config__artDataContent.attempts >= 0) {
     for(i <- 0 to get_Config__artDataContent.attempts) {
       if(get_Config__artDataContent.filter(v)) {
        return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config__artDataContent.filter(v)) {
         return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload _).apply()
         case _artDataContent_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.Empty ===================

  def get_Config__artEmpty: Config__artEmpty
  def set_Config__artEmpty(config: Config__artEmpty): RandomLib

  def next_artEmpty(): art.Empty = {

    var v: art.Empty = art.Empty()

    if(get_Config__artEmpty.attempts >= 0) {
     for(i <- 0 to get_Config__artEmpty.attempts) {
        if(get_Config__artEmpty.filter(v)) {
          return v
        }
        if (get_Config__artEmpty.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = art.Empty()
     }
    } else {
     while(T) {
       if(get_Config__artEmpty.filter(v)) {
         return v
       }
       if (get_Config__artEmpty.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = art.Empty()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Boolean_Payload ===================

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload
  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib

  def nextBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
    var value: B = nextB()

    var v: Base_Types.Boolean_Payload = Base_Types.Boolean_Payload(value)

    if(get_Config_Base_TypesBoolean_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBoolean_Payload.attempts) {
        if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBoolean_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextB()
        v = Base_Types.Boolean_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBoolean_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextB()
       v = Base_Types.Boolean_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_Payload ===================

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload
  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib

  def nextBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
    var value: Z = nextZ()

    var v: Base_Types.Integer_Payload = Base_Types.Integer_Payload(value)

    if(get_Config_Base_TypesInteger_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_Payload.attempts) {
        if(get_Config_Base_TypesInteger_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextZ()
        v = Base_Types.Integer_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextZ()
       v = Base_Types.Integer_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_8_Payload ===================

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload
  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib

  def nextBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
    var value: S8 = nextS8()

    var v: Base_Types.Integer_8_Payload = Base_Types.Integer_8_Payload(value)

    if(get_Config_Base_TypesInteger_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_8_Payload.attempts) {
        if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS8()
        v = Base_Types.Integer_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS8()
       v = Base_Types.Integer_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_16_Payload ===================

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload
  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib

  def nextBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
    var value: S16 = nextS16()

    var v: Base_Types.Integer_16_Payload = Base_Types.Integer_16_Payload(value)

    if(get_Config_Base_TypesInteger_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_16_Payload.attempts) {
        if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS16()
        v = Base_Types.Integer_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS16()
       v = Base_Types.Integer_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_32_Payload ===================

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload
  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib

  def nextBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
    var value: S32 = nextS32()

    var v: Base_Types.Integer_32_Payload = Base_Types.Integer_32_Payload(value)

    if(get_Config_Base_TypesInteger_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_32_Payload.attempts) {
        if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS32()
        v = Base_Types.Integer_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS32()
       v = Base_Types.Integer_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_64_Payload ===================

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload
  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib

  def nextBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
    var value: S64 = nextS64()

    var v: Base_Types.Integer_64_Payload = Base_Types.Integer_64_Payload(value)

    if(get_Config_Base_TypesInteger_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_64_Payload.attempts) {
        if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS64()
        v = Base_Types.Integer_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS64()
       v = Base_Types.Integer_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_8_Payload ===================

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload
  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib

  def nextBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
    var value: U8 = nextU8()

    var v: Base_Types.Unsigned_8_Payload = Base_Types.Unsigned_8_Payload(value)

    if(get_Config_Base_TypesUnsigned_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_8_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU8()
        v = Base_Types.Unsigned_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU8()
       v = Base_Types.Unsigned_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_16_Payload ===================

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload
  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib

  def nextBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
    var value: U16 = nextU16()

    var v: Base_Types.Unsigned_16_Payload = Base_Types.Unsigned_16_Payload(value)

    if(get_Config_Base_TypesUnsigned_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_16_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU16()
        v = Base_Types.Unsigned_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU16()
       v = Base_Types.Unsigned_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_32_Payload ===================

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload
  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib

  def nextBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
    var value: U32 = nextU32()

    var v: Base_Types.Unsigned_32_Payload = Base_Types.Unsigned_32_Payload(value)

    if(get_Config_Base_TypesUnsigned_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_32_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU32()
        v = Base_Types.Unsigned_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU32()
       v = Base_Types.Unsigned_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_64_Payload ===================

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload
  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib

  def nextBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
    var value: U64 = nextU64()

    var v: Base_Types.Unsigned_64_Payload = Base_Types.Unsigned_64_Payload(value)

    if(get_Config_Base_TypesUnsigned_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_64_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU64()
        v = Base_Types.Unsigned_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU64()
       v = Base_Types.Unsigned_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_Payload ===================

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload
  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib

  def nextBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
    var value: R = nextR()

    var v: Base_Types.Float_Payload = Base_Types.Float_Payload(value)

    if(get_Config_Base_TypesFloat_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_Payload.attempts) {
        if(get_Config_Base_TypesFloat_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextR()
        v = Base_Types.Float_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextR()
       v = Base_Types.Float_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_32_Payload ===================

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload
  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib

  def nextBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
    var value: F32 = nextF32()

    var v: Base_Types.Float_32_Payload = Base_Types.Float_32_Payload(value)

    if(get_Config_Base_TypesFloat_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_32_Payload.attempts) {
        if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF32()
        v = Base_Types.Float_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF32()
       v = Base_Types.Float_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_64_Payload ===================

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload
  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib

  def nextBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
    var value: F64 = nextF64()

    var v: Base_Types.Float_64_Payload = Base_Types.Float_64_Payload(value)

    if(get_Config_Base_TypesFloat_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_64_Payload.attempts) {
        if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF64()
        v = Base_Types.Float_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF64()
       v = Base_Types.Float_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Character_Payload ===================

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload
  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib

  def nextBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
    var value: C = nextC()

    var v: Base_Types.Character_Payload = Base_Types.Character_Payload(value)

    if(get_Config_Base_TypesCharacter_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesCharacter_Payload.attempts) {
        if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesCharacter_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextC()
        v = Base_Types.Character_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesCharacter_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextC()
       v = Base_Types.Character_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.String_Payload ===================

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload
  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib

  def nextBase_TypesString_Payload(): Base_Types.String_Payload = {
    var value: String = nextString()

    var v: Base_Types.String_Payload = Base_Types.String_Payload(value)

    if(get_Config_Base_TypesString_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesString_Payload.attempts) {
        if(get_Config_Base_TypesString_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesString_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextString()
        v = Base_Types.String_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesString_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesString_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextString()
       v = Base_Types.String_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== ISZ[B] =====================
  def get_Config_ISZB: Config_ISZB
  def set_Config_ISZB(config: Config_ISZB): RandomLib

  def nextISZB(): ISZ[B] = {

    var length: Z = gen.nextZBetween(0, get_numElement)
    var v: ISZ[B] = ISZ()
    for (r <- 0 until length) {
      v = v :+ nextB()
    }

    if(get_Config_ISZB.attempts >= 0) {
     for(i <- 0 to get_Config_ISZB.attempts) {
        if(get_Config_ISZB.filter(v)) {
          return v
        }
        if (get_Config_ISZB.verbose) {
          println(s"Retrying for failing value: $v")
        }

        length = gen.nextZBetween(0, get_numElement)
        v = ISZ()
        for (r <- 0 until length) {
           v = v :+ nextB()
        }
     }
    } else {
     while(T) {
       if(get_Config_ISZB.filter(v)) {
         return v
       }
       if (get_Config_ISZB.verbose) {
         println(s"Retrying for failing value: $v")
       }

       length = gen.nextZBetween(0, get_numElement)
       v = ISZ()
       for (r <- 0 until length) {
          v = v :+ nextB()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Bits_Payload ===================

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload
  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib

  def nextBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
    var value: ISZ[B] = nextISZB()

    var v: Base_Types.Bits_Payload = Base_Types.Bits_Payload(value)

    if(get_Config_Base_TypesBits_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBits_Payload.attempts) {
        if(get_Config_Base_TypesBits_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBits_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextISZB()
        v = Base_Types.Bits_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBits_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBits_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextISZB()
       v = Base_Types.Bits_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {
    var api_batteryCapacity: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
    var api_batteryCheck: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(api_batteryCapacity, api_batteryCheck)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryCapacity = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
        api_batteryCheck = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryCapacity = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
       api_batteryCheck = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
    var api_batteryCapacity: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
    var api_batteryCheck: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryCapacity = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
        api_batteryCheck = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryCapacity = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
       api_batteryCheck = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(api_batteryAssessment)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(api_batteryAssessment)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(api_batteryAssessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_batteryAssessment)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_batteryAssessment)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_batteryAssessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
    var api_lifecycleContext: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
    var api_lifecycleContext: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {
    var api_batteryReadinessAdvice: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
    var api_chargeContextQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(api_batteryReadinessAdvice, api_chargeContextQualification)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryReadinessAdvice = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
        api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(api_batteryReadinessAdvice, api_chargeContextQualification)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryReadinessAdvice = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
       api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(api_batteryReadinessAdvice, api_chargeContextQualification)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {
    var api_batteryReadinessAdvice: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
    var api_chargeContextQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(api_batteryReadinessAdvice, api_chargeContextQualification)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryReadinessAdvice = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
        api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(api_batteryReadinessAdvice, api_chargeContextQualification)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryReadinessAdvice = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
       api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(api_batteryReadinessAdvice, api_chargeContextQualification)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {
    var api_chargeContextQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
    var api_chargerPathQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
    var api_currentChargeSession: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
        api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
       api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {
    var api_chargeContextQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
    var api_chargerPathQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
    var api_currentChargeSession: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
        api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeContextQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
       api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {
    var api_chargeEligibilityEnvelope: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(api_chargeEligibilityEnvelope)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(api_chargeEligibilityEnvelope)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(api_chargeEligibilityEnvelope)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {
    var api_chargeEligibilityEnvelope: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(api_chargeEligibilityEnvelope)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(api_chargeEligibilityEnvelope)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(api_chargeEligibilityEnvelope)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {
    var api_chargeEligibilityEnvelope: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
    var api_chargeRequest: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(api_chargeEligibilityEnvelope, api_chargeRequest)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
        api_chargeRequest = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(api_chargeEligibilityEnvelope, api_chargeRequest)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
       api_chargeRequest = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(api_chargeEligibilityEnvelope, api_chargeRequest)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {
    var api_chargeEligibilityEnvelope: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
    var api_chargeRequest: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(api_chargeEligibilityEnvelope, api_chargeRequest)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
        api_chargeRequest = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(api_chargeEligibilityEnvelope, api_chargeRequest)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeEligibilityEnvelope = nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
       api_chargeRequest = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(api_chargeEligibilityEnvelope, api_chargeRequest)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {
    var api_chargeDecision: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(api_chargeDecision)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(api_chargeDecision)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(api_chargeDecision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {
    var api_chargeDecision: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(api_chargeDecision)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(api_chargeDecision)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(api_chargeDecision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {
    var api_chargeDecision: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(api_chargeDecision)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(api_chargeDecision)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(api_chargeDecision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {
    var api_chargeDecision: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(api_chargeDecision)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(api_chargeDecision)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeDecision = nextBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(api_chargeDecision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {
    var api_chargePermission: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
    var api_chargeSessionSnapshot: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
    var api_currentChargeSession: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargePermission = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
        api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
        api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargePermission = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
       api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
       api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {
    var api_chargePermission: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
    var api_chargeSessionSnapshot: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
    var api_currentChargeSession: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargePermission = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
        api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
        api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargePermission = nextBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
       api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
       api_currentChargeSession = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = {
    var preSession: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
    var nextSession: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
    var disposition: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
    var reason: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(preSession, nextSession, disposition, reason)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot.verbose) {
          println(s"Retrying for failing value: $v")
        }
        preSession = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
        nextSession = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
        disposition = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
        reason = nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(preSession, nextSession, disposition, reason)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot.verbose) {
         println(s"Retrying for failing value: $v")
       }
       preSession = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
       nextSession = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
       disposition = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
       reason = nextBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(preSession, nextSession, disposition, reason)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {
    var api_chargeActivity: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
    var api_chargerConnection: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(api_chargeActivity, api_chargerConnection)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeActivity = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
        api_chargerConnection = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(api_chargeActivity, api_chargerConnection)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeActivity = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
       api_chargerConnection = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(api_chargeActivity, api_chargerConnection)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {
    var api_chargeActivity: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
    var api_chargerConnection: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(api_chargeActivity, api_chargerConnection)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargeActivity = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
        api_chargerConnection = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(api_chargeActivity, api_chargerConnection)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargeActivity = nextBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
       api_chargerConnection = nextBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(api_chargeActivity, api_chargerConnection)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {
    var api_chargerPathQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(api_chargerPathQualification)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(api_chargerPathQualification)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(api_chargerPathQualification)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {
    var api_chargerPathQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(api_chargerPathQualification)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(api_chargerPathQualification)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(api_chargerPathQualification)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
    var api_lifecycleContext: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
    var api_lifecycleContext: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       api_lifecycleContext = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {
    var api_flightControlBatteryNotice: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(api_flightControlBatteryNotice)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_flightControlBatteryNotice = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(api_flightControlBatteryNotice)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_flightControlBatteryNotice = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(api_flightControlBatteryNotice)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {
    var api_flightControlBatteryNotice: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(api_flightControlBatteryNotice)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_flightControlBatteryNotice = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(api_flightControlBatteryNotice)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_flightControlBatteryNotice = nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(api_flightControlBatteryNotice)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type = nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = {
    var batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
    var chargerPathQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
    var session: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
    var disposition: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
    var advisory: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type = nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus(batteryAssessment, chargerPathQualification, session, disposition, advisory)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus.verbose) {
          println(s"Retrying for failing value: $v")
        }
        batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        session = nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
        disposition = nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
        advisory = nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus(batteryAssessment, chargerPathQualification, session, disposition, advisory)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus.verbose) {
         println(s"Retrying for failing value: $v")
       }
       batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       session = nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
       disposition = nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
       advisory = nextBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus(batteryAssessment, chargerPathQualification, session, disposition, advisory)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
    var api_chargeSessionSnapshot: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
    var api_chargerPathQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
        api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
       api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {
    var api_batteryAssessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
    var api_chargeSessionSnapshot: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
    var api_chargerPathQualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
        api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
        api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_batteryAssessment = nextBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
       api_chargeSessionSnapshot = nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
       api_chargerPathQualification = nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = {
    var callEnum: ISZ[Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Type] = ISZ(Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id, Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = c match {
      case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
      case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
         case Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {
    var api_pilotBatteryStatus: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(api_pilotBatteryStatus)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_pilotBatteryStatus = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(api_pilotBatteryStatus)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_pilotBatteryStatus = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(api_pilotBatteryStatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {
    var api_pilotBatteryStatus: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(api_pilotBatteryStatus)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_pilotBatteryStatus = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(api_pilotBatteryStatus)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_pilotBatteryStatus = nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(api_pilotBatteryStatus)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.numOfElements-1)

    var v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.byOrdinal(ordinal).get
    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType.attempts) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.numOfElements-1)
       v = scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload ===================

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload
  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload): RandomLib

  def nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = {
    var value: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()

    var v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload(value)

    if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload.attempts) {
        if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
        v = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
       v = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= util.Container ===================

  def get_Config_utilContainer: Config_utilContainer
  def set_Config_utilContainer(config: Config_utilContainer): RandomLib

  def nextutilContainer(): util.Container = {
    var callEnum: ISZ[utilContainer_DataTypeId.Type] = ISZ(utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id, utilContainer_DataTypeId.utilEmptyContainer_Id)

    if(get_Config_utilContainer.additiveTypeFiltering) {
       callEnum = get_Config_utilContainer.typeFilter
    } else {
       for(h <- get_Config_utilContainer.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: util.Container = c match {
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_utilContainer.attempts >= 0) {
     for(i <- 0 to get_Config_utilContainer.attempts) {
       if(get_Config_utilContainer.filter(v)) {
        return v
       }
       if (get_Config_utilContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_utilContainer.filter(v)) {
         return v
       }
       if (get_Config_utilContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS_Id => (nextBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.utilEmptyContainer_Id => (nextutilEmptyContainer _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= util.EmptyContainer ===================

  def get_Config_utilEmptyContainer: Config_utilEmptyContainer
  def set_Config_utilEmptyContainer(config: Config_utilEmptyContainer): RandomLib

  def nextutilEmptyContainer(): util.EmptyContainer = {

    var v: util.EmptyContainer = util.EmptyContainer()

    if(get_Config_utilEmptyContainer.attempts >= 0) {
     for(i <- 0 to get_Config_utilEmptyContainer.attempts) {
        if(get_Config_utilEmptyContainer.filter(v)) {
          return v
        }
        if (get_Config_utilEmptyContainer.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = util.EmptyContainer()
     }
    } else {
     while(T) {
       if(get_Config_utilEmptyContainer.filter(v)) {
         return v
       }
       if (get_Config_utilEmptyContainer.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = util.EmptyContainer()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= runtimemonitor.ObservationKind.Type ===================

  def get_Config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType
  def set_Config_runtimemonitorObservationKindType(config: Config_runtimemonitorObservationKindType): RandomLib

  def nextruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.runtimemonitor.ObservationKind.numOfElements-1)

    var v: runtimemonitor.ObservationKind.Type = scp_candidate.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
    if(get_Config_runtimemonitorObservationKindType.attempts >= 0) {
     for(i <- 0 to get_Config_runtimemonitorObservationKindType.attempts) {
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.runtimemonitor.ObservationKind.numOfElements-1)
       v = scp_candidate.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.runtimemonitor.ObservationKind.numOfElements-1)
       v = scp_candidate.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

}

@record class RandomLib(val gen: org.sireum.Random.Gen) extends RandomLibI {

  var numElem: Z = 50

  var _verbose: B = F
  def verbose: RandomLib = {
    _verbose = !_verbose
    return this
  }

  def get_numElement: Z = {return numElem}

  def set_numElement(s: Z): Unit ={
    numElem = s
  }

  // ============= String =============

  def alwaysTrue_String(v: String): B = {return T}

  var config_String: Config_String = Config_String(0, numElem, 100, _verbose, alwaysTrue_String _)

  def get_Config_String: Config_String = {return config_String}

  def set_Config_String(config: Config_String): RandomLib = {
    config_String = config
    return this
  }

  // ============= Z ===================
  def alwaysTrue_Z(v: Z): B = {return T}

  var config_Z: Config_Z = Config_Z(None(), None(), 100, _verbose, alwaysTrue_Z _)
  def get_Config_Z: Config_Z = {return config_Z}

  def set_Config_Z(config: Config_Z): RandomLib ={
    config_Z = config
    return this
  }

  // ============= B ===================
  def alwaysTrue_B(v: B): B = {return T}

  var config_B: Config_B = Config_B(100, _verbose, alwaysTrue_B _)
  def get_Config_B: Config_B = {return config_B}

  def set_Config_B(config: Config_B): RandomLib ={
    config_B = config
    return this
  }

  // ============= C ===================
  def alwaysTrue_C(v: C): B = {return T}

  var config_C: Config_C = Config_C(None(), None(), 100, _verbose, alwaysTrue_C _)
  def get_Config_C: Config_C = {return config_C}

  def set_Config_C(config: Config_C): RandomLib ={
    config_C = config
    return this
  }

  // ============= R ===================
  def alwaysTrue_R(v: R): B = {return T}

  var config_R: Config_R = Config_R(None(), None(), 100, _verbose, alwaysTrue_R _)
  def get_Config_R: Config_R = {return config_R}

  def set_Config_R(config: Config_R): RandomLib ={
    config_R = config
    return this
  }

  // ============= F32 ===================
  def alwaysTrue_F32(v: F32): B = {return T}

  var config_F32: Config_F32 = Config_F32(None(), None(), 100, _verbose, alwaysTrue_F32 _)
  def get_Config_F32: Config_F32 = {return config_F32}

  def set_Config_F32(config: Config_F32): RandomLib ={
    config_F32 = config
    return this
  }

  // ============= F64 ===================
  def alwaysTrue_F64(v: F64): B = {return T}

  var config_F64: Config_F64 = Config_F64(None(), None(), 100, _verbose, alwaysTrue_F64 _)
  def get_Config_F64: Config_F64 = {return config_F64}

  def set_Config_F64(config: Config_F64): RandomLib ={
    config_F64 = config
    return this
  }

  // ============= S8 ===================
  def alwaysTrue_S8(v: S8): B = {return T}

  var config_S8: Config_S8 = Config_S8(None(), None(), 100, _verbose, alwaysTrue_S8 _)
  def get_Config_S8: Config_S8 = {return config_S8}

  def set_Config_S8(config: Config_S8): RandomLib ={
    config_S8 = config
    return this
  }

  // ============= S16 ===================
  def alwaysTrue_S16(v: S16): B = {return T}

  var config_S16: Config_S16 = Config_S16(None(), None(), 100, _verbose, alwaysTrue_S16 _)
  def get_Config_S16: Config_S16 = {return config_S16}

  def set_Config_S16(config: Config_S16): RandomLib ={
    config_S16 = config
    return this
  }

  // ============= S32 ===================
  def alwaysTrue_S32(v: S32): B = {return T}

  var config_S32: Config_S32 = Config_S32(None(), None(), 100, _verbose, alwaysTrue_S32 _)
  def get_Config_S32: Config_S32 = {return config_S32}

  def set_Config_S32(config: Config_S32): RandomLib ={
    config_S32 = config
    return this
  }

  // ============= S64 ===================
  def alwaysTrue_S64(v: S64): B = {return T}

  var config_S64: Config_S64 = Config_S64(None(), None(), 100, _verbose, alwaysTrue_S64 _)
  def get_Config_S64: Config_S64 = {return config_S64}

  def set_Config_S64(config: Config_S64): RandomLib ={
    config_S64 = config
    return this
  }

  // ============= U8 ===================
  def alwaysTrue_U8(v: U8): B = {return T}

  var config_U8: Config_U8 = Config_U8(None(), None(), 100, _verbose, alwaysTrue_U8 _)
  def get_Config_U8: Config_U8 = {return config_U8}

  def set_Config_U8(config: Config_U8): RandomLib ={
    config_U8 = config
    return this
  }

  // ============= U16 ===================
  def alwaysTrue_U16(v: U16): B = {return T}

  var config_U16: Config_U16 = Config_U16(None(), None(), 100, _verbose, alwaysTrue_U16 _)
  def get_Config_U16: Config_U16 = {return config_U16}

  def set_Config_U16(config: Config_U16): RandomLib ={
    config_U16 = config
    return this
  }

  // ============= U32 ===================
  def alwaysTrue_U32(v: U32): B = {return T}

  var config_U32: Config_U32 = Config_U32(None(), None(), 100, _verbose, alwaysTrue_U32 _)
  def get_Config_U32: Config_U32 = {return config_U32}

  def set_Config_U32(config: Config_U32): RandomLib ={
    config_U32 = config
    return this
  }

  // ============= U64 ===================
  def alwaysTrue_U64(v: U64): B = {return T}

  var config_U64: Config_U64 = Config_U64(None(), None(), 100, _verbose, alwaysTrue_U64 _)
  def get_Config_U64: Config_U64 = {return config_U64}

  def set_Config_U64(config: Config_U64): RandomLib ={
    config_U64 = config
    return this
  }

  // ============= art.DataContent ===================
  def alwaysTrue__artDataContent(v: art.DataContent): B = {return T}

  var config__artDataContent: Config__artDataContent = Config__artDataContent(100, _verbose, F, ISZ(), alwaysTrue__artDataContent _)

  def get_Config__artDataContent: Config__artDataContent = {return config__artDataContent}

  def set_Config__artDataContent(config: Config__artDataContent): RandomLib ={
    config__artDataContent = config
    return this
  }

  // ============= art.Empty ===================
  def alwaysTrue__artEmpty(v: art.Empty): B = {return T}

  var config__artEmpty: Config__artEmpty = Config__artEmpty(100, _verbose, alwaysTrue__artEmpty _)

  def get_Config__artEmpty: Config__artEmpty = {return config__artEmpty}

  def set_Config__artEmpty(config: Config__artEmpty): RandomLib ={
    config__artEmpty = config
    return this
  }

  // ============= Base_Types.Boolean_Payload ===================
  def alwaysTrue_Base_TypesBoolean_Payload(v: Base_Types.Boolean_Payload): B = {return T}

  var config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = Config_Base_TypesBoolean_Payload(100, _verbose, alwaysTrue_Base_TypesBoolean_Payload _)

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = {return config_Base_TypesBoolean_Payload}

  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib ={
    config_Base_TypesBoolean_Payload = config
    return this
  }

  // ============= Base_Types.Integer_Payload ===================
  def alwaysTrue_Base_TypesInteger_Payload(v: Base_Types.Integer_Payload): B = {return T}

  var config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = Config_Base_TypesInteger_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_Payload _)

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = {return config_Base_TypesInteger_Payload}

  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib ={
    config_Base_TypesInteger_Payload = config
    return this
  }

  // ============= Base_Types.Integer_8_Payload ===================
  def alwaysTrue_Base_TypesInteger_8_Payload(v: Base_Types.Integer_8_Payload): B = {return T}

  var config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = Config_Base_TypesInteger_8_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_8_Payload _)

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = {return config_Base_TypesInteger_8_Payload}

  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib ={
    config_Base_TypesInteger_8_Payload = config
    return this
  }

  // ============= Base_Types.Integer_16_Payload ===================
  def alwaysTrue_Base_TypesInteger_16_Payload(v: Base_Types.Integer_16_Payload): B = {return T}

  var config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = Config_Base_TypesInteger_16_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_16_Payload _)

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = {return config_Base_TypesInteger_16_Payload}

  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib ={
    config_Base_TypesInteger_16_Payload = config
    return this
  }

  // ============= Base_Types.Integer_32_Payload ===================
  def alwaysTrue_Base_TypesInteger_32_Payload(v: Base_Types.Integer_32_Payload): B = {return T}

  var config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = Config_Base_TypesInteger_32_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_32_Payload _)

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = {return config_Base_TypesInteger_32_Payload}

  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib ={
    config_Base_TypesInteger_32_Payload = config
    return this
  }

  // ============= Base_Types.Integer_64_Payload ===================
  def alwaysTrue_Base_TypesInteger_64_Payload(v: Base_Types.Integer_64_Payload): B = {return T}

  var config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = Config_Base_TypesInteger_64_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_64_Payload _)

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = {return config_Base_TypesInteger_64_Payload}

  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib ={
    config_Base_TypesInteger_64_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_8_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_8_Payload(v: Base_Types.Unsigned_8_Payload): B = {return T}

  var config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = Config_Base_TypesUnsigned_8_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_8_Payload _)

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = {return config_Base_TypesUnsigned_8_Payload}

  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib ={
    config_Base_TypesUnsigned_8_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_16_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_16_Payload(v: Base_Types.Unsigned_16_Payload): B = {return T}

  var config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = Config_Base_TypesUnsigned_16_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_16_Payload _)

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = {return config_Base_TypesUnsigned_16_Payload}

  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib ={
    config_Base_TypesUnsigned_16_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_32_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_32_Payload(v: Base_Types.Unsigned_32_Payload): B = {return T}

  var config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = Config_Base_TypesUnsigned_32_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_32_Payload _)

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = {return config_Base_TypesUnsigned_32_Payload}

  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib ={
    config_Base_TypesUnsigned_32_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_64_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_64_Payload(v: Base_Types.Unsigned_64_Payload): B = {return T}

  var config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = Config_Base_TypesUnsigned_64_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_64_Payload _)

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = {return config_Base_TypesUnsigned_64_Payload}

  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib ={
    config_Base_TypesUnsigned_64_Payload = config
    return this
  }

  // ============= Base_Types.Float_Payload ===================
  def alwaysTrue_Base_TypesFloat_Payload(v: Base_Types.Float_Payload): B = {return T}

  var config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = Config_Base_TypesFloat_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_Payload _)

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = {return config_Base_TypesFloat_Payload}

  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib ={
    config_Base_TypesFloat_Payload = config
    return this
  }

  // ============= Base_Types.Float_32_Payload ===================
  def alwaysTrue_Base_TypesFloat_32_Payload(v: Base_Types.Float_32_Payload): B = {return T}

  var config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = Config_Base_TypesFloat_32_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_32_Payload _)

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = {return config_Base_TypesFloat_32_Payload}

  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib ={
    config_Base_TypesFloat_32_Payload = config
    return this
  }

  // ============= Base_Types.Float_64_Payload ===================
  def alwaysTrue_Base_TypesFloat_64_Payload(v: Base_Types.Float_64_Payload): B = {return T}

  var config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = Config_Base_TypesFloat_64_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_64_Payload _)

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = {return config_Base_TypesFloat_64_Payload}

  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib ={
    config_Base_TypesFloat_64_Payload = config
    return this
  }

  // ============= Base_Types.Character_Payload ===================
  def alwaysTrue_Base_TypesCharacter_Payload(v: Base_Types.Character_Payload): B = {return T}

  var config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = Config_Base_TypesCharacter_Payload(100, _verbose, alwaysTrue_Base_TypesCharacter_Payload _)

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = {return config_Base_TypesCharacter_Payload}

  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib ={
    config_Base_TypesCharacter_Payload = config
    return this
  }

  // ============= Base_Types.String_Payload ===================
  def alwaysTrue_Base_TypesString_Payload(v: Base_Types.String_Payload): B = {return T}

  var config_Base_TypesString_Payload: Config_Base_TypesString_Payload = Config_Base_TypesString_Payload(100, _verbose, alwaysTrue_Base_TypesString_Payload _)

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload = {return config_Base_TypesString_Payload}

  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib ={
    config_Base_TypesString_Payload = config
    return this
  }

  // ============= ISZ[B] ===================
  def alwaysTrue_ISZB(v: ISZ[B]): B = {return T}

  var config_ISZB: Config_ISZB = Config_ISZB(0, 20, 100, _verbose, alwaysTrue_ISZB _)
  def get_Config_ISZB: Config_ISZB = {return config_ISZB}

  def set_Config_ISZB(config: Config_ISZB): RandomLib ={
    config_ISZB = config
    return this
  }

  // ============= Base_Types.Bits_Payload ===================
  def alwaysTrue_Base_TypesBits_Payload(v: Base_Types.Bits_Payload): B = {return T}

  var config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = Config_Base_TypesBits_Payload(100, _verbose, alwaysTrue_Base_TypesBits_Payload _)

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = {return config_Base_TypesBits_Payload}

  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib ={
    config_Base_TypesBits_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(v: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType = Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType = {return config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType = Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType = {return config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType = Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType = {return config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType = Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType = {return config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType = config
    return this
  }

  // ============= Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload ===================
  def alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(v: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload): B = {return T}

  var config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload = Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(100, _verbose, alwaysTrue_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload _)

  def get_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload = {return config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload}

  def set_Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(config: Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload): RandomLib ={
    config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload = config
    return this
  }

  // ============= util.Container ===================
  def alwaysTrue_utilContainer(v: util.Container): B = {return T}

  var config_utilContainer: Config_utilContainer = Config_utilContainer(100, _verbose, F, ISZ(), alwaysTrue_utilContainer _)

  def get_Config_utilContainer: Config_utilContainer = {return config_utilContainer}

  def set_Config_utilContainer(config: Config_utilContainer): RandomLib ={
    config_utilContainer = config
    return this
  }

  // ============= util.EmptyContainer ===================
  def alwaysTrue_utilEmptyContainer(v: util.EmptyContainer): B = {return T}

  var config_utilEmptyContainer: Config_utilEmptyContainer = Config_utilEmptyContainer(100, _verbose, alwaysTrue_utilEmptyContainer _)

  def get_Config_utilEmptyContainer: Config_utilEmptyContainer = {return config_utilEmptyContainer}

  def set_Config_utilEmptyContainer(config: Config_utilEmptyContainer): RandomLib ={
    config_utilEmptyContainer = config
    return this
  }

  // ============= runtimemonitor.ObservationKind.Type ===================
  def alwaysTrue_runtimemonitorObservationKindType(v: runtimemonitor.ObservationKind.Type): B = {return T}

  var config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType = Config_runtimemonitorObservationKindType(100, _verbose, alwaysTrue_runtimemonitorObservationKindType _)

  def get_Config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType = {return config_runtimemonitorObservationKindType}

  def set_Config_runtimemonitorObservationKindType(config: Config_runtimemonitorObservationKindType): RandomLib ={
    config_runtimemonitorObservationKindType = config
    return this
  }
}

