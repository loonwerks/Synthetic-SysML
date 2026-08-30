// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

InputStatus.scala

RequestDisposition.scala

HoldObservation.scala

HoldAssessment.scala

AsteroidCondition.scala

LaserCondition.scala

TargetCondition.scala

SupportAssessment.scala

GuardMode.scala

ResolutionReason.scala

MiningCommand.scala

GuardStatus.scala

OffloadReadiness.scala

PilotRequestSample.scala

RequestAssessment.scala

HoldSample.scala

MiningSupportSample.scala

GuardResolution.scala

Base_Types.scala

RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_Containers.scala

HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_Containers.scala

MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_Containers.scala

OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_Containers.scala

MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_Containers.scala

GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_Containers.scala

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
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload_Id, _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload_Id, _artDataContent_DataTypeId.utilEmptyContainer_Id)

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
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardMode_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldSample_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorInputStatus_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload _).apply()
      case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload _).apply()
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
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardMode_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldSample_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorInputStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload _).apply()
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
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardMode_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldSample_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorInputStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload_Id => (nextOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload _).apply()
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

  // ============= Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType(config: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type = nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()

    var v: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
        v = Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
       v = Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType: Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardModeType(): Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardMode.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardMode.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardMode.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardMode.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardMode.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardMode.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {
    var api_guard_resolution: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(api_guard_resolution)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(api_guard_resolution)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(api_guard_resolution)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {
    var api_guard_resolution: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(api_guard_resolution)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(api_guard_resolution)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(api_guard_resolution)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {
    var api_guard_status: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
    var api_offload_readiness: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(api_guard_status, api_offload_readiness)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_guard_status = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
        api_offload_readiness = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(api_guard_status, api_offload_readiness)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_guard_status = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
       api_offload_readiness = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(api_guard_status, api_offload_readiness)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {
    var api_guard_status: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
    var api_offload_readiness: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(api_guard_status, api_offload_readiness)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_guard_status = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
        api_offload_readiness = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(api_guard_status, api_offload_readiness)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_guard_status = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
       api_offload_readiness = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(api_guard_status, api_offload_readiness)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardResolution ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardResolution(): Ore_Hold_Mining_Guard_Supervisor.GuardResolution = {
    var nextMode: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
    var reason: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type = nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
    var requestConflict: B = nextB()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = Ore_Hold_Mining_Guard_Supervisor.GuardResolution(nextMode, reason, requestConflict)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution.verbose) {
          println(s"Retrying for failing value: $v")
        }
        nextMode = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
        reason = nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
        requestConflict = nextB()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardResolution(nextMode, reason, requestConflict)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution.verbose) {
         println(s"Retrying for failing value: $v")
       }
       nextMode = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
       reason = nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
       requestConflict = nextB()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardResolution(nextMode, reason, requestConflict)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardStatusType(): Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()

    var v: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
        v = Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorGuardStatusType()
       v = Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {
    var api_hold_sample: Ore_Hold_Mining_Guard_Supervisor.HoldSample = nextOre_Hold_Mining_Guard_SupervisorHoldSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(api_hold_sample)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_hold_sample = nextOre_Hold_Mining_Guard_SupervisorHoldSample()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(api_hold_sample)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_hold_sample = nextOre_Hold_Mining_Guard_SupervisorHoldSample()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(api_hold_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {
    var api_hold_sample: Ore_Hold_Mining_Guard_Supervisor.HoldSample = nextOre_Hold_Mining_Guard_SupervisorHoldSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(api_hold_sample)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_hold_sample = nextOre_Hold_Mining_Guard_SupervisorHoldSample()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(api_hold_sample)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_hold_sample = nextOre_Hold_Mining_Guard_SupervisorHoldSample()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(api_hold_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {
    var api_hold_assessment: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(api_hold_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(api_hold_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(api_hold_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {
    var api_hold_assessment: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(api_hold_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(api_hold_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(api_hold_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldObservationType(): Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldObservation.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldObservation.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldObservation.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldObservation.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldObservation.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.HoldObservation.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type = nextOre_Hold_Mining_Guard_SupervisorHoldObservationType()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorHoldObservationType()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorHoldObservationType()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldSample ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldSample(): Ore_Hold_Mining_Guard_Supervisor.HoldSample = {
    var observation: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type = nextOre_Hold_Mining_Guard_SupervisorHoldObservationType()
    var status: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldSample = Ore_Hold_Mining_Guard_Supervisor.HoldSample(observation, status)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample.verbose) {
          println(s"Retrying for failing value: $v")
        }
        observation = nextOre_Hold_Mining_Guard_SupervisorHoldObservationType()
        status = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldSample(observation, status)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample.verbose) {
         println(s"Retrying for failing value: $v")
       }
       observation = nextOre_Hold_Mining_Guard_SupervisorHoldObservationType()
       status = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldSample(observation, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.HoldSample = nextOre_Hold_Mining_Guard_SupervisorHoldSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorHoldSample()
        v = Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorHoldSample()
       v = Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType: Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType(config: Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorInputStatusType(): Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.InputStatus.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.InputStatus.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.InputStatus.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.InputStatus.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.InputStatus.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.InputStatus.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload: Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(): Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()

    var v: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
        v = Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
       v = Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType: Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType(config: Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorLaserConditionType(): Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.LaserCondition.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.LaserCondition.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.LaserCondition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.LaserCondition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.LaserCondition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.LaserCondition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type = nextOre_Hold_Mining_Guard_SupervisorLaserConditionType()

    var v: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorLaserConditionType()
        v = Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorLaserConditionType()
       v = Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommandType(): Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(): Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {
    var api_guard_resolution: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(api_guard_resolution)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(api_guard_resolution)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(api_guard_resolution)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {
    var api_guard_resolution: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(api_guard_resolution)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(api_guard_resolution)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_guard_resolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(api_guard_resolution)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {
    var api_mining_command: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(api_mining_command)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_mining_command = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(api_mining_command)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_mining_command = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(api_mining_command)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {
    var api_mining_command: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(api_mining_command)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_mining_command = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(api_mining_command)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_mining_command = nextOre_Hold_Mining_Guard_SupervisorMiningCommandType()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(api_mining_command)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {
    var api_mining_support: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(api_mining_support)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_mining_support = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(api_mining_support)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_mining_support = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(api_mining_support)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {
    var api_mining_support: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(api_mining_support)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_mining_support = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(api_mining_support)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_mining_support = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(api_mining_support)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {
    var api_support_assessment: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(api_support_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(api_support_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(api_support_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {
    var api_support_assessment: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(api_support_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(api_support_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(api_support_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = {
    var asteroid: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type = nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
    var laser: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type = nextOre_Hold_Mining_Guard_SupervisorLaserConditionType()
    var target: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type = nextOre_Hold_Mining_Guard_SupervisorTargetConditionType()
    var status: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample(asteroid, laser, target, status)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample.verbose) {
          println(s"Retrying for failing value: $v")
        }
        asteroid = nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
        laser = nextOre_Hold_Mining_Guard_SupervisorLaserConditionType()
        target = nextOre_Hold_Mining_Guard_SupervisorTargetConditionType()
        status = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample(asteroid, laser, target, status)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample.verbose) {
         println(s"Retrying for failing value: $v")
       }
       asteroid = nextOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
       laser = nextOre_Hold_Mining_Guard_SupervisorLaserConditionType()
       target = nextOre_Hold_Mining_Guard_SupervisorTargetConditionType()
       status = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample(asteroid, laser, target, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
        v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
       v = Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType(config: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()

    var v: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
        v = Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
       v = Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {
    var api_hold_assessment: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
    var api_request_assessment: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
    var api_support_assessment: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(api_hold_assessment, api_request_assessment, api_support_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
        api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
        api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(api_hold_assessment, api_request_assessment, api_support_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
       api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
       api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(api_hold_assessment, api_request_assessment, api_support_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {
    var In_guardMode: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
    var api_hold_assessment: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
    var api_request_assessment: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
    var api_support_assessment: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(In_guardMode, api_hold_assessment, api_request_assessment, api_support_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_guardMode = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
        api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
        api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
        api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(In_guardMode, api_hold_assessment, api_request_assessment, api_support_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_guardMode = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
       api_hold_assessment = nextOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
       api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
       api_support_assessment = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(In_guardMode, api_hold_assessment, api_request_assessment, api_support_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {
    var api_resolution_to_command: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
    var api_resolution_to_reporting: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()

    var v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(api_resolution_to_command, api_resolution_to_reporting)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_resolution_to_command = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        api_resolution_to_reporting = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(api_resolution_to_command, api_resolution_to_reporting)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_resolution_to_command = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       api_resolution_to_reporting = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(api_resolution_to_command, api_resolution_to_reporting)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {
    var guardMode: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
    var api_resolution_to_command: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
    var api_resolution_to_reporting: Ore_Hold_Mining_Guard_Supervisor.GuardResolution = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()

    var v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(guardMode, api_resolution_to_command, api_resolution_to_reporting)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        guardMode = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
        api_resolution_to_command = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        api_resolution_to_reporting = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
        v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(guardMode, api_resolution_to_command, api_resolution_to_reporting)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       guardMode = nextOre_Hold_Mining_Guard_SupervisorGuardModeType()
       api_resolution_to_command = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       api_resolution_to_reporting = nextOre_Hold_Mining_Guard_SupervisorGuardResolution()
       v = Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(guardMode, api_resolution_to_command, api_resolution_to_reporting)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample
  def set_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample(config: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample(): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = {
    var start: B = nextB()
    var halt_request: B = nextB()
    var resume: B = nextB()
    var status: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()

    var v: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample(start, halt_request, resume, status)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample.verbose) {
          println(s"Retrying for failing value: $v")
        }
        start = nextB()
        halt_request = nextB()
        resume = nextB()
        status = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
        v = Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample(start, halt_request, resume, status)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample.verbose) {
         println(s"Retrying for failing value: $v")
       }
       start = nextB()
       halt_request = nextB()
       resume = nextB()
       status = nextOre_Hold_Mining_Guard_SupervisorInputStatusType()
       v = Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample(start, halt_request, resume, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
        v = Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
       v = Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestAssessment ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestAssessment(): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = {
    var disposition: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type = nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
    var conflict: B = nextB()

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = Ore_Hold_Mining_Guard_Supervisor.RequestAssessment(disposition, conflict)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment.verbose) {
          println(s"Retrying for failing value: $v")
        }
        disposition = nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
        conflict = nextB()
        v = Ore_Hold_Mining_Guard_Supervisor.RequestAssessment(disposition, conflict)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment.verbose) {
         println(s"Retrying for failing value: $v")
       }
       disposition = nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
       conflict = nextB()
       v = Ore_Hold_Mining_Guard_Supervisor.RequestAssessment(disposition, conflict)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
        v = Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
       v = Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType: Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType(): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type = nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType()

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
        v = Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
       v = Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {
    var api_pilot_request: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(api_pilot_request)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_pilot_request = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
        v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(api_pilot_request)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_pilot_request = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
       v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(api_pilot_request)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {
    var In_previousHalt: B = nextB()
    var In_previousResume: B = nextB()
    var In_previousStart: B = nextB()
    var api_pilot_request: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(In_previousHalt, In_previousResume, In_previousStart, api_pilot_request)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_previousHalt = nextB()
        In_previousResume = nextB()
        In_previousStart = nextB()
        api_pilot_request = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
        v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(In_previousHalt, In_previousResume, In_previousStart, api_pilot_request)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_previousHalt = nextB()
       In_previousResume = nextB()
       In_previousStart = nextB()
       api_pilot_request = nextOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
       v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(In_previousHalt, In_previousResume, In_previousStart, api_pilot_request)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = {
    var callEnum: ISZ[Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Type] = ISZ(Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id, Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = c match {
      case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
      case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
         case Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {
    var api_request_assessment: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(api_request_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
        v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(api_request_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
       v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(api_request_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS
  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {
    var previousHalt: B = nextB()
    var previousResume: B = nextB()
    var previousStart: B = nextB()
    var api_request_assessment: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()

    var v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(previousHalt, previousResume, previousStart, api_request_assessment)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        previousHalt = nextB()
        previousResume = nextB()
        previousStart = nextB()
        api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
        v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(previousHalt, previousResume, previousStart, api_request_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       previousHalt = nextB()
       previousResume = nextB()
       previousStart = nextB()
       api_request_assessment = nextOre_Hold_Mining_Guard_SupervisorRequestAssessment()
       v = Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(previousHalt, previousResume, previousStart, api_request_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType(config: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType(): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type = nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType()

    var v: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
        v = Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
       v = Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType(config: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()

    var v: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
        v = Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
       v = Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType: Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType
  def set_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType(config: Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorTargetConditionType(): Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type = {

    var ordinal: Z = gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.TargetCondition.numOfElements-1)

    var v: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.TargetCondition.byOrdinal(ordinal).get
    if(get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType.attempts) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.TargetCondition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.TargetCondition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType.filter(v)) {
        return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, scp_candidate.Ore_Hold_Mining_Guard_Supervisor.TargetCondition.numOfElements-1)
       v = scp_candidate.Ore_Hold_Mining_Guard_Supervisor.TargetCondition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload ===================

  def get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload
  def set_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload): RandomLib

  def nextOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = {
    var value: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type = nextOre_Hold_Mining_Guard_SupervisorTargetConditionType()

    var v: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload(value)

    if(get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload.attempts) {
        if(get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextOre_Hold_Mining_Guard_SupervisorTargetConditionType()
        v = Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextOre_Hold_Mining_Guard_SupervisorTargetConditionType()
       v = Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= util.Container ===================

  def get_Config_utilContainer: Config_utilContainer
  def set_Config_utilContainer(config: Config_utilContainer): RandomLib

  def nextutilContainer(): util.Container = {
    var callEnum: ISZ[utilContainer_DataTypeId.Type] = ISZ(utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id, utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id, utilContainer_DataTypeId.utilEmptyContainer_Id)

    if(get_Config_utilContainer.additiveTypeFiltering) {
       callEnum = get_Config_utilContainer.typeFilter
    } else {
       for(h <- get_Config_utilContainer.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: util.Container = c match {
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
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
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
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
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS_Id => (nextOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _).apply()
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

  // ============= Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType(v: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType = Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType = {return config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType(config: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(v: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload = Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardModeType(v: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardModeType: Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType = Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardModeType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType: Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType = {return config_Ore_Hold_Mining_Guard_SupervisorGuardModeType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardModeType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload(v: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload = Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardResolution ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardResolution(v: Ore_Hold_Mining_Guard_Supervisor.GuardResolution): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardResolution: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution = Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardResolution _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution = {return config_Ore_Hold_Mining_Guard_SupervisorGuardResolution}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardResolution = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload(v: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload = Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardStatusType(v: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType = Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardStatusType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType = {return config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload(v: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload = Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType(v: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType = Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType = {return config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(v: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload = Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldObservationType(v: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType = Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldObservationType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType = {return config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload(v: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload = Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldSample ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldSample(v: Ore_Hold_Mining_Guard_Supervisor.HoldSample): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldSample: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample = Config_Ore_Hold_Mining_Guard_SupervisorHoldSample(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldSample _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample = {return config_Ore_Hold_Mining_Guard_SupervisorHoldSample}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldSample = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload(v: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload = Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorInputStatusType(v: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorInputStatusType: Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType = Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorInputStatusType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType: Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType = {return config_Ore_Hold_Mining_Guard_SupervisorInputStatusType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType(config: Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorInputStatusType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload(v: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload: Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload = Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload: Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorLaserConditionType(v: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType: Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType = Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorLaserConditionType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType: Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType = {return config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType(config: Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload(v: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload = Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandType(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(v: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload = Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType(v: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType = Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType = {return config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType(config: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(v: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload = Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample(v: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample = Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample = {return config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample(config: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(v: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload = Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestAssessment ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestAssessment(v: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment = Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestAssessment _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment = {return config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(v: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload = Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType(v: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType: Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType = Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType: Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType = {return config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(v: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload = Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = {return config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {return config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(v: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {return config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(config: Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType(v: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType = Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType = {return config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType(config: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload(v: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload = Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType(v: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType = Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType = {return config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType(config: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(v: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload = Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorTargetConditionType(v: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType: Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType = Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorTargetConditionType _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType: Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType = {return config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType(config: Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType = config
    return this
  }

  // ============= Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload ===================
  def alwaysTrue_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload(v: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload): B = {return T}

  var config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload = Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload(100, _verbose, alwaysTrue_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload _)

  def get_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload: Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload = {return config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload}

  def set_Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload(config: Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload): RandomLib ={
    config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload = config
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

