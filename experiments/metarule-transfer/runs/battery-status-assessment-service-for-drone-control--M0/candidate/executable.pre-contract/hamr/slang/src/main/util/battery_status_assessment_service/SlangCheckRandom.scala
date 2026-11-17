// #Sireum

package battery_status_assessment_service

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

CheckCommand.scala

CheckToken.scala

AcquisitionOutcome.scala

PublicationOutcome.scala

AcquisitionDirective.scala

AssessmentContext.scala

PublicationDirective.scala

CheckStatus.scala

ReportTicket.scala

ReportAvailability.scala

CapacityLevel.scala

ReportQuality.scala

StatusReadRequest.scala

QualifiedEvidence.scala

AssessmentResult.scala

FeedbackTicket.scala

UseDisposition.scala

CheckRequest.scala

BatteryReport.scala

CapturedReport.scala

TaggedQualifiedEvidence.scala

TaggedAssessment.scala

ControlUseFeedback.scala

Base_Types.scala

CheckLifecycle_battery_assessment_process_check_lifecycle_Containers.scala

ReportAcquisition_battery_assessment_process_report_acquisition_Containers.scala

ReportQualification_battery_assessment_process_report_qualification_Containers.scala

AssessmentDecision_battery_assessment_process_assessment_decision_Containers.scala

