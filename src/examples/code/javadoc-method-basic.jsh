/** This method computes the result of rasing the value {@code base} to 
    the power {@code exponent}.  It is assumed {@code exponent} is a 
    positive integer.
    
    @param base the base value to raise to some power
    @param exponent the exponent that the base value will be raised to
    @return {@code base} rasied to the power {@code exponent}
*/
int raiseToPower(int base, int exponent) {
  int result = 1;
  for(int i=0; i<exponent; i++) { 
    result *= base;
  } 
  return result;
}
