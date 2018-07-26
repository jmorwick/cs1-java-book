boolean justRight(int temperature) {
  if(temperature >= 68) {
    if(temperature <= 72) {
      return true;
    }
  }
  return false;
}