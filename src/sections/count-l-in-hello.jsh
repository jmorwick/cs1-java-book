String message = "hello";
int i = 0;
int occurancesOfL = 0;
while (i < message.length()) {
  if(message.charAt(i) == 'l') {
    occurancesOfL++;
  }
  i++;
}