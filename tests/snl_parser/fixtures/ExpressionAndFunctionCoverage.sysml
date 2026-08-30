package SNL_Expression_Function_Coverage {
  private import AADL::*;
  private import HAMR::*;

  language "GUMBO" /*{
    library
      functions
        // @trace SNL-FUNCTION-SPEC
        @spec def arbitrary(value: Base_Types::Integer_32): Base_Types::Integer_32;

        @spec def boolean_identity(value: Base_Types::Boolean): Base_Types::Boolean;

        @spec def global_type(value: $::Base_Types::Boolean): $::Base_Types::Boolean;

        def zero_argument_value(): Base_Types::Integer_32 := 1 [s32];

        def zero_argument_call(): Base_Types::Boolean :=
          zero_argument_value() == 1 [s32];

        def qualified_receiver_call(value: Base_Types::Boolean): Base_Types::Boolean :=
          SNL_Expression_Function_Coverage::GUMBO__Library::boolean_identity(value);

        def negated_boolean(value: Base_Types::Boolean): Base_Types::Boolean :=
          not value;

        // @trace SNL-FUNCTION-CONTRACT
        @pure def nonnegative(value: Base_Types::Integer_32, flag: Base_Types::Boolean): Base_Types::Boolean :=
          reads flag;
          assume flag implies value >= 0 [s32];
          guarantee value >= 0 [s32];
          value >= 0 [s32];

        // @trace SNL-CAST
        @strictpure def cast_is_rendered(value: Base_Types::Integer): Base_Types::Boolean :=
          (value as Base_Types::Integer_32) >= 0 [s32];

        // @trace SNL-FORALL
        def range_forall_is_rendered(): Base_Types::Boolean :=
          (0 .. 3) -> forAll { in i; i >= 0 };

        // @trace SNL-EXISTS
        def range_exists_is_rendered(): Base_Types::Boolean :=
          (0 .. 3) -> exists { in i; i == 2 };

        // @trace SNL-BOOLEAN-ARGUMENT
        def boolean_expression_argument(value: Base_Types::Integer_32): Base_Types::Boolean :=
          boolean_identity(value >= 0 [s32]);

        // @trace SNL-QUANTIFIER-ARGUMENT
        def quantifier_argument(): Base_Types::Boolean :=
          boolean_identity((0 .. 3) -> forAll { in i; i >= 0 });

        // @trace SNL-VALUE-CONDITIONAL
        def conditional_value(flag: Base_Types::Boolean): Base_Types::Integer_32 :=
          if flag ? 1 [s32] else 0 [s32];

        // @trace SNL-BOOLEAN-CONDITIONAL
        def conditional_boolean(flag: Base_Types::Boolean): Base_Types::Boolean :=
          if flag ? true else false;

        // @trace SNL-UNARY-PLUS
        def unary_plus(value: Base_Types::Integer_32): Base_Types::Boolean :=
          +value >= 0 [s32];

        // @trace SNL-COMPLEMENT
        def complement(value: Base_Types::Integer_32): Base_Types::Boolean :=
          ~value == ~value;

        // @trace SNL-REMAINDER
        def remainder(value: Base_Types::Integer_32): Base_Types::Boolean :=
          value % 2 [s32] == value % 2 [s32];

        // @trace SNL-XOR
        def exclusive_or(flag: Base_Types::Boolean): Base_Types::Boolean :=
          flag xor true;

        // @trace SNL-IMPLIES
        def implication(flag: Base_Types::Boolean): Base_Types::Boolean :=
          flag implies true;

        // @trace SNL-UNARY-MINUS
        def unary_minus(value: Base_Types::Integer_32): Base_Types::Boolean :=
          -value == -value;

        // @trace SNL-ARITHMETIC
        def arithmetic(value: Base_Types::Integer_32): Base_Types::Boolean :=
          value + 1 [s32] == value + 1 [s32] &
          value - 1 [s32] == value - 1 [s32] &
          value * 2 [s32] == value * 2 [s32] &
          value / 2 [s32] == value / 2 [s32];

        // @trace SNL-HASH-INDEX
        def hash_index(values: SNL_Expression_Function_Coverage::Test_Array): Base_Types::Boolean :=
          values#(0) == values#(0);

  }*/

  part def Test_Array :> Array {
    part :>> Base_Type : Base_Types::Integer_32;
    attribute :>> Dimensions = 2;
    attribute :>> Array_Size_Kind = Array_Size_Kinds::Fixed;
  }
}
