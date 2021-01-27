class Main {
  public static void main(String[] args) {
    String name = Keyboard.getText("Pleaase enter a word");
    int length = name.length();

    Screen.display("the word is " + length + " characters long","heading");
  }
}
