// #Sireum

package drone_battery_charge_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryIndication.scala

InputStatus.scala

BatteryEvidence.scala

ChargerAvailability.scala

FlightActivity.scala

ChargeContext.scala

ChargeIntent.scala

QualifiedChargeIntent.scala

ChargeAuthorization.scala

ChargeDisposition.scala

BatteryAttention.scala

BatteryReadinessEvidence.scala

BatterySample.scala

ChargerSample.scala

FlightActivitySample.scala

ChargeIntentSample.scala

ChargeDecision.scala

Base_Types.scala

Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_Containers.scala

Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_Containers.scala

Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_Containers.scala

Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_Containers.scala

Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_Containers.scala

Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_Containers.scala

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
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryAttention_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryEvidence_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryIndication_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatterySample_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeAuthorization_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeContext_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDecision_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDisposition_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntentSample_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntent_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerAvailability_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerSample_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivitySample_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivity_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorInputStatus_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id, _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id, _artDataContent_DataTypeId.utilEmptyContainer_Id)

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
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryAttention_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryAttention_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryEvidence_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryEvidence_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryIndication_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryIndication_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatterySample_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatterySample_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeAuthorization_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeAuthorization_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeContext_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeContext_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDecision_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeDecision_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDisposition_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeDisposition_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntentSample_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeIntentSample_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntent_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeIntent_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerAvailability_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargerAvailability_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerSample_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargerSample_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivitySample_Payload_Id => (nextDrone_Battery_Charge_SupervisorFlightActivitySample_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivity_Payload_Id => (nextDrone_Battery_Charge_SupervisorFlightActivity_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorInputStatus_Payload_Id => (nextDrone_Battery_Charge_SupervisorInputStatus_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload_Id => (nextDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
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
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryAttention_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryAttention_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryEvidence_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryIndication_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryIndication_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatterySample_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatterySample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeAuthorization_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeAuthorization_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeContext_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeContext_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDecision_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeDecision_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDisposition_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntentSample_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeIntentSample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntent_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeIntent_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerAvailability_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargerAvailability_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerSample_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargerSample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivitySample_Payload_Id => (nextDrone_Battery_Charge_SupervisorFlightActivitySample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivity_Payload_Id => (nextDrone_Battery_Charge_SupervisorFlightActivity_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorInputStatus_Payload_Id => (nextDrone_Battery_Charge_SupervisorInputStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload_Id => (nextDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
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
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryAttention_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryAttention_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryEvidence_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryIndication_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryIndication_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBatterySample_Payload_Id => (nextDrone_Battery_Charge_SupervisorBatterySample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeAuthorization_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeAuthorization_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeContext_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeContext_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDecision_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeDecision_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeDisposition_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeDisposition_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntentSample_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeIntentSample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargeIntent_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargeIntent_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerAvailability_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargerAvailability_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorChargerSample_Payload_Id => (nextDrone_Battery_Charge_SupervisorChargerSample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivitySample_Payload_Id => (nextDrone_Battery_Charge_SupervisorFlightActivitySample_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorFlightActivity_Payload_Id => (nextDrone_Battery_Charge_SupervisorFlightActivity_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorInputStatus_Payload_Id => (nextDrone_Battery_Charge_SupervisorInputStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload_Id => (nextDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
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

  // ============= Drone_Battery_Charge_Supervisor.BatteryAttention.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType: Config_Drone_Battery_Charge_SupervisorBatteryAttentionType
  def set_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType(config: Config_Drone_Battery_Charge_SupervisorBatteryAttentionType): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryAttentionType(): Drone_Battery_Charge_Supervisor.BatteryAttention.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryAttention.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.BatteryAttention.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryAttention.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryAttention.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryAttention.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryAttention.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryAttention.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryAttention_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload: Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload
  def set_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryAttention_Payload(): Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = {
    var value: Drone_Battery_Charge_Supervisor.BatteryAttention.Type = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()

    var v: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = Drone_Battery_Charge_Supervisor.BatteryAttention_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()
        v = Drone_Battery_Charge_Supervisor.BatteryAttention_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()
       v = Drone_Battery_Charge_Supervisor.BatteryAttention_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryEvidence.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType: Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType
  def set_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType(config: Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryEvidenceType(): Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryEvidence.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryEvidence.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryEvidence.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryEvidence.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryEvidence.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryEvidence.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload: Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload
  def set_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(): Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = {
    var value: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()

    var v: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        v = Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       v = Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryIndication.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType: Config_Drone_Battery_Charge_SupervisorBatteryIndicationType
  def set_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType(config: Config_Drone_Battery_Charge_SupervisorBatteryIndicationType): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryIndicationType(): Drone_Battery_Charge_Supervisor.BatteryIndication.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryIndication.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.BatteryIndication.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryIndication.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryIndication.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryIndication.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryIndication.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryIndication.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryIndication_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload: Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload
  def set_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryIndication_Payload(): Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = {
    var value: Drone_Battery_Charge_Supervisor.BatteryIndication.Type = nextDrone_Battery_Charge_SupervisorBatteryIndicationType()

    var v: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = Drone_Battery_Charge_Supervisor.BatteryIndication_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorBatteryIndicationType()
        v = Drone_Battery_Charge_Supervisor.BatteryIndication_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorBatteryIndicationType()
       v = Drone_Battery_Charge_Supervisor.BatteryIndication_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType
  def set_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(config: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload
  def set_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = {
    var value: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()

    var v: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
        v = Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
       v = Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatterySample ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatterySample: Config_Drone_Battery_Charge_SupervisorBatterySample
  def set_Config_Drone_Battery_Charge_SupervisorBatterySample(config: Config_Drone_Battery_Charge_SupervisorBatterySample): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatterySample(): Drone_Battery_Charge_Supervisor.BatterySample = {
    var indication: Drone_Battery_Charge_Supervisor.BatteryIndication.Type = nextDrone_Battery_Charge_SupervisorBatteryIndicationType()
    var status: Drone_Battery_Charge_Supervisor.InputStatus.Type = nextDrone_Battery_Charge_SupervisorInputStatusType()

    var v: Drone_Battery_Charge_Supervisor.BatterySample = Drone_Battery_Charge_Supervisor.BatterySample(indication, status)

    if(get_Config_Drone_Battery_Charge_SupervisorBatterySample.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatterySample.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBatterySample.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBatterySample.verbose) {
          println(s"Retrying for failing value: $v")
        }
        indication = nextDrone_Battery_Charge_SupervisorBatteryIndicationType()
        status = nextDrone_Battery_Charge_SupervisorInputStatusType()
        v = Drone_Battery_Charge_Supervisor.BatterySample(indication, status)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatterySample.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatterySample.verbose) {
         println(s"Retrying for failing value: $v")
       }
       indication = nextDrone_Battery_Charge_SupervisorBatteryIndicationType()
       status = nextDrone_Battery_Charge_SupervisorInputStatusType()
       v = Drone_Battery_Charge_Supervisor.BatterySample(indication, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.BatterySample_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload: Config_Drone_Battery_Charge_SupervisorBatterySample_Payload
  def set_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload(config: Config_Drone_Battery_Charge_SupervisorBatterySample_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorBatterySample_Payload(): Drone_Battery_Charge_Supervisor.BatterySample_Payload = {
    var value: Drone_Battery_Charge_Supervisor.BatterySample = nextDrone_Battery_Charge_SupervisorBatterySample()

    var v: Drone_Battery_Charge_Supervisor.BatterySample_Payload = Drone_Battery_Charge_Supervisor.BatterySample_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorBatterySample()
        v = Drone_Battery_Charge_Supervisor.BatterySample_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorBatterySample()
       v = Drone_Battery_Charge_Supervisor.BatterySample_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container
  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id, Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = c match {
      case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {
    var api_battery_sample: Drone_Battery_Charge_Supervisor.BatterySample = nextDrone_Battery_Charge_SupervisorBatterySample()

    var v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(api_battery_sample)

    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_sample = nextDrone_Battery_Charge_SupervisorBatterySample()
        v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(api_battery_sample)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_sample = nextDrone_Battery_Charge_SupervisorBatterySample()
       v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(api_battery_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {
    var api_battery_sample: Drone_Battery_Charge_Supervisor.BatterySample = nextDrone_Battery_Charge_SupervisorBatterySample()

    var v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(api_battery_sample)

    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_sample = nextDrone_Battery_Charge_SupervisorBatterySample()
        v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(api_battery_sample)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_sample = nextDrone_Battery_Charge_SupervisorBatterySample()
       v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(api_battery_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container
  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id, Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = c match {
      case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {
    var api_evidence_to_attention: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_evidence_to_owner: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_evidence_to_readiness: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()

    var v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)

    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_evidence_to_attention = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_evidence_to_owner = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_evidence_to_readiness = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_evidence_to_attention = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_evidence_to_owner = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_evidence_to_readiness = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {
    var api_evidence_to_attention: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_evidence_to_owner: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_evidence_to_readiness: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()

    var v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)

    if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_evidence_to_attention = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_evidence_to_owner = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_evidence_to_readiness = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_evidence_to_attention = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_evidence_to_owner = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_evidence_to_readiness = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       v = Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType: Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType
  def set_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType(config: Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeAuthorizationType(): Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeAuthorization.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeAuthorization.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeAuthorization.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeAuthorization.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeAuthorization.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeAuthorization.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload: Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(): Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()

    var v: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
        v = Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
       v = Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeContext.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeContextType: Config_Drone_Battery_Charge_SupervisorChargeContextType
  def set_Config_Drone_Battery_Charge_SupervisorChargeContextType(config: Config_Drone_Battery_Charge_SupervisorChargeContextType): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeContextType(): Drone_Battery_Charge_Supervisor.ChargeContext.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeContext.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.ChargeContext.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeContext.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorChargeContextType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeContextType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeContextType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeContextType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeContext.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeContext.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorChargeContextType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeContextType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeContext.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeContext.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeContext_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload: Config_Drone_Battery_Charge_SupervisorChargeContext_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeContext_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeContext_Payload(): Drone_Battery_Charge_Supervisor.ChargeContext_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargeContext.Type = nextDrone_Battery_Charge_SupervisorChargeContextType()

    var v: Drone_Battery_Charge_Supervisor.ChargeContext_Payload = Drone_Battery_Charge_Supervisor.ChargeContext_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargeContextType()
        v = Drone_Battery_Charge_Supervisor.ChargeContext_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargeContextType()
       v = Drone_Battery_Charge_Supervisor.ChargeContext_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDecision ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeDecision: Config_Drone_Battery_Charge_SupervisorChargeDecision
  def set_Config_Drone_Battery_Charge_SupervisorChargeDecision(config: Config_Drone_Battery_Charge_SupervisorChargeDecision): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeDecision(): Drone_Battery_Charge_Supervisor.ChargeDecision = {
    var authorization: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
    var disposition: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type = nextDrone_Battery_Charge_SupervisorChargeDispositionType()

    var v: Drone_Battery_Charge_Supervisor.ChargeDecision = Drone_Battery_Charge_Supervisor.ChargeDecision(authorization, disposition)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeDecision.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeDecision.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeDecision.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeDecision.verbose) {
          println(s"Retrying for failing value: $v")
        }
        authorization = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
        disposition = nextDrone_Battery_Charge_SupervisorChargeDispositionType()
        v = Drone_Battery_Charge_Supervisor.ChargeDecision(authorization, disposition)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeDecision.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeDecision.verbose) {
         println(s"Retrying for failing value: $v")
       }
       authorization = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
       disposition = nextDrone_Battery_Charge_SupervisorChargeDispositionType()
       v = Drone_Battery_Charge_Supervisor.ChargeDecision(authorization, disposition)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDecision_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload: Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeDecision_Payload(): Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()

    var v: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = Drone_Battery_Charge_Supervisor.ChargeDecision_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargeDecision()
        v = Drone_Battery_Charge_Supervisor.ChargeDecision_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargeDecision()
       v = Drone_Battery_Charge_Supervisor.ChargeDecision_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDisposition.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType: Config_Drone_Battery_Charge_SupervisorChargeDispositionType
  def set_Config_Drone_Battery_Charge_SupervisorChargeDispositionType(config: Config_Drone_Battery_Charge_SupervisorChargeDispositionType): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeDispositionType(): Drone_Battery_Charge_Supervisor.ChargeDisposition.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeDisposition.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeDisposition.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeDisposition.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeDisposition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeDisposition.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeDisposition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload: Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeDisposition_Payload(): Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type = nextDrone_Battery_Charge_SupervisorChargeDispositionType()

    var v: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargeDispositionType()
        v = Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargeDispositionType()
       v = Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntent.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntentType: Config_Drone_Battery_Charge_SupervisorChargeIntentType
  def set_Config_Drone_Battery_Charge_SupervisorChargeIntentType(config: Config_Drone_Battery_Charge_SupervisorChargeIntentType): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeIntentType(): Drone_Battery_Charge_Supervisor.ChargeIntent.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeIntent.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.ChargeIntent.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeIntent.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeIntentType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeIntentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeIntent.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeIntent.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeIntentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeIntent.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargeIntent.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntent_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload: Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeIntent_Payload(): Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargeIntent.Type = nextDrone_Battery_Charge_SupervisorChargeIntentType()

    var v: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = Drone_Battery_Charge_Supervisor.ChargeIntent_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargeIntentType()
        v = Drone_Battery_Charge_Supervisor.ChargeIntent_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargeIntentType()
       v = Drone_Battery_Charge_Supervisor.ChargeIntent_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntentSample ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample: Config_Drone_Battery_Charge_SupervisorChargeIntentSample
  def set_Config_Drone_Battery_Charge_SupervisorChargeIntentSample(config: Config_Drone_Battery_Charge_SupervisorChargeIntentSample): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeIntentSample(): Drone_Battery_Charge_Supervisor.ChargeIntentSample = {
    var intent: Drone_Battery_Charge_Supervisor.ChargeIntent.Type = nextDrone_Battery_Charge_SupervisorChargeIntentType()
    var status: Drone_Battery_Charge_Supervisor.InputStatus.Type = nextDrone_Battery_Charge_SupervisorInputStatusType()

    var v: Drone_Battery_Charge_Supervisor.ChargeIntentSample = Drone_Battery_Charge_Supervisor.ChargeIntentSample(intent, status)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample.verbose) {
          println(s"Retrying for failing value: $v")
        }
        intent = nextDrone_Battery_Charge_SupervisorChargeIntentType()
        status = nextDrone_Battery_Charge_SupervisorInputStatusType()
        v = Drone_Battery_Charge_Supervisor.ChargeIntentSample(intent, status)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample.verbose) {
         println(s"Retrying for failing value: $v")
       }
       intent = nextDrone_Battery_Charge_SupervisorChargeIntentType()
       status = nextDrone_Battery_Charge_SupervisorInputStatusType()
       v = Drone_Battery_Charge_Supervisor.ChargeIntentSample(intent, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload: Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(): Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargeIntentSample = nextDrone_Battery_Charge_SupervisorChargeIntentSample()

    var v: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargeIntentSample()
        v = Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargeIntentSample()
       v = Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id, Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = c match {
      case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {
    var api_charger_sample: Drone_Battery_Charge_Supervisor.ChargerSample = nextDrone_Battery_Charge_SupervisorChargerSample()
    var api_flight_sample: Drone_Battery_Charge_Supervisor.FlightActivitySample = nextDrone_Battery_Charge_SupervisorFlightActivitySample()

    var v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(api_charger_sample, api_flight_sample)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_charger_sample = nextDrone_Battery_Charge_SupervisorChargerSample()
        api_flight_sample = nextDrone_Battery_Charge_SupervisorFlightActivitySample()
        v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(api_charger_sample, api_flight_sample)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_charger_sample = nextDrone_Battery_Charge_SupervisorChargerSample()
       api_flight_sample = nextDrone_Battery_Charge_SupervisorFlightActivitySample()
       v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(api_charger_sample, api_flight_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {
    var api_charger_sample: Drone_Battery_Charge_Supervisor.ChargerSample = nextDrone_Battery_Charge_SupervisorChargerSample()
    var api_flight_sample: Drone_Battery_Charge_Supervisor.FlightActivitySample = nextDrone_Battery_Charge_SupervisorFlightActivitySample()

    var v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(api_charger_sample, api_flight_sample)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_charger_sample = nextDrone_Battery_Charge_SupervisorChargerSample()
        api_flight_sample = nextDrone_Battery_Charge_SupervisorFlightActivitySample()
        v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(api_charger_sample, api_flight_sample)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_charger_sample = nextDrone_Battery_Charge_SupervisorChargerSample()
       api_flight_sample = nextDrone_Battery_Charge_SupervisorFlightActivitySample()
       v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(api_charger_sample, api_flight_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id, Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = c match {
      case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {
    var api_charge_context: Drone_Battery_Charge_Supervisor.ChargeContext.Type = nextDrone_Battery_Charge_SupervisorChargeContextType()

    var v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(api_charge_context)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
        v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(api_charge_context)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
       v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(api_charge_context)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {
    var api_charge_context: Drone_Battery_Charge_Supervisor.ChargeContext.Type = nextDrone_Battery_Charge_SupervisorChargeContextType()

    var v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(api_charge_context)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
        v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(api_charge_context)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
       v = Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(api_charge_context)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id, Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = c match {
      case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {
    var api_intent_sample: Drone_Battery_Charge_Supervisor.ChargeIntentSample = nextDrone_Battery_Charge_SupervisorChargeIntentSample()

    var v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(api_intent_sample)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_intent_sample = nextDrone_Battery_Charge_SupervisorChargeIntentSample()
        v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(api_intent_sample)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_intent_sample = nextDrone_Battery_Charge_SupervisorChargeIntentSample()
       v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(api_intent_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {
    var api_intent_sample: Drone_Battery_Charge_Supervisor.ChargeIntentSample = nextDrone_Battery_Charge_SupervisorChargeIntentSample()

    var v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(api_intent_sample)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_intent_sample = nextDrone_Battery_Charge_SupervisorChargeIntentSample()
        v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(api_intent_sample)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_intent_sample = nextDrone_Battery_Charge_SupervisorChargeIntentSample()
       v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(api_intent_sample)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id, Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = c match {
      case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {
    var api_qualified_intent: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()

    var v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(api_qualified_intent)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
        v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(api_qualified_intent)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
       v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(api_qualified_intent)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {
    var api_qualified_intent: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()

    var v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(api_qualified_intent)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
        v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(api_qualified_intent)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
       v = Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(api_qualified_intent)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id, Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = c match {
      case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {
    var api_battery_evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_charge_context: Drone_Battery_Charge_Supervisor.ChargeContext.Type = nextDrone_Battery_Charge_SupervisorChargeContextType()
    var api_qualified_intent: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()

    var v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(api_battery_evidence, api_charge_context, api_qualified_intent)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
        api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
        v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(api_battery_evidence, api_charge_context, api_qualified_intent)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
       api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
       v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(api_battery_evidence, api_charge_context, api_qualified_intent)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {
    var api_battery_evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_charge_context: Drone_Battery_Charge_Supervisor.ChargeContext.Type = nextDrone_Battery_Charge_SupervisorChargeContextType()
    var api_qualified_intent: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()

    var v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(api_battery_evidence, api_charge_context, api_qualified_intent)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
        api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
        v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(api_battery_evidence, api_charge_context, api_qualified_intent)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_charge_context = nextDrone_Battery_Charge_SupervisorChargeContextType()
       api_qualified_intent = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
       v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(api_battery_evidence, api_charge_context, api_qualified_intent)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id, Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = c match {
      case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {
    var api_authorization: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
    var api_decision_to_attention: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()
    var api_decision_to_readiness: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()

    var v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(api_authorization, api_decision_to_attention, api_decision_to_readiness)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_authorization = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
        api_decision_to_attention = nextDrone_Battery_Charge_SupervisorChargeDecision()
        api_decision_to_readiness = nextDrone_Battery_Charge_SupervisorChargeDecision()
        v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(api_authorization, api_decision_to_attention, api_decision_to_readiness)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_authorization = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
       api_decision_to_attention = nextDrone_Battery_Charge_SupervisorChargeDecision()
       api_decision_to_readiness = nextDrone_Battery_Charge_SupervisorChargeDecision()
       v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(api_authorization, api_decision_to_attention, api_decision_to_readiness)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {
    var api_authorization: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
    var api_decision_to_attention: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()
    var api_decision_to_readiness: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()

    var v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(api_authorization, api_decision_to_attention, api_decision_to_readiness)

    if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_authorization = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
        api_decision_to_attention = nextDrone_Battery_Charge_SupervisorChargeDecision()
        api_decision_to_readiness = nextDrone_Battery_Charge_SupervisorChargeDecision()
        v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(api_authorization, api_decision_to_attention, api_decision_to_readiness)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_authorization = nextDrone_Battery_Charge_SupervisorChargeAuthorizationType()
       api_decision_to_attention = nextDrone_Battery_Charge_SupervisorChargeDecision()
       api_decision_to_readiness = nextDrone_Battery_Charge_SupervisorChargeDecision()
       v = Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(api_authorization, api_decision_to_attention, api_decision_to_readiness)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerAvailability.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType: Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType
  def set_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType(config: Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargerAvailabilityType(): Drone_Battery_Charge_Supervisor.ChargerAvailability.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargerAvailability.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargerAvailability.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargerAvailability.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargerAvailability.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargerAvailability.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.ChargerAvailability.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload: Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload(config: Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargerAvailability_Payload(): Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type = nextDrone_Battery_Charge_SupervisorChargerAvailabilityType()

    var v: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargerAvailabilityType()
        v = Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargerAvailabilityType()
       v = Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerSample ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargerSample: Config_Drone_Battery_Charge_SupervisorChargerSample
  def set_Config_Drone_Battery_Charge_SupervisorChargerSample(config: Config_Drone_Battery_Charge_SupervisorChargerSample): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargerSample(): Drone_Battery_Charge_Supervisor.ChargerSample = {
    var availability: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type = nextDrone_Battery_Charge_SupervisorChargerAvailabilityType()
    var status: Drone_Battery_Charge_Supervisor.InputStatus.Type = nextDrone_Battery_Charge_SupervisorInputStatusType()

    var v: Drone_Battery_Charge_Supervisor.ChargerSample = Drone_Battery_Charge_Supervisor.ChargerSample(availability, status)

    if(get_Config_Drone_Battery_Charge_SupervisorChargerSample.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargerSample.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargerSample.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargerSample.verbose) {
          println(s"Retrying for failing value: $v")
        }
        availability = nextDrone_Battery_Charge_SupervisorChargerAvailabilityType()
        status = nextDrone_Battery_Charge_SupervisorInputStatusType()
        v = Drone_Battery_Charge_Supervisor.ChargerSample(availability, status)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargerSample.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargerSample.verbose) {
         println(s"Retrying for failing value: $v")
       }
       availability = nextDrone_Battery_Charge_SupervisorChargerAvailabilityType()
       status = nextDrone_Battery_Charge_SupervisorInputStatusType()
       v = Drone_Battery_Charge_Supervisor.ChargerSample(availability, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerSample_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload: Config_Drone_Battery_Charge_SupervisorChargerSample_Payload
  def set_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload(config: Config_Drone_Battery_Charge_SupervisorChargerSample_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorChargerSample_Payload(): Drone_Battery_Charge_Supervisor.ChargerSample_Payload = {
    var value: Drone_Battery_Charge_Supervisor.ChargerSample = nextDrone_Battery_Charge_SupervisorChargerSample()

    var v: Drone_Battery_Charge_Supervisor.ChargerSample_Payload = Drone_Battery_Charge_Supervisor.ChargerSample_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorChargerSample()
        v = Drone_Battery_Charge_Supervisor.ChargerSample_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorChargerSample()
       v = Drone_Battery_Charge_Supervisor.ChargerSample_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivity.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivityType: Config_Drone_Battery_Charge_SupervisorFlightActivityType
  def set_Config_Drone_Battery_Charge_SupervisorFlightActivityType(config: Config_Drone_Battery_Charge_SupervisorFlightActivityType): RandomLib

  def nextDrone_Battery_Charge_SupervisorFlightActivityType(): Drone_Battery_Charge_Supervisor.FlightActivity.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.FlightActivity.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.FlightActivity.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.FlightActivity.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorFlightActivityType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorFlightActivityType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorFlightActivityType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorFlightActivityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.FlightActivity.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.FlightActivity.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorFlightActivityType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorFlightActivityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.FlightActivity.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.FlightActivity.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivity_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload: Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload
  def set_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload(config: Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorFlightActivity_Payload(): Drone_Battery_Charge_Supervisor.FlightActivity_Payload = {
    var value: Drone_Battery_Charge_Supervisor.FlightActivity.Type = nextDrone_Battery_Charge_SupervisorFlightActivityType()

    var v: Drone_Battery_Charge_Supervisor.FlightActivity_Payload = Drone_Battery_Charge_Supervisor.FlightActivity_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorFlightActivityType()
        v = Drone_Battery_Charge_Supervisor.FlightActivity_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorFlightActivityType()
       v = Drone_Battery_Charge_Supervisor.FlightActivity_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivitySample ===================

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample: Config_Drone_Battery_Charge_SupervisorFlightActivitySample
  def set_Config_Drone_Battery_Charge_SupervisorFlightActivitySample(config: Config_Drone_Battery_Charge_SupervisorFlightActivitySample): RandomLib

  def nextDrone_Battery_Charge_SupervisorFlightActivitySample(): Drone_Battery_Charge_Supervisor.FlightActivitySample = {
    var activity: Drone_Battery_Charge_Supervisor.FlightActivity.Type = nextDrone_Battery_Charge_SupervisorFlightActivityType()
    var status: Drone_Battery_Charge_Supervisor.InputStatus.Type = nextDrone_Battery_Charge_SupervisorInputStatusType()

    var v: Drone_Battery_Charge_Supervisor.FlightActivitySample = Drone_Battery_Charge_Supervisor.FlightActivitySample(activity, status)

    if(get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample.verbose) {
          println(s"Retrying for failing value: $v")
        }
        activity = nextDrone_Battery_Charge_SupervisorFlightActivityType()
        status = nextDrone_Battery_Charge_SupervisorInputStatusType()
        v = Drone_Battery_Charge_Supervisor.FlightActivitySample(activity, status)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample.verbose) {
         println(s"Retrying for failing value: $v")
       }
       activity = nextDrone_Battery_Charge_SupervisorFlightActivityType()
       status = nextDrone_Battery_Charge_SupervisorInputStatusType()
       v = Drone_Battery_Charge_Supervisor.FlightActivitySample(activity, status)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload: Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload
  def set_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload(config: Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(): Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = {
    var value: Drone_Battery_Charge_Supervisor.FlightActivitySample = nextDrone_Battery_Charge_SupervisorFlightActivitySample()

    var v: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorFlightActivitySample()
        v = Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorFlightActivitySample()
       v = Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.InputStatus.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorInputStatusType: Config_Drone_Battery_Charge_SupervisorInputStatusType
  def set_Config_Drone_Battery_Charge_SupervisorInputStatusType(config: Config_Drone_Battery_Charge_SupervisorInputStatusType): RandomLib

  def nextDrone_Battery_Charge_SupervisorInputStatusType(): Drone_Battery_Charge_Supervisor.InputStatus.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.InputStatus.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.InputStatus.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.InputStatus.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorInputStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorInputStatusType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorInputStatusType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorInputStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.InputStatus.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.InputStatus.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorInputStatusType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorInputStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.InputStatus.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.InputStatus.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.InputStatus_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload: Config_Drone_Battery_Charge_SupervisorInputStatus_Payload
  def set_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload(config: Config_Drone_Battery_Charge_SupervisorInputStatus_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorInputStatus_Payload(): Drone_Battery_Charge_Supervisor.InputStatus_Payload = {
    var value: Drone_Battery_Charge_Supervisor.InputStatus.Type = nextDrone_Battery_Charge_SupervisorInputStatusType()

    var v: Drone_Battery_Charge_Supervisor.InputStatus_Payload = Drone_Battery_Charge_Supervisor.InputStatus_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorInputStatusType()
        v = Drone_Battery_Charge_Supervisor.InputStatus_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorInputStatusType()
       v = Drone_Battery_Charge_Supervisor.InputStatus_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container
  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id, Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = c match {
      case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {
    var api_battery_evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_charge_decision: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()

    var v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)

    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
        v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
       v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {
    var api_battery_evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_charge_decision: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()

    var v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)

    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
        v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
       v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container
  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id, Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = c match {
      case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {
    var api_battery_attention: Drone_Battery_Charge_Supervisor.BatteryAttention.Type = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()

    var v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(api_battery_attention)

    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_attention = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()
        v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(api_battery_attention)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_attention = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()
       v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(api_battery_attention)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {
    var api_battery_attention: Drone_Battery_Charge_Supervisor.BatteryAttention.Type = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()

    var v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(api_battery_attention)

    if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_attention = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()
        v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(api_battery_attention)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_attention = nextDrone_Battery_Charge_SupervisorBatteryAttentionType()
       v = Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(api_battery_attention)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type ===================

  def get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType
  def set_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType(config: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType): RandomLib

  def nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = {

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.numOfElements-1)

    var v: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.byOrdinal(ordinal).get
    if(get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.numOfElements-1)
       v = drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload ===================

  def get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload
  def set_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(config: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload): RandomLib

  def nextDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = {
    var value: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()

    var v: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload(value)

    if(get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
        v = Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
       v = Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container
  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id, Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = c match {
      case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {
    var api_battery_evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_charge_decision: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()

    var v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)

    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
        v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
       v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {
    var api_battery_evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
    var api_charge_decision: Drone_Battery_Charge_Supervisor.ChargeDecision = nextDrone_Battery_Charge_SupervisorChargeDecision()

    var v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)

    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
        api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
        v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_evidence = nextDrone_Battery_Charge_SupervisorBatteryEvidenceType()
       api_charge_decision = nextDrone_Battery_Charge_SupervisorChargeDecision()
       v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container ===================

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container
  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container): RandomLib

  def nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = {
    var callEnum: ISZ[Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Type] = ISZ(Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id, Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id)

    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = c match {
      case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
      case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.attempts) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
         case Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P ===================

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P
  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P): RandomLib

  def nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {
    var api_readiness_evidence: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()

    var v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(api_readiness_evidence)

    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_readiness_evidence = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
        v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(api_readiness_evidence)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_readiness_evidence = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
       v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(api_readiness_evidence)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS ===================

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS
  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS): RandomLib

  def nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {
    var api_readiness_evidence: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()

    var v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(api_readiness_evidence)

    if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS.attempts) {
        if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_readiness_evidence = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
        v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(api_readiness_evidence)
     }
    } else {
     while(T) {
       if(get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_readiness_evidence = nextDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
       v = Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(api_readiness_evidence)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= util.Container ===================

  def get_Config_utilContainer: Config_utilContainer
  def set_Config_utilContainer(config: Config_utilContainer): RandomLib

  def nextutilContainer(): util.Container = {
    var callEnum: ISZ[utilContainer_DataTypeId.Type] = ISZ(utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id, utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id, utilContainer_DataTypeId.utilEmptyContainer_Id)

    if(get_Config_utilContainer.additiveTypeFiltering) {
       callEnum = get_Config_utilContainer.typeFilter
    } else {
       for(h <- get_Config_utilContainer.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: util.Container = c match {
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
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
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
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
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS_Id => (nextDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _).apply()
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

    var ordinal: Z = gen.nextZBetween(0, drone_battery_charge_supervisor.runtimemonitor.ObservationKind.numOfElements-1)

    var v: runtimemonitor.ObservationKind.Type = drone_battery_charge_supervisor.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
    if(get_Config_runtimemonitorObservationKindType.attempts >= 0) {
     for(i <- 0 to get_Config_runtimemonitorObservationKindType.attempts) {
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.runtimemonitor.ObservationKind.numOfElements-1)
       v = drone_battery_charge_supervisor.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, drone_battery_charge_supervisor.runtimemonitor.ObservationKind.numOfElements-1)
       v = drone_battery_charge_supervisor.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
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

  // ============= Drone_Battery_Charge_Supervisor.BatteryAttention.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryAttentionType(v: Drone_Battery_Charge_Supervisor.BatteryAttention.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryAttentionType: Config_Drone_Battery_Charge_SupervisorBatteryAttentionType = Config_Drone_Battery_Charge_SupervisorBatteryAttentionType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryAttentionType _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType: Config_Drone_Battery_Charge_SupervisorBatteryAttentionType = {return config_Drone_Battery_Charge_SupervisorBatteryAttentionType}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryAttentionType(config: Config_Drone_Battery_Charge_SupervisorBatteryAttentionType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryAttentionType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryAttention_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryAttention_Payload(v: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload: Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload = Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryAttention_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload: Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload = {return config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryEvidence.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryEvidenceType(v: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryEvidenceType: Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType = Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryEvidenceType _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType: Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType = {return config_Drone_Battery_Charge_SupervisorBatteryEvidenceType}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType(config: Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryEvidenceType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload(v: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload: Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload = Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload: Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload = {return config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryIndication.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryIndicationType(v: Drone_Battery_Charge_Supervisor.BatteryIndication.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryIndicationType: Config_Drone_Battery_Charge_SupervisorBatteryIndicationType = Config_Drone_Battery_Charge_SupervisorBatteryIndicationType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryIndicationType _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType: Config_Drone_Battery_Charge_SupervisorBatteryIndicationType = {return config_Drone_Battery_Charge_SupervisorBatteryIndicationType}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryIndicationType(config: Config_Drone_Battery_Charge_SupervisorBatteryIndicationType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryIndicationType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryIndication_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryIndication_Payload(v: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload: Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload = Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryIndication_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload: Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload = {return config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(v: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType = Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType = {return config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(config: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(v: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload = Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload = {return config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(config: Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatterySample ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatterySample(v: Drone_Battery_Charge_Supervisor.BatterySample): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatterySample: Config_Drone_Battery_Charge_SupervisorBatterySample = Config_Drone_Battery_Charge_SupervisorBatterySample(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatterySample _)

  def get_Config_Drone_Battery_Charge_SupervisorBatterySample: Config_Drone_Battery_Charge_SupervisorBatterySample = {return config_Drone_Battery_Charge_SupervisorBatterySample}

  def set_Config_Drone_Battery_Charge_SupervisorBatterySample(config: Config_Drone_Battery_Charge_SupervisorBatterySample): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatterySample = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.BatterySample_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBatterySample_Payload(v: Drone_Battery_Charge_Supervisor.BatterySample_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBatterySample_Payload: Config_Drone_Battery_Charge_SupervisorBatterySample_Payload = Config_Drone_Battery_Charge_SupervisorBatterySample_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBatterySample_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload: Config_Drone_Battery_Charge_SupervisorBatterySample_Payload = {return config_Drone_Battery_Charge_SupervisorBatterySample_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorBatterySample_Payload(config: Config_Drone_Battery_Charge_SupervisorBatterySample_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBatterySample_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = {return config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {return config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {return config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = {return config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {return config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(v: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {return config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeAuthorizationType(v: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeAuthorizationType: Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType = Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeAuthorizationType _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType: Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType = {return config_Drone_Battery_Charge_SupervisorChargeAuthorizationType}

  def set_Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType(config: Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeAuthorizationType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload(v: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload: Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload = Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload: Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload = {return config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeContext.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeContextType(v: Drone_Battery_Charge_Supervisor.ChargeContext.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeContextType: Config_Drone_Battery_Charge_SupervisorChargeContextType = Config_Drone_Battery_Charge_SupervisorChargeContextType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeContextType _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeContextType: Config_Drone_Battery_Charge_SupervisorChargeContextType = {return config_Drone_Battery_Charge_SupervisorChargeContextType}

  def set_Config_Drone_Battery_Charge_SupervisorChargeContextType(config: Config_Drone_Battery_Charge_SupervisorChargeContextType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeContextType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeContext_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeContext_Payload(v: Drone_Battery_Charge_Supervisor.ChargeContext_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeContext_Payload: Config_Drone_Battery_Charge_SupervisorChargeContext_Payload = Config_Drone_Battery_Charge_SupervisorChargeContext_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeContext_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload: Config_Drone_Battery_Charge_SupervisorChargeContext_Payload = {return config_Drone_Battery_Charge_SupervisorChargeContext_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargeContext_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeContext_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeContext_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDecision ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeDecision(v: Drone_Battery_Charge_Supervisor.ChargeDecision): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeDecision: Config_Drone_Battery_Charge_SupervisorChargeDecision = Config_Drone_Battery_Charge_SupervisorChargeDecision(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeDecision _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeDecision: Config_Drone_Battery_Charge_SupervisorChargeDecision = {return config_Drone_Battery_Charge_SupervisorChargeDecision}

  def set_Config_Drone_Battery_Charge_SupervisorChargeDecision(config: Config_Drone_Battery_Charge_SupervisorChargeDecision): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeDecision = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDecision_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeDecision_Payload(v: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeDecision_Payload: Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload = Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeDecision_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload: Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload = {return config_Drone_Battery_Charge_SupervisorChargeDecision_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeDecision_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDisposition.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeDispositionType(v: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeDispositionType: Config_Drone_Battery_Charge_SupervisorChargeDispositionType = Config_Drone_Battery_Charge_SupervisorChargeDispositionType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeDispositionType _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeDispositionType: Config_Drone_Battery_Charge_SupervisorChargeDispositionType = {return config_Drone_Battery_Charge_SupervisorChargeDispositionType}

  def set_Config_Drone_Battery_Charge_SupervisorChargeDispositionType(config: Config_Drone_Battery_Charge_SupervisorChargeDispositionType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeDispositionType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeDisposition_Payload(v: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload: Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload = Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeDisposition_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload: Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload = {return config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntent.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntentType(v: Drone_Battery_Charge_Supervisor.ChargeIntent.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeIntentType: Config_Drone_Battery_Charge_SupervisorChargeIntentType = Config_Drone_Battery_Charge_SupervisorChargeIntentType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntentType _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntentType: Config_Drone_Battery_Charge_SupervisorChargeIntentType = {return config_Drone_Battery_Charge_SupervisorChargeIntentType}

  def set_Config_Drone_Battery_Charge_SupervisorChargeIntentType(config: Config_Drone_Battery_Charge_SupervisorChargeIntentType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeIntentType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntent_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntent_Payload(v: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeIntent_Payload: Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload = Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntent_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload: Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload = {return config_Drone_Battery_Charge_SupervisorChargeIntent_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeIntent_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntentSample ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntentSample(v: Drone_Battery_Charge_Supervisor.ChargeIntentSample): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeIntentSample: Config_Drone_Battery_Charge_SupervisorChargeIntentSample = Config_Drone_Battery_Charge_SupervisorChargeIntentSample(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntentSample _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample: Config_Drone_Battery_Charge_SupervisorChargeIntentSample = {return config_Drone_Battery_Charge_SupervisorChargeIntentSample}

  def set_Config_Drone_Battery_Charge_SupervisorChargeIntentSample(config: Config_Drone_Battery_Charge_SupervisorChargeIntentSample): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeIntentSample = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload(v: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload: Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload = Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload: Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload = {return config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload(config: Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = {return config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {return config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {return config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = {return config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {return config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(v: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {return config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = {return config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {return config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {return config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = {return config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {return config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(v: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {return config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = {return config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {return config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {return config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = {return config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {return config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(v: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {return config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerAvailability.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargerAvailabilityType(v: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargerAvailabilityType: Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType = Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargerAvailabilityType _)

  def get_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType: Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType = {return config_Drone_Battery_Charge_SupervisorChargerAvailabilityType}

  def set_Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType(config: Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargerAvailabilityType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargerAvailability_Payload(v: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload: Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload = Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargerAvailability_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload: Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload = {return config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload(config: Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerSample ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargerSample(v: Drone_Battery_Charge_Supervisor.ChargerSample): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargerSample: Config_Drone_Battery_Charge_SupervisorChargerSample = Config_Drone_Battery_Charge_SupervisorChargerSample(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargerSample _)

  def get_Config_Drone_Battery_Charge_SupervisorChargerSample: Config_Drone_Battery_Charge_SupervisorChargerSample = {return config_Drone_Battery_Charge_SupervisorChargerSample}

  def set_Config_Drone_Battery_Charge_SupervisorChargerSample(config: Config_Drone_Battery_Charge_SupervisorChargerSample): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargerSample = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.ChargerSample_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorChargerSample_Payload(v: Drone_Battery_Charge_Supervisor.ChargerSample_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorChargerSample_Payload: Config_Drone_Battery_Charge_SupervisorChargerSample_Payload = Config_Drone_Battery_Charge_SupervisorChargerSample_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorChargerSample_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload: Config_Drone_Battery_Charge_SupervisorChargerSample_Payload = {return config_Drone_Battery_Charge_SupervisorChargerSample_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorChargerSample_Payload(config: Config_Drone_Battery_Charge_SupervisorChargerSample_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorChargerSample_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivity.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivityType(v: Drone_Battery_Charge_Supervisor.FlightActivity.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorFlightActivityType: Config_Drone_Battery_Charge_SupervisorFlightActivityType = Config_Drone_Battery_Charge_SupervisorFlightActivityType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivityType _)

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivityType: Config_Drone_Battery_Charge_SupervisorFlightActivityType = {return config_Drone_Battery_Charge_SupervisorFlightActivityType}

  def set_Config_Drone_Battery_Charge_SupervisorFlightActivityType(config: Config_Drone_Battery_Charge_SupervisorFlightActivityType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorFlightActivityType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivity_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivity_Payload(v: Drone_Battery_Charge_Supervisor.FlightActivity_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorFlightActivity_Payload: Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload = Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivity_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload: Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload = {return config_Drone_Battery_Charge_SupervisorFlightActivity_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload(config: Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorFlightActivity_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivitySample ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivitySample(v: Drone_Battery_Charge_Supervisor.FlightActivitySample): B = {return T}

  var config_Drone_Battery_Charge_SupervisorFlightActivitySample: Config_Drone_Battery_Charge_SupervisorFlightActivitySample = Config_Drone_Battery_Charge_SupervisorFlightActivitySample(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivitySample _)

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample: Config_Drone_Battery_Charge_SupervisorFlightActivitySample = {return config_Drone_Battery_Charge_SupervisorFlightActivitySample}

  def set_Config_Drone_Battery_Charge_SupervisorFlightActivitySample(config: Config_Drone_Battery_Charge_SupervisorFlightActivitySample): RandomLib ={
    config_Drone_Battery_Charge_SupervisorFlightActivitySample = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload(v: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload: Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload = Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload: Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload = {return config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload(config: Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.InputStatus.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorInputStatusType(v: Drone_Battery_Charge_Supervisor.InputStatus.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorInputStatusType: Config_Drone_Battery_Charge_SupervisorInputStatusType = Config_Drone_Battery_Charge_SupervisorInputStatusType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorInputStatusType _)

  def get_Config_Drone_Battery_Charge_SupervisorInputStatusType: Config_Drone_Battery_Charge_SupervisorInputStatusType = {return config_Drone_Battery_Charge_SupervisorInputStatusType}

  def set_Config_Drone_Battery_Charge_SupervisorInputStatusType(config: Config_Drone_Battery_Charge_SupervisorInputStatusType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorInputStatusType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.InputStatus_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorInputStatus_Payload(v: Drone_Battery_Charge_Supervisor.InputStatus_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorInputStatus_Payload: Config_Drone_Battery_Charge_SupervisorInputStatus_Payload = Config_Drone_Battery_Charge_SupervisorInputStatus_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorInputStatus_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload: Config_Drone_Battery_Charge_SupervisorInputStatus_Payload = {return config_Drone_Battery_Charge_SupervisorInputStatus_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorInputStatus_Payload(config: Config_Drone_Battery_Charge_SupervisorInputStatus_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorInputStatus_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = {return config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {return config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {return config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = {return config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {return config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(v: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {return config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType(v: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type): B = {return T}

  var config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType = Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType _)

  def get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType = {return config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType}

  def set_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType(config: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType): RandomLib ={
    config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(v: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload): B = {return T}

  var config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload = Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload _)

  def get_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload = {return config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload}

  def set_Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(config: Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload): RandomLib ={
    config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = {return config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {return config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {return config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container): B = {return T}

  var config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container _)

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = {return config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container}

  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container): RandomLib ={
    config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P): B = {return T}

  var config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _)

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {return config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P}

  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P): RandomLib ={
    config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = config
    return this
  }

  // ============= Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS ===================
  def alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(v: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS): B = {return T}

  var config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(100, _verbose, alwaysTrue_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _)

  def get_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {return config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS}

  def set_Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(config: Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS): RandomLib ={
    config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = config
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

