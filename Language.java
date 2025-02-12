public class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;

  public Language(String name, int numSpk, String region, String wordord ){
      this.name = name;
      this.numSpeakers = numSpk;
      this.regionSpoken = region;
      this.wordOrder = wordord;
  }

  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers + " in " + regionSpoken + ". The language follows the word order: " + wordOrder + ".");
  }

  public static void main(String[] args){
    Language japanese = new Language("japanese", 5005055, "Japan", "verb-subject-noun");
    Mayan kroen = new Mayan("Korea", 102002);
    japanese.getInfo();
    kroen.getInfo();

    SinoTibetan Chinese = new SinoTibetan("China", 4000303);
    SinoTibetan Burmese = new SinoTibetan("Burmese", 239292);

    Chinese.getInfo();
    Burmese.getInfo();

  }
}