ResultCustody_battery_assessment_process_result_custody_Containers.scala

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
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionDirective_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentContext_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentResult_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceBatteryReport_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapacityLevel_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapturedReport_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckCommand_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckRequest_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckStatus_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckToken_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceControlUseFeedback_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceFeedbackTicket_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationDirective_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationOutcome_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceQualifiedEvidence_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAvailability_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQuality_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportTicket_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceStatusReadRequest_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedAssessment_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload_Id, _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceUseDisposition_Payload_Id, _artDataContent_DataTypeId.utilEmptyContainer_Id)

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
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionDirective_Payload_Id => (nextBattery_Status_Assessment_ServiceAcquisitionDirective_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload_Id => (nextBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentContext_Payload_Id => (nextBattery_Status_Assessment_ServiceAssessmentContext_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentResult_Payload_Id => (nextBattery_Status_Assessment_ServiceAssessmentResult_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceBatteryReport_Payload_Id => (nextBattery_Status_Assessment_ServiceBatteryReport_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapacityLevel_Payload_Id => (nextBattery_Status_Assessment_ServiceCapacityLevel_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapturedReport_Payload_Id => (nextBattery_Status_Assessment_ServiceCapturedReport_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckCommand_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckCommand_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckRequest_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckRequest_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckStatus_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckStatus_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckToken_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckToken_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceControlUseFeedback_Payload_Id => (nextBattery_Status_Assessment_ServiceControlUseFeedback_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceFeedbackTicket_Payload_Id => (nextBattery_Status_Assessment_ServiceFeedbackTicket_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationDirective_Payload_Id => (nextBattery_Status_Assessment_ServicePublicationDirective_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationOutcome_Payload_Id => (nextBattery_Status_Assessment_ServicePublicationOutcome_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceQualifiedEvidence_Payload_Id => (nextBattery_Status_Assessment_ServiceQualifiedEvidence_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAvailability_Payload_Id => (nextBattery_Status_Assessment_ServiceReportAvailability_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQuality_Payload_Id => (nextBattery_Status_Assessment_ServiceReportQuality_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportTicket_Payload_Id => (nextBattery_Status_Assessment_ServiceReportTicket_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceStatusReadRequest_Payload_Id => (nextBattery_Status_Assessment_ServiceStatusReadRequest_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedAssessment_Payload_Id => (nextBattery_Status_Assessment_ServiceTaggedAssessment_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload_Id => (nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload _).apply()
      case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceUseDisposition_Payload_Id => (nextBattery_Status_Assessment_ServiceUseDisposition_Payload _).apply()
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
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionDirective_Payload_Id => (nextBattery_Status_Assessment_ServiceAcquisitionDirective_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload_Id => (nextBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentContext_Payload_Id => (nextBattery_Status_Assessment_ServiceAssessmentContext_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentResult_Payload_Id => (nextBattery_Status_Assessment_ServiceAssessmentResult_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceBatteryReport_Payload_Id => (nextBattery_Status_Assessment_ServiceBatteryReport_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapacityLevel_Payload_Id => (nextBattery_Status_Assessment_ServiceCapacityLevel_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapturedReport_Payload_Id => (nextBattery_Status_Assessment_ServiceCapturedReport_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckCommand_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckCommand_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckRequest_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckRequest_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckStatus_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckToken_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckToken_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceControlUseFeedback_Payload_Id => (nextBattery_Status_Assessment_ServiceControlUseFeedback_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceFeedbackTicket_Payload_Id => (nextBattery_Status_Assessment_ServiceFeedbackTicket_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationDirective_Payload_Id => (nextBattery_Status_Assessment_ServicePublicationDirective_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationOutcome_Payload_Id => (nextBattery_Status_Assessment_ServicePublicationOutcome_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceQualifiedEvidence_Payload_Id => (nextBattery_Status_Assessment_ServiceQualifiedEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAvailability_Payload_Id => (nextBattery_Status_Assessment_ServiceReportAvailability_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQuality_Payload_Id => (nextBattery_Status_Assessment_ServiceReportQuality_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportTicket_Payload_Id => (nextBattery_Status_Assessment_ServiceReportTicket_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceStatusReadRequest_Payload_Id => (nextBattery_Status_Assessment_ServiceStatusReadRequest_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedAssessment_Payload_Id => (nextBattery_Status_Assessment_ServiceTaggedAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload_Id => (nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceUseDisposition_Payload_Id => (nextBattery_Status_Assessment_ServiceUseDisposition_Payload _).apply()
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
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionDirective_Payload_Id => (nextBattery_Status_Assessment_ServiceAcquisitionDirective_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload_Id => (nextBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentContext_Payload_Id => (nextBattery_Status_Assessment_ServiceAssessmentContext_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceAssessmentResult_Payload_Id => (nextBattery_Status_Assessment_ServiceAssessmentResult_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceBatteryReport_Payload_Id => (nextBattery_Status_Assessment_ServiceBatteryReport_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapacityLevel_Payload_Id => (nextBattery_Status_Assessment_ServiceCapacityLevel_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCapturedReport_Payload_Id => (nextBattery_Status_Assessment_ServiceCapturedReport_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckCommand_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckCommand_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckRequest_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckRequest_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckStatus_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckStatus_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceCheckToken_Payload_Id => (nextBattery_Status_Assessment_ServiceCheckToken_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceControlUseFeedback_Payload_Id => (nextBattery_Status_Assessment_ServiceControlUseFeedback_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceFeedbackTicket_Payload_Id => (nextBattery_Status_Assessment_ServiceFeedbackTicket_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationDirective_Payload_Id => (nextBattery_Status_Assessment_ServicePublicationDirective_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServicePublicationOutcome_Payload_Id => (nextBattery_Status_Assessment_ServicePublicationOutcome_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceQualifiedEvidence_Payload_Id => (nextBattery_Status_Assessment_ServiceQualifiedEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportAvailability_Payload_Id => (nextBattery_Status_Assessment_ServiceReportAvailability_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportQuality_Payload_Id => (nextBattery_Status_Assessment_ServiceReportQuality_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceReportTicket_Payload_Id => (nextBattery_Status_Assessment_ServiceReportTicket_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceStatusReadRequest_Payload_Id => (nextBattery_Status_Assessment_ServiceStatusReadRequest_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedAssessment_Payload_Id => (nextBattery_Status_Assessment_ServiceTaggedAssessment_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload_Id => (nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload _).apply()
         case _artDataContent_DataTypeId.Battery_Status_Assessment_ServiceUseDisposition_Payload_Id => (nextBattery_Status_Assessment_ServiceUseDisposition_Payload _).apply()
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

  // ============= Battery_Status_Assessment_Service.AcquisitionDirective.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType: Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType
  def set_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType(config: Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType): RandomLib

  def nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType(): Battery_Status_Assessment_Service.AcquisitionDirective.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionDirective.numOfElements-1)

    var v: Battery_Status_Assessment_Service.AcquisitionDirective.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionDirective.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionDirective.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionDirective.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionDirective.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionDirective.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AcquisitionDirective_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload: Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload
  def set_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload(config: Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceAcquisitionDirective_Payload(): Battery_Status_Assessment_Service.AcquisitionDirective_Payload = {
    var value: Battery_Status_Assessment_Service.AcquisitionDirective.Type = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()

    var v: Battery_Status_Assessment_Service.AcquisitionDirective_Payload = Battery_Status_Assessment_Service.AcquisitionDirective_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
        v = Battery_Status_Assessment_Service.AcquisitionDirective_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
       v = Battery_Status_Assessment_Service.AcquisitionDirective_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AcquisitionOutcome.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType: Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType
  def set_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType(config: Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType): RandomLib

  def nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType(): Battery_Status_Assessment_Service.AcquisitionOutcome.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionOutcome.numOfElements-1)

    var v: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionOutcome.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionOutcome.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionOutcome.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionOutcome.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AcquisitionOutcome.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AcquisitionOutcome_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload: Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload
  def set_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload(config: Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceAcquisitionOutcome_Payload(): Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = {
    var value: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()

    var v: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload = Battery_Status_Assessment_Service.AcquisitionOutcome_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
        v = Battery_Status_Assessment_Service.AcquisitionOutcome_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
       v = Battery_Status_Assessment_Service.AcquisitionOutcome_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentContext.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentContextType: Config_Battery_Status_Assessment_ServiceAssessmentContextType
  def set_Config_Battery_Status_Assessment_ServiceAssessmentContextType(config: Config_Battery_Status_Assessment_ServiceAssessmentContextType): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentContextType(): Battery_Status_Assessment_Service.AssessmentContext.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentContext.numOfElements-1)

    var v: Battery_Status_Assessment_Service.AssessmentContext.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentContext.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceAssessmentContextType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentContextType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentContextType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentContextType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentContext.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentContext.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentContextType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentContextType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentContext.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentContext.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentContext_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload: Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload
  def set_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload(config: Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentContext_Payload(): Battery_Status_Assessment_Service.AssessmentContext_Payload = {
    var value: Battery_Status_Assessment_Service.AssessmentContext.Type = nextBattery_Status_Assessment_ServiceAssessmentContextType()

    var v: Battery_Status_Assessment_Service.AssessmentContext_Payload = Battery_Status_Assessment_Service.AssessmentContext_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceAssessmentContextType()
        v = Battery_Status_Assessment_Service.AssessmentContext_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceAssessmentContextType()
       v = Battery_Status_Assessment_Service.AssessmentContext_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container
  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id, Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = c match {
      case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {
    var api_assessment_context: Battery_Status_Assessment_Service.AssessmentContext.Type = nextBattery_Status_Assessment_ServiceAssessmentContextType()
    var api_qualified_evidence: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()

    var v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(api_assessment_context, api_qualified_evidence)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
        api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
        v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(api_assessment_context, api_qualified_evidence)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
       api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
       v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(api_assessment_context, api_qualified_evidence)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {
    var api_assessment_context: Battery_Status_Assessment_Service.AssessmentContext.Type = nextBattery_Status_Assessment_ServiceAssessmentContextType()
    var api_qualified_evidence: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()

    var v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(api_assessment_context, api_qualified_evidence)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
        api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
        v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(api_assessment_context, api_qualified_evidence)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
       api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
       v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(api_assessment_context, api_qualified_evidence)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container
  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id, Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = c match {
      case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {
    var api_decision_assessment: Battery_Status_Assessment_Service.TaggedAssessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()

    var v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(api_decision_assessment)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
        v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(api_decision_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
       v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(api_decision_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(): Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {
    var api_decision_assessment: Battery_Status_Assessment_Service.TaggedAssessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()

    var v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(api_decision_assessment)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
        v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(api_decision_assessment)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
       v = Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(api_decision_assessment)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentResult.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentResultType: Config_Battery_Status_Assessment_ServiceAssessmentResultType
  def set_Config_Battery_Status_Assessment_ServiceAssessmentResultType(config: Config_Battery_Status_Assessment_ServiceAssessmentResultType): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentResultType(): Battery_Status_Assessment_Service.AssessmentResult.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentResult.numOfElements-1)

    var v: Battery_Status_Assessment_Service.AssessmentResult.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentResult.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceAssessmentResultType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentResultType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentResultType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentResultType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentResult.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentResult.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentResultType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentResultType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentResult.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.AssessmentResult.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.AssessmentResult_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload: Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload
  def set_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload(config: Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceAssessmentResult_Payload(): Battery_Status_Assessment_Service.AssessmentResult_Payload = {
    var value: Battery_Status_Assessment_Service.AssessmentResult.Type = nextBattery_Status_Assessment_ServiceAssessmentResultType()

    var v: Battery_Status_Assessment_Service.AssessmentResult_Payload = Battery_Status_Assessment_Service.AssessmentResult_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceAssessmentResultType()
        v = Battery_Status_Assessment_Service.AssessmentResult_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceAssessmentResultType()
       v = Battery_Status_Assessment_Service.AssessmentResult_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.BatteryReport ===================

  def get_Config_Battery_Status_Assessment_ServiceBatteryReport: Config_Battery_Status_Assessment_ServiceBatteryReport
  def set_Config_Battery_Status_Assessment_ServiceBatteryReport(config: Config_Battery_Status_Assessment_ServiceBatteryReport): RandomLib

  def nextBattery_Status_Assessment_ServiceBatteryReport(): Battery_Status_Assessment_Service.BatteryReport = {
    var ticket: Battery_Status_Assessment_Service.ReportTicket.Type = nextBattery_Status_Assessment_ServiceReportTicketType()
    var availability: Battery_Status_Assessment_Service.ReportAvailability.Type = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
    var level: Battery_Status_Assessment_Service.CapacityLevel.Type = nextBattery_Status_Assessment_ServiceCapacityLevelType()
    var quality: Battery_Status_Assessment_Service.ReportQuality.Type = nextBattery_Status_Assessment_ServiceReportQualityType()

    var v: Battery_Status_Assessment_Service.BatteryReport = Battery_Status_Assessment_Service.BatteryReport(ticket, availability, level, quality)

    if(get_Config_Battery_Status_Assessment_ServiceBatteryReport.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceBatteryReport.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceBatteryReport.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceBatteryReport.verbose) {
          println(s"Retrying for failing value: $v")
        }
        ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
        availability = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
        level = nextBattery_Status_Assessment_ServiceCapacityLevelType()
        quality = nextBattery_Status_Assessment_ServiceReportQualityType()
        v = Battery_Status_Assessment_Service.BatteryReport(ticket, availability, level, quality)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceBatteryReport.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceBatteryReport.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
       availability = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
       level = nextBattery_Status_Assessment_ServiceCapacityLevelType()
       quality = nextBattery_Status_Assessment_ServiceReportQualityType()
       v = Battery_Status_Assessment_Service.BatteryReport(ticket, availability, level, quality)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.BatteryReport_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload: Config_Battery_Status_Assessment_ServiceBatteryReport_Payload
  def set_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload(config: Config_Battery_Status_Assessment_ServiceBatteryReport_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceBatteryReport_Payload(): Battery_Status_Assessment_Service.BatteryReport_Payload = {
    var value: Battery_Status_Assessment_Service.BatteryReport = nextBattery_Status_Assessment_ServiceBatteryReport()

    var v: Battery_Status_Assessment_Service.BatteryReport_Payload = Battery_Status_Assessment_Service.BatteryReport_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceBatteryReport()
        v = Battery_Status_Assessment_Service.BatteryReport_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceBatteryReport()
       v = Battery_Status_Assessment_Service.BatteryReport_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CapacityLevel.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceCapacityLevelType: Config_Battery_Status_Assessment_ServiceCapacityLevelType
  def set_Config_Battery_Status_Assessment_ServiceCapacityLevelType(config: Config_Battery_Status_Assessment_ServiceCapacityLevelType): RandomLib

  def nextBattery_Status_Assessment_ServiceCapacityLevelType(): Battery_Status_Assessment_Service.CapacityLevel.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CapacityLevel.numOfElements-1)

    var v: Battery_Status_Assessment_Service.CapacityLevel.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.CapacityLevel.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceCapacityLevelType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCapacityLevelType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceCapacityLevelType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCapacityLevelType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CapacityLevel.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CapacityLevel.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceCapacityLevelType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCapacityLevelType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CapacityLevel.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CapacityLevel.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CapacityLevel_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload: Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload
  def set_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload(config: Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceCapacityLevel_Payload(): Battery_Status_Assessment_Service.CapacityLevel_Payload = {
    var value: Battery_Status_Assessment_Service.CapacityLevel.Type = nextBattery_Status_Assessment_ServiceCapacityLevelType()

    var v: Battery_Status_Assessment_Service.CapacityLevel_Payload = Battery_Status_Assessment_Service.CapacityLevel_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceCapacityLevelType()
        v = Battery_Status_Assessment_Service.CapacityLevel_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceCapacityLevelType()
       v = Battery_Status_Assessment_Service.CapacityLevel_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CapturedReport ===================

  def get_Config_Battery_Status_Assessment_ServiceCapturedReport: Config_Battery_Status_Assessment_ServiceCapturedReport
  def set_Config_Battery_Status_Assessment_ServiceCapturedReport(config: Config_Battery_Status_Assessment_ServiceCapturedReport): RandomLib

  def nextBattery_Status_Assessment_ServiceCapturedReport(): Battery_Status_Assessment_Service.CapturedReport = {
    var ticket: Battery_Status_Assessment_Service.ReportTicket.Type = nextBattery_Status_Assessment_ServiceReportTicketType()
    var availability: Battery_Status_Assessment_Service.ReportAvailability.Type = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
    var level: Battery_Status_Assessment_Service.CapacityLevel.Type = nextBattery_Status_Assessment_ServiceCapacityLevelType()
    var quality: Battery_Status_Assessment_Service.ReportQuality.Type = nextBattery_Status_Assessment_ServiceReportQualityType()

    var v: Battery_Status_Assessment_Service.CapturedReport = Battery_Status_Assessment_Service.CapturedReport(ticket, availability, level, quality)

    if(get_Config_Battery_Status_Assessment_ServiceCapturedReport.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCapturedReport.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCapturedReport.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCapturedReport.verbose) {
          println(s"Retrying for failing value: $v")
        }
        ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
        availability = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
        level = nextBattery_Status_Assessment_ServiceCapacityLevelType()
        quality = nextBattery_Status_Assessment_ServiceReportQualityType()
        v = Battery_Status_Assessment_Service.CapturedReport(ticket, availability, level, quality)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCapturedReport.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCapturedReport.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
       availability = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
       level = nextBattery_Status_Assessment_ServiceCapacityLevelType()
       quality = nextBattery_Status_Assessment_ServiceReportQualityType()
       v = Battery_Status_Assessment_Service.CapturedReport(ticket, availability, level, quality)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CapturedReport_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload: Config_Battery_Status_Assessment_ServiceCapturedReport_Payload
  def set_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload(config: Config_Battery_Status_Assessment_ServiceCapturedReport_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceCapturedReport_Payload(): Battery_Status_Assessment_Service.CapturedReport_Payload = {
    var value: Battery_Status_Assessment_Service.CapturedReport = nextBattery_Status_Assessment_ServiceCapturedReport()

    var v: Battery_Status_Assessment_Service.CapturedReport_Payload = Battery_Status_Assessment_Service.CapturedReport_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceCapturedReport()
        v = Battery_Status_Assessment_Service.CapturedReport_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceCapturedReport()
       v = Battery_Status_Assessment_Service.CapturedReport_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckCommand.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckCommandType: Config_Battery_Status_Assessment_ServiceCheckCommandType
  def set_Config_Battery_Status_Assessment_ServiceCheckCommandType(config: Config_Battery_Status_Assessment_ServiceCheckCommandType): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckCommandType(): Battery_Status_Assessment_Service.CheckCommand.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckCommand.numOfElements-1)

    var v: Battery_Status_Assessment_Service.CheckCommand.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckCommand.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceCheckCommandType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckCommandType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckCommandType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckCommandType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckCommand.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckCommand.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceCheckCommandType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckCommandType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckCommand.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckCommand.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckCommand_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload: Config_Battery_Status_Assessment_ServiceCheckCommand_Payload
  def set_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload(config: Config_Battery_Status_Assessment_ServiceCheckCommand_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckCommand_Payload(): Battery_Status_Assessment_Service.CheckCommand_Payload = {
    var value: Battery_Status_Assessment_Service.CheckCommand.Type = nextBattery_Status_Assessment_ServiceCheckCommandType()

    var v: Battery_Status_Assessment_Service.CheckCommand_Payload = Battery_Status_Assessment_Service.CheckCommand_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceCheckCommandType()
        v = Battery_Status_Assessment_Service.CheckCommand_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceCheckCommandType()
       v = Battery_Status_Assessment_Service.CheckCommand_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container
  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id, Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = c match {
      case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {
    var api_acquisition_outcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
    var api_check_request: Battery_Status_Assessment_Service.CheckRequest = nextBattery_Status_Assessment_ServiceCheckRequest()
    var api_publication_outcome: Battery_Status_Assessment_Service.PublicationOutcome.Type = nextBattery_Status_Assessment_ServicePublicationOutcomeType()

    var v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(api_acquisition_outcome, api_check_request, api_publication_outcome)

    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
        api_check_request = nextBattery_Status_Assessment_ServiceCheckRequest()
        api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
        v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(api_acquisition_outcome, api_check_request, api_publication_outcome)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
       api_check_request = nextBattery_Status_Assessment_ServiceCheckRequest()
       api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
       v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(api_acquisition_outcome, api_check_request, api_publication_outcome)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {
    var api_acquisition_outcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
    var api_check_request: Battery_Status_Assessment_Service.CheckRequest = nextBattery_Status_Assessment_ServiceCheckRequest()
    var api_publication_outcome: Battery_Status_Assessment_Service.PublicationOutcome.Type = nextBattery_Status_Assessment_ServicePublicationOutcomeType()

    var v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(api_acquisition_outcome, api_check_request, api_publication_outcome)

    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
        api_check_request = nextBattery_Status_Assessment_ServiceCheckRequest()
        api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
        v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(api_acquisition_outcome, api_check_request, api_publication_outcome)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
       api_check_request = nextBattery_Status_Assessment_ServiceCheckRequest()
       api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
       v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(api_acquisition_outcome, api_check_request, api_publication_outcome)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container
  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id, Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = c match {
      case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {
    var api_acquisition_directive: Battery_Status_Assessment_Service.AcquisitionDirective.Type = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
    var api_assessment_context: Battery_Status_Assessment_Service.AssessmentContext.Type = nextBattery_Status_Assessment_ServiceAssessmentContextType()
    var api_check_status: Battery_Status_Assessment_Service.CheckStatus.Type = nextBattery_Status_Assessment_ServiceCheckStatusType()
    var api_publication_directive: Battery_Status_Assessment_Service.PublicationDirective.Type = nextBattery_Status_Assessment_ServicePublicationDirectiveType()

    var v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)

    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
        api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
        api_check_status = nextBattery_Status_Assessment_ServiceCheckStatusType()
        api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
        v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
       api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
       api_check_status = nextBattery_Status_Assessment_ServiceCheckStatusType()
       api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
       v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(): Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {
    var api_acquisition_directive: Battery_Status_Assessment_Service.AcquisitionDirective.Type = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
    var api_assessment_context: Battery_Status_Assessment_Service.AssessmentContext.Type = nextBattery_Status_Assessment_ServiceAssessmentContextType()
    var api_check_status: Battery_Status_Assessment_Service.CheckStatus.Type = nextBattery_Status_Assessment_ServiceCheckStatusType()
    var api_publication_directive: Battery_Status_Assessment_Service.PublicationDirective.Type = nextBattery_Status_Assessment_ServicePublicationDirectiveType()

    var v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)

    if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
        api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
        api_check_status = nextBattery_Status_Assessment_ServiceCheckStatusType()
        api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
        v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
       api_assessment_context = nextBattery_Status_Assessment_ServiceAssessmentContextType()
       api_check_status = nextBattery_Status_Assessment_ServiceCheckStatusType()
       api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
       v = Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(api_acquisition_directive, api_assessment_context, api_check_status, api_publication_directive)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckRequest ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckRequest: Config_Battery_Status_Assessment_ServiceCheckRequest
  def set_Config_Battery_Status_Assessment_ServiceCheckRequest(config: Config_Battery_Status_Assessment_ServiceCheckRequest): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckRequest(): Battery_Status_Assessment_Service.CheckRequest = {
    var command: Battery_Status_Assessment_Service.CheckCommand.Type = nextBattery_Status_Assessment_ServiceCheckCommandType()
    var token: Battery_Status_Assessment_Service.CheckToken.Type = nextBattery_Status_Assessment_ServiceCheckTokenType()

    var v: Battery_Status_Assessment_Service.CheckRequest = Battery_Status_Assessment_Service.CheckRequest(command, token)

    if(get_Config_Battery_Status_Assessment_ServiceCheckRequest.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckRequest.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckRequest.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckRequest.verbose) {
          println(s"Retrying for failing value: $v")
        }
        command = nextBattery_Status_Assessment_ServiceCheckCommandType()
        token = nextBattery_Status_Assessment_ServiceCheckTokenType()
        v = Battery_Status_Assessment_Service.CheckRequest(command, token)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckRequest.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckRequest.verbose) {
         println(s"Retrying for failing value: $v")
       }
       command = nextBattery_Status_Assessment_ServiceCheckCommandType()
       token = nextBattery_Status_Assessment_ServiceCheckTokenType()
       v = Battery_Status_Assessment_Service.CheckRequest(command, token)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckRequest_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload: Config_Battery_Status_Assessment_ServiceCheckRequest_Payload
  def set_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload(config: Config_Battery_Status_Assessment_ServiceCheckRequest_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckRequest_Payload(): Battery_Status_Assessment_Service.CheckRequest_Payload = {
    var value: Battery_Status_Assessment_Service.CheckRequest = nextBattery_Status_Assessment_ServiceCheckRequest()

    var v: Battery_Status_Assessment_Service.CheckRequest_Payload = Battery_Status_Assessment_Service.CheckRequest_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceCheckRequest()
        v = Battery_Status_Assessment_Service.CheckRequest_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceCheckRequest()
       v = Battery_Status_Assessment_Service.CheckRequest_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckStatus.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckStatusType: Config_Battery_Status_Assessment_ServiceCheckStatusType
  def set_Config_Battery_Status_Assessment_ServiceCheckStatusType(config: Config_Battery_Status_Assessment_ServiceCheckStatusType): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckStatusType(): Battery_Status_Assessment_Service.CheckStatus.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckStatus.numOfElements-1)

    var v: Battery_Status_Assessment_Service.CheckStatus.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckStatus.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceCheckStatusType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckStatusType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckStatusType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckStatus.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckStatus.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceCheckStatusType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckStatusType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckStatus.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckStatus.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckStatus_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload: Config_Battery_Status_Assessment_ServiceCheckStatus_Payload
  def set_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload(config: Config_Battery_Status_Assessment_ServiceCheckStatus_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckStatus_Payload(): Battery_Status_Assessment_Service.CheckStatus_Payload = {
    var value: Battery_Status_Assessment_Service.CheckStatus.Type = nextBattery_Status_Assessment_ServiceCheckStatusType()

    var v: Battery_Status_Assessment_Service.CheckStatus_Payload = Battery_Status_Assessment_Service.CheckStatus_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceCheckStatusType()
        v = Battery_Status_Assessment_Service.CheckStatus_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceCheckStatusType()
       v = Battery_Status_Assessment_Service.CheckStatus_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckToken.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckTokenType: Config_Battery_Status_Assessment_ServiceCheckTokenType
  def set_Config_Battery_Status_Assessment_ServiceCheckTokenType(config: Config_Battery_Status_Assessment_ServiceCheckTokenType): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckTokenType(): Battery_Status_Assessment_Service.CheckToken.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckToken.numOfElements-1)

    var v: Battery_Status_Assessment_Service.CheckToken.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckToken.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceCheckTokenType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckTokenType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckTokenType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckTokenType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckToken.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckToken.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceCheckTokenType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckTokenType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.CheckToken.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.CheckToken.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.CheckToken_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload: Config_Battery_Status_Assessment_ServiceCheckToken_Payload
  def set_Config_Battery_Status_Assessment_ServiceCheckToken_Payload(config: Config_Battery_Status_Assessment_ServiceCheckToken_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceCheckToken_Payload(): Battery_Status_Assessment_Service.CheckToken_Payload = {
    var value: Battery_Status_Assessment_Service.CheckToken.Type = nextBattery_Status_Assessment_ServiceCheckTokenType()

    var v: Battery_Status_Assessment_Service.CheckToken_Payload = Battery_Status_Assessment_Service.CheckToken_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceCheckTokenType()
        v = Battery_Status_Assessment_Service.CheckToken_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceCheckTokenType()
       v = Battery_Status_Assessment_Service.CheckToken_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ControlUseFeedback ===================

  def get_Config_Battery_Status_Assessment_ServiceControlUseFeedback: Config_Battery_Status_Assessment_ServiceControlUseFeedback
  def set_Config_Battery_Status_Assessment_ServiceControlUseFeedback(config: Config_Battery_Status_Assessment_ServiceControlUseFeedback): RandomLib

  def nextBattery_Status_Assessment_ServiceControlUseFeedback(): Battery_Status_Assessment_Service.ControlUseFeedback = {
    var ticket: Battery_Status_Assessment_Service.FeedbackTicket.Type = nextBattery_Status_Assessment_ServiceFeedbackTicketType()
    var disposition: Battery_Status_Assessment_Service.UseDisposition.Type = nextBattery_Status_Assessment_ServiceUseDispositionType()

    var v: Battery_Status_Assessment_Service.ControlUseFeedback = Battery_Status_Assessment_Service.ControlUseFeedback(ticket, disposition)

    if(get_Config_Battery_Status_Assessment_ServiceControlUseFeedback.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceControlUseFeedback.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceControlUseFeedback.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceControlUseFeedback.verbose) {
          println(s"Retrying for failing value: $v")
        }
        ticket = nextBattery_Status_Assessment_ServiceFeedbackTicketType()
        disposition = nextBattery_Status_Assessment_ServiceUseDispositionType()
        v = Battery_Status_Assessment_Service.ControlUseFeedback(ticket, disposition)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceControlUseFeedback.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceControlUseFeedback.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ticket = nextBattery_Status_Assessment_ServiceFeedbackTicketType()
       disposition = nextBattery_Status_Assessment_ServiceUseDispositionType()
       v = Battery_Status_Assessment_Service.ControlUseFeedback(ticket, disposition)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ControlUseFeedback_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload: Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload
  def set_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload(config: Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceControlUseFeedback_Payload(): Battery_Status_Assessment_Service.ControlUseFeedback_Payload = {
    var value: Battery_Status_Assessment_Service.ControlUseFeedback = nextBattery_Status_Assessment_ServiceControlUseFeedback()

    var v: Battery_Status_Assessment_Service.ControlUseFeedback_Payload = Battery_Status_Assessment_Service.ControlUseFeedback_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceControlUseFeedback()
        v = Battery_Status_Assessment_Service.ControlUseFeedback_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceControlUseFeedback()
       v = Battery_Status_Assessment_Service.ControlUseFeedback_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.FeedbackTicket.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType: Config_Battery_Status_Assessment_ServiceFeedbackTicketType
  def set_Config_Battery_Status_Assessment_ServiceFeedbackTicketType(config: Config_Battery_Status_Assessment_ServiceFeedbackTicketType): RandomLib

  def nextBattery_Status_Assessment_ServiceFeedbackTicketType(): Battery_Status_Assessment_Service.FeedbackTicket.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.FeedbackTicket.numOfElements-1)

    var v: Battery_Status_Assessment_Service.FeedbackTicket.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.FeedbackTicket.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.FeedbackTicket.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.FeedbackTicket.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.FeedbackTicket.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.FeedbackTicket.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.FeedbackTicket_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload: Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload
  def set_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload(config: Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceFeedbackTicket_Payload(): Battery_Status_Assessment_Service.FeedbackTicket_Payload = {
    var value: Battery_Status_Assessment_Service.FeedbackTicket.Type = nextBattery_Status_Assessment_ServiceFeedbackTicketType()

    var v: Battery_Status_Assessment_Service.FeedbackTicket_Payload = Battery_Status_Assessment_Service.FeedbackTicket_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceFeedbackTicketType()
        v = Battery_Status_Assessment_Service.FeedbackTicket_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceFeedbackTicketType()
       v = Battery_Status_Assessment_Service.FeedbackTicket_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.PublicationDirective.Type ===================

  def get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType: Config_Battery_Status_Assessment_ServicePublicationDirectiveType
  def set_Config_Battery_Status_Assessment_ServicePublicationDirectiveType(config: Config_Battery_Status_Assessment_ServicePublicationDirectiveType): RandomLib

  def nextBattery_Status_Assessment_ServicePublicationDirectiveType(): Battery_Status_Assessment_Service.PublicationDirective.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationDirective.numOfElements-1)

    var v: Battery_Status_Assessment_Service.PublicationDirective.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationDirective.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationDirective.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationDirective.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationDirective.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationDirective.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.PublicationDirective_Payload ===================

  def get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload: Config_Battery_Status_Assessment_ServicePublicationDirective_Payload
  def set_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload(config: Config_Battery_Status_Assessment_ServicePublicationDirective_Payload): RandomLib

  def nextBattery_Status_Assessment_ServicePublicationDirective_Payload(): Battery_Status_Assessment_Service.PublicationDirective_Payload = {
    var value: Battery_Status_Assessment_Service.PublicationDirective.Type = nextBattery_Status_Assessment_ServicePublicationDirectiveType()

    var v: Battery_Status_Assessment_Service.PublicationDirective_Payload = Battery_Status_Assessment_Service.PublicationDirective_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
        v = Battery_Status_Assessment_Service.PublicationDirective_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
       v = Battery_Status_Assessment_Service.PublicationDirective_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.PublicationOutcome.Type ===================

  def get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType: Config_Battery_Status_Assessment_ServicePublicationOutcomeType
  def set_Config_Battery_Status_Assessment_ServicePublicationOutcomeType(config: Config_Battery_Status_Assessment_ServicePublicationOutcomeType): RandomLib

  def nextBattery_Status_Assessment_ServicePublicationOutcomeType(): Battery_Status_Assessment_Service.PublicationOutcome.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationOutcome.numOfElements-1)

    var v: Battery_Status_Assessment_Service.PublicationOutcome.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationOutcome.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationOutcome.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationOutcome.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationOutcome.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.PublicationOutcome.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.PublicationOutcome_Payload ===================

  def get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload: Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload
  def set_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload(config: Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload): RandomLib

  def nextBattery_Status_Assessment_ServicePublicationOutcome_Payload(): Battery_Status_Assessment_Service.PublicationOutcome_Payload = {
    var value: Battery_Status_Assessment_Service.PublicationOutcome.Type = nextBattery_Status_Assessment_ServicePublicationOutcomeType()

    var v: Battery_Status_Assessment_Service.PublicationOutcome_Payload = Battery_Status_Assessment_Service.PublicationOutcome_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
        v = Battery_Status_Assessment_Service.PublicationOutcome_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
       v = Battery_Status_Assessment_Service.PublicationOutcome_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.QualifiedEvidence.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType: Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType
  def set_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType(config: Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType): RandomLib

  def nextBattery_Status_Assessment_ServiceQualifiedEvidenceType(): Battery_Status_Assessment_Service.QualifiedEvidence.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.QualifiedEvidence.numOfElements-1)

    var v: Battery_Status_Assessment_Service.QualifiedEvidence.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.QualifiedEvidence.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.QualifiedEvidence.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.QualifiedEvidence.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.QualifiedEvidence.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.QualifiedEvidence.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.QualifiedEvidence_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload: Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload
  def set_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload(config: Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceQualifiedEvidence_Payload(): Battery_Status_Assessment_Service.QualifiedEvidence_Payload = {
    var value: Battery_Status_Assessment_Service.QualifiedEvidence.Type = nextBattery_Status_Assessment_ServiceQualifiedEvidenceType()

    var v: Battery_Status_Assessment_Service.QualifiedEvidence_Payload = Battery_Status_Assessment_Service.QualifiedEvidence_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceQualifiedEvidenceType()
        v = Battery_Status_Assessment_Service.QualifiedEvidence_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceQualifiedEvidenceType()
       v = Battery_Status_Assessment_Service.QualifiedEvidence_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container
  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id, Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = c match {
      case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {
    var api_acquisition_directive: Battery_Status_Assessment_Service.AcquisitionDirective.Type = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
    var api_battery_report: Battery_Status_Assessment_Service.BatteryReport = nextBattery_Status_Assessment_ServiceBatteryReport()

    var v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(api_acquisition_directive, api_battery_report)

    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
        api_battery_report = nextBattery_Status_Assessment_ServiceBatteryReport()
        v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(api_acquisition_directive, api_battery_report)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
       api_battery_report = nextBattery_Status_Assessment_ServiceBatteryReport()
       v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(api_acquisition_directive, api_battery_report)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {
    var api_acquisition_directive: Battery_Status_Assessment_Service.AcquisitionDirective.Type = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
    var api_battery_report: Battery_Status_Assessment_Service.BatteryReport = nextBattery_Status_Assessment_ServiceBatteryReport()

    var v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(api_acquisition_directive, api_battery_report)

    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
        api_battery_report = nextBattery_Status_Assessment_ServiceBatteryReport()
        v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(api_acquisition_directive, api_battery_report)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_directive = nextBattery_Status_Assessment_ServiceAcquisitionDirectiveType()
       api_battery_report = nextBattery_Status_Assessment_ServiceBatteryReport()
       v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(api_acquisition_directive, api_battery_report)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container
  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id, Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = c match {
      case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {
    var api_acquisition_outcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
    var api_captured_report: Battery_Status_Assessment_Service.CapturedReport = nextBattery_Status_Assessment_ServiceCapturedReport()
    var api_status_read_request: Battery_Status_Assessment_Service.StatusReadRequest.Type = nextBattery_Status_Assessment_ServiceStatusReadRequestType()

    var v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(api_acquisition_outcome, api_captured_report, api_status_read_request)

    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
        api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
        api_status_read_request = nextBattery_Status_Assessment_ServiceStatusReadRequestType()
        v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(api_acquisition_outcome, api_captured_report, api_status_read_request)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
       api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
       api_status_read_request = nextBattery_Status_Assessment_ServiceStatusReadRequestType()
       v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(api_acquisition_outcome, api_captured_report, api_status_read_request)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(): Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {
    var api_acquisition_outcome: Battery_Status_Assessment_Service.AcquisitionOutcome.Type = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
    var api_captured_report: Battery_Status_Assessment_Service.CapturedReport = nextBattery_Status_Assessment_ServiceCapturedReport()
    var api_status_read_request: Battery_Status_Assessment_Service.StatusReadRequest.Type = nextBattery_Status_Assessment_ServiceStatusReadRequestType()

    var v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(api_acquisition_outcome, api_captured_report, api_status_read_request)

    if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
        api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
        api_status_read_request = nextBattery_Status_Assessment_ServiceStatusReadRequestType()
        v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(api_acquisition_outcome, api_captured_report, api_status_read_request)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_acquisition_outcome = nextBattery_Status_Assessment_ServiceAcquisitionOutcomeType()
       api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
       api_status_read_request = nextBattery_Status_Assessment_ServiceStatusReadRequestType()
       v = Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(api_acquisition_outcome, api_captured_report, api_status_read_request)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAvailability.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType: Config_Battery_Status_Assessment_ServiceReportAvailabilityType
  def set_Config_Battery_Status_Assessment_ServiceReportAvailabilityType(config: Config_Battery_Status_Assessment_ServiceReportAvailabilityType): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAvailabilityType(): Battery_Status_Assessment_Service.ReportAvailability.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportAvailability.numOfElements-1)

    var v: Battery_Status_Assessment_Service.ReportAvailability.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportAvailability.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportAvailability.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportAvailability.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportAvailability.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportAvailability.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportAvailability_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload: Config_Battery_Status_Assessment_ServiceReportAvailability_Payload
  def set_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload(config: Config_Battery_Status_Assessment_ServiceReportAvailability_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceReportAvailability_Payload(): Battery_Status_Assessment_Service.ReportAvailability_Payload = {
    var value: Battery_Status_Assessment_Service.ReportAvailability.Type = nextBattery_Status_Assessment_ServiceReportAvailabilityType()

    var v: Battery_Status_Assessment_Service.ReportAvailability_Payload = Battery_Status_Assessment_Service.ReportAvailability_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
        v = Battery_Status_Assessment_Service.ReportAvailability_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceReportAvailabilityType()
       v = Battery_Status_Assessment_Service.ReportAvailability_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container
  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id, Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container = c match {
      case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {
    var api_captured_report: Battery_Status_Assessment_Service.CapturedReport = nextBattery_Status_Assessment_ServiceCapturedReport()

    var v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(api_captured_report)

    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
        v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(api_captured_report)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
       v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(api_captured_report)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {
    var api_captured_report: Battery_Status_Assessment_Service.CapturedReport = nextBattery_Status_Assessment_ServiceCapturedReport()

    var v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(api_captured_report)

    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
        v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(api_captured_report)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_captured_report = nextBattery_Status_Assessment_ServiceCapturedReport()
       v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(api_captured_report)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container
  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id, Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container = c match {
      case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {
    var api_qualified_evidence: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()

    var v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(api_qualified_evidence)

    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
        v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(api_qualified_evidence)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
       v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(api_qualified_evidence)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(): Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {
    var api_qualified_evidence: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()

    var v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(api_qualified_evidence)

    if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
        v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(api_qualified_evidence)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_qualified_evidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
       v = Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(api_qualified_evidence)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQuality.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQualityType: Config_Battery_Status_Assessment_ServiceReportQualityType
  def set_Config_Battery_Status_Assessment_ServiceReportQualityType(config: Config_Battery_Status_Assessment_ServiceReportQualityType): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQualityType(): Battery_Status_Assessment_Service.ReportQuality.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportQuality.numOfElements-1)

    var v: Battery_Status_Assessment_Service.ReportQuality.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportQuality.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceReportQualityType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQualityType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQualityType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportQuality.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportQuality.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceReportQualityType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQualityType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportQuality.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportQuality.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportQuality_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload: Config_Battery_Status_Assessment_ServiceReportQuality_Payload
  def set_Config_Battery_Status_Assessment_ServiceReportQuality_Payload(config: Config_Battery_Status_Assessment_ServiceReportQuality_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceReportQuality_Payload(): Battery_Status_Assessment_Service.ReportQuality_Payload = {
    var value: Battery_Status_Assessment_Service.ReportQuality.Type = nextBattery_Status_Assessment_ServiceReportQualityType()

    var v: Battery_Status_Assessment_Service.ReportQuality_Payload = Battery_Status_Assessment_Service.ReportQuality_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceReportQualityType()
        v = Battery_Status_Assessment_Service.ReportQuality_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceReportQualityType()
       v = Battery_Status_Assessment_Service.ReportQuality_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportTicket.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceReportTicketType: Config_Battery_Status_Assessment_ServiceReportTicketType
  def set_Config_Battery_Status_Assessment_ServiceReportTicketType(config: Config_Battery_Status_Assessment_ServiceReportTicketType): RandomLib

  def nextBattery_Status_Assessment_ServiceReportTicketType(): Battery_Status_Assessment_Service.ReportTicket.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportTicket.numOfElements-1)

    var v: Battery_Status_Assessment_Service.ReportTicket.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportTicket.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceReportTicketType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportTicketType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceReportTicketType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportTicketType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportTicket.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportTicket.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceReportTicketType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportTicketType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.ReportTicket.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.ReportTicket.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ReportTicket_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload: Config_Battery_Status_Assessment_ServiceReportTicket_Payload
  def set_Config_Battery_Status_Assessment_ServiceReportTicket_Payload(config: Config_Battery_Status_Assessment_ServiceReportTicket_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceReportTicket_Payload(): Battery_Status_Assessment_Service.ReportTicket_Payload = {
    var value: Battery_Status_Assessment_Service.ReportTicket.Type = nextBattery_Status_Assessment_ServiceReportTicketType()

    var v: Battery_Status_Assessment_Service.ReportTicket_Payload = Battery_Status_Assessment_Service.ReportTicket_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceReportTicketType()
        v = Battery_Status_Assessment_Service.ReportTicket_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceReportTicketType()
       v = Battery_Status_Assessment_Service.ReportTicket_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container
  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id, Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container = c match {
      case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {
    var api_control_use_feedback: Battery_Status_Assessment_Service.ControlUseFeedback = nextBattery_Status_Assessment_ServiceControlUseFeedback()
    var api_decision_assessment: Battery_Status_Assessment_Service.TaggedAssessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
    var api_publication_directive: Battery_Status_Assessment_Service.PublicationDirective.Type = nextBattery_Status_Assessment_ServicePublicationDirectiveType()

    var v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P(api_control_use_feedback, api_decision_assessment, api_publication_directive)

    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_control_use_feedback = nextBattery_Status_Assessment_ServiceControlUseFeedback()
        api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
        api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
        v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P(api_control_use_feedback, api_decision_assessment, api_publication_directive)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_control_use_feedback = nextBattery_Status_Assessment_ServiceControlUseFeedback()
       api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
       api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
       v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P(api_control_use_feedback, api_decision_assessment, api_publication_directive)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {
    var api_control_use_feedback: Battery_Status_Assessment_Service.ControlUseFeedback = nextBattery_Status_Assessment_ServiceControlUseFeedback()
    var api_decision_assessment: Battery_Status_Assessment_Service.TaggedAssessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
    var api_publication_directive: Battery_Status_Assessment_Service.PublicationDirective.Type = nextBattery_Status_Assessment_ServicePublicationDirectiveType()

    var v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(api_control_use_feedback, api_decision_assessment, api_publication_directive)

    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_control_use_feedback = nextBattery_Status_Assessment_ServiceControlUseFeedback()
        api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
        api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
        v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(api_control_use_feedback, api_decision_assessment, api_publication_directive)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_control_use_feedback = nextBattery_Status_Assessment_ServiceControlUseFeedback()
       api_decision_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
       api_publication_directive = nextBattery_Status_Assessment_ServicePublicationDirectiveType()
       v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(api_control_use_feedback, api_decision_assessment, api_publication_directive)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container ===================

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container
  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container): RandomLib

  def nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container = {
    var callEnum: ISZ[Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Type] = ISZ(Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id, Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id)

    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container = c match {
      case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
      case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
         case Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P ===================

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P
  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P): RandomLib

  def nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {
    var api_battery_assessment: Battery_Status_Assessment_Service.TaggedAssessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
    var api_publication_outcome: Battery_Status_Assessment_Service.PublicationOutcome.Type = nextBattery_Status_Assessment_ServicePublicationOutcomeType()

    var v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P(api_battery_assessment, api_publication_outcome)

    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
        api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
        v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P(api_battery_assessment, api_publication_outcome)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
       api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
       v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P(api_battery_assessment, api_publication_outcome)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS ===================

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS
  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS): RandomLib

  def nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(): Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {
    var api_battery_assessment: Battery_Status_Assessment_Service.TaggedAssessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
    var api_publication_outcome: Battery_Status_Assessment_Service.PublicationOutcome.Type = nextBattery_Status_Assessment_ServicePublicationOutcomeType()

    var v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(api_battery_assessment, api_publication_outcome)

    if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_battery_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
        api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
        v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(api_battery_assessment, api_publication_outcome)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_battery_assessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()
       api_publication_outcome = nextBattery_Status_Assessment_ServicePublicationOutcomeType()
       v = Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(api_battery_assessment, api_publication_outcome)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.StatusReadRequest.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType: Config_Battery_Status_Assessment_ServiceStatusReadRequestType
  def set_Config_Battery_Status_Assessment_ServiceStatusReadRequestType(config: Config_Battery_Status_Assessment_ServiceStatusReadRequestType): RandomLib

  def nextBattery_Status_Assessment_ServiceStatusReadRequestType(): Battery_Status_Assessment_Service.StatusReadRequest.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.StatusReadRequest.numOfElements-1)

    var v: Battery_Status_Assessment_Service.StatusReadRequest.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.StatusReadRequest.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.StatusReadRequest.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.StatusReadRequest.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.StatusReadRequest.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.StatusReadRequest.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.StatusReadRequest_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload: Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload
  def set_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload(config: Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceStatusReadRequest_Payload(): Battery_Status_Assessment_Service.StatusReadRequest_Payload = {
    var value: Battery_Status_Assessment_Service.StatusReadRequest.Type = nextBattery_Status_Assessment_ServiceStatusReadRequestType()

    var v: Battery_Status_Assessment_Service.StatusReadRequest_Payload = Battery_Status_Assessment_Service.StatusReadRequest_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceStatusReadRequestType()
        v = Battery_Status_Assessment_Service.StatusReadRequest_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceStatusReadRequestType()
       v = Battery_Status_Assessment_Service.StatusReadRequest_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.TaggedAssessment ===================

  def get_Config_Battery_Status_Assessment_ServiceTaggedAssessment: Config_Battery_Status_Assessment_ServiceTaggedAssessment
  def set_Config_Battery_Status_Assessment_ServiceTaggedAssessment(config: Config_Battery_Status_Assessment_ServiceTaggedAssessment): RandomLib

  def nextBattery_Status_Assessment_ServiceTaggedAssessment(): Battery_Status_Assessment_Service.TaggedAssessment = {
    var ticket: Battery_Status_Assessment_Service.ReportTicket.Type = nextBattery_Status_Assessment_ServiceReportTicketType()
    var result: Battery_Status_Assessment_Service.AssessmentResult.Type = nextBattery_Status_Assessment_ServiceAssessmentResultType()

    var v: Battery_Status_Assessment_Service.TaggedAssessment = Battery_Status_Assessment_Service.TaggedAssessment(ticket, result)

    if(get_Config_Battery_Status_Assessment_ServiceTaggedAssessment.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceTaggedAssessment.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceTaggedAssessment.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceTaggedAssessment.verbose) {
          println(s"Retrying for failing value: $v")
        }
        ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
        result = nextBattery_Status_Assessment_ServiceAssessmentResultType()
        v = Battery_Status_Assessment_Service.TaggedAssessment(ticket, result)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceTaggedAssessment.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceTaggedAssessment.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
       result = nextBattery_Status_Assessment_ServiceAssessmentResultType()
       v = Battery_Status_Assessment_Service.TaggedAssessment(ticket, result)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.TaggedAssessment_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload: Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload
  def set_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload(config: Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceTaggedAssessment_Payload(): Battery_Status_Assessment_Service.TaggedAssessment_Payload = {
    var value: Battery_Status_Assessment_Service.TaggedAssessment = nextBattery_Status_Assessment_ServiceTaggedAssessment()

    var v: Battery_Status_Assessment_Service.TaggedAssessment_Payload = Battery_Status_Assessment_Service.TaggedAssessment_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceTaggedAssessment()
        v = Battery_Status_Assessment_Service.TaggedAssessment_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceTaggedAssessment()
       v = Battery_Status_Assessment_Service.TaggedAssessment_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.TaggedQualifiedEvidence ===================

  def get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence
  def set_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence(config: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence): RandomLib

  def nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence(): Battery_Status_Assessment_Service.TaggedQualifiedEvidence = {
    var ticket: Battery_Status_Assessment_Service.ReportTicket.Type = nextBattery_Status_Assessment_ServiceReportTicketType()
    var evidence: Battery_Status_Assessment_Service.QualifiedEvidence.Type = nextBattery_Status_Assessment_ServiceQualifiedEvidenceType()

    var v: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = Battery_Status_Assessment_Service.TaggedQualifiedEvidence(ticket, evidence)

    if(get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence.verbose) {
          println(s"Retrying for failing value: $v")
        }
        ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
        evidence = nextBattery_Status_Assessment_ServiceQualifiedEvidenceType()
        v = Battery_Status_Assessment_Service.TaggedQualifiedEvidence(ticket, evidence)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ticket = nextBattery_Status_Assessment_ServiceReportTicketType()
       evidence = nextBattery_Status_Assessment_ServiceQualifiedEvidenceType()
       v = Battery_Status_Assessment_Service.TaggedQualifiedEvidence(ticket, evidence)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload
  def set_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(config: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(): Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = {
    var value: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()

    var v: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload = Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
        v = Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceTaggedQualifiedEvidence()
       v = Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.UseDisposition.Type ===================

  def get_Config_Battery_Status_Assessment_ServiceUseDispositionType: Config_Battery_Status_Assessment_ServiceUseDispositionType
  def set_Config_Battery_Status_Assessment_ServiceUseDispositionType(config: Config_Battery_Status_Assessment_ServiceUseDispositionType): RandomLib

  def nextBattery_Status_Assessment_ServiceUseDispositionType(): Battery_Status_Assessment_Service.UseDisposition.Type = {

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.UseDisposition.numOfElements-1)

    var v: Battery_Status_Assessment_Service.UseDisposition.Type = battery_status_assessment_service.Battery_Status_Assessment_Service.UseDisposition.byOrdinal(ordinal).get
    if(get_Config_Battery_Status_Assessment_ServiceUseDispositionType.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceUseDispositionType.attempts) {
       if(get_Config_Battery_Status_Assessment_ServiceUseDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceUseDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.UseDisposition.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.UseDisposition.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_Battery_Status_Assessment_ServiceUseDispositionType.filter(v)) {
        return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceUseDispositionType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.Battery_Status_Assessment_Service.UseDisposition.numOfElements-1)
       v = battery_status_assessment_service.Battery_Status_Assessment_Service.UseDisposition.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Battery_Status_Assessment_Service.UseDisposition_Payload ===================

  def get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload: Config_Battery_Status_Assessment_ServiceUseDisposition_Payload
  def set_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload(config: Config_Battery_Status_Assessment_ServiceUseDisposition_Payload): RandomLib

  def nextBattery_Status_Assessment_ServiceUseDisposition_Payload(): Battery_Status_Assessment_Service.UseDisposition_Payload = {
    var value: Battery_Status_Assessment_Service.UseDisposition.Type = nextBattery_Status_Assessment_ServiceUseDispositionType()

    var v: Battery_Status_Assessment_Service.UseDisposition_Payload = Battery_Status_Assessment_Service.UseDisposition_Payload(value)

    if(get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload.attempts) {
        if(get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload.filter(v)) {
          return v
        }
        if (get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBattery_Status_Assessment_ServiceUseDispositionType()
        v = Battery_Status_Assessment_Service.UseDisposition_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload.filter(v)) {
         return v
       }
       if (get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBattery_Status_Assessment_ServiceUseDispositionType()
       v = Battery_Status_Assessment_Service.UseDisposition_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= util.Container ===================

  def get_Config_utilContainer: Config_utilContainer
  def set_Config_utilContainer(config: Config_utilContainer): RandomLib

  def nextutilContainer(): util.Container = {
    var callEnum: ISZ[utilContainer_DataTypeId.Type] = ISZ(utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id, utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id, utilContainer_DataTypeId.utilEmptyContainer_Id)

    if(get_Config_utilContainer.additiveTypeFiltering) {
       callEnum = get_Config_utilContainer.typeFilter
    } else {
       for(h <- get_Config_utilContainer.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: util.Container = c match {
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
      case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
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
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
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
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _).apply()
         case utilContainer_DataTypeId.Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS_Id => (nextBattery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _).apply()
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

    var ordinal: Z = gen.nextZBetween(0, battery_status_assessment_service.runtimemonitor.ObservationKind.numOfElements-1)

    var v: runtimemonitor.ObservationKind.Type = battery_status_assessment_service.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
    if(get_Config_runtimemonitorObservationKindType.attempts >= 0) {
     for(i <- 0 to get_Config_runtimemonitorObservationKindType.attempts) {
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.runtimemonitor.ObservationKind.numOfElements-1)
       v = battery_status_assessment_service.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, battery_status_assessment_service.runtimemonitor.ObservationKind.numOfElements-1)
       v = battery_status_assessment_service.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
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

  // ============= Battery_Status_Assessment_Service.AcquisitionDirective.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionDirectiveType(v: Battery_Status_Assessment_Service.AcquisitionDirective.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType: Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType = Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionDirectiveType _)

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType: Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType = {return config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType}

  def set_Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType(config: Config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType): RandomLib ={
    config_Battery_Status_Assessment_ServiceAcquisitionDirectiveType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AcquisitionDirective_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload(v: Battery_Status_Assessment_Service.AcquisitionDirective_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload: Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload = Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload: Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload = {return config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload}

  def set_Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload(config: Config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceAcquisitionDirective_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AcquisitionOutcome.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionOutcomeType(v: Battery_Status_Assessment_Service.AcquisitionOutcome.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType: Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType = Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionOutcomeType _)

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType: Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType = {return config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType}

  def set_Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType(config: Config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType): RandomLib ={
    config_Battery_Status_Assessment_ServiceAcquisitionOutcomeType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AcquisitionOutcome_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload(v: Battery_Status_Assessment_Service.AcquisitionOutcome_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload: Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload = Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload: Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload = {return config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload}

  def set_Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload(config: Config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceAcquisitionOutcome_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentContext.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentContextType(v: Battery_Status_Assessment_Service.AssessmentContext.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentContextType: Config_Battery_Status_Assessment_ServiceAssessmentContextType = Config_Battery_Status_Assessment_ServiceAssessmentContextType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentContextType _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentContextType: Config_Battery_Status_Assessment_ServiceAssessmentContextType = {return config_Battery_Status_Assessment_ServiceAssessmentContextType}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentContextType(config: Config_Battery_Status_Assessment_ServiceAssessmentContextType): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentContextType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentContext_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentContext_Payload(v: Battery_Status_Assessment_Service.AssessmentContext_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentContext_Payload: Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload = Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentContext_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload: Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload = {return config_Battery_Status_Assessment_ServiceAssessmentContext_Payload}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload(config: Config_Battery_Status_Assessment_ServiceAssessmentContext_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentContext_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = {return config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = {return config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = {return config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = {return config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = {return config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(v: Battery_Status_Assessment_Service.AssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = {return config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentDecision_battery_assessment_process_assessment_decision_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentResult.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentResultType(v: Battery_Status_Assessment_Service.AssessmentResult.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentResultType: Config_Battery_Status_Assessment_ServiceAssessmentResultType = Config_Battery_Status_Assessment_ServiceAssessmentResultType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentResultType _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentResultType: Config_Battery_Status_Assessment_ServiceAssessmentResultType = {return config_Battery_Status_Assessment_ServiceAssessmentResultType}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentResultType(config: Config_Battery_Status_Assessment_ServiceAssessmentResultType): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentResultType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.AssessmentResult_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceAssessmentResult_Payload(v: Battery_Status_Assessment_Service.AssessmentResult_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceAssessmentResult_Payload: Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload = Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceAssessmentResult_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload: Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload = {return config_Battery_Status_Assessment_ServiceAssessmentResult_Payload}

  def set_Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload(config: Config_Battery_Status_Assessment_ServiceAssessmentResult_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceAssessmentResult_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.BatteryReport ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceBatteryReport(v: Battery_Status_Assessment_Service.BatteryReport): B = {return T}

  var config_Battery_Status_Assessment_ServiceBatteryReport: Config_Battery_Status_Assessment_ServiceBatteryReport = Config_Battery_Status_Assessment_ServiceBatteryReport(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceBatteryReport _)

  def get_Config_Battery_Status_Assessment_ServiceBatteryReport: Config_Battery_Status_Assessment_ServiceBatteryReport = {return config_Battery_Status_Assessment_ServiceBatteryReport}

  def set_Config_Battery_Status_Assessment_ServiceBatteryReport(config: Config_Battery_Status_Assessment_ServiceBatteryReport): RandomLib ={
    config_Battery_Status_Assessment_ServiceBatteryReport = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.BatteryReport_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceBatteryReport_Payload(v: Battery_Status_Assessment_Service.BatteryReport_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceBatteryReport_Payload: Config_Battery_Status_Assessment_ServiceBatteryReport_Payload = Config_Battery_Status_Assessment_ServiceBatteryReport_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceBatteryReport_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload: Config_Battery_Status_Assessment_ServiceBatteryReport_Payload = {return config_Battery_Status_Assessment_ServiceBatteryReport_Payload}

  def set_Config_Battery_Status_Assessment_ServiceBatteryReport_Payload(config: Config_Battery_Status_Assessment_ServiceBatteryReport_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceBatteryReport_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CapacityLevel.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCapacityLevelType(v: Battery_Status_Assessment_Service.CapacityLevel.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceCapacityLevelType: Config_Battery_Status_Assessment_ServiceCapacityLevelType = Config_Battery_Status_Assessment_ServiceCapacityLevelType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCapacityLevelType _)

  def get_Config_Battery_Status_Assessment_ServiceCapacityLevelType: Config_Battery_Status_Assessment_ServiceCapacityLevelType = {return config_Battery_Status_Assessment_ServiceCapacityLevelType}

  def set_Config_Battery_Status_Assessment_ServiceCapacityLevelType(config: Config_Battery_Status_Assessment_ServiceCapacityLevelType): RandomLib ={
    config_Battery_Status_Assessment_ServiceCapacityLevelType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CapacityLevel_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCapacityLevel_Payload(v: Battery_Status_Assessment_Service.CapacityLevel_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceCapacityLevel_Payload: Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload = Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCapacityLevel_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload: Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload = {return config_Battery_Status_Assessment_ServiceCapacityLevel_Payload}

  def set_Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload(config: Config_Battery_Status_Assessment_ServiceCapacityLevel_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceCapacityLevel_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CapturedReport ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCapturedReport(v: Battery_Status_Assessment_Service.CapturedReport): B = {return T}

  var config_Battery_Status_Assessment_ServiceCapturedReport: Config_Battery_Status_Assessment_ServiceCapturedReport = Config_Battery_Status_Assessment_ServiceCapturedReport(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCapturedReport _)

  def get_Config_Battery_Status_Assessment_ServiceCapturedReport: Config_Battery_Status_Assessment_ServiceCapturedReport = {return config_Battery_Status_Assessment_ServiceCapturedReport}

  def set_Config_Battery_Status_Assessment_ServiceCapturedReport(config: Config_Battery_Status_Assessment_ServiceCapturedReport): RandomLib ={
    config_Battery_Status_Assessment_ServiceCapturedReport = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CapturedReport_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCapturedReport_Payload(v: Battery_Status_Assessment_Service.CapturedReport_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceCapturedReport_Payload: Config_Battery_Status_Assessment_ServiceCapturedReport_Payload = Config_Battery_Status_Assessment_ServiceCapturedReport_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCapturedReport_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload: Config_Battery_Status_Assessment_ServiceCapturedReport_Payload = {return config_Battery_Status_Assessment_ServiceCapturedReport_Payload}

  def set_Config_Battery_Status_Assessment_ServiceCapturedReport_Payload(config: Config_Battery_Status_Assessment_ServiceCapturedReport_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceCapturedReport_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckCommand.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckCommandType(v: Battery_Status_Assessment_Service.CheckCommand.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckCommandType: Config_Battery_Status_Assessment_ServiceCheckCommandType = Config_Battery_Status_Assessment_ServiceCheckCommandType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckCommandType _)

  def get_Config_Battery_Status_Assessment_ServiceCheckCommandType: Config_Battery_Status_Assessment_ServiceCheckCommandType = {return config_Battery_Status_Assessment_ServiceCheckCommandType}

  def set_Config_Battery_Status_Assessment_ServiceCheckCommandType(config: Config_Battery_Status_Assessment_ServiceCheckCommandType): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckCommandType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckCommand_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckCommand_Payload(v: Battery_Status_Assessment_Service.CheckCommand_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckCommand_Payload: Config_Battery_Status_Assessment_ServiceCheckCommand_Payload = Config_Battery_Status_Assessment_ServiceCheckCommand_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckCommand_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload: Config_Battery_Status_Assessment_ServiceCheckCommand_Payload = {return config_Battery_Status_Assessment_ServiceCheckCommand_Payload}

  def set_Config_Battery_Status_Assessment_ServiceCheckCommand_Payload(config: Config_Battery_Status_Assessment_ServiceCheckCommand_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckCommand_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = {return config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container}

  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = {return config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = {return config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = {return config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container}

  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = {return config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(v: Battery_Status_Assessment_Service.CheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = {return config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckLifecycle_battery_assessment_process_check_lifecycle_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckRequest ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckRequest(v: Battery_Status_Assessment_Service.CheckRequest): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckRequest: Config_Battery_Status_Assessment_ServiceCheckRequest = Config_Battery_Status_Assessment_ServiceCheckRequest(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckRequest _)

  def get_Config_Battery_Status_Assessment_ServiceCheckRequest: Config_Battery_Status_Assessment_ServiceCheckRequest = {return config_Battery_Status_Assessment_ServiceCheckRequest}

  def set_Config_Battery_Status_Assessment_ServiceCheckRequest(config: Config_Battery_Status_Assessment_ServiceCheckRequest): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckRequest = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckRequest_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckRequest_Payload(v: Battery_Status_Assessment_Service.CheckRequest_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckRequest_Payload: Config_Battery_Status_Assessment_ServiceCheckRequest_Payload = Config_Battery_Status_Assessment_ServiceCheckRequest_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckRequest_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload: Config_Battery_Status_Assessment_ServiceCheckRequest_Payload = {return config_Battery_Status_Assessment_ServiceCheckRequest_Payload}

  def set_Config_Battery_Status_Assessment_ServiceCheckRequest_Payload(config: Config_Battery_Status_Assessment_ServiceCheckRequest_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckRequest_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckStatus.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckStatusType(v: Battery_Status_Assessment_Service.CheckStatus.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckStatusType: Config_Battery_Status_Assessment_ServiceCheckStatusType = Config_Battery_Status_Assessment_ServiceCheckStatusType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckStatusType _)

  def get_Config_Battery_Status_Assessment_ServiceCheckStatusType: Config_Battery_Status_Assessment_ServiceCheckStatusType = {return config_Battery_Status_Assessment_ServiceCheckStatusType}

  def set_Config_Battery_Status_Assessment_ServiceCheckStatusType(config: Config_Battery_Status_Assessment_ServiceCheckStatusType): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckStatusType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckStatus_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckStatus_Payload(v: Battery_Status_Assessment_Service.CheckStatus_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckStatus_Payload: Config_Battery_Status_Assessment_ServiceCheckStatus_Payload = Config_Battery_Status_Assessment_ServiceCheckStatus_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckStatus_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload: Config_Battery_Status_Assessment_ServiceCheckStatus_Payload = {return config_Battery_Status_Assessment_ServiceCheckStatus_Payload}

  def set_Config_Battery_Status_Assessment_ServiceCheckStatus_Payload(config: Config_Battery_Status_Assessment_ServiceCheckStatus_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckStatus_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckToken.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckTokenType(v: Battery_Status_Assessment_Service.CheckToken.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckTokenType: Config_Battery_Status_Assessment_ServiceCheckTokenType = Config_Battery_Status_Assessment_ServiceCheckTokenType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckTokenType _)

  def get_Config_Battery_Status_Assessment_ServiceCheckTokenType: Config_Battery_Status_Assessment_ServiceCheckTokenType = {return config_Battery_Status_Assessment_ServiceCheckTokenType}

  def set_Config_Battery_Status_Assessment_ServiceCheckTokenType(config: Config_Battery_Status_Assessment_ServiceCheckTokenType): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckTokenType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.CheckToken_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceCheckToken_Payload(v: Battery_Status_Assessment_Service.CheckToken_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceCheckToken_Payload: Config_Battery_Status_Assessment_ServiceCheckToken_Payload = Config_Battery_Status_Assessment_ServiceCheckToken_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceCheckToken_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceCheckToken_Payload: Config_Battery_Status_Assessment_ServiceCheckToken_Payload = {return config_Battery_Status_Assessment_ServiceCheckToken_Payload}

  def set_Config_Battery_Status_Assessment_ServiceCheckToken_Payload(config: Config_Battery_Status_Assessment_ServiceCheckToken_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceCheckToken_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ControlUseFeedback ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceControlUseFeedback(v: Battery_Status_Assessment_Service.ControlUseFeedback): B = {return T}

  var config_Battery_Status_Assessment_ServiceControlUseFeedback: Config_Battery_Status_Assessment_ServiceControlUseFeedback = Config_Battery_Status_Assessment_ServiceControlUseFeedback(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceControlUseFeedback _)

  def get_Config_Battery_Status_Assessment_ServiceControlUseFeedback: Config_Battery_Status_Assessment_ServiceControlUseFeedback = {return config_Battery_Status_Assessment_ServiceControlUseFeedback}

  def set_Config_Battery_Status_Assessment_ServiceControlUseFeedback(config: Config_Battery_Status_Assessment_ServiceControlUseFeedback): RandomLib ={
    config_Battery_Status_Assessment_ServiceControlUseFeedback = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ControlUseFeedback_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceControlUseFeedback_Payload(v: Battery_Status_Assessment_Service.ControlUseFeedback_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload: Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload = Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceControlUseFeedback_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload: Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload = {return config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload}

  def set_Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload(config: Config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceControlUseFeedback_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.FeedbackTicket.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceFeedbackTicketType(v: Battery_Status_Assessment_Service.FeedbackTicket.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceFeedbackTicketType: Config_Battery_Status_Assessment_ServiceFeedbackTicketType = Config_Battery_Status_Assessment_ServiceFeedbackTicketType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceFeedbackTicketType _)

  def get_Config_Battery_Status_Assessment_ServiceFeedbackTicketType: Config_Battery_Status_Assessment_ServiceFeedbackTicketType = {return config_Battery_Status_Assessment_ServiceFeedbackTicketType}

  def set_Config_Battery_Status_Assessment_ServiceFeedbackTicketType(config: Config_Battery_Status_Assessment_ServiceFeedbackTicketType): RandomLib ={
    config_Battery_Status_Assessment_ServiceFeedbackTicketType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.FeedbackTicket_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceFeedbackTicket_Payload(v: Battery_Status_Assessment_Service.FeedbackTicket_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload: Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload = Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceFeedbackTicket_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload: Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload = {return config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload}

  def set_Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload(config: Config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceFeedbackTicket_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.PublicationDirective.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServicePublicationDirectiveType(v: Battery_Status_Assessment_Service.PublicationDirective.Type): B = {return T}

  var config_Battery_Status_Assessment_ServicePublicationDirectiveType: Config_Battery_Status_Assessment_ServicePublicationDirectiveType = Config_Battery_Status_Assessment_ServicePublicationDirectiveType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServicePublicationDirectiveType _)

  def get_Config_Battery_Status_Assessment_ServicePublicationDirectiveType: Config_Battery_Status_Assessment_ServicePublicationDirectiveType = {return config_Battery_Status_Assessment_ServicePublicationDirectiveType}

  def set_Config_Battery_Status_Assessment_ServicePublicationDirectiveType(config: Config_Battery_Status_Assessment_ServicePublicationDirectiveType): RandomLib ={
    config_Battery_Status_Assessment_ServicePublicationDirectiveType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.PublicationDirective_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServicePublicationDirective_Payload(v: Battery_Status_Assessment_Service.PublicationDirective_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServicePublicationDirective_Payload: Config_Battery_Status_Assessment_ServicePublicationDirective_Payload = Config_Battery_Status_Assessment_ServicePublicationDirective_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServicePublicationDirective_Payload _)

  def get_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload: Config_Battery_Status_Assessment_ServicePublicationDirective_Payload = {return config_Battery_Status_Assessment_ServicePublicationDirective_Payload}

  def set_Config_Battery_Status_Assessment_ServicePublicationDirective_Payload(config: Config_Battery_Status_Assessment_ServicePublicationDirective_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServicePublicationDirective_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.PublicationOutcome.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServicePublicationOutcomeType(v: Battery_Status_Assessment_Service.PublicationOutcome.Type): B = {return T}

  var config_Battery_Status_Assessment_ServicePublicationOutcomeType: Config_Battery_Status_Assessment_ServicePublicationOutcomeType = Config_Battery_Status_Assessment_ServicePublicationOutcomeType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServicePublicationOutcomeType _)

  def get_Config_Battery_Status_Assessment_ServicePublicationOutcomeType: Config_Battery_Status_Assessment_ServicePublicationOutcomeType = {return config_Battery_Status_Assessment_ServicePublicationOutcomeType}

  def set_Config_Battery_Status_Assessment_ServicePublicationOutcomeType(config: Config_Battery_Status_Assessment_ServicePublicationOutcomeType): RandomLib ={
    config_Battery_Status_Assessment_ServicePublicationOutcomeType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.PublicationOutcome_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServicePublicationOutcome_Payload(v: Battery_Status_Assessment_Service.PublicationOutcome_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServicePublicationOutcome_Payload: Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload = Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServicePublicationOutcome_Payload _)

  def get_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload: Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload = {return config_Battery_Status_Assessment_ServicePublicationOutcome_Payload}

  def set_Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload(config: Config_Battery_Status_Assessment_ServicePublicationOutcome_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServicePublicationOutcome_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.QualifiedEvidence.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceQualifiedEvidenceType(v: Battery_Status_Assessment_Service.QualifiedEvidence.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceQualifiedEvidenceType: Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType = Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceQualifiedEvidenceType _)

  def get_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType: Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType = {return config_Battery_Status_Assessment_ServiceQualifiedEvidenceType}

  def set_Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType(config: Config_Battery_Status_Assessment_ServiceQualifiedEvidenceType): RandomLib ={
    config_Battery_Status_Assessment_ServiceQualifiedEvidenceType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.QualifiedEvidence_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload(v: Battery_Status_Assessment_Service.QualifiedEvidence_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload: Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload = Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload: Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload = {return config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload}

  def set_Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload(config: Config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceQualifiedEvidence_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = {return config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container}

  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = {return config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = {return config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = {return config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container}

  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = {return config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(v: Battery_Status_Assessment_Service.ReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = {return config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAcquisition_battery_assessment_process_report_acquisition_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAvailability.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAvailabilityType(v: Battery_Status_Assessment_Service.ReportAvailability.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAvailabilityType: Config_Battery_Status_Assessment_ServiceReportAvailabilityType = Config_Battery_Status_Assessment_ServiceReportAvailabilityType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportAvailabilityType _)

  def get_Config_Battery_Status_Assessment_ServiceReportAvailabilityType: Config_Battery_Status_Assessment_ServiceReportAvailabilityType = {return config_Battery_Status_Assessment_ServiceReportAvailabilityType}

  def set_Config_Battery_Status_Assessment_ServiceReportAvailabilityType(config: Config_Battery_Status_Assessment_ServiceReportAvailabilityType): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAvailabilityType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportAvailability_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportAvailability_Payload(v: Battery_Status_Assessment_Service.ReportAvailability_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportAvailability_Payload: Config_Battery_Status_Assessment_ServiceReportAvailability_Payload = Config_Battery_Status_Assessment_ServiceReportAvailability_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportAvailability_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload: Config_Battery_Status_Assessment_ServiceReportAvailability_Payload = {return config_Battery_Status_Assessment_ServiceReportAvailability_Payload}

  def set_Config_Battery_Status_Assessment_ServiceReportAvailability_Payload(config: Config_Battery_Status_Assessment_ServiceReportAvailability_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportAvailability_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container = Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container = {return config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container}

  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = {return config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = {return config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container = Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container = {return config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container}

  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = {return config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(v: Battery_Status_Assessment_Service.ReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = {return config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQualification_battery_assessment_process_report_qualification_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQuality.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQualityType(v: Battery_Status_Assessment_Service.ReportQuality.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQualityType: Config_Battery_Status_Assessment_ServiceReportQualityType = Config_Battery_Status_Assessment_ServiceReportQualityType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportQualityType _)

  def get_Config_Battery_Status_Assessment_ServiceReportQualityType: Config_Battery_Status_Assessment_ServiceReportQualityType = {return config_Battery_Status_Assessment_ServiceReportQualityType}

  def set_Config_Battery_Status_Assessment_ServiceReportQualityType(config: Config_Battery_Status_Assessment_ServiceReportQualityType): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQualityType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportQuality_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportQuality_Payload(v: Battery_Status_Assessment_Service.ReportQuality_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportQuality_Payload: Config_Battery_Status_Assessment_ServiceReportQuality_Payload = Config_Battery_Status_Assessment_ServiceReportQuality_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportQuality_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceReportQuality_Payload: Config_Battery_Status_Assessment_ServiceReportQuality_Payload = {return config_Battery_Status_Assessment_ServiceReportQuality_Payload}

  def set_Config_Battery_Status_Assessment_ServiceReportQuality_Payload(config: Config_Battery_Status_Assessment_ServiceReportQuality_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportQuality_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportTicket.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportTicketType(v: Battery_Status_Assessment_Service.ReportTicket.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportTicketType: Config_Battery_Status_Assessment_ServiceReportTicketType = Config_Battery_Status_Assessment_ServiceReportTicketType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportTicketType _)

  def get_Config_Battery_Status_Assessment_ServiceReportTicketType: Config_Battery_Status_Assessment_ServiceReportTicketType = {return config_Battery_Status_Assessment_ServiceReportTicketType}

  def set_Config_Battery_Status_Assessment_ServiceReportTicketType(config: Config_Battery_Status_Assessment_ServiceReportTicketType): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportTicketType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ReportTicket_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceReportTicket_Payload(v: Battery_Status_Assessment_Service.ReportTicket_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceReportTicket_Payload: Config_Battery_Status_Assessment_ServiceReportTicket_Payload = Config_Battery_Status_Assessment_ServiceReportTicket_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceReportTicket_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceReportTicket_Payload: Config_Battery_Status_Assessment_ServiceReportTicket_Payload = {return config_Battery_Status_Assessment_ServiceReportTicket_Payload}

  def set_Config_Battery_Status_Assessment_ServiceReportTicket_Payload(config: Config_Battery_Status_Assessment_ServiceReportTicket_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceReportTicket_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container = Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container = {return config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container}

  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P = Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P = {return config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PreState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = {return config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PreState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container): B = {return T}

  var config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container = Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container _)

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container = {return config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container}

  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container): RandomLib ={
    config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_P): B = {return T}

  var config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P = Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P _)

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P = {return config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P}

  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P): RandomLib ={
    config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_P = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(v: Battery_Status_Assessment_Service.ResultCustody_battery_assessment_process_result_custody_PostState_Container_PS): B = {return T}

  var config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS _)

  def get_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = {return config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS}

  def set_Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS(config: Config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS): RandomLib ={
    config_Battery_Status_Assessment_ServiceResultCustody_battery_assessment_process_result_custody_PostState_Container_PS = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.StatusReadRequest.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceStatusReadRequestType(v: Battery_Status_Assessment_Service.StatusReadRequest.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceStatusReadRequestType: Config_Battery_Status_Assessment_ServiceStatusReadRequestType = Config_Battery_Status_Assessment_ServiceStatusReadRequestType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceStatusReadRequestType _)

  def get_Config_Battery_Status_Assessment_ServiceStatusReadRequestType: Config_Battery_Status_Assessment_ServiceStatusReadRequestType = {return config_Battery_Status_Assessment_ServiceStatusReadRequestType}

  def set_Config_Battery_Status_Assessment_ServiceStatusReadRequestType(config: Config_Battery_Status_Assessment_ServiceStatusReadRequestType): RandomLib ={
    config_Battery_Status_Assessment_ServiceStatusReadRequestType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.StatusReadRequest_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceStatusReadRequest_Payload(v: Battery_Status_Assessment_Service.StatusReadRequest_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload: Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload = Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceStatusReadRequest_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload: Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload = {return config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload}

  def set_Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload(config: Config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceStatusReadRequest_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.TaggedAssessment ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceTaggedAssessment(v: Battery_Status_Assessment_Service.TaggedAssessment): B = {return T}

  var config_Battery_Status_Assessment_ServiceTaggedAssessment: Config_Battery_Status_Assessment_ServiceTaggedAssessment = Config_Battery_Status_Assessment_ServiceTaggedAssessment(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceTaggedAssessment _)

  def get_Config_Battery_Status_Assessment_ServiceTaggedAssessment: Config_Battery_Status_Assessment_ServiceTaggedAssessment = {return config_Battery_Status_Assessment_ServiceTaggedAssessment}

  def set_Config_Battery_Status_Assessment_ServiceTaggedAssessment(config: Config_Battery_Status_Assessment_ServiceTaggedAssessment): RandomLib ={
    config_Battery_Status_Assessment_ServiceTaggedAssessment = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.TaggedAssessment_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceTaggedAssessment_Payload(v: Battery_Status_Assessment_Service.TaggedAssessment_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload: Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload = Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceTaggedAssessment_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload: Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload = {return config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload}

  def set_Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload(config: Config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceTaggedAssessment_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.TaggedQualifiedEvidence ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence(v: Battery_Status_Assessment_Service.TaggedQualifiedEvidence): B = {return T}

  var config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence = Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence _)

  def get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence = {return config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence}

  def set_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence(config: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence): RandomLib ={
    config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(v: Battery_Status_Assessment_Service.TaggedQualifiedEvidence_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload = Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload = {return config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload}

  def set_Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload(config: Config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceTaggedQualifiedEvidence_Payload = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.UseDisposition.Type ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceUseDispositionType(v: Battery_Status_Assessment_Service.UseDisposition.Type): B = {return T}

  var config_Battery_Status_Assessment_ServiceUseDispositionType: Config_Battery_Status_Assessment_ServiceUseDispositionType = Config_Battery_Status_Assessment_ServiceUseDispositionType(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceUseDispositionType _)

  def get_Config_Battery_Status_Assessment_ServiceUseDispositionType: Config_Battery_Status_Assessment_ServiceUseDispositionType = {return config_Battery_Status_Assessment_ServiceUseDispositionType}

  def set_Config_Battery_Status_Assessment_ServiceUseDispositionType(config: Config_Battery_Status_Assessment_ServiceUseDispositionType): RandomLib ={
    config_Battery_Status_Assessment_ServiceUseDispositionType = config
    return this
  }

  // ============= Battery_Status_Assessment_Service.UseDisposition_Payload ===================
  def alwaysTrue_Battery_Status_Assessment_ServiceUseDisposition_Payload(v: Battery_Status_Assessment_Service.UseDisposition_Payload): B = {return T}

  var config_Battery_Status_Assessment_ServiceUseDisposition_Payload: Config_Battery_Status_Assessment_ServiceUseDisposition_Payload = Config_Battery_Status_Assessment_ServiceUseDisposition_Payload(100, _verbose, alwaysTrue_Battery_Status_Assessment_ServiceUseDisposition_Payload _)

  def get_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload: Config_Battery_Status_Assessment_ServiceUseDisposition_Payload = {return config_Battery_Status_Assessment_ServiceUseDisposition_Payload}

  def set_Config_Battery_Status_Assessment_ServiceUseDisposition_Payload(config: Config_Battery_Status_Assessment_ServiceUseDisposition_Payload): RandomLib ={
    config_Battery_Status_Assessment_ServiceUseDisposition_Payload = config
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

