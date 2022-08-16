def call(var1, var2) {
  sh 'echo MY values ${var1} and ${var2}'
  sh "echo MY values ${var1} and ${var2}" <-- Works using double quotes, this messes up sed and for-loops...
}
